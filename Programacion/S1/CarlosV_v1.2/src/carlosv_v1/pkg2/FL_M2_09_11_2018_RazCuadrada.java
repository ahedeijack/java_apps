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
public class FL_M2_09_11_2018_RazCuadrada {
    public static void main (String[] args){
        Scanner read = new Scanner (System.in);
       double promedio, n, b, a;
       
        System.out.println("Ingresa el número a sacar raíz cuadrada: ");
        n = read.nextDouble();
       a = 1;
       b = n; 
       
        while(Math.abs(a-b)>0.000001){
        promedio = (a+b)/2;
        a = promedio;
        b = n/a;
        }
         
       System.out.println("La raíz de "+n+" = "+a); 
    }
}
