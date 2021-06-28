/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenuarchivosbinarios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author martinos
 */
public class AppMenuArchivosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArchivoBinarioEnteros archivo = new ArchivoBinarioEnteros();
        
       // ArchivoBinarioEnteros.guardar_archivo("datos.val");
//        ArchivoBinarioEnteros.leer_archivo("datos.val");
//        ArchivoBinarioEnteros.agregar_a_archivo("datos.val");
//        ArchivoBinarioEnteros.leer_archivo("datos.val");
//  
       
        char opcion;
        Scanner sc = new Scanner(System.in);
        String nomarch;
        boolean band = true;
        while(band)
        //while(true)
        {
           opcion = Menu.Opciones();
           switch(opcion)
           {     // 49   
               case '1': {
                          System.out.println("NOMBRE DEL ARCHIVO : ");
                          nomarch = sc.nextLine();
                          ArchivoBinarioEnteros.leer_archivo(nomarch);
                        }
                         break;
                  //'2'      
               case '2':{
                         System.out.println("NOMBRE DEL ARCHIVO : ");
                          nomarch = sc.nextLine();
                          ArchivoBinarioEnteros.guardar_archivo(nomarch);
                        }
                        break;
               case '3':{
                         System.out.println("NOMBRE DEL ARCHIVO : ");
                          nomarch = sc.nextLine();
                          ArchivoBinarioEnteros.agregar_a_archivo(nomarch);
                        }
                        break;
               case '4': band = false;
                        // System.exit(0);
                         break;
           }
           
        }
    }
    
}
