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
public class FL_M2_08_11_2018_FactorialComunFuncion {
    public static void main (String[] args){
       long fac =1; 
       for (int i = 0; i <=200; i++)
        
        System.out.println(i+" != "+factorial(i));
    }
    //Función
    public static  int factorial (int n){
        double fac = 1;
        int i = 1;
        
        for (i=1; i<=n; i++)
            fac *= i;
    return (int) fac;
    }
   //Función 
    
}
