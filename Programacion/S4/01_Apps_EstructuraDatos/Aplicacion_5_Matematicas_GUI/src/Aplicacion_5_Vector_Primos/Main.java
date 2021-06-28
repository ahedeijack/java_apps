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
        int limI = 10, limS = 50;
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
           System.out.println((x+1)+"-."+arreglo[x]);
       }
     
        System.out.println(Matematicas.fabonacciRec(6));
        System.out.println("-");
        int [] fib = new int [6];
        
        for (int j = 0; j < fib.length; j++) {
            fib[j] = Matematicas.fibonacciIte((j+1));
            System.out.println(fib[j]);
        }
        
    }
    
    

} 

