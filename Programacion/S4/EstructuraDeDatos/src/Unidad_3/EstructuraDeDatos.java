/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ahedeijack
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    
      Scanner read = new Scanner(System.in);
        int n;
        char rep = 's';
        //for(char rep == 's'; rep == 'S'; rep == Character.toLowerCase(rep), rep = Character.toLowerCase(0)){
        do{ 
         
        int sel;
         
        
         try {
                     System.out.println("Ingresa el tipo de operacion a realizar entre el 0 - 12");
                     System.out.println("1.- Sacar Factorial");
                     System.out.println("2.- Numeros Primos");
                     System.out.println("3.- Numero de Euler");
                     System.out.println("4.-Numero de euler elevado.");
                     System.out.println("4.- Numero de PI");
                     
                     
                     sel = read.nextInt();
         } catch (NumberFormatException | InputMismatchException e) {
                     System.out.println("Tienes un problema, no puede ingresar una letra como valor. Excepio"
                             + ""
                             + ""
                             + ""
                             + ""
                             + ""
                             + ""
                             + "n: "+e.getMessage());
                     System.out.println("Se usara por defecto el valor 1: ");
                     sel = 1;        
         } 
           
         double val;
            switch(sel){
                
                
                
            case 1: System.out.println("Haz seleccionado factorial.");
            
            
            //Validacion
            try {
                     System.out.println("Ingresa el valor de tu numero para trabajar. ");
                     n = read.nextInt();
         } catch (NumberFormatException | InputMismatchException e) {
                     System.out.println("Tienes un problema, no puede ingresar una letra como valor. Excepion: "+e.getMessage());
                     System.out.println("Se usara por defecto el valor 5: ");
                     n = 5;        
         } 
            //Validacion
            
            val = Matematicas.Factorial(n);
                System.out.println("El factorial de tu numero es: "+ val);
                break;
            
            case 2: System.out.println("Haz seleccionado numeros primos.");
            
           //Validacion
            try {
                     System.out.println("Ingresa el valor de tu numero para trabajar. ");
                     n = read.nextInt();
         } catch (NumberFormatException | InputMismatchException e) {
                     System.out.println("Tienes un problema, no puede ingresar una letra como valor. Excepion: "+e.getMessage());
                     System.out.println("Se usara por defecto el valor 5: ");
                     n = 5;        
         } 
            //Validacion
            
           boolean val2 = Matematicas.Primos(n);
                System.out.println("Los primos de tu numero son: "+val2);
                break;
                
            case 3: System.out.println("Numero de euler: ");
            val = Matematicas.Euler();
                System.out.println("El valor de euler: "+val);
                break;
                
            case 4: System.out.println("Euler a potencia. ");
            double nn;
            //Validacion
            try {
                     System.out.println("Ingresa el valor de tu numero para trabajar. ");
                      nn = read.nextDouble();
           } catch (NumberFormatException | InputMismatchException e) {
                     System.out.println("Tienes un problema, no puede ingresar una letra como valor. Excepion: "+e.getMessage());
                     System.out.println("Se usara por defecto el valor 5: ");
                     nn = 5;        
           } 
            //Validacion
            
            val = Matematicas.potenciaEuler(nn);
            System.out.println("El valor de E elevado es; "+val);
            break; 
            
            case 5: System.out.println("Numero de PI:");
            n = 16;
                System.out.println("El numero de pi es: "+Matematicas.Pi(n));
             break;
        }
        
         System.out.println("Quieres intentar con otro numero? S/N ");
         rep =(char) System.in.read();
                                
        } while (rep == 's' || rep == 'S');
          System.out.println(" Gracias por usarme omichan. uwu ");
       }
    
    
}

                            //Meter dentro de un ciclo, el cual el usuario pueda seguir * 
                            //No dejar que el usuario meta otro tipo de dato (Validar entrada)
                            //Como leer con read 
                            //Traer codigo ASCII *
                            //Utilizar Character clase
                            //Como mandar a llamar args al abrir una aplicacion.

                            //Escribir una aplicacion  para determinar cuantos numero primos hay entre 1500 y 2000
                            //Almacenar los numero primos encontrados en un arreglo de enteros.
                            //La aplicacion mostrara el contenido del arreglo.
                            