Algoritmo Algoritmo_U3_18131288
	//El usaurio quiere poner el limite, aquí haremos el calculo.
	 Escribir "Introducir limite de la serie"
	Leer n
	//n es el número limite de la serie a calcular.
	ss<-0
	//El valor de B es el valor que cambiara a simbolo contrario.
	b<-0
	
	Para I<-0 Hasta n Con Paso 1 Hacer
		Si b = 1 Entonces
			ss<-ss-1/(2*i+1)
			b<- -1
			
		SiNo
			ss<-ss+1/(2*i+1)
			b<- 1
			
		FinSi
	Fin Para
	
	piCalc<-ss*4
	Escribir"PI = ",piCalc
	
	
	
FinAlgoritmo
