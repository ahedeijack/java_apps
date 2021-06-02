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
public class App_StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenaSB = " uwu ";
        char[] cadenaChar = cadenaSB.toCharArray();
        
        StringBuilder cadena1 = new StringBuilder (cadenaSB);
        StringBuilder cadena2 = new StringBuilder("TecNoLoGicO");
        StringBuilder cadena3 = new StringBuilder(new String(cadenaChar));
        
        System.out.println(cadena1 + " "+cadena2+" "+cadena3);
        
        cadena1.append("se canio mija?");
        System.out.println(cadena1);
        
        for (int i = 0; i < cadena1.length(); i++) {
            if (Estrin.esMenor(cadena1.charAt(i))) {
                cadena1.setCharAt(i, Estrin.aumentar(cadena1.charAt(i)));
            }
        }
        System.out.println(cadena1);
       cadena1.insert(0, "hola");
       
        System.out.println(cadena1);
        
        cadena1.insert(4, ",");
        System.out.println(cadena1);
        
        cadena1.insert(0, cadena1.toString().toUpperCase());
        System.out.println(cadena1);
    
        for (int i = 0; i < cadena1.length(); i++) {
            if (Estrin.esMenor(cadena1.charAt(i))) {
                cadena1.setCharAt(i, Estrin.disminuir(cadena1.charAt(i)));
            }
        }
        
        System.out.println(cadena1);
       cadena1.insert(0, "hola");
       
        System.out.println(cadena1);
        
        cadena1.insert(4, ",");
        System.out.println(cadena1);
        
        cadena1.insert(0, cadena1.toString().toUpperCase());
        System.out.println(cadena1);
    
        
        System.out.println("Ingrese una cadena:");

        
        
        StringBuilder cadena4 = new StringBuilder("AB"); 
        char [] cadenaCopia = new char[cadena4.length()];
        cadenaCopia[0] = (char)(cadenaCopia[0]-2);
        System.out.println(cadenaCopia);
        //HACER ESTO EN STRING BUFFER
        cadenaCopia[0] = cadenaCopia[0];
        
    }
    
    
}
