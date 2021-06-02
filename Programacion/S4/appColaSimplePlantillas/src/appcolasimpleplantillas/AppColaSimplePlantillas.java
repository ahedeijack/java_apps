/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimpleplantillas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class AppColaSimplePlantillas {

    /**
     * @param args the command line arguments
     */
    
    public static void colaSimple(String tipo)
    {
        switch(tipo)
        {
            case "Integer":
            {
                int d, op = 1;
                
                ColaSimpleT<Integer> cola = new ColaSimpleT<Integer>(5);
                Scanner teclado = new Scanner(System.in);
                boolean band = true;
                while(band = true)
                {
                    op = Menu.opciones();
                    switch(op)
                    {
                        case 1:
                        {    
                            System.out.print("Dato: ");
                            d = teclado.nextInt();
                            if(!cola.esta_llena())
                            {
                                cola.agregar(d);   //azul
                                System.out.println("\033[34m OK, DATO INSERTADO");
                                cola.mostrar();
                                
                            }    
                            else
                            {                       //morado
                                System.out.println("\033[35m DESBORDAMIENTO (OVERFLOW)");
                            }
                            
                        }   
                        System.out.println("\033[30m");
                        break;
                        
                        case 2:
                        {
                            if(!cola.esta_vacia())
                            {
                                Integer dato = cola.extraer();
                                if(dato!=null)
                                {                       //ROJO
                                    System.out.println("\033[31m OK, DATO ELIMINADO");
                                    cola.mostrar();
                                }  
                                
                            } 
                            else
                            {
                                System.out.println("\033[35m COLA VACIA (UNDERFLOW)");
                            }    
                        }
                        System.out.println("\u001B[30m");
                        break;
                        
                        case 3: //band = false; //negro reseteamos el color
                        //break;
                            return;
  
                    }    
                }    
            } 
            
            case "Double":
            {
                int op = 1;
                double d;
                
                ColaSimpleT<Double> cola = new ColaSimpleT<Double>(5);
                Scanner teclado = new Scanner(System.in);
                boolean band = true;
                while(band = true)
                {
                    op = Menu.opciones();
                    switch(op)
                    {
                        case 1:
                        {    
                            System.out.print("Dato: ");
                            d = teclado.nextDouble();
                            if(!cola.esta_llena())
                            {
                                cola.agregar(d);   //azul
                                System.out.println("\033[34m OK, DATO INSERTADO");
                                cola.mostrar();
                                
                            }    
                            else
                            {                       //morado
                                System.out.println("\033[35m DESBORDAMIENTO (OVERFLOW)");
                            }
                            
                        }   
                        System.out.println("\033[30m");
                        break;
                        
                        case 2:
                        {
                            if(!cola.esta_vacia())
                            {
                                Double dato = cola.extraer();
                                if(dato!=null)
                                {                       //ROJO
                                    System.out.println("\033[31m OK, DATO ELIMINADO");
                                    cola.mostrar();
                                }  
                                
                            } 
                            else
                            {
                                System.out.println("\033[35m COLA VACIA (UNDERFLOW)");
                            }    
                        }
                        System.out.println("\u001B[30m");
                        break;
                        
                        case 3: //band = false; //negro reseteamos el color
                        //break;
                            return;
  
                    }    
                }    
            }
            
            case "String":
            {
                int op = 1;
                String d;
                
                ColaSimpleT<String> cola = new ColaSimpleT<String>(5);
                Scanner teclado = new Scanner(System.in);
                boolean band = true;
                while(band = true)
                {
                    op = Menu.opciones();
                    switch(op)
                    {
                        case 1:
                        {    
                            System.out.print("Dato: ");
                            d = teclado.next();
                            if(!cola.esta_llena())
                            {
                                cola.agregar(d);   //azul
                                System.out.println("\033[34m OK, DATO INSERTADO");
                                cola.mostrar();
                                
                            }    
                            else
                            {                       //morado
                                System.out.println("\033[35m DESBORDAMIENTO (OVERFLOW)");
                            }
                            
                        }   
                        System.out.println("\033[30m");
                        break;
                        
                        case 2:
                        {
                            if(!cola.esta_vacia())
                            {
                                String dato = cola.extraer();
                                if(dato!=null)
                                {                       //ROJO
                                    System.out.println("\033[31m OK, DATO ELIMINADO");
                                    cola.mostrar();
                                }  
                                
                            } 
                            else
                            {
                                System.out.println("\033[35m COLA VACIA (UNDERFLOW)");
                            }    
                        }
                        System.out.println("\u001B[30m");
                        break;
                        
                        case 3: //band = false; //negro reseteamos el color
                        //break;
                            return;
  
                    }    
                }    
            }
            
            case "NombresEnArchivos":
            {
                int op;
                String nombre;
                
                ColaSimpleT<String> cola = new ColaSimpleT<String>(5);
                
                
                //Leer el archivo de nombres y contarlos
                //y de ese numero hacer un aleatorio de al menos 5 nombres
                
                
                //Scanner teclado = new Scanner(System.in);
                boolean band = true;
                while(band = true)
                {
                    op = Menu.opciones();
                    switch(op)
                    {
                        case 1:
                        {    
                            //System.out.print("Dato: ");
                            //d = teclado.next();
                            ArrayList<String> nombres = new ArrayList<String>();
                            ArchivosDeTexto.leerArchivo("nombres.txt", nombres);
                            Random random = new Random();
                            if(!cola.esta_llena())
                            {                  //obtenemos nombres aleatorios
                                cola.agregar(nombres.get(random.nextInt(nombres.size())));   //azul
                                System.out.println("\033[34m OK, DATO INSERTADO");
                                cola.mostrar();
                                
                            }    
                            else
                            {                       //morado
                                System.out.println("\033[35m DESBORDAMIENTO (OVERFLOW)");
                            }
                            
                        }   
                        System.out.println("\033[30m");
                        break;
                        
                        case 2:
                        {
                            if(!cola.esta_vacia())
                            {
                                //la cola ya tiene los datos ahora solo los extraemos
                                String cadena = cola.extraer();
                                if(cadena!=null)
                                {                       //ROJO
                                    System.out.println("\033[31m OK, DATO ELIMINADO");
                                    cola.mostrar();
                                }  
                                
                            } 
                            else
                            {
                                System.out.println("\033[35m COLA VACIA (UNDERFLOW)");
                            }    
                        }
                        System.out.println("\u001B[30m");
                        break;
                        
                        case 3: //band = false; //negro reseteamos el color
                        //break;
                            return;
  
                    }    
                }    
            }
        }    
    }        
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("EJEMPLOS UTILIZANDO COLA SIMPRE");
        int opc;
        boolean band = true;
        while(band)
        {
            opc = MenuTipos.opciones();
            switch(opc)
            {
                case 1: colaSimple("Integer");
                break;
                
                case 2: colaSimple("Double");
                break;
                
                case 3: colaSimple("String");
                break;
                
                case 4: colaSimple("NombresEnArchivos");
                break;
                
                case 5: band = false;
                break;
            }    
        }    
    }
    
}
