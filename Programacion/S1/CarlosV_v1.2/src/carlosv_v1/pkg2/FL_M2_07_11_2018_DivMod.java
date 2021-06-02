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
public class FL_M2_07_11_2018_DivMod {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        
        int cociente;
        double dividendo, divisor, residuo;
        
        System.out.println("Ingresa el valor del dividendo: ");
        dividendo = read.nextDouble();
        
        System.out.println("Ingresa el valor del divisor: ");
        divisor= read.nextDouble();
        
        cociente = 0 ;
        residuo = dividendo;
        
        while (residuo >= divisor){
            residuo = residuo - divisor;
            cociente++;
        }
        
        System.out.println(dividendo+" div "+divisor+" = "+cociente);
        System.out.println(dividendo+" div "+divisor+" = "+residuo);
        
    }
}
