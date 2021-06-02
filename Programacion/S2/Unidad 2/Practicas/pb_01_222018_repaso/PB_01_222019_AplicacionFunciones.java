/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_01_222018_repaso;
import java.util.Scanner;

/**
 *
 * @author aa635
 */
public class PB_01_222019_AplicacionFunciones {
     public static double FunVol(double r, double h){
        double v;
        v = Math.PI * Math.pow(r, 2) * h;
        return v;
                }
     public static double FunArea (double r, double h){
        double a;
        a = 2 * Math.PI * r * (r + h);
        return a;
     }
    
    
    public static void  main(String[] args){
//Declaración de variables.
        double radio, altura, area, volumen;
        Scanner read = new Scanner(System.in);
        
//Entrada de datos.
        System.out.println("Repaso Funciones");
        System.out.println("Ingresa el valor del radio de la lata:");
        radio = read.nextDouble();
        System.out.println("Ingresa la altura de la lata: ");        
        altura = read.nextDouble();
//Proceso.
        volumen = FunVol(radio, altura);
        area = FunArea(radio, altura);
        
//Salida.
        System.out.println("El area del cilindro es de: " +area);
        System.out.println("El volumen del cilindo es de: "+volumen);

    }
    
}
