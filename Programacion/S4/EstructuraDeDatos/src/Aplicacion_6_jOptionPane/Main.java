/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_6_jOptionPane;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ahedeijack
 */
public class Main {
    public static void main (String[] args){
        
        
        System.out.println("Cadeanas desde la linea de comandos.");
        for(int i = 0; i< args.length; i++){
            System.out.println(args[i]);
        }
        
        String cad;
        String cadsMain="";
        JOptionPane.showMessageDialog(null , "Cadenas enviadas a Main desdela linea de comandos");
        
        
        for(int i = 0; i<args.length; i++){
            cadsMain += args[i];
        }
        
        
        JOptionPane.showMessageDialog(null, cadsMain);
        Random r = new Random();
        
        int opc; 
        
        do {
            
            
            int n;
            
            try{
            cad = JOptionPane.showInputDialog(null, "Cuantos datos? ", "Introduce la cantdad. ", JOptionPane.INFORMATION_MESSAGE);
            n = Integer.parseInt(cad);
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingresaste en dato erroneo, por defecto se usara el 5. ");
                n = 5;
            }
            
            int [] vec = new int[n];
            cad = ""; //Borramos su contenido en cado de que halla sido modificada.
            
            for(int i = 0; i<vec.length; i++){
                vec[i] = r.nextInt(90)+10;
                cad += vec[i]+" , ";
            }
            JOptionPane.showMessageDialog(null, "Vector ;  "+cad);
            opc = JOptionPane.showConfirmDialog(null, "Generar nuevos datos: ");
            
            
        }  while(opc == 0);
        
        
    }
    
}

//Investigar la implementacion de numeros aleatorios que no se repitan. 