/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_colacircular;

import java.util.Scanner;

/**
 *
 * @author ahdijack
 */
public class MenuTipos {
     public static int opciones()
    {
        System.out.println("Tipo de dato a utilizar");
        
        System.out.println("1) Entero");
        System.out.println("2) Double");
        System.out.println("3) String");
        System.out.println("4) Nombres en Archivo");
        System.out.println("5) Terminar");
        System.out.println("Opción : ");
        Scanner teclado = new Scanner(System.in);
        int opc = teclado.nextInt();
        return opc;
    }
}
