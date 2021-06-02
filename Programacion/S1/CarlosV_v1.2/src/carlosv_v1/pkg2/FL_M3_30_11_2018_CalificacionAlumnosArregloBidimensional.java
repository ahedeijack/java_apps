/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M3_30_11_2018_CalificacionAlumnosArregloBidimensional {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        
        int alumnos, examenes, renMayor, colMayor, renMenor, colMenor, r, c;
        double promedio, suma, califMayor, califMenor;
        
        System.out.println("Cuantos alumnos son?");
        alumnos = read.nextInt();
        System.out.println("Cuantos examenes por alumno son?");
        examenes = read.nextInt();
        
        double [][] grupo = new double [alumnos] [examenes]; 
        Random azar = new Random();
        
        System.out.println();
        
        for (r = 0; r<alumnos; r++) {
            for (c=0; c<examenes; c++){
                grupo[r][c] = 40 + azar.nextInt(60);
                System.out.println(".-Alumno "+ (r+1) + " .-Examen: "+ (c+1) +  " = "+grupo[r][c]);
            }
            System.out.println();
        }
        
        califMayor = grupo[0][0];
        renMayor = 0;
        colMayor = 0;
        
        
        califMenor = grupo[0][0];
        renMenor = 0;
        colMenor = 0;
        
        suma = 0 ;
        
        for (r = 0; r < grupo.length; r++){
            for (c = 0; c<grupo[0].length; c++){
                suma += grupo[r][c];
                if (grupo[r][c]> califMayor) {
                    califMayor = grupo[r][c];
                    renMayor = r;
                    colMayor = c;
                }
                if (grupo[r][c] < califMayor) {
                    califMenor = grupo[r][c];
                    renMenor = r;
                    colMenor = c;
                }
            }
        
        }
        promedio = suma / (grupo.length*grupo[0].length);
            System.out.println("Promedio General: "+promedio);
            System.out.println("Calificación Mayor: "+califMayor);
            System.out.println("Es del alumno: "+(renMayor+1)+", Examen: "+(colMayor+1));          
            System.out.println("Calificación Menor: "+califMenor);
            System.out.println("Es del alumno: "+(renMenor+1)+", Examen: "+(colMenor+1));
            
            System.out.println("\nTabla de Calificaciones\n");
            for (r = 0; r < grupo.length; r++){
                for (c = 0; c<grupo[0].length; c++){
                    System.out.print(grupo[r][c]+" ");                    
                    
                }
                System.out.println();
            }
            
            System.out.println("Promedios mas altos: ");
            
            for( r = 0; r<grupo.length; r++){
                for( c = 0; c<grupo[0].length; c++){
                     if (grupo[r][c]> promedio) {
                    califMayor = grupo[r][c];
                    renMayor = r;
                    colMayor = c;
                }
                    
                }
                
                System.out.println("Datos que sobre pasan el promedio: "+califMayor+", del alumno: "+renMayor+","+colMayor);
            }
            
    }
}
