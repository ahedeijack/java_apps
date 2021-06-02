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
public class PilaDinamica {
//    
//    int tam;
//    Nodo tope;
//    
//    public boolean isEmpty(){
//        return tope ==null;
//    }
//    
//    public void push(String elemento){
//        Nodo nuevo = new Nodo(elemento);
//        nuevo.siguiente=tope;
//        tope=nuevo;
//        tam++;
//    }
//    
//    public String pop(){
//        String aux = tope.elemento;
//        tope = tope.siguiente;
//        tam--;
//        
//        return aux;
//    }
//    
//    public void mostrar(){
//        Nodo recorre=tope;
//        while(recorre!=null) {
//            System.out.print("&lt;---[" + recorre.elemento + "]");
//            recorre = recorre.siguiente;
//        }
//    }
     int tam;
     int []vec = new int[tam];
     int tope= 0;
// assert(vec);
     boolean vacia = true;
     boolean llena = false;
     
     public void push(int valor){
         vacia = false;
         vec[tope++]= valor;
         if( tope == tam)
         llena = true;
     }
     
     public int pop(){
         if(--tope == 0)
           vacia = true;
         llena = false;
          
          return vec[tope];
     }
}

