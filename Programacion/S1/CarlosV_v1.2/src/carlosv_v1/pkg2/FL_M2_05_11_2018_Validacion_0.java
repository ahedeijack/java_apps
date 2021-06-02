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
public class FL_M2_05_11_2018_Validacion_0 {
    public static void main (String[] args){
        int rep;
        double cociente, divisor, dividendo;
        Scanner read = new Scanner(System.in);
       
        do {
        
        System.out.println("Ingresa el valor del dividendo: ");
        dividendo = read.nextDouble();
        
        do {
            System.out.println("Ingresa el valor del divisor: ");
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
