/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprueba;

import Clases.Cola;
import java.util.Scanner;
import Clases.Menu;
import Clases.Numero;

/**
 *
 * @author pqdst
 */
public class ColaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el maximo de la cola");
        int max = leer.nextInt();
        int dato;
        
        Cola <Integer>c = new Cola(max);
        
        char opcion;
        boolean band = true;
        
        while(band){
            opcion = Menu.Opciones();
            switch(opcion){
                case '0':{
                    System.out.println("Adios c:");
                    band = false;
                }break;
                
                case '1':{    
                    System.out.println("Inserte dato en la cola: ");
                    for (int i = 0; i < max; i++) {
                        System.out.println("Inserte el dato: "+i);
                        dato = leer.nextInt();
                        
                        if(c.agregar(dato))
                            System.out.println("El dato -> "+dato+", fue agregado.");
                        else
                            System.out.println("Overflow!! Cola llena.");
                    }
                }
                break;
                
                case '2':{
                    
                    c.extraer();
                    
                }break;
                
                case '3':{
                    c.mostrar();
                }break;
                
            }

        }
    }
    
}
