Algoritmo sin_titulo
	Escribir "Primer Lado"
	Leer lado1
	Escribir "Segundo lado"
	Leer lado2
	Escribir "Tercer lado"
	Leer lado3
	
	perimetro <- lado1+lado2+lado3
	s <- perimetro/2
	area <- RC(s*(s-lado1)*(s-lado2)*(s-lado3))
	Escribir "El area es :",area,", y el perimetro es: ",perimetro
	Escribir s
FinAlgoritmo
