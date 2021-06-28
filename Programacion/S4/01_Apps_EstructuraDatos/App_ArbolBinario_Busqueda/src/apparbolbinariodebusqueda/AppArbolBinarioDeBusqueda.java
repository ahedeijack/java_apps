/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparbolbinariodebusqueda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class AppArbolBinarioDeBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int []vec = {72,35,96,29,88,122,58,101,16,43,137,55};
        Random r = new Random();

        Scanner read = new Scanner(System.in);
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();
        
        System.out.println("Insertando datos en el arbol. ");
        
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]);
            System.out.print(" , ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < vec.length; i++)
        {
            arbol.insertar(vec[i]);
        }
        
        System.out.println("Recorrido In-orden: ");
        arbol.RecInorden();
        System.out.println("");
        System.out.println("Recorrido Pos-Orden: ");
        arbol.RecPosOrden();
        System.out.println("");
        System.out.println("Recorrido Pre-Orden: ");
        arbol.RecPreOrden();
        System.out.println("");
        System.out.println("Mayor: "+arbol.Mayor());      
        System.out.println("Menor: "+arbol.Menor());
        
        int rep = -1;
        do{
        System.out.println("Ingresa el nodo a eliminar. ");
        int del = read.nextInt();
        arbol.eliminar(del);
        System.out.println("Recorrido In-orden: ");
        arbol.RecInorden();
        
            System.out.println("");
            System.out.println("Eliminar otro? (Para no, ingresar -1)");
            rep = read.nextInt();
        } while(rep != -1);

        ArbolBinarioDeBusqueda busqueda = arbol.buscar_(58);
        busqueda.RecInorden();
        
    }

    
}
// Plegamiento 6 digitos.
//Hacer la prueba a los otros 3 datos que faltan -
//Metodo hash, subir previo al hash asignado