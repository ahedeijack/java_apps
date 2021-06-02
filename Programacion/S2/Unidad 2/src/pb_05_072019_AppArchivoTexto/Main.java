/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_072019_AppArchivoTexto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa603
 */
public class Main {
    public static void main (String args[]){
        
        Scanner read = new Scanner(System.in);
        System.out.println("Nombre del archivo .txt: ");
        String archivo = read.next(); //Una palabra
        
        Scanner read2 = new Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        String nombre = read2.nextLine(); //Texto por linea
        
        System.out.println("No. Calificaciones: ");
        int n = read.nextInt();
        
        int [] calif = new int[n];
        
        
        for(int i = 0; i < n ; i++){
            System.out.println("Calificacion "+(i+1)+":");
            calif[i] = read.nextInt();
        }
        
        try {
            
            //Creamos los flujos para grabar la informacion. (Crear y Abrir el archivo).
            FileWriter fw = new FileWriter(archivo);
            //Se abre el archivo
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(nombre);
            pw.println(n);
            
            for(int i = 0; i<calif.length; i++)
                pw.println(calif[i]);
            
            pw.close();
            fw.close();
            //Se cierra el archivo.
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
