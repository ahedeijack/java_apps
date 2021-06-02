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
    
 public int valor;
 public String nombre;
 public Nodo sig;
 
 public Nodo(int v,String n,Nodo s){
 valor = v;
 nombre = n;
 sig = s;
 }   
}
