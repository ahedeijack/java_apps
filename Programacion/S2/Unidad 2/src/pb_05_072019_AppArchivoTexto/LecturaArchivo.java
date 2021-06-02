/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_072019_AppArchivoTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa603
 */
public class LecturaArchivo {
    public static void main (String args[]){
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Nombre del archivo: ");
        String archivo = read.next();
        
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String nombre = br.readLine();
            System.out.println("Alumno: "+nombre);
            
            int n = Integer.parseInt(br.readLine());
            System.out.println("Calificaciones: "+n);
            
            double suma = 0;
            int calif;
            for(int i=1; i<=n; i++){
                calif = Integer.parseInt(br.readLine());
                System.out.println(calif);
                suma += calif;
            }
            double promedio = suma / n;
            
            System.out.println("Promedio: "+promedio);
            
            br.close();
            fr.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
