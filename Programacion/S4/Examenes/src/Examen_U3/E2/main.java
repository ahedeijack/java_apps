/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_U3.E2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ahedeijak
 */
public class main {
    public static void main(String [] args){
        
        Scanner read = new Scanner(System.in);
        String nom, dep, pos;
        
        System.out.println("Ingresa cuantos trabajadores tendras: ");
        int n = read.nextInt();
        
        Empleado emp [] = new Empleado[n];
        
        for(int i = 0; i < emp.length; i++){
            System.out.println("Que tipo de empleado necesitas?  Directivo(1), Gerente(2)");
            int w = read.nextInt();
            
            if(w == 1){
               
                 System.out.println("Ingresa el departamento del trabajador:");
                dep = read.nextLine();
                 System.out.println("Ingresa el nombre del trabajador: ");
                nom = read.nextLine();
                emp[i] = new Directivo(nom, dep);
                
            } else if (w == 2) {
                
                 System.out.println("Ingresa el departamento del trabajador: ");
                dep = read.nextLine();
                 System.out.println("Ingresa el posgrado del trabajador: ");
                pos = read.nextLine();
                 System.out.println("Ingresa el nombre del trabajador: ");
                nom = read.nextLine();
                emp[i] = new Gerente(nom, dep, pos);
                
            } else {
                System.out.println("La seleccion es invalida...");
            }
            
        }

        Arrays.sort(emp);
        
        for(int r = 0; r<emp.length; r++){
            System.out.println(" .- Emp #."+(r+1)+" = "+emp[r].mostrar());
        }
   
            
        }
        
        
    }

