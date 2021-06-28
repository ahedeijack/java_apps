/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_2018_12_06_ordenamietoarreglos;

import java.util.Arrays;

/**
 *
 * @author aa531
 */
public class FL_2018_12_06_OrdenamietoArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] x = {4,2,7,0,1,6};
        int i,r,c;
        
        System.out.println("Arreglo unidimesional sin ordenar:\n");
        for (i=0;i<x.length;i++)
            System.out.println(x[i]);
        
        Arrays.sort(x);
        
        
        System.out.println("Arreglo unidimesional ordenado:\n");
        for (i=0;i<x.length;i++)
            System.out.println(x[i]);
        
        
        int[][] y = {
            {8,2,5}, 
            {0,10,7},    
            {11,4,6},
            {9,3,7}                       
                    };
        
        System.out.println("\nArreglo Bidimensional sin ordenar");
        for (r=0;r<y.length;r++)
        {
            for(c=0;c<y[0].length;c++)
                System.out.print(y[r][c]+"\t");
            // el "\t" es un tabulador
            System.out.println();
        }
        Arrays.sort(y);
        
        System.out.println("\nArreglo Bidimensional ordenado");
        for (r=0;r<y.length;r++)
        {
            for(c=0;c<y[0].length;c++)
                System.out.print(y[r][c]+"\t");
            // el "\t" es un tabulador
            System.out.println();
        }
        
        
        
    }
    
}
