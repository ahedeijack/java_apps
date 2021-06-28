/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author aa501
 */
public class FL_M1_2018_12_09_AhorroAnual {
    public static void main (String[] args){
      
        
      Scanner teclado = new Scanner(System.in);
      double sueldo, ahorro, auto, hipoteca, sueldoAnual, gastoCorriente, gastoHipoteca, gMensual;
      
      System.out.print("Ingresa tu sueldo mensual: ");
      sueldo = teclado.nextDouble();
      
      System.out.print("Ingresa el porcentaje que le quieres dar a tu hipoteca: ");
      hipoteca = teclado.nextDouble();
      
      gastoCorriente=sueldo*(50/100);
      gastoHipoteca=sueldo*(hipoteca/100);
      auto = gastoHipoteca;
      gMensual=gastoCorriente+gastoHipoteca+auto;
      ahorro=sueldo-gMensual;
      sueldoAnual=ahorro*12;
      System.out.print("El gasto en hipoteca sera de : $"+gastoHipoteca+", el gasto para tu automovil será de $"+auto+", y tu ahorro anual será de: $"+sueldoAnual);
       
      
    
        
    }
}
