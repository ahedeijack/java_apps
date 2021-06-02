/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_04_302019_ListaAlumnos;

import java.util.Arrays;

/**
 *
 * @author aa603
 */
public class Main {
    public static void main(String args[]){
        
        Alumno[] grupo = {
                            new Alumno("Juan",20,74.5),
                            new Alumno("Luis",18,80.5),
                            new Alumno("Pedro",19,88.5),
                            new Alumno("Johan",22,90.5),
                            new Alumno("Luisa",17,100),
                            new Alumno("Perla",19,60.99),
                            new Alumno("Miriam",20,75.6),
                         };
        Arrays.sort(grupo);
        
        for(Alumno a:grupo){
           System.out.println(a);
        }
        
        
    }
}
