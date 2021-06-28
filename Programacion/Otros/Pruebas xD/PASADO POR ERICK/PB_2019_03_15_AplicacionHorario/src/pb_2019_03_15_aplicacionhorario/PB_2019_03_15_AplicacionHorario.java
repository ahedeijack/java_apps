/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_15_aplicacionhorario;

/**
 *
 * @author aa625
 */
public class PB_2019_03_15_AplicacionHorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horario h1 = new Horario(5,37,43);
        
        Horario h2 = new Horario();
        h2.setHoras(8);
        h2.setMinutos(51);
        h2.setSegundos(38);
        
        Horario h3 = h1.suma(h2);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("---------------");
        System.out.println(h3);
        
        Horario h4 = new Horario(16,0,0);
        Horario h5 = new Horario(0,0,1);
        Horario h6 = h4.resta(h5);
        
        System.out.println("\n"+h6);
    }
}