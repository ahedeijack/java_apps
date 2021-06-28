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
public class FL_M2_2018_17_10_DiaSemana {
    public static void main(String[] args){
    
     Scanner teclado = new Scanner(System.in);
     int dia;
     
     System.out.println("Ingresa el día de la semana en el que te encuentras.");
     dia = teclado.nextInt();
     
     if (dia == 1){
         System.out.println("El día es lunes");
     } else
         if (dia == 2){
             System.out.println("El día es Martes");
         } else
         if (dia == 3){
             System.out.println("El día es Miercoles");
         } else
         if (dia == 4){
             System.out.println("El día es Jueves");
         } else
         if (dia == 5){
             System.out.println("El día es Viernes");
         } else
         if (dia == 6){
             System.out.println("El día es Sábado");
         } else
         if (dia == 7){
             System.out.println("El día es Domingo");
         } else
         if (dia < 0 || dia > 7){
             System.out.println("El dato es erroneo uwu");
         }
    
}
}