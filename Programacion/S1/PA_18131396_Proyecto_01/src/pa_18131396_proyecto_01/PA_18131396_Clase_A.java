/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131396_proyecto_01;

import java.util.Random;

/**
 *
 * @author ahdeijack
 */
class Nombre  {
private static String nombre  [] =  {"V-","N-","K-","P-","Q-"};
private static Random azar = new Random();

public static String nextNombre(){
    return nombre[azar.nextInt(nombre.length)]+(azar.nextInt(89)+10)+"";
}
    
}
