Algoritmo sin_titulo
	Escribir "Escribe un número de 4 dígitos:"
	Leer numero
	
	d1 <- numero % 10
	numero <- Trunc(numero / 10)
	d2 <- numero % 10
	numero <- Trunc(numero / 10)
	d3 <- numero % 10
	numero <- Trunc(numero / 10)
	d4 <- numero % 10
	
	Escribir d1, d2, d3, d4
	Escribir d1 * 1000 + d2 * 100 + d3 * 10 + d4
FinAlgoritmo

