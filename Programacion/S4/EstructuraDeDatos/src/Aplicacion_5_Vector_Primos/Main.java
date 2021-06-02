/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_5_Vector_Primos;

import java.util.Scanner;

/**
 *
 * @author ahedeijack
 */
public class Main {
    public static void main (String[] args){
        int limI = 1500, limS = 2000;
        Scanner read = new Scanner(System.in);
       
        int i = 0;
       

//Seleccionamos el número de primos.
       for (int x = limI; x<=limS; x++) {
           if(Matematicas.Primos(x)){
               i++;
           }
       }
       
//Damos el tamaño del arreglo con la cantidad de números primos que existen.
        int arreglo [] = new int[i];
       
//Llenamos el arreglo de números primos.
int c = 0;
       for(int x = limI; x<=limS; x++){
           if(Matematicas.Primos(x)){
               arreglo[c++] = x;
               
           }
       }

       for(int x = 0; x<arreglo.length; x++){
           System.out.println((x+1)+".-"+arreglo[x]);
       }
       
    }
    
}
