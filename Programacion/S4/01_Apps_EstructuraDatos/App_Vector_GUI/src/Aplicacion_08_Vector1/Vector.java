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
public class Vector {
    private int [] vec;

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }
 
    public int leer(int pos){
        
        if(pos>=0 && pos<vec.length)
            return vec[pos];
            
        return -1;
        
    }
    
    public int tam(){
        return vec.length;
    }
    
    public Vector(Vector v){
        vec = new int[v.tam()];
        for(int i = 0; i<vec.length; i++){
            vec[i] = v.leer(i);
        }
    }
    public Vector (int n){
        vec = new int [n];
    }
    
    public float promedio(){
        int suma = 0;
        float prom;
        for(int i = 0; i<vec.length; i++){
            suma += vec[i];
        }
        prom = suma/(float)tam();
        return prom;
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
      
       public void asignar (int val, int pos){
           if(pos>= 0 && pos< vec.length){
               vec[pos] = val;
           }
       }
      
      
      //DETERMINAR MAYOR Y MENOR
      //ENCONTRAR EL NUMERO QUE SE REPITE MAS DE UNA VEZ
      //ESCRIBIR EN ORDEN INVERSO
      
      
    
}
