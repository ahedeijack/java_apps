/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_5_Vector_Primos;

import Unidad_3.*;

/**
 *
 * @author ahedeijack
 */
public class Matematicas {
    
    public static int Factorial(int n){
        
         int fac = 1;
         
         if(n == 1 || n == 0){
             return n;
         }
         int i = n;
                                    while(i > 1){
                                    fac *= i;
                                    i--;
        }
        return fac;
    }
    
    public static boolean Primos(int n){
      int div  = 2;
      while(div < n){
          if(n%div == 0){
              return false;
          }
          div++;
      }
      return true;
    } 
    
    public static double Euler(){
        
        double eu = 0, suma = 0;
        for (int i = 1; i < 9; i++) {
            eu = 1 / (double) Factorial(i);
            suma += eu;
        }
        return suma+1;
        
    }
    
    public static double potenciaEuler(double n){
       
        double val = Math.pow(Euler(), n);
        return val;
        
    }
    
    public static double Pi(int n){
       double  calculo, s, valCalc;
       s = -1;
       calculo = 0;
  for (int i = 0; i <= n ; i++ ){
            //Se calcula el valor, cuando la variable cSigno, es positiva se hace
            //La resta al valor1 inicial, sumando la repetición.
            if (s == 1){
                calculo = calculo - 1.0/(2*i+1);
		s = -1;
                System.out.println(""+calculo);
            } else {
                //De igual forma, se hace la misma validación para hacer la resta.
                calculo = calculo + 1.0/(2*i+1);
		s = 1;
                System.out.println(""+calculo);
            }
          }
        //Se multiplica el resultado por el valor de 4.
        //Recordemos que la formula original es PI/4 = (1-1/3+1/5-1/7...)
        //Despejando, el valor es PI = 4(1-1/3+1/5-1/7...)
        return valCalc = (calculo * 4);      
    }
    
     public static boolean PrimosEnRango(int n, int m){
      boolean primo = true;
      int i = 1;
      int div  = 2;
      while(div < n){
          if(n%div == 0){
              return false;
              
          }
          div++;
      }
      return true;
    } 
    
    


    
}
