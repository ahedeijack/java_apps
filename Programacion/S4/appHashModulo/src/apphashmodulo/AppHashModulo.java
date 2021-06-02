/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphashmodulo;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class AppHashModulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VALIDAR QUE N SEA UN NUM PRIMO O BUSCARLO
        //INCLUIR SU CLASE MATEMATICAS PARA USAR EL METODOS DE PRIMOS
        
        //El lunes iniciamos con la prueba de escritorio cen el cuaderno
        //Solicitar al usuario cantidad de datos
        //  int[]vec = {17,27,34,44,26,37,11};

        int n = 101;
        
        Random azar = new Random();
        int vecHash[] = new int[n];
        
        for(int i=0; i<vecHash.length; i++)
        {
            int key = azar.nextInt(9000)+1000;
            System.out.println(key);
            int indice = HashModulo.hash_modulo_ubicar_pos(vecHash, key, vecHash.length);
            vecHash[indice] = key;
        }    
        System.out.println("\nDatos en el arreglo ubicados por hash\n");
        for(int i =0; i<vecHash.length; i++)
        {
            System.out.println("Vec ["+ i + "] : "+vecHash[i]);
        }
        System.out.println("\t\tBusqueda de datos");
        Scanner teclado = new Scanner(System.in);
        char resp;
        do
        {
            System.out.println("\tDato a buscar");
            int dato = teclado.nextInt();
            int pos = HashModulo.hash_modulo_buscar(vecHash, dato, vecHash.length);
            if(pos==1)
                System.out.println("Dato no existe");
            else
                System.out.println("Dato encontrado en la posicion " + pos);
            System.out.println("\nBuscar otro (s/n)");
            resp = Character.toLowerCase(teclado.next().charAt(0));
        }while(resp=='s');
        
    }        
}

//Para el proyecto hash, utilizarlo pra ubicar por clave algún tipo de producto.
