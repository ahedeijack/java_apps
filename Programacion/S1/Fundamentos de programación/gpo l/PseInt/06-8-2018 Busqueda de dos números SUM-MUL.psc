Algoritmo BuscarDosNumeros
	Escribir "Dada la suma y la multiplicacion de dos n�meros, determinar un algoritmo para determinar dichos n�meros"
	Escribir "Dame tu multiplicaci�n: "
	Leer mpc
	Escribir "Dame tu suma: "
	leer sum
	
	num2<-(sum+RC((sum)^2-4*mpc))/2
	num1<- sum - num2
	Escribir "El n�mero 1 es: [",num1,"], y el N�mero 2 es: [",num2,"]"
	
FinAlgoritmo
