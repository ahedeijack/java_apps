/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cris;

import java.util.Scanner;

/**
 *
 * @author Ahedeijak
 */
public class Cris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        double x, y1, y2, y3,y4;
        
        System.out.println("Ingresa el valor de X: ");
        x = read.nextDouble(); //5
        
        y1 = ((Math.pow(x, 3)/4)*3)-(4*Math.pow(x, 2))-((x/2)*3)+25;
        y2 = (x/2)+((Math.pow(x, 2)/5)*2)-(16/5)+(2*Math.pow(x, 3));
        y3 = (Math.pow(x, 2)*0.2)-((x/5)*7)-((Math.pow(x, 3))*2)-1;
        y4 = ((x/5)*-7)-2+((Math.pow(x, 2)/2)*3);
        System.out.println("Primer resultado:  "+y1); //11.25
        System.out.println("Segundo resultado: "+y2);//259.5
        System.out.println("Tercer Resultado:  "+y3);//-253
        System.out.println("Cuarto resultado:  "+y4);//28.5
        
        double ecuacionF = y1-y2+y3-y4;
        
        System.out.println("Resultado Final: "+ecuacionF);
    }
    
}
