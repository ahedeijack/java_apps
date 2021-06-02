/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M2_13_11_2018_SenoDeÁnguloGrados {
    
    
     public static double factorial (int n){
        double fac = 1;
        int i = 1;
        for (i=1; i<=n; i++)
            fac *= i;
        return (int) fac;
                                            }
    public static double potencia(double base, int exponente){
        int limite;
        if (exponente < 0 )
        limite = -exponente;
        else 
        limite = exponente;
        double pot = 1; 
        int i;
        for (i = 1; i<=limite; i++){
        pot *=base;
    }
        if (exponente <0)
        return 1/pot;
        else return pot;
                                                            } 
     
     
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int i, p, signo;
        double angulo, x, termino, resultado, suma;
        
        System.out.println("Cálculo de seno mediante el angulo en radianes...");
        System.out.println("Ingresa el valor del ángulo...");
        
        angulo = read.nextDouble();
        
        x =(angulo*Math.PI)/180;
        p = 1;
        suma = 0;
        signo = 1;
        
        for (i = 1; i<=20; i++){
            termino = potencia(x,p)/factorial(p);
            suma = suma+(termino * signo);
            p = p +2;
            signo = signo *  (-1);
            
        }
        System.out.println("El seno de "+angulo+"° = "+suma);
    }
}
