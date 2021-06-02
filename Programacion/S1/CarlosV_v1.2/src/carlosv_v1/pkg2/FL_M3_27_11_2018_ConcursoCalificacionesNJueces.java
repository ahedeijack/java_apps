/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M3_27_11_2018_ConcursoCalificacionesNJueces {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n;
        do {
        System.out.println("Calificacion jueces! Ingresa el número de jueces que existen. ");
        n = read.nextInt();
        } while (n<5);
        
        
        System.out.println("Calificacion jueces! Ingresa las "+n+ " calificaciones que daran los jueces: ");
        double [] jueces = new double[n];
        int i;
        
        for(i=0; i<jueces.length; i++){
            System.out.println("Ingresa la calificación del juez "+(i+1)+": ");
            jueces[i] = read.nextDouble();
        }
        Arrays.sort(jueces);
        //Se muestran las calificaciones ordenadas. 
        for(i = 0; i < jueces.length; i++)
            System.out.println("Calificación "+i+" : "+jueces[i]);
        
        double suma = 0 ;
        for (i = 2; i<=n-3; i++)
            suma += jueces[i];
        
        double promedio = suma/(n-4);
        
        System.out.println("La calificación del participante es: "+promedio);
    }
}
