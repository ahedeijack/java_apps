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
public class FL_M2_2018_23_10_CalificaciónAlumnos2 {
    
     public static int convL(char letra){
        int num;
                switch (letra){
        case 'a':
        case 'A': num = 100; break;
        case 'b':
        case 'B': num = 90; break;
        case 'c':
        case 'C': num = 80; break;
        case 'd':
        case 'D': num = 70; break;
        case 'e':
        case 'E': num = 60; break;
        case 'f':
        case 'F': num = 50; break;
        default: num = 0;
    }
                return num;
    }
    
     
     
    public static void main(String[] args){
    int ex1F, ex2F, ex3F, ex4F;
    char ex2, ex3, ex4;
    double promedio;
    
   Scanner teclado = new Scanner(System.in);
   
   System.out.println("Obtengamos el promedio de tus calificaciones. ");
   
   System.out.println("Ingresa el valor de tu primer calificación (0-100): ");
   ex1F = teclado.nextInt();
   System.out.println("Ingresa el valor de tu segunda calificación (A-F): ");
   ex2 = teclado.next().charAt(0);
   System.out.println("Ingresa el valor de tu tercer calificación: (A-F)");
   ex3 = teclado.next().charAt(0);    
   System.out.println("Ingresa el valor de tu cuarta calificación: (A-F)");
   ex4 = teclado.next().charAt(0);    
   
   ex2F = convL(ex2);
   ex3F = convL(ex3);
   ex4F = convL(ex4);
   
   promedio = (ex1F + ex2F + ex3F + ex4F)/4.0;
   
    if (promedio >= 90){
        System.out.println("Tu promedio fue de "+promedio+") ¡¡Excelente!! ");
    }   
    if (promedio >= 80 && promedio <= 90){
            System.out.println("Tu promedio fue de "+promedio+") ¡¡Bueno!!");
        }
    if (promedio >= 70 && promedio <= 80){
        System.out.println("Tu promedio fue de "+promedio+") ¡¡Regular!!");
    }
    if (promedio >= 60 && promedio <= 70){
        System.out.println("Tu promedio fue de "+promedio+") ¡¡Bajo!!");
    }
    if (promedio >= 50 && promedio <= 60){
        System.out.println("Tu promedio fue de "+promedio+") ¡¡Insuficiente!!");
    }
    if (promedio <= 50){
        System.out.println("Tu promedio fue de "+promedio+") ¡¡Reprobado xd!!");
    }
    
    
    
}
}
