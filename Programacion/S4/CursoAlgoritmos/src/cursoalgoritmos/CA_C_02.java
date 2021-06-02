/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoalgoritmos;

import java.util.Scanner;

/**
 *
 * @author Ahedeijak
 */
public class CA_C_02 {
    public static void main (String args[]){
        int i, r; 
        Scanner read = new Scanner(System.in);
        System.out.println("Cuantas repeticiones quieres hacer?");
        r = read.nextInt();
        int suma = 1;
        
        System.out.println("");
        for (i = 0; i<r; i++){
            suma = suma + i;
             System.out.println(""+suma);
        }
            
    }
}
