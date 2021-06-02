/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolacircular;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class ArchivosDeTexto {
    
    
    public static void leerArchivo(String nomarch)
    {
       File archivo = null;
       FileReader fr = null;
       BufferedReader br = null;

       try 
       {
             // Apertura del fichero y creacion de BufferedReader para poder
             // hacer una lectura comoda (disponer del metodo readLine()).
             archivo = new File (nomarch); //"C:\\archivo.txt");
             //"C:\Users\jose_\Documents\Tec Laguna\4to Semestre\4. Estructura de Datos\Programas\Unidad 4\appColaSimplePlantillas\nombres.txt"
            
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);//para leer

             // Lectura del fichero
             String linea;
             while((linea = br.readLine()) !=null )
                System.out.println(linea);
          }
          catch(Exception e)
          {
             e.printStackTrace();
          }
          finally
          {
             // En el finally cerramos los flujos o archivos

             try{                    
                if( fr != null )
                {
                   br.close();
                   fr.close();    

                }                  
             }
             catch (Exception e2)
             { 
                e2.printStackTrace();
             }
          }
    }
    
    public static void leerArchivo(String nomarch, ArrayList<String> nombres)
    {
        nombres.clear();
        
       File archivo = null;
       FileReader fr = null;
       BufferedReader br = null;

       try 
       {
             // Apertura del fichero y creacion de BufferedReader para poder
             // hacer una lectura comoda (disponer del metodo readLine()).
             archivo = new File (nomarch); //"C:\\archivo.txt");
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cadena;
             while((cadena = br.readLine()) !=null )
               // System.out.println(linea);
                 //GUARDAMOS LOS NOMBRES EN UN ARRAYLIST
                 nombres.add(cadena);
          }
          catch(Exception e)
          {
             e.printStackTrace();
          }
          finally
          {
             // En el finally cerramos los flujos o archivos

             try{                    
                if( fr != null )
                {
                   br.close();
                   fr.close();    

                }                  
             }
             catch (Exception e2)
             { 
                e2.printStackTrace();
             }
          }
    }
    
    public static void Guardar(String nomarch, ArrayList<String> nombres) throws IOException
    {
       // Scanner sc = new Scanner(System.in);
        
        PrintWriter salida = null;//ARCHIVO DE TEXTO
       
        try 
        {
            salida = new PrintWriter(nomarch);
             //nombres es un contenedor
            for (String s : nombres) {
                //System.out.println(s);
                salida.println(s);
            }
            //String cadena;
            /*System.out.println("Introduce Texto. Para terminar teclea . ");
            cadena = sc.nextLine();
            while (!cadena.equals(".")){
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            */ 
            salida.flush(); //limpiar los flujos
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println(e.getMessage());
        }
        finally 
        {    
            salida.close();
        }
    }
    
    public static void Agregar(String nomarch, ArrayList<String> nombres) throws IOException
    {
        
        
        Scanner sc = new Scanner(System.in);
        FileWriter archivo=null;
        PrintWriter salida = null;//ARCHIVO DE TEXTO
        try {
            //salida = new PrintWriter("C:\\Users\\mosva\\Desktop\\ArchivosPracticas\\" + nomarch);
            
            archivo = new FileWriter(nomarch,true);//<-- true para AGREGAR
            salida = new PrintWriter(archivo);
           
            for (String s : nombres) {
                //System.out.println(s);
                salida.println(s);
            }
            
            
            /*String cadena;
            //System.out.println("Introduce Nombres. Para acabar introduce la cadena FIN:");
            System.out.println("Introduce Texto Para terminar teclea . ");
            cadena = sc.nextLine();
            while (!cadena.equals(".")){
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            */
            salida.flush();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println(e.getMessage());
        }
        
        finally 
        {    
            salida.close();
        }
    }
    
}
