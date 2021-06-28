/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphash;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author D E L L P C
 */
public class AppHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int [] datos = {17,27,34,44,26};
        
//        int pos= Hash.Hash_Modulo(datos[i])
//                int pos Hash.Hash_Buscar(27)
System.out.println("Probar con este");
        int [] vec = new int[70];
        Random r = new Random();
        for(int i=0; i< vec.length;i++)
        {
            int key = r.nextInt(100)+100;
            System.out.println(key);
            int indice = Hash.HashTrunc(vec, key, vec.length);
            vec[indice]=key;
        }
            System.out.println("\nDATOS EN EN EL ARREGLO UBICADOS POR HASH: \n");
            for(int i=0; i <vec.length; i++)
                System.out.println("Vec ["+ i + "]:" +vec[i]);
            System.out.println("\tBUSQUEDA DE DATOS \n");
            Scanner entrada = new Scanner(System.in);
            char resp;
            do{
                System.out.println("\nDATO A BUSCAR: ");
                int dato= entrada.nextInt();
                    int pos = Hash.Hash_Buscar(vec, dato, vec.length);
                if(pos == -1)
                    System.out.println("Dato no existe");
                else
                    System.out.println("Dato encontrado en la posicion "+pos);
                System.out.println("\n Buscar otro dato? [S/N]");
                resp = Character.toLowerCase(entrada.next().charAt(0));
            }while(resp == 's');
    }
    
}
