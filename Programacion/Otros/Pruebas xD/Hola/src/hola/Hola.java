/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.util.Scanner;

/**
 *
 * @author ahedeijack
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = read.next();
        
        char c [] = new char[nombre.length()];
        
        System.out.println("Tu nombre en minusculas: ");
        
        int voc = 0;
        
        for(int i = 0; i<nombre.length(); i++){
           if(nombre.charAt(i) == 'a'||
              nombre.charAt(i) == 'e'||
              nombre.charAt(i) == 'i'||
              nombre.charAt(i) == 'o'|| 
              nombre.charAt(i) == 'u'){
               voc++;
           }
           
        }
        System.out.println("Cantidad de vocales: "+voc);
    }
    
}
