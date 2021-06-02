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
public class PilaChar {
    
     char []vec;
     int tope;
// assert(vec);
     private boolean vacia;
     private boolean llena;
     
     
     public PilaChar(int n){
         vec = new char[n];
         tope =0;
         vacia = true;
         llena= false;
     }
     public void push(char valor){
         vacia = false;
         vec[tope++]= valor;
         if( tope == vec.length)
            llena = true;
     }
     
     public char pop(){
         if(--tope == 0)
           vacia = true;
         llena = false;
          
          return vec[tope];
     }
     
     
     public boolean isEmpty(){
         return vacia;
     }
     public boolean isFull(){
         return llena;
     }
     
     public int tope(){
         return vec[tope - 1];
     }
}
