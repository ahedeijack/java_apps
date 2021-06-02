/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131285_proyecto_02;

import java.util.Random;

/**
 *
 * @author gamer
 */
class cliente {
    private static Random azar = new Random();
        
        private static String nombre[] = {"Hans", "Charlie", "Daniel", "John", "Roger", "Samuel"};
    
    static public String nextCliente(){
        return nombre[azar.nextInt(nombre.length)]+ "";
    }
    
}
