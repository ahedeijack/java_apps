/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pila_simulacion;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class App_Pila_Simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Random azar = new Random();
        String [] esp = {"Normal","Especial","Basica"};
        int [] tam = {1,2,3};
        
        
        Pila datos = new Pila(10);
        Pila aux = new Pila(datos.Length());
        System.out.println("La capacidad de la pila es de: "+datos.Length());
        Elemento [] info = new Elemento[datos.Capacidad()];
        
        int i = 0;
        while(!datos.Full()) {
            
            info[i] = new Elemento(esp[azar.nextInt(3)],
                    tam[azar.nextInt(3)], 
                    (azar.nextInt(150)+50.00+(azar.nextInt(99)*.01)));
            datos.Push(info[i]);
            i++;
        }
        
        System.out.println("Capacidad de la pila:"+datos.Length());
       int cont = 0;
       
        while(!datos.Empty()){
            System.out.println("Hola");
            Object [] objeto = new Object[3];
            Elemento orden = datos.Pop();
            aux.Push(orden);
            objeto[0] = orden.getEspecialidad();
            objeto[1] = orden.getTamaño();
            objeto[2] = orden.getPrecio();
            System.out.println(objeto+" : "+cont);
            cont++;
        } 
        while(!datos.Full()){
            datos.Push(aux.Pop());
            System.out.println("Agregado...");
        }
        
        System.out.println("Eliminando el último dato de la pila; " + datos.Pop());
        System.out.println("Datos. \nC:"+datos.Capacidad()+", L:"+datos.Length());
        cont = 0;
        while(!datos.Empty()){
            System.out.println("Hola");
            Object [] objeto = new Object[3];
            Elemento orden = datos.Pop();
            aux.Push(orden);
            objeto[0] = orden.getEspecialidad();
            objeto[1] = orden.getTamaño();
            objeto[2] = orden.getPrecio();
            
            System.out.println(objeto+" : "+cont);
            cont++;
        } 
        cont = 0;
        while(!aux.Empty()){
            datos.Push(aux.Pop());
            System.out.println("Agregado..."+cont);
            cont++;
        }
        
       
    }
    
}
