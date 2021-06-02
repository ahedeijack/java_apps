/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M3_06_12_2018_IrdenamientoArreglos {
    public static void main (String[] args ){
        
        int [] x = {
          2, 4, 7, 0, 1,6  
        };
        int i, r, c;
        
        System.out.println("Arreglo unidimensional sin ordenar:");
        for (i = 0; i<x.length; i++){
            System.out.println(x[i]);
        }
        Arrays.sort(x);
        System.out.println("Arreglo unidimensional  ordenado:");
        for (i = 0; i<x.length; i++){
            System.out.println(x[i]);
        }
        
        int [][] y = {
            {8, 2, 5}, {7, 8,12}, {56, 6, 7,}, {45, 23, 12}    
        };
        
        System.out.println("Arreglo biidimensional sin ordenar:");
        for (r = 0; r < y.length; r++){
            for (c=0; c<y[0].length; c++){
                System.out.print(y[r][c]+"\t");
            }
            System.out.println();
        }
        //Creamos un arerglo unidimensional del mismo numero de elementos que la matriz
        int [] z = new int[y.length*y[0].length];
        i =0 ; //Subindice del arreglo unidimensional
        for (c=0; r<y.length; r++){
            for(c = 0; c<y[0].length; c++){
                z [i] = y [r][c];
                i++;
            }
        }
        Arrays.sort(z);
        //Copiamos los valores ya ordenados delarreglo unidimensional a la matriz
        i = 0;
        for (c=0; r<y.length; r++){
            for(c = 0; c<y[0].length; c++){
                 y [r][c] = z [i];
                i++;
            }
        }
        
        Arrays.sort(y);
        System.out.println("Arreglo biidimensional  ordenado:");
        for (r = 0; r < y.length; r++){
            for (c=0; c<y[0].length; c++){
                System.out.print(y[r][c]+"\t");
            }
            System.out.println();
        }
        
    }
}
