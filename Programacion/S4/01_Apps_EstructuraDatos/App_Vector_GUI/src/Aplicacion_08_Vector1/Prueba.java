/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_08_Vector1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahedeijack
 */
public class Prueba {
    public static void main (String args[]){
Random ran = new Random();
//        System.out.println("Mi vector");
//        Vector mivec = new Vector(ran.nextInt(10)+1);
//        Vector aux = new Vector(mivec.tam());
//        
//        System.out.println("Valor vector: "+mivec.tam());
//        
//        for(int izq = 0, der = aux.tam()-1; izq<mivec.tam(); izq++, der--){
//            aux.asignar(mivec.leer(izq),der);
//            System.out.println("valor "+izq+ " ");
//            System.out.println("valor "+der+ " ");
//        }
//        for(int i = 0; i<aux.tam(); i++){
//            System.out.println("Valor: "+i + " : "+aux.leer(i));
//        }
//        
//        System.out.println("De que tabla quieres sacar: ");
//        int rep = 0;
//        
System.out.println("Ingresa tu nombe");
        Scanner read = new Scanner(System.in); //Clase estatica, entramos a su elemento "in"
        String nombre = read.next();
        
//VectorT<Character> nombreChar = new VectorT<Character>(nombre.length());
//VectorT<String> vecNombres = new VectorT<T>(nombres.length);

    VectorT<Character> nombreChar = new VectorT(nombre.length());
    

        VectorT<Float> mivec1 = new VectorT(5);
    
        System.out.println("Nombre en mayusculas.");
            for(int i = 0; i<nombre.length(); i++){
               nombreChar.asignar(Character.toUpperCase(nombre.charAt(i)),i);
                System.out.println(nombreChar.leer(i));
            }
            
        System.out.println("Nombre en minusculas. ");
           
                System.out.println("Nombre en mayusculas.");
            for(int i = 0; i<nombre.length(); i++){
               nombreChar.asignar(Character.toLowerCase(nombre.charAt(i)),i);
                System.out.println(nombreChar.leer(i));
            }
        
            
String[]nombres = {"Pedro","Luis","Juan","Mario","Luis","Alejandro","Gustavo", "Pacho", "Alfredo","Cuca la cucaracha!"+
        "Christian"+"Mar"+"Don pedro"};
VectorT<String> vecNombres = new VectorT<String>(nombres.length);

for (int i = 0; i < nombres.length; i++) {
            vecNombres.asignar(nombres[ran.nextInt(10)], i);
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Nombre [%d] = %s  \n", i, vecNombres.leer(i));
        }
           
        //float resultado = vecNombres.promedio();
        //no se debe utilizar metodos matematicas con cadenas. 
        //Generara un Exception error.
        
        VectorT<Float> vecFloats = new VectorT(5);
        
        for (int i = 0; i < vecFloats.tam(); i++) {
            vecFloats.asignar(((ran.nextInt(99))+1)+ran.nextFloat(),i);
            System.out.println(vecFloats.leer(i));
        }
        System.out.printf("Promedio = %f",vecFloats.promedio());
        
        VectorT hola = new VectorT(5);
        
        //MAÑANA TRAER CON DOS DIGITOS.
//   VectorT<Integer> mivec2 = new VectorT(10);
//        System.out.println("De que numero quieres hacer tu tabla?");
//        int numero = read.nextInt();
//        
//        for (int i = 0; i < 10; i++) {
//            mivec2.asignar(i, (numero*i));
//        }
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("%i * %i", i,mivec2.leer(i));
//        }
//            
//    }
}
}

//Agregar nombres en un bloc de notas.

//IMPLEMENTAR LA APP CON EL VECTOR PLANTILLA O TEMPLATE EN LA OPCION GUI
//EL USUSARIO SELECCIONARA EL TIPO DE DATO A USAR. AGREGAR LA TABLA DE MULTIPLICAR

