// Ejercicio 3
const mostrarMensaje = botonPresionado => alert("Se presionó el botón " + botonPresionado);

// Ejercicio 4
const concatenar = () => {
    let nom = document.getElementById('nombre').value;
    let ape = document.getElementById('apellido').value;
    let nombreCompleto = nom + " " + ape; 
    document.getElementById("nombreCompleto").value = nombreCompleto;
}

// Ejercicio 5
const pizza = () => {
    let pizza = document.getElementById('select1');
    document.getElementById('text').value = pizza.options[pizza.selectedIndex].value;
}

// Ejercicio 6
const precioPizza = () => {
    let pizza = document.getElementById('select1');
    let cantidad = document.getElementById('cantidad').value; // Obtener el valor de la cantidad
    let precioUnitario = parseFloat(pizza.options[pizza.selectedIndex].value); // Convertir el precio unitario a un número de punto flotante
    document.getElementById('text').value = precioUnitario; // Mostrar el precio unitario

    // Calcular el total multiplicando la cantidad por el precio unitario y mostrarlo
    let total = cantidad * precioUnitario;
    document.getElementById('text2').value = total.toFixed(2); // Redondear el total a 2 decimales
}

// Ejercicio 7
const contarSeleccionados = () => {
    let seleccion = (document.getElementById('futbol').checked ? "Futbol, " : "") +
                    (document.getElementById('basket').checked ? "Basket, " : "") +
                    (document.getElementById('tenis').checked ? "Tenis, " : "");
    alert(seleccion ? `Ha elegido: ${seleccion.slice(0, -2)}` : "No ha elegido ningún deporte.");
}

// Ejercicio 8
const verificarEdad = () => document.getElementById('mayor').checked ? alert("Puede ingresar al sitio.") : alert("No puede ingresar al sitio.");

// Ejercicio 9
const mostrar = () => {
    let nom = document.getElementById('nombre').value;
    let email = document.getElementById('email').value;
    let comentario = document.getElementById('comentario').value;
    alert(`Su nombre es ${nom}\nEmail: ${email}\nComentario: ${comentario}`);
}
