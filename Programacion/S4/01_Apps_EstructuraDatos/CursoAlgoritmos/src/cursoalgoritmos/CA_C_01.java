/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoalgoritmos;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ahedeijak
 */
public class CA_C_01 {
 
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        double x, y;
        
        System.out.println("Ingresa el valor de X");
        x = 5;
        System.out.println("Ingresa el valor de Y");
        y = 10;
        
        if (x>y){
            System.out.println("El valor mas grande es de: "+x+" de x");
        } else {
            System.out.println("El valor mas grande es de: "+y+" de y");
        }
        
        //P2
        
        //Una empresa X, el salario de los trabajadores son: 
        //Operador = 1000, Ayudante de Lider = 1750; Lider 2500; Supervisor = 5000; Gerencia = 12250
        
        double a;
        System.out.println("------------");
        System.out.println("Ingresa el salario de los empleados: ");
        Random rand = new Random();
        a = rand.nextInt(12255);
        
        if (a<=1000){
            System.out.println("El trabajador es Operador $"+a);
        } else if(a>1001 && a <1749){
            System.out.println("El trabajador es Ayudante de Lider $"+a);
        } else if (a >1750 && a < 2499){
            System.out.println("El trabajador es Lider $"+a);
        } else if(a > 2500 && a < 4999) {
            System.out.println("El trabajador es Supervisor $"+a);
        } else if(a > 5000 && a <12250){
            System.out.println("El trabajador es de Gerencia $"+a);
        }
        
        
    }
    
}
