/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author pqdst
 */
public class NodoLista {
    int dato;
    NodoLista sig;
    
    public NodoLista(int d){
        dato = d;
        sig = null;
    }
    
    public void insertar_s(NodoLista nodo){
         if(sig == null) //0
     {
     sig = nodo;
     nodo.sig = null;//0
     }
     /*else {
     nodo->sig = sig;
     sig = nodo;
     }*/
    }
    
    public void muestra(){
     NodoLista p1;
     p1 = this;
     while(p1 != null)
     {
         System.out.print(p1.dato+" -> ");
     p1 = p1.sig;
     }
        System.out.println("\n");
    }
}
