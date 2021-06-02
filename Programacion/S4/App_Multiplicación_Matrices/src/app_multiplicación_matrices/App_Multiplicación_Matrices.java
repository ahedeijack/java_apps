/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_multiplicación_matrices;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class App_Multiplicación_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //asignaar aleatorios
        //datos aleatorios y mostrar la salida
        //tabulada con los datos de la matriz
        Scanner read = new Scanner(System.in);
        int col, ren;
        int [][]matriz1 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        
        
        System.out.println("De que tamaño quieres tu matriz? ");
        System.out.println("renglones: ");
        ren = read.nextInt();
        System.out.println("columnas: ");
        col = read.nextInt();
        
        int [][]matriz2 = new int[ren][col];
        
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j]=(j+i+1);
            }
        }
        
        //El tamaño sera del numero de renglones de la primera matriz y las columnas las mismas que la segunda matriz 
        int [] [] matriz3 = new int [matriz1.length] [matriz2[0].length];
        
        if(ren != matriz1[0].length){
            System.out.println("La matriz no se puede ultiplicar.");
        } else {
        
        System.out.println("Multiplicación.");
        
        //El primer for va a recorrerse el numero de datos que tiene la 3er matriz
        for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    for (int k = 0; k < matriz2[0].length; k++) {
                     matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
            }
            }
        mostrar(matriz1);
        System.out.println(" * ");
        mostrar(matriz2);
        System.out.println(" = ");
        mostrar(matriz3);
        
            System.out.println("Cuandos uwus quieres poner?");
            int na = 0;
            na = read.nextInt();
            for (int i = 0; i < na; i++) {
                System.out.println("uwu "+(i+1));
            }
        }
        
        }
    
    public static void mostrar(int [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
        
    }
    }
    

