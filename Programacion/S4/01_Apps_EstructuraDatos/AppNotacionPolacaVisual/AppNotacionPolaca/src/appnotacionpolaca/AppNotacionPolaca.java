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
        Scanner leer = new Scanner(System.in);
        
        System.out.println("intruduzca la expresion infija que quiere convertir:\n");    
        //String infija = leer.next();
        
        String infija = "(7*(3+4))^(3/2)"; //<<-- expresion de tarea
        Validación info = new Validación();
        
        if (info.Validar(infija) == false) {
            JOptionPane.showMessageDialog(null, infija+", tiene caracteres invalidos");
        } else {
        
        System.out.println(infija+"\n");

        System.out.println("expresion infija --> "+infija);

        StringBuilder expPost = new StringBuilder(infija);

        NotacionPolaca expresion = new NotacionPolaca();

        expPost = expresion.convertirANotacionPostFija(infija);

        System.out.println("Expresion Postfija --> "+expPost);

        }
    }
    
}
