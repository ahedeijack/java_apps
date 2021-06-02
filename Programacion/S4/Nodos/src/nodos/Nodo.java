/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author ahdeijack
 */
public class Nodo
{
        public int valor;
        public Nodo sig;
               
        public Nodo(int v, Nodo s){
                        valor = v;
                        sig = s;
                }
}
