Algoritmo ValidacionDeFechas
		Escribir "Carlos Alberto V�zquez Aguirre\18131288\P2"
		definir diaSV, mesSV, a�oSV, abis, am como entero
		Definir mesVal como cadena
		Escribir "Ingresa el n�mero del d�a: "
		leer diaSV
		Escribir "Ingresa el n�mero de mes: "
		leer mesSV
		Escribir "Ingresa el n�mero del a�o: "
		leer a�oSV
		
		//Validaci�n del a�o
		//Se crea una variable la cual dira si es Bisiesto o no lo es.
		Si a�oSV MOD 4 = 0 y ((a�oSV MOD 400 = 0) o (a�oSV MOD 100 <> 0)) Entonces
			Escribir "El a�o ",a�oSV," es bisiesto" 
			abis = 1;
		SiNo
			Escribir "El a�o ",a�oSV," no es bisiesto" 
			abis = 2;
		FinSi
		
		//Validaci�n del mes
		//Si el mes es menor a 0 o bien, mayor a 13 saltara un error.
		Si mesSV <= 0 Entonces
			Escribir "El mes es erroneo"
		SiNo
			Si mesSV >= 13 Entonces
				escribir "El mes es erroneo, (",mesSV," ) no existe."
			SiNo
				Segun mesSV Hacer
						//Se hace una asiganci�n simple de 1,2,3
						//1 equivale a mes de 30 d�as
						//2 equivale a mes de 31 d�as
						//3 equivale a febrero (29 d�as)
						
					1:
						am = 2
						mesVal = "enero"
					2:
						am = 3
						mesVal = "febrero"
					3:
						am = 1
						mesVal = "marzo"
					4:
						am = 2
						mesVal = "abril"
					5:
						am = 1
						mesVal  = "mayo"
					6:
						am = 2
						mesVal = "junio"
					7:
						am = 1
						mesVal = "julio"
					8 :
						am = 2
						mesVal = "agosto"
					9:
						am = 1
						mesVal  = "septiembre"
					10:
						am = 2
						mesVal = "octubre"
					11:
						am = 1 
						mesVal= "noviembre"
						Escribir "El mes es ",mesVal,"."
					12:
						am = 2
						mesVal = "diciembre"
					De Otro Modo:
						
				Fin Segun
			Fin Si
			
		Fin Si
		
		
		//Si el mes es 3 (febrero) y el a�o bisiesto es correcto, se hara una instrucci�n siguiente.
		Si am = 3 y abis = 1 
			Entonces
			//La cual, es quesi el d�a es menor, o mayor a 29 cuando el a�o sea bisiesto,  dara un error.
			Si diaSV < 0 o diaSV >= 30 Entonces
				Escribir "Tu fecha es Erronea."
			SiNo
				//Pero, si todo es correcto, entonces sera valido el argumento y desplegara la fecha.
				Escribir "Est�s a ",diaSV," de ",mesVal," de ",a�oSV
			Fin Si
		fin si
		//
		
		//En esta instrucci�n es lo mismo, solo que cuando el a�o no ea bisiesto, se buscara si el mes de 
		//febrero tiene m�s de 29 d�as. Si es correcto entonces saldr� un error.
		Si am = 3 y abis = 2 
			Entonces
			Si diaSV < 0 o diaSV >= 29 Entonces
				Escribir "Tu fecha es Erronea."
			SiNo
				Escribir "Est�s a ",diaSV," de ",mesVal," de ",a�oSV
			Fin Si
		Fin Si
		//
		
		//En las siguientes instrucciones se dara un aviso cuando el mes sea de 30 o 31 dias
		//as� como decir si el mes es correcto, o no lo es. 
		si am = 1 
			Entonces
			si diaSV < 0 o diaSV >= 31
				escribir "Tu fecha es Erronea"
			SiNo
				Escribir  "Est�s a ",diaSV," de ",mesVal," de ",a�oSV
			Fin Si		
		Fin Si
		//
		si am = 2
			Entonces
			si diaSV < 0 o diaSV >=32
				Escribir "Tu fecha es Erronea"
			SiNo
				Escribir  "Est�s a ",diaSV," de ",mesVal," de ",a�oSV
			FinSi
		Fin Si
FinAlgoritmo
	

	
	
	
	

