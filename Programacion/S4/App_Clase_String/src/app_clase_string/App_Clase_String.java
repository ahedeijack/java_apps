/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_clase_string;

/**
 *
 * @author ahedeijack
 */
public class App_Clase_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Hola muy buenas";
        String cadena2 = "Hola uwu";
        for (int i = 0; i < cadena.length(); i++) {
            if(Estrin.esMenor(cadena.charAt(i))){
                cadena+= Estrin.aumentar(cadena.charAt(i));
            }
        }
        System.out.println(cadena);
        
        char [] cadenaChar = cadena2.toCharArray();
        
        for (int i = 0; i < cadenaChar.length; i++) {
            cadenaChar [i] = Estrin.aumentar(cadena2.charAt(i));
           // System.out.print(cadenaChar[i]); si lo corre
        }
     
        //System.out.printf("%s",cadenaChar); no lo corre
    
        for (int i = 0; i < cadenaChar.length; i++) {
            System.out.printf("\n%c",cadenaChar[i]);
        }
    }
    
}

//GEEKSFORGEEKS o TUTORIALSPOINT
//Leer StringBuilder y StringBuffer 