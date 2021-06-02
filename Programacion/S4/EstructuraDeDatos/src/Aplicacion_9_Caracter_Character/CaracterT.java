/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_9_Caracter_Character;

/**
 *
 * @author ahedeijack
 */
public class CaracterT<T> {
    
         Object  [] caracter;

         public CaracterT (int n){
        caracter = new Object [n];
    }
     
     public CaracterT(CaracterT v){
        caracter = new Object[v.tam()];
        for(int i = 0; i<caracter.length; i++){
            caracter[i] = v.leer(i);
        }
    }
     
       public void asignar (T val, int pos){
           if(pos>= 0 && pos< caracter.length){
               caracter[pos] = val;
           }
       }

       public T leer(int pos){
        if(pos>=0 && pos<caracter.length)
            return (T)caracter[pos];
            
        Object val = 1;
        return (T)val;
        
    }
       
       public int tam(){
        return caracter.length;
    }  
       
     public Object[] getVec() {
        return caracter;
    }

    public void setVec(Object[] caracter) {
        this.caracter = caracter;
    }
    
}
