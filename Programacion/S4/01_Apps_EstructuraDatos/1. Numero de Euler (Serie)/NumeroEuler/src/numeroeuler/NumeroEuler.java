/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroeuler;

/**
 *
 * @author Luis
 */
public class NumeroEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sumaActual= 1.0/Matematicas.factorialLong(0);
        double sumaAnterior = 0;
        double serieEuler = sumaActual;
        double dif_limite = 0.0001;
        int i=1;
        do 
        {
            sumaAnterior = sumaActual;
            sumaActual = 1.0/Matematicas.factorialLong(i); 
            serieEuler += sumaActual;
            i++;
            System.out.println("Suma Actual: " + sumaActual);
            System.out.println("Diferencia Actual: " + (sumaActual - sumaAnterior));
            System.out.println("Factorial de: " +i+ " = " + Matematicas.factorialLong(i));
            System.out.println("Serie Euler: " + serieEuler);
            System.out.println("Math.E: " + Math.E);
            System.out.println("");
        } while(sumaActual - sumaAnterior < dif_limite);
        
        System.out.println("Revisar los datos anteriores, es lo mas parecido al ejercicio");
        System.out.println("");
        System.out.println("Calculando el numero de euler por medio de la serie, podemos observar que " +
                           "Java solo puede soportar hasta el factorial de 65 (utilizando un long), en adelante el resultado " +
                           "lo interpreta como el 'Infinto', si utilizamos un tipo de dato Double, lo mas que soporta es hasta " +
                           "el factorial de 1/34! (lo cual no se acerca al numero de Euler dado por Math.E)");

    }  
}
