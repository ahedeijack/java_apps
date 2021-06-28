/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotacionpolaca;

import Clases.NotacionPolaca;
import Clases.Validación;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pqdst
 */
public class AppNotacionPolaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 1;
        
        while(c == 1){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("intruduzca la expresion infija que quiere convertir:\n");    
        String infija = leer.next();
        
         //infija = "1+2*(3-4)+5/(6*7+8)*P^9"  expresion de tarea
       //String infija = "a+(b-c)"; //<<-- expresion de tarea
        Validación info = new Validación();
        
        if (info.Validar(infija) == false) {
            
            System.out.println(infija+ ", tiene uno o mas caracteres invalidos."); 
            System.out.println("Deseas reintentarlo? ");
            c = leer.nextInt();
            
        } else {
        //Entrada "1+(2-3)
        //Entrada; "x^?y-}
        System.out.println(infija+"\n");

        System.out.println("expresion infija --> "+infija);

        StringBuilder expPost = new StringBuilder(infija);

        NotacionPolaca expresion = new NotacionPolaca();

        expPost = expresion.convertirANotacionPostFija(infija);

        System.out.println("Expresion Postfija --> "+expPost);
        
            System.out.println("Deseas repetir el programa? 1/0");
               c = leer.nextInt();
        }

        }
    }

}
