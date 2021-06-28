/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_tabla_multiplicar;

/**
 *
 * @author ahedeijack
 */
//Definir e implementar la clase vector para manerjar diferentes tipos de dato.
public class VectorT<T> {
     Object  [] vec;

         public VectorT (int n){
        vec = new Object [n];
    }
     
     public VectorT(VectorT v){
        vec = new Object[v.tam()];
        for(int i = 0; i<vec.length; i++){
            vec[i] = v.leer(i);
        }
    }
     
       public void asignar (T val, int pos){
           if(pos>= 0 && pos< vec.length){
               vec[pos] = val;
           }
       }

       public T leer(int pos){
        if(pos>=0 && pos<vec.length)
            return (T)vec[pos];
            
        Object val = 1;
        return (T)val;
        
    }
       
       public int tam(){
        return vec.length;
    }
    
       public float promedio(){
        float prom =0.0f;
        for(int i = 0; i<vec.length; i++){
            prom += (float)vec[i];
        }
        prom = prom/(float)tam();
        return prom;
    }
       
       
     public Object[] getVec() {
        return vec;
    }

    public void setVec(Object[] vec) {
        this.vec = vec;
    }

    
    
    public static float mayor(VectorT vector){
    float may = (float)vector.leer(0);
         
     for(int i = 0; i<= vector.tam(); i++){
         if((float)vector.leer(i) >= may){
             may = (float)(vector.leer(i));
         }
     }
     
         return may;
     }
      
      public static float menor(VectorT vector){
        int menor = Integer.parseInt(vector.leer(0)+"");
          
          for(int i = 0; i<= vector.tam(); i++){
              if((int)vector.leer(i)<=menor){
                  menor = (int)vector.leer(i);
              }
          }
          return menor;
      }
      
     
      
      
      //DETERMINAR MAYOR Y MENOR      //ESCRIBIR EN ORDEN INVERSO
      
      
    
}


