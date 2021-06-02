/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicación_01_numero_euler;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class Aplicación_01_Numero_Euler {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        char rep = 's';
        
do {
        System.out.println("Ingresa la cantidad de números a calcular: ");
        int num;
//Validación del número.        
try{
        num = read.nextInt();
//En caso de error.
        } catch(InputMismatchException e) {
            System.out.println("Ingresa un número, una letra no funciona, error del sistema:  "+e);
            System.out.println("Por defecto se dara el valor de 10.");
            num = 10;
        } 
//Repeticiones para hacer. 
    double res = Matematicas.Euler(num);
    
    System.out.println("número es con calculadora: "+res);
    System.out.println("número calculado netbeans: "+Math.E);
        
        System.out.println("Quieres calcular con otra cantidad?");
        rep =(char) System.in.read();
        
    } while (rep == 's' || rep == 'S');


   }
    
}
