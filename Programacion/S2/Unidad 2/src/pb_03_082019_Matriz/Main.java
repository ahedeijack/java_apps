/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_082019_Matriz;

import java.util.Random;

/**
 *
 * @author aa603
 */
public class Main {
 public static void main (String args[]){
     
     
     Matriz tres = new Matriz(3,4);
     
     double [][] x = {
             {3,7,1,2,0},
             {4,8,9,1,4}
                     };
     
     Random azar = new Random();
     
     for (int r = 0; r<tres.getRenglones(); r++){
         for(int c = 0; c<tres.getColumnas(); c++){
             tres.setValor(azar.nextInt(99), r, c);
         }
     }
     
     
     Matriz cuatro = new Matriz(x);
     
     tres.mostrar();
     cuatro.mostrar();
     
     cuatro.setValor(100, 0, 0);
     cuatro.setValor(500, cuatro.getRenglones()-1, cuatro.getColumnas()-1);
     cuatro.mostrar();
     
     Matriz uno = new Matriz(2, 4);
     
     uno.setValor(4, 0, 0);           
     uno.setValor(2, 0, 1);
     uno.setValor(3, 0, 2);
     uno.setValor(5, 0, 3);
     uno.setValor(4, 0, 0);           
                                        //Set Valor(valor, renglon, columna)
     uno.setValor(1, 1, 0);           
     uno.setValor(5, 1, 1);           
     uno.setValor(3, 1, 2);           
     uno.setValor(2, 1, 3);           
     
     double [][] d  =  {{1,4,2,6},
                                {7,5,8,3}};
     
     Matriz dos = new Matriz(d);
     
     tres=uno.suma(dos);
     System.out.println("- - - - - -");
     
     uno.mostrar();
     System.out.println("- - - - - -");
     dos.mostrar();
     System.out.println("- - - - - -");
     tres.mostrar();
     System.out.println("- - - - - -");
     
     Matriz cinco = uno.suma(cuatro);
     cinco.mostrar();
     System.out.println("- - - - - -");
     
     cinco = uno.escalar(10);
     
     cinco.mostrar();
     
     Matriz seis = uno.resta(dos);
     
     seis.mostrar();
 }   
}
