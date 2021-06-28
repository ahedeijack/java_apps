
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahdeijack
 */
public class Prueba_Logica {
   public static void main(String args[]){
    int[] numeros = new int[18];
   int count = 0;
 
   
   while(count<18){
    
     int nvr = 0;
     Random r = new Random();
     int  na = (r.nextInt(9)+1);
       
     for (int i = 0; i < 18; i++) {
           if(numeros[i] == na){
               nvr ++;
           }
       }
     if(nvr < 2){
         numeros[count] = na;
         count++;
     }
 }   
       for (int i = 0; i < 18; i++) {
           System.out.println(numeros[i]+ " ");
       }
     
       
   }
   
}
