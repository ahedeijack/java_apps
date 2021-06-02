/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131396_proyecto_01;

import java.util.Random;

class NombreSistema {
    private static String [] sis = {"Inventarios","Ventas","Produccion","Presupuestos","Contable"};
    private static Random azar = new Random();
    
    public static String nextNombre()
    {
        return sis[azar.nextInt(sis.length)];
    }
}
