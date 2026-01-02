Algoritmo sin_titulo
	
	Definir n1, n2, n3 Como Entero
	
	Escribir "Escribe un número: "
	leer n1
	Escribir "Escribe otro número: "
	leer n2
	Escribir "Escribe otro número: "
	leer n3
	
	max = n1
	si n2 > max Entonces
		max = n2
	FinSi
	
	si n3 > max Entonces
		max = n3
	FinSi
	
	Escribir "El máximo es: ", max
	
FinAlgoritmo
