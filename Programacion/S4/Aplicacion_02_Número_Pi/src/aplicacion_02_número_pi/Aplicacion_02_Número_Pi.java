/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_02_número_pi;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ahdeijack
 */
public class Aplicacion_02_Número_Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
       //Aquí se hace el calculo, cuando el usuario da el valor de PI.
       //Se velve a utilizar el valor de N como PI.
       
        Scanner read = new Scanner(System.in);
        int terminos;
        double n, calculo, s, valCalc;
        calculo = 0;
        s = -1;
        System.out.println("Ingresa el número de calculos a relizar para encontrar PI:");
        try{
        n = read.nextDouble();
        } catch(InputMismatchException e) {
            
            System.out.println("Ingresa un número, una letra no funciona, error del sistema:  "+e);
            System.out.println("Por defecto se dara el valor de 10.");
            n = 10;
            
        }
        
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
        valCalc = (calculo * 4);
        System.out.println("Calculado con "+n+" terminos.");
        System.out.println(valCalc+"");
        System.out.println("El valor del sistema del número PI es: "+Math.PI);
    }
    
}
