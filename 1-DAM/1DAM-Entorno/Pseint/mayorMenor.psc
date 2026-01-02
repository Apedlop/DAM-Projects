Algoritmo mayorMenor
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir n3 Como Entero
	
	Escribir "Escribe un número: "
	Leer n1
	Escribir "Escribe un segundo número: "
	Leer n2
	Escribir "Escribe un tercer número: "
	Leer n3
	
	Si n1 > n2 && n2 > n3 Entonces
		Escribir n1, " > ", n2 " > ", n3
	SiNo
		Si n1 > n3 && n3 > n2 Entonces
			Escribir n1, " > ", n3, " > ", n2
		SiNo
			Si  n2 > n1 && n1 > n3 Entonces
				Escribir n2, " > ", n1, " > ", n3
			SiNo
				Si n2 > n3 && n3 > n1 Entonces
					Escribir n2, " > ", n3, " > ", n1
				SiNo
					Si n3 > n1 && n1 > n2 Entonces
						Escribir n3, " > ", n1, " > ", n2
					SiNo 
							Escribir n3, " > ", n2, " > ", n1
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
