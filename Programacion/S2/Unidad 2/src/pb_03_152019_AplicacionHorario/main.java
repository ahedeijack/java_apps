/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_152019_AplicacionHorario;

/**
 *
 * @author aa603
 */
public class main {
    public static void main (String args[]){
        
        Horario h1 = new Horario(5,37,43);
        
        Horario h2 = new Horario();
        h2.setSegundos(38);
        h2.setMinutos(51);
        h2.setHoras(8);
        
        System.out.println(h1);
        System.out.println(h2);
        
        Horario h3 = h1.suma(h2);
        
        System.out.println(h3);
        
        Horario h4 = new Horario(16,0,0);
        Horario h5 = new Horario(0,0,1);
        
        Horario h6 = h4.resta(h5);
        System.out.println(h6);
        
    }
}
