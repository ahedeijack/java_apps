/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso_problema_2;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class Concurso_Problema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa la cadena de texto");
        Scanner read = new Scanner(System.in);
        String cad = read.nextLine();
        
        char [] ord = cad.toCharArray();
        char aux ='a';
        char [] listo = new char[ord.length];
        
        
        for (int i = 0; i < cad.length(); i++) {
            if(aux > ord[i]){
                listo[i] = aux;
                aux = ord[i];
        }
    }
        StringBuilder orden = new StringBuilder();
        
        for (int i = 0; i < listo.length; i++) {
            orden.setCharAt(i,listo[i]);
        }
    
}
}
