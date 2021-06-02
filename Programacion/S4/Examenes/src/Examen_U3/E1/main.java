/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_U3.E1;

import java.util.Scanner;

/**
 *
 * @author Ahedeijak
 */
public class main {
    public static void main(String[] args){
        
       
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa el numero de productos a registrar:");
        int n = read.nextInt();
        String ss, ss2, ss3;
        double ss4;
        Producto datos [] = new Producto[n];
        
        for(int i = 0; i < datos.length; i++){
            System.out.println("Que tipo de producto es? Nacional(1), o Importado(2)");
            int s = read.nextInt();
            
            if (s == 1) {
                
                    
                    System.out.println("Ingresa Proveedor: ");
                     ss2 = read.nextLine();
                    System.out.println("Ingresa la descripcion: ");
                     ss = read.nextLine();
                    datos[i] = new Nacional(ss, ss2);
                    
            } else if(s == 2) {
                   
                    System.out.println("Ingresa el precio: ");
                     ss4 = read.nextDouble();
                    System.out.println("Ingresa la descripcion: ");
                     ss3 = read.nextLine();
                    datos[i] = new Importado(ss3, ss4);
                    
            }
                    
            else if (s != 1 || s != 2){
                    System.out.println("La seleccion no existe...");
            }
            
           
            
            
        }
        
         System.out.println("Los datos ordenados son:");
            
            for(int r = datos.length-1; r>=0; r--){
                System.out.println("→"+datos[r].mostrar());
            }
        
    }
    
    
}
