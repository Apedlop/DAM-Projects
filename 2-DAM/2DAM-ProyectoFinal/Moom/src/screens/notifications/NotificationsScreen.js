import React, { useEffect, useState } from "react";
import { View, Text, StyleSheet, FlatList, Button, Alert } from "react-native";
import {
  initNotifications,
  scheduleDailyNotification,
  scheduleNotificationOnDate,
  getNotificationHistory,
  clearNotificationHistory,
} from "../../hooks/NotificationService";
import * as Notifications from "expo-notifications";
import AsyncStorage from "@react-native-async-storage/async-storage";
import cycleService from "../../api/cycleService";
import { useUser } from "../../context/UserContext";

const NotificationsScreen = () => {
  const { user } = useUser();
  const idUser = user.id;

  const [history, setHistory] = useState([]);
  const [cycleData, setCycleData] = useState(null);

  // Funciones para programar notificaciones específicas del ciclo
  const scheduleCycleStartNotification = async (startDate) => {
    await scheduleNotificationOnDate(
      "🩸 Comienza tu periodo",
      "Tu periodo comienza hoy. Cuida de ti.",
      startDate,
      8,
      0
    );
  };

  const scheduleOvulationNotification = async (startDate) => {
    const ovulationDate = new Date(startDate);
    ovulationDate.setDate(ovulationDate.getDate() + 14);

    await scheduleNotificationOnDate(
      "🌸 Día de ovulación",
      "Hoy es tu día probable de ovulación.",
      ovulationDate,
      9,
      0
    );
  };

  useEffect(() => {
    const fetchAndSchedule = async () => {
      try {
        const cycle = await cycleService.getCyclesByUserId(idUser);
        if (!cycle.data || cycle.data.length === 0) {
          console.warn("No se obtuvo ningún ciclo desde la API");
          return;
        }

        // Ordenar por fecha de inicio descendente (más reciente primero)
        const sortedCycles = [...cycle.data].sort(
          (a, b) => new Date(b.startDate) - new Date(a.startDate)
        );
        const latestCycle = sortedCycles[0];
        setCycleData(latestCycle); // guardamos por si se necesita

        const startDate = new Date(latestCycle.startDate);
        const cycleLength = latestCycle.cycleLength;

        if (isNaN(startDate) || typeof cycleLength !== "number") {
          console.warn("startDate o cycleLength inválidos", latestCycle);
          return;
        }

        // Inicializar permisos de notificaciones
        const permissionGranted = await initNotifications();
        if (!permissionGranted) {
          console.warn("Permisos de notificación no concedidos");
          return;
        }

        // Limpiar notificaciones anteriores para evitar duplicados
        await Notifications.cancelAllScheduledNotificationsAsync();

        // Notificación 2 días antes del siguiente ciclo
        const nextCycleDate = new Date(startDate);
        nextCycleDate.setDate(startDate.getDate() + cycleLength);
        const twoDaysBefore = new Date(nextCycleDate);
        twoDaysBefore.setDate(twoDaysBefore.getDate() - 22);

        console.log(nextCycleDate, "fecha del siguiente ciclo");
        console.log(twoDaysBefore, "dos días antes");

        await scheduleNotificationOnDate(
          "🔔 ¡Tu ciclo está por comenzar!",
          "Tu próximo ciclo comenzará en 2 días. Prepárate 💡",
          twoDaysBefore,
          20,
          17
        );

        // Notificación día inicio ciclo
        await scheduleCycleStartNotification(startDate);

        // Notificación día ovulación
        await scheduleOvulationNotification(startDate);

        // Cargar historial guardado
        const saved = await getNotificationHistory();
        setHistory(saved);
      } catch (error) {
        console.error(
          "Error al obtener el ciclo y programar notificaciones:",
          error
        );
      }
    };

    fetchAndSchedule();
  }, []);

  // Listener para notificaciones recibidas y guardar en historial
  useEffect(() => {
    const subscription = Notifications.addNotificationReceivedListener(
      async (notification) => {
        const { title, body } = notification.request.content;
        const receivedAt = new Date().toISOString();

        const newEntry = { title, body, receivedAt };

        try {
          const existing = await AsyncStorage.getItem("notificationHistory");
          const historyArray = existing ? JSON.parse(existing) : [];
          historyArray.unshift(newEntry);
          await AsyncStorage.setItem(
            "notificationHistory",
            JSON.stringify(historyArray)
          );
          setHistory(historyArray);
        } catch (error) {
          console.error("Error guardando historial:", error);
        }
      }
    );

    return () => subscription.remove();
  }, []);

  const handleClearHistory = async () => {
    Alert.alert(
      "Confirmar",
      "¿Estás seguro de que deseas eliminar el historial de notificaciones?",
      [
        { text: "Cancelar", style: "cancel" },
        {
          text: "Eliminar",
          style: "destructive",
          onPress: async () => {
            await clearNotificationHistory();
            setHistory([]);
          },
        },
      ]
    );
  };

  return (
    <View style={styles.container}>
      <View style={styles.buttonContainer}>
        <Button
          title="Borrar historial"
          color="#d9534f"
          onPress={handleClearHistory}
        />
      </View>

      <View style={styles.buttonContainer}>
        <Button
          title="Probar notificación"
          color="#0275d8"
          onPress={async () => {
            await Notifications.scheduleNotificationAsync({
              content: {
                title: "🔔 Notificación de prueba",
                body: "Esto es una notificación enviada manualmente.",
                sound: true,
              },
              trigger: null, // Inmediata
            });
          }}
        />
      </View>

      {history.length === 0 ? (
        <Text style={styles.subtext}>Aún no hay notificaciones</Text>
      ) : (
        history.map((item, index) => (
          <View key={index.toString()} style={styles.notificationItem}>
            <Text style={styles.title}>{item.title}</Text>
            <Text>{item.body}</Text>
            <Text style={styles.date}>
              {new Date(item.receivedAt).toLocaleString()}
            </Text>
          </View>
        ))
      )}
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    width: "85%",
    alignSelf: "center",
  },
  text: {
    fontSize: 20,
    fontWeight: "bold",
    marginBottom: 10,
    textAlign: "center",
  },
  subtext: {
    textAlign: "center",
    marginTop: 20,
    color: "#888",
  },
  notificationItem: {
    backgroundColor: "#fff",
    padding: 12,
    marginVertical: 6,
    borderRadius: 8,
  },
  title: {
    fontWeight: "bold",
  },
  date: {
    fontSize: 12,
    color: "#555",
    marginTop: 4,
  },
  buttonContainer: {
    marginTop: 16,
    marginBottom: 16,
    width: "50%",
    justifyContent: "center",
    alignSelf: "center",
  },
});

export default NotificationsScreen;
