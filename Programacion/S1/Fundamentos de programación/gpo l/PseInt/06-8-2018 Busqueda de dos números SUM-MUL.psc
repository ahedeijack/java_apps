Algoritmo BuscarDosNumeros
	Escribir "Dada la suma y la multiplicacion de dos números, determinar un algoritmo para determinar dichos números"
	Escribir "Dame tu multiplicación: "
	Leer mpc
	Escribir "Dame tu suma: "
	leer sum
	
	num2<-(sum+RC((sum)^2-4*mpc))/2
	num1<- sum - num2
	Escribir "El número 1 es: [",num1,"], y el Número 2 es: [",num2,"]"
	
FinAlgoritmo
