Algoritmo CalificacionPorPonderacion
		Escribir "Calificación de un alumno que presenta distintos examenes:"
		
		
		Escribir "Ingresa la calificacion de Fisica "
		Leer exFisica
		Escribir "Ingresa la calificacion de Quimica "
		Leer exQuimica
		Escribir "Ingresa la calificacion de Matematicas "
		Leer exMatematicas
		
		Escribir "Ingresa la ponderacion de Quimica"
		Leer ponQ
		Escribir "Ingresa la ponderacion de Fisica"
		leer ponF
		ponM <- 100 - (ponQ+ponF)
		
		
		
		
		Si exFisica | exQuimica | exMatematicas > 101 Entonces
			Mientras cal > 101 Hacer
				escribir "Una de tus valores sobrepasa el 100" 
				Escribir "Ingresa de nuevo los valores: "
				Escribir "Calificación de un alumno que presenta distintos examenes:"
				Escribir "Ingresa la calificacion de Fisica "
				Leer exFisica
				Escribir "Ingresa la calificacion de Quimica "
				Leer exQuimica
				Escribir "Ingresa la calificacion de Matematicas "
				Leer exMatematicas
				Escribir "Ingresa la ponderacion de Quimica"
				Leer ponQ
				Escribir "Ingresa la ponderacion de Fisica"
				leer ponF
				ponM <- 100 - (ponQ+ponF)
				
				ponF<-ponF/100
				ponQ<-ponQ/100
				ponM<-ponM/100
				
				puntM <- exMatematicas * ponM;
				puntF <- exFisica * ponF;
				puntQ <- exQuimica * ponQ;
				
				Escribir "La calificacion del alumno es: "
				Escribir "Fisica: ", exFisica
				Escribir "Quimica: ", exQuimica
				Escribir "Matematicas: ", exMatematicas
				Escribir "Final: ", cal
			Fin Mientras
		SiNo
			cal = ((exFisica*.25)+(exQuimica*.35)+(exMatematicas*.40))/3
			Escribir "La calificacion del alumno es: "
			Escribir "Fisica: ", exFisica
			Escribir "Quimica: ", exQuimica
			Escribir "Matematicas: ", exMatematicas
			Escribir "Final: ", cal
			
		Fin Si
		
		
		
		
		
FinAlgoritmo

