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
public class Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada primero = new ListaEnlazada();
        primero.Insertar(10);
        primero.Insertar(12);
        primero.Insertar(1);
        primero.Insertar(5);
        primero.Insertar(3);
        primero.Mostrar();
        
        
        primero.Borrar(5);
        primero.Borrar(10);
        primero.Mostrar();
        
      
        
    }
    
}
