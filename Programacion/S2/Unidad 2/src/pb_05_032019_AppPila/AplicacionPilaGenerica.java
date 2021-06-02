/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_032019_AppPila;

import java.util.Random;

/**
 *
 * @author aa613
 */
public class AplicacionPilaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilagenerica<Double> pilaDobles = new Pilagenerica(6);
        
        Random azar = new Random();
        
        System.out.println(pilaDobles);
        
        while(!pilaDobles.estaLlena()){
            pilaDobles.poner(azar.nextInt(100)*1.0);
            System.out.println();
        }
        
        vaciarPila(pilaDobles);
        String [] cosas = {"Cañon","mouse","laptop","plancha","refrigerador","pizarron","mesa","sillon","banca","computadora","lapiz"};
        
        Pilagenerica <String> pilaCadena = new Pilagenerica(5);
        
        System.out.println(pilaCadena);
        
        while(!pilaCadena.estaLlena()){
            pilaCadena.poner(cosas[azar.nextInt(cosas.length)]);
            System.out.println(pilaCadena);
        }
        vaciarPila(pilaCadena);
        
        Automovil [] lote = {new Automovil ("Ford",1905),
                            new Automovil ("Mustang",2019),
                            new Automovil ("Fiat",2014),
                            new Automovil ("Vocho",1905),
                            new Automovil ("Tsuru",1905),
                            new Automovil ("Maverik",1905),
                            new Automovil ("Mazda",1905),
                            new Automovil ("BMW",1905),
                            
        };
        
        
        
        Pilagenerica <Automovil> pilaAutos = new Pilagenerica(50);
        
        System.out.println(pilaAutos);
        
        while(!pilaAutos.estaLlena()){
            pilaAutos.poner(lote[azar.nextInt(lote.length)]);
            System.out.println(pilaAutos);
        }
        vaciarPila(pilaAutos);
        
        
        
    }
    public static void vaciarPila(Pilagenerica pila)
    {
        
        while(!pila.estaVacia()){
            System.out.println(pila+"-->"+pila.quitar()); 
            
            System.out.println();
            
        }
        

    }
    
    
}
