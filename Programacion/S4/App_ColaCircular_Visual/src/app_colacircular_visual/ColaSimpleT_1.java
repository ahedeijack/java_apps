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
public class ColaSimpleT_1<T> {
    Object dato;
     Object []vec;
     int p, u; //tam;
    
    public ColaSimpleT_1(int n) {
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
    
    public boolean agregar(T dato){
        if(!llena()){
            vec[++u] = dato;
            if(u == 0)
                p = 0;
            return true;
        }
        return false;
    }
    
    public T extraer(){
        if(!vacia()){
            T dato = (T)vec[p];
            vec[p] = null;
            
            if(p == u){
                p = -1;
                u = p;
            }else
                p++;
            return dato;
        }
        return null;
    }
    public int primero(){
        return p;
    }
    public int ultimo(){
        return u;
    }
    
    public void mostrar(){
        System.out.println("datos de la pila");
        for (int i = 0; i < vec.length && !this.vacia(); i++)
            System.out.println("Dato ["+i+"] : "+vec[i]);
            //while(!vacia())
                //System.out.println("Dato -> [ "+p+" ]: "+vec[p++]);
        //p++ movera de posicion al atributo p, lo cual generara comportamientos no deseados
                
    }
    
    
}
