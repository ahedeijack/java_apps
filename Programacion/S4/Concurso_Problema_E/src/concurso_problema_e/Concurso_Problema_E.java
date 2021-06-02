/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso_problema_e;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class Concurso_Problema_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random num = new Random();
        System.out.println("Ingresa el tamaño de la ciudad");
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa los renglones");
        int r = read.nextInt();
        System.out.println("Ingresa las columnas: ");
        int c = read.nextInt();
        
        char [][] ciudad = new char[r][c];
        
    
        for (int i = 0; i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[0].length; j++) {
                ciudad[i][j] = '*';
                if(num.nextInt(10) == 1){
                ciudad[i][j] = 'x';
                }
            }
        }
        
        ciudad[num.nextInt(r)][num.nextInt(c)] = 'b';
        ciudad[num.nextInt(r)][num.nextInt(c)] = 'c';
        ciudad[num.nextInt(r)][num.nextInt(c)] = 'f';
        
        for (int i = 0; i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[0].length; j++) {
                System.out.print(ciudad[i][j]);
            }
            System.out.println(" ");
        }
        
      
        int xb= 0, yb = 0, xc= 0, yc = 0, xf= 0, yf = 0;
        for (int i = 0; i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[0].length; j++) {
                if(ciudad[i][j] == 'b'){
                  xb = i;
                  yb = j;
                } else if (ciudad [i][j] == 'c'){
                  xc = i;
                  yc = j;
                } else if (ciudad[i][j] == 'f') {
                  xf = i;
                  yf = j;
                }
                
            }
        }
        char [][] bonnie = new char[xb][yb];
        char [][] clayde = new char[xc][yc];
        char [][] ford   = new char[xf][yf];

            
        
        System.out.println("B; ("+(bonnie.length+1)+","+(bonnie[0].length+1)+")");
        System.out.println("C; ("+(clayde.length+1)+","+(clayde[0].length+1)+")");
        System.out.println("F; ("+(ford.length+1)+","+(ford[0].length+1)+")");
        
        int pasosb = 0, pasosc = 0, pasosf = 0;
        
        for (int i = 0; i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[0].length; j++) {
                if(ciudad[i][j] == 'b'){
                    for (int k = 0; k < ciudad.length; k++) {
                        for (int l = 0; l < ciudad[0].length; l++) {
                            if (ciudad[i][j] !='f') {
                                pasosb++;
                            } 
                        }
                    }
                } else if(ciudad[i][j] == 'c'){
                    for (int k = 0; k < ciudad.length; k++) {
                        for (int l = 0; l < ciudad[0].length; l++) {
                            if (ciudad[i][j] !='f') {
                                pasosc++;
                            } 
                        }
                    }
                }
            }
        }
        System.out.println("pasos bonni"+pasosb);
        System.out.println("pasos clai"+pasosc);
        
    }
    
}
