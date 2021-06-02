/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

/**
 *
 * @author Ahedeijak
 */
public class PB_18131288_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClaseA uno;
        uno = new ClaseA("La banda baston", "Hip-Hop", 2, "Baja Cal. Sur",2);
        
        
        
        //El metodo mostrar info, es utilizado para mandar los datos de las clases, desde el punto mas alto al mas bajo.
        System.out.println(uno.mostrarInfo());
        
        
    }
    
}
