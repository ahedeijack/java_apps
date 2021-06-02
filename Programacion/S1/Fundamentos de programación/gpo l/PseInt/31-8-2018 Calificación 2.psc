Algoritmo CalificacionPorPonderacion
		Escribir "Calificación de un alumno que presenta distintos examenes:"
		
		
		Escribir "Ingresa la calificacion de Fisica "
		Leer exFisica
		Escribir "Ingresa la calificacion de Quimica "
		Leer exQuimica
		Escribir "Ingresa la calificacion de Matematicas "
		Leer exMatematicas
		
		
		
		
		Si exFisica | exQuimica | exMatematicas > 101 Entonces
			Mientras cal > 101 Hacer
				escribir "Una de tus calificaciones sobre pasa el 100" 
				Escribir "Ingresa de nuevo las calificaciones: "
				Escribir "Calificación de un alumno que presenta distintos examenes:"
				Escribir "Ingresa la calificacion de Fisica "
				Leer exFisica
				Escribir "Ingresa la calificacion de Quimica "
				Leer exQuimica
				Escribir "Ingresa la calificacion de Matematicas "
				Leer exMatematicas
				cal = ((exFisica*.25)+(exQuimica*.35)+(exMatematicas*.40))/3
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

