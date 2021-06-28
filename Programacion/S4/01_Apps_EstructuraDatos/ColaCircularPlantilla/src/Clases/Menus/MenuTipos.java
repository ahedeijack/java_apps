/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Menus;

import java.util.Scanner;

/**
 *
 * @author pqdst
 */
public class MenuTipos {
    
    public static char Opciones()
    {
        System.out.println("Que tipo de dato va a utilizar: ");
        System.out.println("1) Integer");
        System.out.println("2) Double");
        System.out.println("3) String");
        System.out.println("4) archivos de texto");
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
