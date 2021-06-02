/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author pqdst
 */
public class Archivos {
    
   public static String cantNombres(String dirArchivo){
       
       String texto = "";
       
       try{
            BufferedReader bf = new BufferedReader(new FileReader(dirArchivo));
            String temp = "";
            String bfRead;
            
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;
            
       }catch(Exception e){
           System.err.println("No se encotro el archivo");
       }
       
       return texto;
    } 
}
