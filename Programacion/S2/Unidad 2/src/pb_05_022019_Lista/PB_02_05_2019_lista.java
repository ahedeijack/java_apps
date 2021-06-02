/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_022019_Lista;

import java.util.Arrays;

/**
 *
 * @author aa602
 */
public class PB_02_05_2019_lista {
//Un metodo static no puede crear un objeto que no es static
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto[] inventario = {
            
                   new Producto("Cuaderno :",28,18),
                   new Producto("Lapiz    :",458,3.25),
                   new Producto("Mouse    :",289,149.50),
                   new Producto("Libro Matematicas:",365,249),
                   new Producto("Memoria USB:",290,37.50),
                   new Producto("Lapicero :",150,17),
                   new Producto("Micro SD :",291,119.99),
            
        };
        
        
        mostrar(inventario, "Lista sin ordenar: ");
        
        Arrays.sort(inventario);
        mostrar(inventario, "Lista ordenada por existencia:");
        

    }
    
    public static void mostrar(Producto []inv, String encabezado){
            
            System.out.println(encabezado+"\n");
            
            for(Producto p:inv)
                System.out.println(p);
            
            System.out.println();
        }
    
}
