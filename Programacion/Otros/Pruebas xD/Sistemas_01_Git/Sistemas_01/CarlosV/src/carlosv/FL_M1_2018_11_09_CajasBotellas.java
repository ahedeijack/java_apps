/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import java.util.Scanner;

/**
 *
 * @author aa504
 */
public class FL_M1_2018_11_09_CajasBotellas {


public static void main(String[] args){
    int botellas, botellas_cajas, sueltas, cajas;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Ingresa el número de botellas: ");
    botellas = teclado.nextInt();
    
    System.out.print("Cuantas cajas por botellas: ");
    botellas_cajas = teclado.nextInt();
    
    //PROCESO
    
    //Al dividir dos enteros, operador "/" regresa un entero
     cajas = botellas / botellas_cajas;
     
    //El operador "%" nos regresa el residuo de una division de dos números;
    
    sueltas = botellas % botellas_cajas;
    
    System.out.print("Las cajas que completas con tus "+botellas+" botellas son: "+cajas+", y las botellas restantes son: "+sueltas);
    
    
     
            
            
            
    
}
    
}
