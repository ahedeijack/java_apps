/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_colacircular_visual;

/**
 *
 * @author pqdst
 */
public class Cola<T> {
    Object dato;
     Object []vec;
     int p, u; //tam;
    
    public Cola(int n) {
        p=u=-1;
        //tam=n;
        vec = new Object[n];
    }
    
    public boolean llena(){
        if (u >= vec.length-1)
            return true;
        
        return false;
    }
    
    public boolean vacia(){
        if(p==-1)
            return true;
        return false;
    }
    
    public boolean agregar(Object dato){
        if(!llena()){
            vec[++u] = dato;
            if(u == 0)
                p = 0;
            return true;
        }
        return false;
    }
    
    public T extraer(){
        if(p!=0){ //verificamos si la cola no esta vacia
            dato = vec[p-1];
            if(p==u){ //hay un solo elemento
                p=0; //indica cola vacia
                u=0;
            }
            else
                p++;
            System.out.println("Dato Eliminado: "+dato);
            return (T)dato;
        }
        else{
            System.out.println("OVERFLOW");
            System.out.println("Dato Eliminado: "+dato);
            return (T)dato;
        }
    }
    public int primero(){
        return p;
    }
    public int ultimo(){
        return u;
    }
    
    public void mostrar(){
        System.out.println("datos de la pila");
      //  for (int i = 0; i < vec.length; i++) 
            while(!vacia())
                System.out.println("Dato -> [ "+p+" ]: "+vec[p++]);
        
    }
    
    
}
