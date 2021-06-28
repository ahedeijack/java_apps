/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazadaprueba;

import Clases.ListaEnlazada;

/**
 *
 * @author pqdst
 */
public class ListaEnlazadaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     ListaEnlazada lista = new ListaEnlazada();
     lista.Insertar(10);
     lista.Insertar(12);
     lista.Insertar(1);
     lista.Insertar(5);
     lista.Insertar(3);
     lista.Mostrar();
     
     lista.Borrar(5);
     lista.Borrar(10);
     lista.Mostrar();
     
     
    }
    
}
