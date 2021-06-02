Algoritmo EcuacionCuadratica		
	Escribir "Coeficiente A: "
    leer a
	Escribir "Coeficiente B: "
    leer b
	Escribir "Coeficiente C: "
    leer c
	
	x1 <- (-b+RC(b^2-4*a*c))/(2*a)
	x2 <- (+b+RC(b^2-4*a*c))/(2*a)
	
	Escribir "X1 = ",x1
	Escribir "X2 = ",x2
	
	
FinAlgoritmo
