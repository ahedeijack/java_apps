/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_stringbuilder;

/**
 *
 * @author ahedeijack
 */
public class Estrin {
    private String adena;

    public Estrin(String adena) {
        this.adena = adena;
    }
    
public Estrin() {
        this.adena = "null";
    }
    
    public String getEstrin() {
        return adena;
    }

    public void setEstrin(String adena) {
        this.adena = adena;
    }
    
    public static String convMayor(String cadena){
       char [] dato = new char[cadena.length()];
        for (int i = 0; i < dato.length; i++) {
            dato[i] = cadena.charAt(i);
            aumentar(dato[i]);
        }
      return "hola";
     //las cadenas String no puedes modificarse.
    }  
        
     public static Character disminuir(char c){
       if(esMenor(c) && esMenor(c)){
           c+=32;
           return c;
       }
       return c;
    }
    
    public static Character aumentar(char c){
        if(esDigito(c) && esMenor(c)){
           c=(char)(c-32);
           return c;
       }
       return c;
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
    
    public static boolean esLetra(char c){
        if(esMenor(c) ||esMayor(c) ){
            return true;
        }
        return false;
    }
    public static boolean esDigito(char c){
        if(esLetra(c)){
            return true;
        }
        return false;
    }
    
    public static boolean noSigno(char c){
        if(esDigito(c) || esLetra(c)){
            return true;
        }
        return false;
    }
        
    }
    

