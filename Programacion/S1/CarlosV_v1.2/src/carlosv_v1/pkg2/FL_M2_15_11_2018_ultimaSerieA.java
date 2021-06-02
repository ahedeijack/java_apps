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
public class FL_M2_15_11_2018_ultimaSerieA {
    public static void main (String[] args){
        
    
   Scanner read = new Scanner(System.in); 
   int n, i, signo, d;
   double r, suma, termino;
   
   System.out.println("Ingresa el valor del denominador:");
   r = read.nextDouble();
   System.out.println("Ingresa el valor de terminos ");
   n = read.nextInt();
   
   d = 1;
   suma = 0;
   signo = 1;
   
   for (i=1; i<=n; i++){
       termino = Math.pow(r, i) / d;
       suma = suma + termino * signo;
       
       d = d + 3;
       signo = signo * (-1);
       
   }
   System.out.println("La suma es : "+suma);
}
}