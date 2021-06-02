/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_prestas_simple;

/**
 *
 * @author ahdeijack
 */
public class Cola <T>{
        Object []vec;
    int p, u; // tam;
    
    public Cola(){
        
    }

    public Cola(int n) {
        p=u=1;
        // tam=n;
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
    
    public boolean extraer(Object dato){
        if(!vacia()){
            dato = vec[p];
            if (p == u) {
                p = -1;
                u = p;
            }else
                p++;
            return true;
        }
        return false;
    }
    
    public void mostrar(){
        System.out.println("datos de la Cola.");
        //for (int i = 0; i < vec.length; i++) 
            while(!vacia())
                System.out.println("Dato -> [ "+p+" ]: "+vec[p++]); 
    }
}
