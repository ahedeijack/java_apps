/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class Validación {
    private String cadena;

    public Validación(String cadena) {
        this.cadena = cadena;
    }
    
    public Validación(){
        
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public boolean Validar(String cadena){
        int num = validoNum(cadena);
        int ops = validoOperador(cadena);
        int leMin= validoLeMin(cadena);
        int leMay = validoLeMay(cadena);
        int validar = num + ops + leMin + leMay;
        //System.out.println(num +" "+ops +" "+leMin+" "+ leMay + " " + validar );
        
        if (cadena.length() != validar) {
            return false;
        } else { 
        return true;
        }
        
        //la validación es simple, vamos a contar cuandos números hay en la expresión que recibimos.
        //Posteriormente, contaremos el numero de operadores validos que existen, esto nos dara un resultado de
        //operadores y operandos que son validos dentro de nuestra cadena.
        //Al final, compararemos el numero de caracteres que tenemos al inicio, con el que tenemos al final.
        //Si son iguales, obviamente no hubo perdida de caracteres, por lo cual toda la cadena mandada es 
        //correcta.
    }
    
    public int validoNum(String cadena){
      int valido = 0;
 
        for (int i = 0; i < cadena.length(); i++) {
            if (valNum(cadena.charAt(i)) == true) {
                valido++;
            } 
        }
        return valido;
}
    
    public int validoOperador(String cadena){
       int valido = 0;
       
         for (int i = 0; i < cadena.length(); i++) {
            if (valChar(cadena.charAt(i)) == true) {
                valido++;
            }
        }   
        return valido;
    }
    
       public int validoLeMin(String cadena){
       int valido = 0;
       
         for (int i = 0; i < cadena.length(); i++) {
            if (valLetraMin(cadena.charAt(i)) == true) {
                valido++;
            }
        }   
        return valido;
    }
       
        public int validoLeMay(String cadena){
       int valido = 0;
       
         for (int i = 0; i < cadena.length(); i++) {
            if (valLetraMay(cadena.charAt(i)) == true) {
                valido++;
            }
        }   
        return valido;
    }
    
    public boolean valChar (char c){
    char [] op = {'+', '-', '*','/', '(', ')','^'};   
        for (int i = 0; i < op.length; i++) {
            if (c == op[i]) {
                return true;
            }
        }
        return false;
    }
    
    public boolean valNum(char c){
        char[] nums = new char[10];
        
        //Llenamos
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (char) (i+48);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (c == nums[i]) {
                return true;
            }
        }
        return false;
    }
    
    public boolean valLetraMin(char c){
         char[] minus = new char[28];
        
        //Llenamos
        for (int i = 0; i < minus.length; i++) {
            minus[i] = (char) (i+97);
        }
        
        for (int i = 0; i < minus.length; i++) {
            if (c == minus[i]) {
                return true;
            }
        }
        return false;
        
    }
    
public boolean valLetraMay(char c){
         char[] mayus = new char[28];
        
        //Llenamos
        for (int i = 0; i < mayus.length; i++) {
            mayus[i] = (char) (i+65);
        }
        
        for (int i = 0; i < mayus.length; i++) {
            if (c == mayus[i]) {
                return true;
            }
        }
        return false;
     
    }
    
}
