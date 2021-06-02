/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;

import java.util.Arrays;

/**
 *
 * @author aa504
 */
public class FL_M3_23_11_2018_AplicacionMediana {
    public static void main(String[] args){
        
        double [] x = new double[7];
        x[0] = 8;
        x[1] = 2;
        x[2] = 10;
        x[3] = 9;
        x[4] = 7;
        x[5] = 12 ;
        x[6] = 5;  
        
        double mediana;
        ArregloOrdenado(x, "Arreglo x sin ordenar");
        Arrays.sort(x);
        ArregloOrdenado(x, "Arreglo x ya ordenado");
        
        double [] y = {7,1,5,2,13,9,8,4};
       
        ArregloOrdenado(y, "Arreglo y sin ordenar");
        Arrays.sort(y);
        ArregloOrdenado(y, "Arreglo y ya ordenado");
        
        
        if (x.length % 2 == 0){
            //El número es par
            mediana = ((x[x.length/2-1]+x[x.length/2])/2);
        } else {
            //El número es non
            mediana = x[(x.length - 1)/2];
        }
        
        System.out.println("La mediana de X es igual a: "+mediana);        
    }
    public static void ArregloOrdenado(double [] a, String mensaje){
        System.out.println();
        
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    
}
