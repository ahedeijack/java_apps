/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_15_aplicacionhorario;

import java.util.Random;

/**
 *
 * @author aa618
 */
public class NombreAzar {
    private static String [] Nombre = {"Juan", "Sebastian", "Roberto", "Alberto", "Alan", "Jose", "Jose", "Gerardo", "Raul", "Jesus", "Armando", "Viviana", "Edson", "Maria", "Fernanda", "Samuel","Erickson", "Erick", "Mariale","Tania"};
    private static String [] Apellidos  = {"Perez",  "Contreras", "Dovali", "Jacinto", "Flores", "Cabrales", "Reyes", "Garcia", "Martinez", "Romero", "Macias", "Briones", "Picazo","Gonzales", "Chavez", "Juarez","Jade"};
    
    private static Random Azar = new Random();
    
    public static String nextNombre(){
         return Nombre[Azar.nextInt(Nombre.length)];
        
    }
    
    public static String nextNombreCompleto(){
         return Nombre[Azar.nextInt(Nombre.length)] + " " +
                Apellidos[Azar.nextInt(Apellidos.length)] + " " +
                Apellidos[Azar.nextInt(Apellidos.length)];
        
    }
    
    public static String nextNombrelegal(){
        return Apellidos[Azar.nextInt(Apellidos.length)] + " " +
               Apellidos[Azar.nextInt(Apellidos.length)] + " " +
               Nombre[Azar.nextInt(Nombre.length)];
        
    }
    
    public static String nextNombreCorto(){
        return Nombre[Azar.nextInt(Nombre.length)] + " " +
               Apellidos[Azar.nextInt(Apellidos.length)];
               
    }
    
}
