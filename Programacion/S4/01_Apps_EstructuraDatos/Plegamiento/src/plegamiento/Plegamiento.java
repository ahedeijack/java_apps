/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plegamiento;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class Plegamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejemplo plegamiento.");
        System.out.println("Ingresa el tamaño de la tabla");
        Scanner read = new Scanner(System.in);
        int tam = read.nextInt();
        
        int el1 = 1231;
        int el2 = 2131;
        int el3 = 1251;
        int el4 = 4562;
        int el5 = 5865;
        
        Hash tabla = new  Hash(tam);
        System.out.println("Plegamiento");
        System.out.println("Posicion El1: "+tabla.plegamiento(el1));
        System.out.println("Posicion El2: "+tabla.plegamiento(el2));
        System.out.println("Posicion El3: "+tabla.plegamiento(el3));
        System.out.println("Posicion El4: "+tabla.plegamiento(el4));
        System.out.println("Posicion El5: "+tabla.plegamiento(el5));
        
    }

    
}
