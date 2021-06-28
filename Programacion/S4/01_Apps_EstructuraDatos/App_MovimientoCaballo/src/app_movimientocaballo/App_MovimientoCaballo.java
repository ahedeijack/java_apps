/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_movimientocaballo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ahdeijack
 */
public class App_MovimientoCaballo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean solucion;

        try {
            Caballo miCaballo = new Caballo(1, 1);
            solucion = miCaballo.resolverProblema();
            
            if (solucion) {
                miCaballo.escribirTablero();
            }
        } catch (Exception m) {
            System.out.println("No se pudo probar el algoritmo, " + m);
        }
    }

    }
 

