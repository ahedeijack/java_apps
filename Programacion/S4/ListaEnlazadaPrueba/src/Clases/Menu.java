/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author pqdst
 */
public class Menu {
    
    public static char opciones(){
        System.out.println();
        System.out.println("1) ingresar");
        System.out.println("2) borrar");
        System.out.println("3) primer elemento de la lista");
        System.out.println("4) informacion del elemento actual");
        System.out.println("5) ultimo elemento de la lista");
        System.out.println();
        System.out.println("0) salir");
        System.out.println();
        System.out.print("eliga una opcion -> ");
        
        Scanner leer = new Scanner(System.in);
        char opc = leer.next().charAt(0);
        
        return opc;
    }
    
}
