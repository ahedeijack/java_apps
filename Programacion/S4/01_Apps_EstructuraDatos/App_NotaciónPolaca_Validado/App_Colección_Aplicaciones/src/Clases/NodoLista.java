/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author ahdeijack
 */

public class NodoLista {
   private String archivo;
   private double datoD;
    NodoLista sig;
    
    DefaultListModel modelo;
    
    public NodoLista(String arch, double dd){
        archivo = arch;
        datoD = dd;
        sig = null;
    }
    
        public NodoLista(){
        archivo = null;
        datoD = 0.0;
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
 
    
    //Modificamos el metodo de muestra, recibimos un jTextArea, para poder ir agregando las direcciones.
    
    public void muestra(DefaultListModel modelo,DefaultListModel modelo2, JList lista, JList tam){
     DecimalFormat format = new DecimalFormat("#.##");
     
     NodoLista p1;
     p1 = this;
     
     while(p1 != null){
              modelo.addElement(p1.archivo);
              modelo2.addElement(p1.datoD);
              p1 = p1.sig;
     }
             lista.setModel(modelo);
             tam.setModel(modelo2);
    }
    
    
}
