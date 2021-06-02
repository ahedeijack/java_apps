/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_01_242019_repaso_areglos_ordenamientos;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author aa603
 */
public class pb_01_242019_Arreglos {
 public static void main(String[] args){
    int n, i; 
    Scanner read = new Scanner(System.in);
    
    System.out.println("Ingresa el número de elentos: ");
    n = read.nextInt();
    
    int [] arreglo = new int[n];
    
    Random azar = new Random();
    
    for(i = 0; i < arreglo.length; i++){  /*.length, para saber el tamaño del arreglo */
        arreglo[i] = azar.nextInt(10); /*la [i] menciona la posición del arreglo a llenar*/
        System.out.println((i+1)+" > "+arreglo[i]);
    }
     
    int suma = 0;
    
    for (i = 0; i < arreglo.length; i++){
        suma += arreglo[i];
    }
    double promedio = suma /(arreglo.length*1.0);
    int mayor = arreglo[0]; //Se hace una comparación desde la primera variable considerando que el mayor es la posición 0
    int menor = arreglo[0]; //Se hace una comparación desde la primera variable considerando que el menor es la posición 0
    for (i = 0; i < arreglo.length; i ++){
        if (arreglo[i]>mayor){
            mayor = arreglo[i];
        }
    }
    for (i = 0; i < arreglo.length; i ++){
        if (arreglo[i]<menor){
            menor = arreglo[i];
        }
    }
    
    
    
    System.out.println("La suma de "+arreglo.length+" numeros es de: "+suma);
    System.out.println("El promedio fue "+promedio);
    System.out.println("El número mayor fue "+mayor);
    System.out.println("El número menor fue "+menor);
    
    Arrays.sort(arreglo);
    System.out.println("Datos ordenados");
    for (i = 0; i < arreglo.length; i ++){
        System.out.println((i+1)+" > "+arreglo[i]);
    }
 }
    
}
