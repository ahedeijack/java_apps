/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Ferreteria_Binarios;

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
 * @author ahdeijack
 */
public class ArchivosBinarios {
    
     public static void leer_archivo(String nomarch){
        FileInputStream fis = null;
        DataInputStream entrada = null;
        try {
            fis = new FileInputStream(nomarch);       //"/ficheros/datos.dat");
            entrada = new DataInputStream(fis);
            
            while (true) {    
                int clave = entrada.readInt();  //Leeremos el tamaño del arreglo
                int cantidad = entrada.readInt();
                String desc = entrada.readUTF(); //Leemos una cadena (Strings)
                double precio = entrada.readDouble();
                System.out.println("ID: |"+clave+" | "+", Cantidad: "+cantidad+", Descripción: "+desc+", Precio: $"+precio);
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
     
    public static void guardar_archivo(String nomarch, Productos [] prod) //recibe un arrego de productos
    {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
        try {                                    //AGREGAR
            fos = new FileOutputStream(nomarch);  //"datos.itl",true //No debe ser .txt
            salida = new DataOutputStream(fos);
            int i = 0;
            while ( i < prod.length) {
                salida.writeInt(prod[i].clave);
                salida.writeInt(prod[i].cant);
                salida.writeUTF(prod[i].descripcion);
                salida.writeDouble(prod[i].precio);
                i++;
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
    

    public static void agregar_a_archivo(String nomarch, Productos [] prod)
    {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        Productos prodAdd = new Productos();
        int n;
        try {                                    //AGREGAR
            fos = new FileOutputStream(nomarch,true);  //"datos.itl",true (archiv, true (para ir agregando informacion))
            salida = new DataOutputStream(fos);

             int i = 0;
            while ( i < prod.length) {
                salida.writeInt(prod[i].clave);
                salida.writeInt(prod[i].cant);
                salida.writeUTF(prod[i].descripcion);
                salida.writeDouble(prod[i].precio);
                i++;
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
    
    public static  void ordQS_A_ID(Productos prod[], int izq, int der){
        int i, j, pivote;
        Productos aux = new Productos();
        i = izq;
        j = der;
        
        pivote = prod[(izq+der)/2].getClave();
        do{
            
        while(prod[i].getClave()<pivote && i < der)
            i++;
            
        while(prod[j].getClave()>pivote && j>izq)
            j--;
        
            if (i<=j) {
                aux.setClave(prod[i].getClave());
                prod[i].setClave(prod[j].getClave());
                prod[j].setClave(aux.getClave());
                
                aux.setCant(prod[i].getCant());
                prod[i].setCant(prod[j].getCant());
                prod[j].setCant(aux.getCant());
                
                aux.setDescripcion(prod[i].getDescripcion());
                prod[i].setDescripcion(prod[j].getDescripcion());
                prod[j].setDescripcion(aux.getDescripcion());
                
                aux.setPrecio(prod[i].getPrecio());
                prod[i].setPrecio(prod[j].getPrecio());
                prod[j].setPrecio(aux.getPrecio());
                
                i++; j--;
            }
        } while(i<=j);
        
        if(izq<j)
            ordQS_A_ID(prod, izq, j);
        
        if (i<der) 
            ordQS_A_ID(prod, i, der);

    }
        //1.-Utilizar la clave de los productos para ordenarlos por medio del QuickSort
    
     public static  void ord_QS_Dsc_Asc(Productos prod[], int izq, int der){
        int i, j;
        Productos aux = new Productos();
        i = izq;
        j = der;
        
        String pivote = prod[(izq+der)/2].getDescripcion();
        do{
            
        while(prod[i].getDescripcion().compareTo(pivote)<0 && i < der)
            i++;
            
        while(prod[j].getDescripcion().compareTo(pivote)>0 && j>izq)
            j--;
        
            if (i<=j) {
                aux.setClave(prod[i].getClave());
                prod[i].setClave(prod[j].getClave());
                prod[j].setClave(aux.getClave());
                
                aux.setCant(prod[i].getCant());
                prod[i].setCant(prod[j].getCant());
                prod[j].setCant(aux.getCant());
                
                aux.setDescripcion(prod[i].getDescripcion());
                prod[i].setDescripcion(prod[j].getDescripcion());
                prod[j].setDescripcion(aux.getDescripcion());
                
                aux.setPrecio(prod[i].getPrecio());
                prod[i].setPrecio(prod[j].getPrecio());
                prod[j].setPrecio(aux.getPrecio());
                
                i++; j--;
            }
        } while(i<=j);
        
        if(izq<j)
            ordQS_A_ID(prod, izq, j);
        
        if (i<der) 
            ordQS_A_ID(prod, i, der);

    }
}
        //2.- Para mañana utilizar la descripcion.
//Evualuación unidad 6, ordenamientos. 
