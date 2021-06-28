/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_torres_hanoi;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class App_Torres_Hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner read = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = read.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
    }
    
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
   }
 }
}
    

