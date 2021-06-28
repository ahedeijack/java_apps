/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu2_recursividad;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class AppU2_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        
        int n = read.nextInt();
        int fac = MatRec.Factorial(n);
        int sum = MatRec.Sumatoria(n);
        
        System.out.println("Factorial de "+n+" es: "+fac);
        System.out.printf("Factorial de %d es:  %d ",n,fac);
        
        System.out.println("Sumatoria de "+n+" es: "+sum);
        System.out.printf("Factorial de %d es:  %d ",n,sum);
        
        //Implementar la app de anera interactiva
        //El usuario implica cuando terminar
        //Validar el valor cuando se calcule el factorial.
    
        //APP Multiplicación GUI
        //
    }
    
}
