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
    
    public static char Opciones()
    {
        System.out.println("Que deseas hacer: ");
        System.out.println("1) Insertar Dato");
        System.out.println("2) Borrar Dato");
        System.out.println("3) Mostrar la Cola");
        System.out.println();
        System.out.println("0) Salir");
        System.out.println();
        System.out.println("Opción : ");
        System.out.println();
        
        Scanner leer = new Scanner (System.in);
        char opc = leer.next().charAt(0);
        return opc;
    }
}
