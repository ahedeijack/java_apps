/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimple;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author X555Q
 */
public class AppColaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Cola tamaño =5

//   //Agregamos cinco datos a la cola.
//   ejemplo.agregar(12);
//   ejemplo.agregar(21);
//   ejemplo.agregar(4);
//   ejemplo.agregar(7);
//   ejemplo.agregar(3);
//   
//   //Eliminamos 
//  
//   ejemplo.mostrar();

    Scanner leer = new Scanner (System.in);
Random rd = new Random();
 int i,n,dato = 0; 

    System.out.print(" Cuantos elementos : ");
n = leer.nextInt();
  Cola  ejemplo = new Cola(n);
 System.out.println("\tInsertando Datos en la cola ");
 
 for( i = 0; i < n+1; i++)
 {
 dato = rd.nextInt(90)+10; 
 if(ejemplo.agregar(dato))
         System.out.println("Dato agregado : "+dato);
 else
         System.out.println("\nDesbordamiento, Cola llena : ");
 }
        System.out.println("\n\tExtrayendo Datos de la cola ");
        Numero numero = new Numero();
     //   ejemplo.extraer(numero);
//        while(ejemplo.extraer(numero))
// {
//     System.out.println("Dato extraido :  "+numero.num);
// }
for(i=0; i<n-1; i++)
        {
            ejemplo.extraer(numero);
            System.out.print("\nDato extraido : "+numero.num);
        }
        dato = rd.nextInt(90)+10;
        if(ejemplo.agregar(dato))
        System.out.print("\nDato agregado : "+dato);
        else
            System.out.println("\nDato NO agregado: "+ dato);

}}