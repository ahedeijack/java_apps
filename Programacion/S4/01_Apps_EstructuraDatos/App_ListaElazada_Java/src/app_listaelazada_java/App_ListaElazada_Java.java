/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_listaelazada_java;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author ahdeijack
 */
public class App_ListaElazada_Java {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
        // TODO code application logic here
        String [] nombres = {"Juan", "Pedro", "Enrique", "Jaime", "Oswaldo","C++ ", "Alberto", "Java"};
        Random azar  = new Random();
        double dob = azar.nextDouble()*10;
        
        NodoLista primero = new NodoLista(azar.nextInt(90)+10,dob, nombres[azar.nextInt(nombres.length)]);
        NodoLista nodo = primero;
       
        for (int i = 0; i < 5; i++) {
            dob = azar.nextDouble()*10;
            NodoLista nuevo = new NodoLista(azar.nextInt(90)+10,dob, nombres[azar.nextInt(nombres.length)]);
            nodo.insertar_s(nuevo);
            nodo = nuevo;
        }
        
        primero.muestra();
        nodo.muestra();

    }
    
}
