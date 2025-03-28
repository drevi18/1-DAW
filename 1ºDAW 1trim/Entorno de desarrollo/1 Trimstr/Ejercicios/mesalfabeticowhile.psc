Algoritmo mesalfabetico
	Escribir "Introduce un mes:"
	leer mes   
		
	Mientras mes < 1 o mes > 12 Hacer
			Escribir 'Mes inválido. Introduce un número entre 1 y 12:'
			leer mes   
	FinMientras
		
	segun mes hacer
		1:  Escribir 'Enero'
		2:  Escribir 'Febrero'
		3:  Escribir 'Marzo'
		4:  Escribir 'Abril'
		5:  Escribir 'Mayo'
		6:  Escribir 'Junio'
		7:  Escribir 'Julio'
		8:  Escribir 'Agosto'
		9:  Escribir 'Septiembre'
		10: Escribir 'Octubre'
		11: Escribir 'Noviembre'
		12: Escribir 'Diciembre'
	FinSegun
FinAlgoritmo

