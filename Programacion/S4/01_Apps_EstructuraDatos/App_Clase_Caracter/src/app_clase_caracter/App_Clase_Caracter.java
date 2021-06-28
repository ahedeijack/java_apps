/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_clase_caracter;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class App_Clase_Caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Tu letra es mayor o menor?");
        char a = read.next().charAt(0);
        
        System.out.println("Es menor? "+Caracter.esMenor(a));
        System.out.println("Es mayor? "+Caracter.esMayor(a));
        
        System.out.println("Disminuir "+Caracter.disminuir(a));
        System.out.println("Aumentar "+Caracter.aumentar(a));
        
        System.out.println("Es número? "+Caracter.esNumero(a));
        
        
        
    }
    
    
    //Identificar cuando sea letra minuscula o mayuscula.
    //Convertir de minuscula a mayuscula y viceversa.
    //Identificar cuando es un digito.
}
