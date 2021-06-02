/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_prestas_simple;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class App_Prestas_Simple {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        int i,n;
        
        
        System.out.print("\n Cantidad de elementos:  ");
        n = leer.nextInt();
        Cola cola = new Cola(n);

        Numero dato = new Numero(10);
        
        for (int j = 0; j < n; j++) {
           
            dato = new Numero(azar.nextInt(100));
            
            if(cola.agregar(dato.valor()))
                System.out.println("\nDato agegado: "+dato.valor());
            else
                System.out.println("\nDesbordamiento: ");
        }
        System.out.println("\n\n\tExtrayendo datos de la cola ");
        Object numero = new Object();
        
        while(cola.extraer(dato))
            System.out.println("\nDato extraido"+dato.num);
    }
    
}
