/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_01_252019_repaso_arreglos_bidimensionales;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author aa601
 */
public class pb_01_252019_repaso_arreglos_bidimensionales {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Random azar = new Random();
        int reng, col;
        System.out.println("cuantos renglones?");
        reng = read.nextInt();
        
        System.out.println("cuantas columnas?");
        col = read.nextInt();
        System.out.println("");
        
        int datos [] [] = new int [reng] [col];
        
        int r, c;
        for (r = 0; r < datos.length; r++) { //datos.length seria el tamaño de la primera dimensión
            for (c = 0; c<datos[0].length; c++){//datos[0].length es el tamaño de la segunda dimensión
                datos [r][c] =(10 + azar.nextInt(90));
            }
        }
        
        for (r = 0; r < datos.length; r++) { //datos.length seria el tamaño de la primera dimensión
            System.out.print(r+1+"||");
            
            for (c = 0; c<datos[0].length; c++){//datos[0].length es el tamaño de la segunda dimensión
                System.out.print(datos[r][c]+"|");
            }
            System.out.println("");
        }

        int [] copia = new int [datos.length * datos[0].length];
        int i = 0;
        for (r = 0; r < datos.length; r++){
            for (c = 0; c < datos[0].length; c++){
                copia[i] = datos[r][c];
                i++;
            }
        }
        
        Arrays.sort(copia);
        
        System.out.println("Arreglos ordenados: ");
        
        i = 0;
        for (r = 0; r < datos.length; r++){
            for (c = 0; c < datos[0].length; c++){
                datos[r][c] = copia[i]; 
                i++;
            }
        }
        
        
    }
}