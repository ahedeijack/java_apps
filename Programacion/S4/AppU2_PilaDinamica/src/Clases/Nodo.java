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
public class Nodo {
    
   String elemento;
   Nodo siguiente;
   
   public Nodo(String elemento){
       
       this.elemento = elemento;
       siguiente = null;
   }
}
