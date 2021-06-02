/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodolistajava;

import Clases.NodoLista;

/**
 *
 * @author pqdst
 */
public class NodoListaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        NodoLista primero = new NodoLista(5);
        NodoLista nodo = primero;
        
        for (int i = 0; i < 5; i++) {
            NodoLista nuevo = new NodoLista(i*i);
            nodo.insertar_s(nuevo);
            nodo = nuevo;
        }
        
        primero.muestra();
        nodo.muestra();
    }
    
}
