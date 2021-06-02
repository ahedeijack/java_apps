/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_clase_caracter;

/**
 *
 * @author ahdeijack
 */
public class Caracter {
    private char car;

    public Caracter(char car) {
        this.car = car;
    }
    
    public Caracter(){
        this.car = 'a';
    }
    
    public char getCar() {
        return car;
    }

    public void setCar(char car) {
        this.car = car;
    }
    
    public static boolean esMenor(char c){
        if(c >= 97 && c <= 122){
            return true;
        }
        return false;
    }
    
    public static boolean esMayor(char c){
        if(esMenor(c) == true){
            return false;
        }
        return true;
    }
    
    public static Character disminuir(char c){
        char ret = c;
        if(esMayor(c)){
            return Character.toLowerCase(c);
        }
        return ret;
    }
    
    public static Character aumentar(char c){
        char ret = c;
        
       if(esMayor(c)){
           return Character.toUpperCase(c);
        }
        return c;
    }
    
    public static boolean esNumero(char c){
        for (int i = 48; i <= 57; i++) {
            if(c == i){
                return true;
            }
        }
        return false;
    }
    
}
