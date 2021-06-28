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
   private Nodo pos;
    NodoLista sig;
    
    DefaultListModel modelo;
    
    public NodoLista(String arch, double dd, Nodo pos){
        archivo = arch;
        datoD = dd;
        this.pos = pos;
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
    }
 
    
     public void Borrar(int v){
        Nodo anterior, nodo;
        nodo = pos;
        anterior = null;
        while(nodo!=null && nodo.valor<v){
            anterior = nodo;
            nodo = nodo.sig;
        }
        if(nodo==null||nodo.valor!=v)
            return;
        else{
            if(anterior ==null)
                pos=nodo.sig;
            else
                anterior.sig=nodo.sig;
        }
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
