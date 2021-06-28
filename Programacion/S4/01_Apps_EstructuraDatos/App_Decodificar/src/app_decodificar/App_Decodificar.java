/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_decodificar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class App_Decodificar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa un mensaje! ");
        Scanner read = new Scanner(System.in);
        String msj = read.next();
        
        StringBuilder cadena = new StringBuilder(msj);
        
        System.out.println("Mensaje original: "+cadena);
        
        
        Random ran = new Random();
        char clave = (char)(ran.nextInt(25)+1);
        clave+= 'a';
        
        StringBuilder cadenaMod = codificar(cadena, clave);
        System.out.println("Mensaje codificado: "+cadenaMod);
        
        System.out.println("Cadena Original: "+ decodificar(cadenaMod, clave));
        System.out.println("La clave fue: "+clave);
        
        System.out.println("Convertir un int a una letra.");
        int val = 66;
        System.out.println("66 = "+Caracter.addCaracter(val));
    }
        
public static StringBuilder codificar(StringBuilder mensaje, char letra_clave){
StringBuilder cadCod = new StringBuilder(mensaje);

//Iniciar la distancia de la letra inicial a.
int inicio = letra_clave - 'a';
char car;
    for (int i = 0; i < mensaje.length(); i++) {
        car = mensaje.charAt(i);
        if(Character.isLetter(car)){
            car = Character.toLowerCase(car);
            car += inicio;
            if(car>'z'){ //Si excede el valor de Z es regresado a A.
                car-= 26;
            }
        }
        cadCod.setCharAt(i, car);
    }
    return cadCod;

}

public static StringBuilder decodificar(StringBuilder mensaje, char letra_clave){
    StringBuilder cadCod = new StringBuilder(mensaje);

//Iniciar la distancia de la letra inicial a.
int inicio = letra_clave - 'a';
char car;
    for (int i = 0; i < mensaje.length(); i++) {
        car = mensaje.charAt(i);
        if(Character.isLetter(car)){
            car = Character.toLowerCase(car);
            car -= inicio;
            if(car>'z'){ //Si excede el valor de Z es regresado a A.
                car+= 26;
            }
        }
        cadCod.setCharAt(i, car);
    }
    return cadCod;
}

}
    

