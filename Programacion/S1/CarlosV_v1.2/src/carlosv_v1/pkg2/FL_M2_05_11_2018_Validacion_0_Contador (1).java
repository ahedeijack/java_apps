package carlosv_v1.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M2_05_11_2018_Validacion_0_Contador {
    public static void main (String[] args){
        int rep, enojado;
        double cociente, divisor, dividendo;
        Scanner read = new Scanner(System.in);
        //Repeticion del programa.
        do {
        
            
        System.out.println("Ingresa el valor del dividendo: ");
        dividendo = read.nextDouble();
        enojado=0;
        
        do {
           enojado++;
           
           switch(enojado){
               case 1:System.out.println("Ingresa el valor del divisor: "); break;
               case 2:System.out.println("El divisor no puede ser 0, ingresa de nuevo: "); break;
               case 3:System.out.println("El valor del divisor, NO, PUEDE, SER, CERO, intenta de nuevo: "); break;
               case 4:System.out.println("Ok, no se puede el 0, trata nuevamente: "); break;
               case 5:System.out.println("okay...intenta de nuevo: "); break;
               default: System.out.println("Orale pues perro, a ver quien se cansa primero JEJEJE");
           }
           divisor = read.nextDouble();
           }
            while (divisor == 0);    
        
        cociente = dividendo / divisor; 
        
        System.out.println(dividendo+ " / " +divisor+ " = "+cociente);
        System.out.println("Presiona 1 para repetir, 0 para terminar.");
        rep = read.nextInt();
        
        if (rep >= 1)
            rep = 1;
        else if (rep <= 0)
            rep = 0;
        
        }
        while (rep == 1);
    }
}
