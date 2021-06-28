/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_recursivo;

import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class App_Recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número de 4 digitos: ");
        int num = 1000;
        
        if (num < 1000 || num > 10000) {
            System.out.println("El número no jala.");
        }
        
       // invRec(num);
        System.out.println("  --- ");
        metodoRec(num);
        int fab, fab2;
        fab2 = 50;
        fab = fabonacci(fab2);
        System.out.println(fab);
        
        System.out.println("Fibonacci");
        int rep[] = new int[10];
        int fib[] = fibonacci(rep);
        
//        for (int i = 0; i < fib.length; i++) {
//            System.out.println(fib[i]);
//        }
       
    }
    
   public static void invRec(int n){
       System.out.printf("%d  ",n%10);
       
       if(n>10){
           invRec(n/10);
       }
   }
   
   public static void metodoRec(int n){
       if (n<2) {
           System.out.print(n);
       } else {
           metodoRec(n/2);
           System.out.print(n%2);
       }
   }
   public static int fabonacci(int n){
       if (n <= 2) {
           return n;
       } else {
           return fabonacci(n-2)+fabonacci(n-2);
       }
   }
   public static int[] fibonacci(int num[]){
       int sum = 0;
       int aux = 0;
       for (int i = 0; i < num.length; i++) {
           
           if(i < 2){
               num[i] = 1;
               sum++;
               System.out.println(">2: "+(i+1)+": "+num[i]);
           } else {
               num[i] = (sum-1)+(sum-2);
               aux = num[i];
               num[i] = aux;
               System.out.println(">2: "+(i+1)+": "+num[i]);
           }
       }
       return num;
   }
}
