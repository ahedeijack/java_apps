/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_listaelazada_java;

import java.text.DecimalFormat;

/**
 *
 * @author ahdeijack
 */
public class NodoLista {
   private int dato;
   private double datoD;
   private String nombre;
    NodoLista sig;
    
    public NodoLista(int d, double dd, String n){
        dato = d;
        datoD = dd;
        nombre =  n;
        sig = null;
    }
    
        public NodoLista(){
        dato = 0;
        datoD = 0.0;
        nombre =  null;
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
     DecimalFormat format = new DecimalFormat("#.##");
     
     NodoLista p1;
     p1 = this;
     while(p1 != null)
     {
         System.out.println("| "+p1.dato+ " |  "+format.format(p1.datoD)+" | "+" | "+p1.nombre+" -> ");
     p1 = p1.sig;
     }
        System.out.println("\n");
    }
}
