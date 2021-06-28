/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazadaprueba;

import Clases.ListaEnlazada;
import Clases.Menu;
import java.util.Scanner;

/**
 *
 * @author pqdst
 */
public class ListaEnlazadaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     ListaEnlazada cola = new ListaEnlazada();
//     lista.Insertar(10);
//     lista.Insertar(12);
//     lista.Insertar(1);
//     lista.Insertar(5);
//     lista.Insertar(3);
//     lista.Mostrar();
//     
//     lista.Borrar(5);
//     lista.Borrar(10);
//     lista.Mostrar();
     
        Scanner teclado = new Scanner(System.in);
        char opcion;
        boolean band = true;
        
        while(band){
            opcion = Menu.opciones();
            switch(opcion){
                case'0':{
                        System.out.println("Adios c:");
                        band=false;
                    }break;
                case '1':{
                    System.out.println("teclee el numero que quiera ingresar a la cola");
                    int v;
                    try{
                    v = Integer.parseInt(teclado.next());
                    }catch(NumberFormatException e){
                        System.out.println("entrada no valida");
                        System.out.println("mensaje del compilador"+e.getMessage());
                        System.out.println("el valor default sera 5;");
                        v=5;
                    }
                    
                    cola.Insertar(v);
                    cola.Mostrar();
                    }break;
                
                case '2':{
                    System.out.print("teclee el numero que desee borrar de la cola:    ");
                     int n = teclado.nextInt();
                     
                     if(cola.ListaVacia()){
                         System.out.println("cola vacia, ingrese algunos datos antes");
                     }else if(n!=n){
                         System.out.println("el elemento no existe en la cola");
                     }
                        cola.Borrar(n);
                        cola.Mostrar();
                    }break;
                    
                case '3':{
                        if(lista.ListaVacia()){
                            System.out.println("la lista esta vacia"
                                             + "por favor ingrese algunos datos a la lista");
                        }
                        System.out.print("el pirmer elemento de la lista es -> ");
                        lista.Primero();
                    }break;
                    
                case'4':{
                        if(lista.ListaVacia()==false){
                        System.out.println("valor -> "+lista.valorActual());                    
                        System.out.print("nombre ->"+lista.nombreActual());
                        }
                        
                        System.out.println("la lista esta vacia "
                                         + "por favor ingrese algunos datos a la lista");
                    
                    }break;
                
                case'5':{
                        if(lista.ListaVacia()==true){
                            System.out.println("la lista esta vacia"
                                             + "por favor ingrese algunos datos a la lista");
                        }
                        System.out.print("ultimo elemento de la lista -> ");
                        lista.Ultimo();
                    
                    }break;
                
            }
        }
    }
     
}
