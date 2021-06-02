/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_032019_AppPila;

/**
 *
 * @author aa613
 */
public class Pilagenerica <T> {
    private T [] datos;
    private int tope;

    public Pilagenerica() {
        datos = (T[])new Object [10];
        tope =-1; // vacia 
    }
    public Pilagenerica(int n){
        if(n<1)
            n = 10;
        
        datos = (T[])new Object [n];
        tope = -1; // pila base 
    }
    public int getCapacidad(){
        return datos.length;
    }
    public boolean estaVacia(){
        
//        if(tope == -1)
//            return true;
//        else 
//            return false;
         return tope == -1;
    }
    public boolean estaLlena(){
        return tope == datos.length-1;
    }
    public void poner(T x){
        if(!estaLlena()){
            tope++;
            datos[tope] =x;
        }
    }
    public T quitar(){
        if(!estaVacia())
        {
            tope--;
            return datos[tope+1];
        }
        else 
            return null;
    }

    @Override
    public String toString() {
       String cad = "[";
       for(int i =0;i<=tope;i++){
           cad+=datos[i];
           
           if(i<tope)
               cad+= ",";
       }
       cad+= "]";
       return cad;
    }
    
    
    
    
}
