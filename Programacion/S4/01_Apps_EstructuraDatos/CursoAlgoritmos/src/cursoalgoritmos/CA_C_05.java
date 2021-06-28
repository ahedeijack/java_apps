/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package cursoalgoritmos;

import java.util.Random;

/**
 *
 * @author Ahedeijak
 */
public class CA_C_05 {
    
    public static void main(String args[]){
    
        System.out.println("Cuantos dulces ecesitas para hacer distintos tipos de dulces?");
        
        Random azar = new Random();
        int renglones, columnas;
        
        renglones = 3;
        columnas = 3;
        
        double[][] dulces = new double [renglones][columnas];
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                double llenar = azar.nextInt(10)+1;
                dulces[i][j] = llenar;
                llenar = 0;
                 
            }
        }
        
        double iTotal, jTotal; 
        
        for(int i = 0; i<3; i++){
            
            System.out.println("|");
            
            for(int j = 0; j<3; j++){
                
               System.out.print(dulces[i][j]+" "); 
            }
        } 
        
        double[] vector = new double[dulces.length * dulces[0].length];
        
        for(int i = 0; i<3; i++){
          for(int j = 0; j<3; j++){
              
              vector[i] += dulces[i][j];
              
          } 
        }
        
        for(int i = 0; i<3; i++){
            
            System.out.println("|");
            
            for(int j = 0; j<3; j++){
                
               System.out.print(dulces[i][j]+" "); 
            }
        } 
        
        
    }
    
}
