/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_tabla_multiplicar;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahedeijack
 */
public class Prueba {
    public static void main (String args[]){
Random ran = new Random();

 VectorT<Float> vecFloats = new VectorT(5);
        System.out.println("Ingresa el numero de la tabla de multiplicar.");
        Scanner read = new Scanner(System.in);
        int tab;
        try{
        tab = read.nextInt();
        } catch( InputMismatchException e){
            System.out.println("Añadiste un numero erroneo, utilizaremos un número aleatorio. uwu");
            tab = ran.nextInt(9)+1;
        }   
        
        for (int i = 0; i < 11; i++) {
            System.out.println(tab+" * "+i+" "+(tab*i));
            
        }
        
        
}
}

//Agregar nombres en un bloc de notas.

//IMPLEMENTAR LA APP CON EL VECTOR PLANTILLA O TEMPLATE EN LA OPCION GUI
//EL USUSARIO SELECCIONARA EL TIPO DE DATO A USAR. AGREGAR LA TABLA DE MULTIPLICAR

