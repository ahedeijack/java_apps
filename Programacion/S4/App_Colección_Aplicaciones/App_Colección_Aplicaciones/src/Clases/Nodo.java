/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author ahdeijack
 */
public class Nodo
{
        public int valor;
         String nombres;
         int iguales;
        public Nodo sig;
               
        public Nodo(int v, String nombres, int iguales, Nodo s){
                        valor = v;
                        this.nombres = nombres;
                        this.iguales = iguales;
                        sig = s;
                }
        
        public Nodo(){
            
        }

}
