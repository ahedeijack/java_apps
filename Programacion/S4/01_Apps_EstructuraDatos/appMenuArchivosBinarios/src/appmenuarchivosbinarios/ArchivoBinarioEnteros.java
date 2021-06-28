/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenuarchivosbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author martinos
 */
public class ArchivoBinarioEnteros 
{
    public static void leer_archivo(String nomarch)
    {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int n;
        try {
            fis = new FileInputStream(nomarch);       //"/ficheros/datos.dat");
            entrada = new DataInputStream(fis);
            while (true) {    
                n = entrada.readInt();  //se lee  un entero del fichero
                System.out.println(n);  //se muestra en pantalla
            }
        } catch (FileNotFoundException e) 
        {
            System.out.println(e.getMessage());
        } 
        catch (EOFException e) { 
            System.out.println("Fin de archivo");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void guardar_archivo(String nomarch)
    {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
        try {                                    //AGREGAR
            fos = new FileOutputStream(nomarch);  //"datos.itl",true //No debe ser .txt
            salida = new DataOutputStream(fos);

            System.out.print("Introduce número entero. -1 para terminar: ");
            n = sc.nextInt();
            while (n != -1) {
                salida.writeInt(n); //se escribe el número entero en el fichero
                System.out.print("Introduce número entero. -1 para terminar: ");
                n = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally 
        {
            try {
                if (salida != null) {
                    salida.close();
                }if (fos != null) {
                    fos.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

    public static void agregar_a_archivo(String nomarch)
    {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
        try {                                    //AGREGAR
            fos = new FileOutputStream(nomarch,true);  //"datos.itl",true (archiv, true (para ir agregando informacion))
            salida = new DataOutputStream(fos);

            System.out.print("Introduce número entero. -1 para acabar: ");
            n = sc.nextInt();
            while (n != -1) {
                salida.writeInt(n); //se escribe el número entero en el fichero
                System.out.print("Introduce número entero. -1 para acabar: ");
                n = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally 
        {
            try {
                if (salida != null) {
                    salida.close();
                }if (fos != null) {
                    fos.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
