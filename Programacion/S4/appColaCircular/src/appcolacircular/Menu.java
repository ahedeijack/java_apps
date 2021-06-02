/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolacircular;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class Menu {
     public static int opciones()
    {
        System.out.println("C O L A");
        System.out.println("1) Insertar Dato");
        System.out.println("2) Borrar Dato");
        System.out.println("3) Salir");
        System.out.println("Opción : ");
        Scanner teclado = new Scanner(System.in);
        int opc = teclado.nextInt();
        return opc;
    }
}
