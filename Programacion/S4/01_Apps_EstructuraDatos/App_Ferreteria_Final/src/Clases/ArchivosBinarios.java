/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahdeijack
 */

public class ArchivosBinarios {
    int cont;
    private class nodoArbol
    
        {
        private int dato; //string descripcion; double precio; int cantidad; podrian formar cada nodo del arbol
        private ArbolBinarioDeBusqueda der;
        private ArbolBinarioDeBusqueda izq;
        
        private void nodoArbol()
        {
            dato = 0;
            der = null;
            izq = null;
        }
        }
    
     public static  void leer_archivo(DefaultTableModel modelo, JTable Modelo){
        JFileChooser jfch = new JFileChooser();
        FileInputStream fis = null;
        DataInputStream entrada = null;
        jfch.setDialogTitle("Busca archivos con terminación .vzq");
             
             if(jfch.showOpenDialog(Modelo) !=0){
                 return;
             }
        
        try {
            fis = new FileInputStream(jfch.getSelectedFile());       //"/ficheros/datos.dat");
            entrada = new DataInputStream(fis);
            Object o = new Object[5];
            int n = Integer.parseInt(entrada.readInt()+"");
            modelo.setRowCount(n);
            int i = 0;
            while (true) {    
                
                modelo.setValueAt(entrada.readInt(), i, 0);   
                modelo.setValueAt(entrada.readUTF(), i, 1);
                modelo.setValueAt(entrada.readUTF(), i, 2);
                modelo.setValueAt(entrada.readInt(), i, 3);
                modelo.setValueAt(entrada.readDouble(), i, 4);
                i++;
                
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
     
    public static void guardar_archivo(Producto [] prod, int r, JLabel l1) //recibe un arrego de productos
    {
        JFileChooser jfch = new JFileChooser();
        Scanner sc = new Scanner(System.in);
        
        jfch.showSaveDialog(l1);
        jfch.setDialogTitle("Guardar registro.");
        
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;
        try {                                    //AGREGAR
            fos = new FileOutputStream(jfch.getSelectedFile()+".vzq");  //"datos.itl",true //No debe ser .txt
            salida = new DataOutputStream(fos);
            int i = 0;
            salida.writeInt(prod.length);
            while ( i < prod.length) {
                salida.writeInt(prod[i].getId());
                salida.writeUTF(prod[i].getTipo());
                salida.writeUTF(prod[i].getMarca());
                salida.writeInt(prod[i].getCantidad());
                salida.writeDouble(prod[i].getPrecio());
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
    

    public static void agregar_a_archivo(String nomarch, Producto [] prod)
    {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        Producto prodAdd = new Producto();
        int n;
        try {                                    //AGREGAR
            fos = new FileOutputStream(nomarch,true);  //"datos.itl",true (archiv, true (para ir agregando informacion))
            salida = new DataOutputStream(fos);

             int i = 0;
            while ( i < prod.length) {
                salida.writeInt(prod[i].getId());
                salida.writeUTF(prod[i].getTipo());
                salida.writeUTF(prod[i].getMarca());
                salida.writeDouble(prod[i].getPrecio());
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
    
    public static  void ordQS_A_ID(Producto prod[], int izq, int der){
        int i, j, pivote;
        Producto aux = new Producto();
        i = izq;
        j = der;
        
        pivote = prod[(izq+der)/2].getId();
        do{
            
        while(prod[i].getId()<pivote && i < der)
            i++;
            
        while(prod[j].getId()>pivote && j>izq)
            j--;
        
            if (i<=j) {
                aux.setId(prod[i].getId());
                prod[i].setId(prod[j].getId());
                prod[j].setId(aux.getId());
                
                aux.setTipo(prod[i].getTipo());
                prod[i].setTipo(prod[j].getTipo());
                prod[j].setTipo(aux.getTipo());
                
                aux.setMarca(prod[i].getMarca());
                prod[i].setMarca(prod[j].getMarca());
                prod[j].setMarca(aux.getMarca());
                
                aux.setCantidad(prod[i].getCantidad());
                prod[i].setCantidad(prod[j].getCantidad());
                prod[j].setCantidad(aux.getCantidad());
                
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
    
     public static  void ord_QS_Dsc_Asc(Producto prod[], int izq, int der){
        int i, j;
        Producto aux = new Producto();
        i = izq;
        j = der;
        
        String pivote = prod[(izq+der)/2].getTipo();
        do{
            
        while(prod[i].getTipo().compareTo(pivote)<0 && i < der)
            i++;
            
        while(prod[j].getTipo().compareTo(pivote)>0 && j>izq)
            j--;
        
            if (i<=j) {
                aux.setId(prod[i].getId());
                prod[i].setId(prod[j].getId());
                prod[j].setId(aux.getId());
                
                aux.setTipo(prod[i].getTipo());
                prod[i].setTipo(prod[j].getTipo());
                prod[j].setTipo(aux.getTipo());
                
                aux.setMarca(prod[i].getMarca());
                prod[i].setMarca(prod[j].getMarca());
                prod[j].setMarca(aux.getMarca());
                
                aux.setCantidad(prod[i].getCantidad());
                prod[i].setCantidad(prod[j].getCantidad());
                prod[j].setCantidad(aux.getCantidad());
                
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
     
     public static  void ordQS_A_ID(ProductoSerial prod[], int izq, int der){
        int i, j, pivote;
        Producto aux = new Producto();
        i = izq;
        j = der;
        
        pivote = prod[(izq+der)/2].getId();
        do{
            
        while(prod[i].getId()<pivote && i < der)
            i++;
            
        while(prod[j].getId()>pivote && j>izq)
            j--;
        
            if (i<=j) {
                aux.setId(prod[i].getId());
                prod[i].setId(prod[j].getId());
                prod[j].setId(aux.getId());
                
                aux.setTipo(prod[i].getTipo());
                prod[i].setTipo(prod[j].getTipo());
                prod[j].setTipo(aux.getTipo());
                
                aux.setMarca(prod[i].getMarca());
                prod[i].setMarca(prod[j].getMarca());
                prod[j].setMarca(aux.getMarca());
                
                aux.setCantidad(prod[i].getCantidad());
                prod[i].setCantidad(prod[j].getCantidad());
                prod[j].setCantidad(aux.getCantidad());
                
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
     public static void ordQS_A_Desc(ProductoSerial prod[]){
         ProductoSerial aux = new ProductoSerial();
         
         for (int i = 0; i < prod.length; i++) {
             for (int j = 0; j < prod.length; j++) {
                 
                 if (prod[i].getTipo().compareTo(prod[j].getTipo())<0) {
                     aux = prod[i];
                     prod[i] = prod[j];
                     prod[j]  = aux;           
                 }
                 
                 
             }
         }
         
         
     }
     public static  void ord_QS_Dsc_Asc(ProductoSerial prod[], int izq, int der){
        int i, j;
        Producto aux = new Producto();
        i = izq;
        j = der;
        
        String pivote = prod[(izq+der)/2].getTipo();
        do{
            
        while(prod[i].getTipo().compareTo(pivote)<0 && i < der)
            i++;
            
        while(prod[j].getTipo().compareTo(pivote)>0 && j>izq)
            j--;
        
            if (i<=j) {
                aux.setId(prod[i].getId());
                prod[i].setId(prod[j].getId());
                prod[j].setId(aux.getId());
                
                aux.setTipo(prod[i].getTipo());
                prod[i].setTipo(prod[j].getTipo());
                prod[j].setTipo(aux.getTipo());
                
                aux.setMarca(prod[i].getMarca());
                prod[i].setMarca(prod[j].getMarca());
                prod[j].setMarca(aux.getMarca());
                
                aux.setCantidad(prod[i].getCantidad());
                prod[i].setCantidad(prod[j].getCantidad());
                prod[j].setCantidad(aux.getCantidad());
                
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
     
        
             nodoArbol raiz;
        public boolean estaVacio()
        {
            return raiz == null;
        }
     
     
     
}

