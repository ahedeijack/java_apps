Algoritmo CajasBotellas	
	
	Escribir "Calculo de cajas de 12 botellas, así como la obtención de botellas sueltas"
	Escribir "Ingresa el valor de las botellas:"
	
	leer botellas
	cajas <- TRUNC (botellas/12) 
	sueltas <- botellas MOD 12
	Escribir "La cantidad de cajas es: ",cajas,", y de botellas sueltas: ",sueltas
	
	
FinAlgoritmo
