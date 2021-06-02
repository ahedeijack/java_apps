/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M2_15_11_2018_ultimaSerieB {
    public static void main (String[] args){
        
    
   Scanner read = new Scanner(System.in); 
   int n, i, signo, d;
   double r, suma, termino, limite;
   
   System.out.println("Ingresa el valor del denominador:");
   r = read.nextDouble();
   System.out.println("Ingresa el limite del denominador ");
   limite = read.nextDouble();
   
   d = 1;
   suma = 0;
   signo = 1;
   i = 1;
   while (d<limite){
       termino = Math.pow(r, i) / d;
       suma = suma + termino * signo;
       i +=1;
       d = d + 3;
       signo = signo * (-1);
       
   }
   System.out.println("La suma es : "+suma);
}
}