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
public class FL_M2_08_11_2018_FactorialComún {
    public static void main (String[] args){
        
        int i, fac, n;
        i = 1;
        fac = 1;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Programa para sacar el Factorial de un número.");
        System.out.println("Ingresa el número.");
        n = read.nextInt();
        
        for (i=1; i<=n; i++)
            fac *= i;
        
        System.out.println(n+"! ="+fac);
    }
}
