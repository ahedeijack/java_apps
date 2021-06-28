/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_08_Vector1;

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
     
     public VectorT(Vector v){
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

    
    
      public static int mayor(int [] vector){
     int may = vector[0];
         
     for(int i = 0; i<= vector.length; i++){
         if(vector[i] >= may){
             may = vector[i];
         }
     }
     
         return may;
     }
      
      public static int menor(int [] vector){
          int menor = vector[0];
          
          for(int i = 0; i<= vector.length; i++){
              if(vector[i]<=menor){
                  menor = vector[i];
              }
          }
          return menor;
      }
      
     
      
      
      //DETERMINAR MAYOR Y MENOR
      //ENCONTRAR EL NUMERO QUE SE REPITE MAS DE UNA VEZ
      //ESCRIBIR EN ORDEN INVERSO
      
      
    
}


