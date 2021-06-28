/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18131396_p2;

/**
 *
 * @author Cris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Depositos nuevo = new Depositos(16,8,12,3);
        System.out.println("total 1: "+nuevo.oboloTotal());
        
        Depositos viejo = new Depositos(1,4,5,6);
        System.out.println("total 2: "+viejo.oboloTotal());
        
        Depositos suma = nuevo.suma(viejo);
        Depositos resta = nuevo.resta(viejo);
        System.out.println("Suma: "+suma.toString());
        System.out.println("Resta: "+resta.toString());
        
    }
    
}
