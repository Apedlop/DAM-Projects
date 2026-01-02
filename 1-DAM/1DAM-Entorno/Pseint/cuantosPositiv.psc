Algoritmo cuantosPositiv
	
	Definir num1 Como entero
	Definir num2 Como entero
	
	Escribir "Escribe un número: "
	Leer num1
	Escribir "Escribe otro número: "
	Leer num2
	
	Si num1 >= 0  && num2 >= 0 Entonces
		Escribir "Dos números son positivos."
	SiNo
		Si num1 >= 0 && num2 < 0 Entonces
			Escribir "Un número es positivo."
		SiNo
			Escribir "Ningun número es positivo"
		Fin Si
	Fin Si
	
FinAlgoritmo
