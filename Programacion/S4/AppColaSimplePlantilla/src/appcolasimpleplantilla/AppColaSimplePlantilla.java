/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimpleplantilla;

import Clases.ArchivosDeTexto;
import Clases.ColaSimpleT;
import Clases.Menu;
import Clases.MenuTipos;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pqdst
 */
public class AppColaSimplePlantilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opc;
        boolean band = true;
        
        while(band){
            opc = MenuTipos.Opciones();
            switch(opc){
                case '0':{
                    System.out.println("adios c:");
                    band = false;
                }break;
                case '1':{
                    ArrayList<String> nombres = new ArrayList<String>();
                    ArchivosDeTexto.leerArchivo("nombres.txt", nombres);
                    Random azar = new Random();
                    if (!cola.llena()) {
                        cola.agregar(nombres.get(azar.nextInt(nombres.size())));
                        System.out.println("\\033[34m OK], Dato incertado en la cola.");
                        cola.mostrar;
                    } else {
                        System.out.println("\033[35m] Desbordamiento, overflow!");
                    }
                    
                    colaSimple("Integer");
                }break;
                case '2':{
           
                    colaSimple("Double");
                }break;
                case '3':{
                    colaSimple("String");
                }break;
                case '4':{
                    colaSimple("Nombres en archivos");
                }break;
            }
        }
    }
    public static void colaSimple(String tipo){
        switch(tipo){
            case "Integer":{
                int d, op = 1;
                
                ColaSimpleT<Integer> cola = new ColaSimpleT(5);
                Scanner scan = new Scanner(System.in);
                boolean band = true;
                
                while(band){
                    op = Menu.Opciones();
                    switch(op){
                         case '0':{
                            band = false;
                        }break;
                        case '1':{
                            System.out.print("Dato: ");
                            d = scan.nextInt();
                            
                            if(!cola.llena()){
                                cola.agregar(d);    //color azul
                                System.out.println("\033[34m el dato -> "+d+" fue insertado");
                            }else                  //color morado
                                System.out.println("\033[35m OverFlow!!");
                            System.out.println("\033[30m"); // se reinicia el color
                        }break;
                        
                        case'2':{
                            if(!cola.vacia()){
                                Integer dato = cola.extraer();
                                if(dato != null){
                                    System.out.println("\033[31m el dato fue eliminado");
                                }
                            }else
                                System.out.println("\033[35m UnderFlow!!");
                            System.out.println("\033[30m");
                        }break;
                        case'3':{
                            if(!cola.vacia())
                                cola.mostrar();
                            else
                                System.out.println("cola vacia");
                        }break;
                }
            }
        }break;
            case "Double":{
                double d= 1.0;
                int op = 1;
                
                ColaSimpleT<Double> cola = new ColaSimpleT(5);
                Scanner scan = new Scanner(System.in);
                boolean band = true;
                
                while(band){
                    op = Menu.Opciones();
                    switch(op){
                         case '0':{
                            band = false;
                        }break;
                        case '1':{
                            System.out.print("Dato: ");
                            d = scan.nextDouble();
                            
                            if(!cola.llena()){
                                cola.agregar(d);    //color azul
                                System.out.println("\033[34m el dato -> "+d+" fue insertado");
                            }else                  //color morado
                                System.out.println("\033[35m OverFlow!!");
                            System.out.println("\033[30m"); // se reinicia el color
                        }break;
                        
                        case'2':{
                            
                            if(!cola.vacia()){
                                Double dato = cola.extraer();
                                if(dato != null){
                                    System.out.println("\033[31m el dato fue eliminado");
                                }
                            }else
                                System.out.println("\033[35m UnderFlow!!");
                            System.out.println("\033[30m");
                        }break;
                        case'3':{
                            if(!cola.vacia())
                                cola.mostrar();
                            else
                                System.out.println("cola vacia");
                        }break;
                }
            }
            }break;
            case "String":{
                String d= "";
                int op = 1;
                
                ColaSimpleT<String> cola = new ColaSimpleT(5);
                Scanner scan = new Scanner(System.in);
                boolean band = true;
                
                while(band){
                    op = Menu.Opciones();
                    switch(op){
                         case '0':{
                            band = false;
                        }break;
                        case '1':{
                            System.out.print("Cadena: ");
                            d = scan.next();
                            
                            if(!cola.llena()){
                                cola.agregar(d);    //color azul
                                System.out.println("\033[34m la cadena -> "+d+" fue insertada");
                            }else                  //color morado
                                System.out.println("\033[35m OverFlow!!");
                            System.out.println("\033[30m"); // se reinicia el color
                        }break;
                        
                        case'2':{
                            if(!cola.vacia()){
                                String dato = cola.extraer();
                                if(dato != null){
                                    System.out.println("\033[31m la cadena fue eliminada");
                                }
                            }else
                                System.out.println("\033[35m UnderFlow!!");
                            System.out.println("\033[30m");
                        }break;
                        case'3':{
                            if(!cola.vacia())
                                cola.mostrar();
                            else
                                System.out.println("cola vacia");
                        }break;
                    }
                }
            }break;
        }
    }   
}
