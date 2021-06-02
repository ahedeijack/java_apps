/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_aplicacion_multiplicacionmatrices;

import java.util.Scanner;

/**
 *
 * @author ahedeijack
 */
public class App_Aplicacion_MultiplicacionMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz1 = {{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6}};
        int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
        
        int [][] matriz3 = new int [matriz1.length][matriz2[0].length];
        
        multiplicar(matriz1,matriz2,matriz3);
        
        System.out.println("Ingresa el número de repeticiones de uwu : ");
        Scanner read = new Scanner(System.in);
        int valor = 0;
        valor = read.nextInt();
        
        for (int i = 0; i < valor; i++) {
            System.out.println("owo "+(i+1));
        }
        
    }
 //En la naturaleza que se puede replicar con código   
    public static void multiplicar(int [][] a, int [][] b, int c[][]){
        if (a[0].length == b.length) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j]; 
                }
            }
        }    
        }
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
    
}
