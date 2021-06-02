/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_032019_AppPila;

import java.util.Random;

/**
 *
 * @author aa613
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila edades = new Pila(12);
        
        Random rc = new Random();
        
        System.out.println(edades);
        
        while(!edades.estaLlena()){
            edades.poner(rc.nextInt(100));
            System.out.println(edades);
        }
        double valor =0;
        while(!edades.estaVacia()){
            valor = edades.quitar();
            System.out.println(edades+"-->"+valor); 
            
        }
    }
    
}
