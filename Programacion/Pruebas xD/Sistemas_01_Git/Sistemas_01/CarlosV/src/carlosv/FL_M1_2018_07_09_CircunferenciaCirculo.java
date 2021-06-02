/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;

import java.util.Scanner;

/**
 *
 * @author aa504
 */
public class FL_M1_2018_07_09_CircunferenciaCirculo {
    
    public static void main (String args[]){
        
//Declaración de variables
        double  radio, area, diametro, circunferencia; 
        
//Entrada de datos        
   //Definición dispositivo de entrada
     Scanner teclado = new Scanner(System.in);
     System.out.println("Area y diametro de un circulo! ");
     System.out.println("Ingresa el radio del circulo:  ");
     
//Proceso
      radio = teclado.nextDouble();
     
     area = Math.PI * Math.pow(radio, 2);
     
     diametro = radio*2;
     
     circunferencia = Math.PI * diametro;
     

//Salida de datos

          System.out.println("El radio es:  "+radio);
          System.out.println("El diametro es:  "+diametro);
          System.out.println("El area  es:  "+area);
          System.out.println("La circunferencia es:  "+circunferencia);

             }


    
}
