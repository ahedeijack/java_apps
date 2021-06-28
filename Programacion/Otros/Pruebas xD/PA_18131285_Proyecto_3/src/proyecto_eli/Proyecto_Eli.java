/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_eli;

/**
 *
 * @author ahdeijack
 */
public class Proyecto_Eli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PA_18131285_Clase_D ale = new PA_18131285_Clase_D(3769, "Euro", "Berlin", "Austria");
        PA_18131285_Clase_G rom = new PA_18131285_Clase_G(2873, "Euro", "Italia", "Pomezia");
        PA_18131285_Clase_E ny = new PA_18131285_Clase_E(2706, "Illinois", "Chicago", "Hammond");
        PA_18131285_Clase_F ch = new PA_18131285_Clase_F(8399,"New York", "New York", "Conneticut");
   
        System.out.println(ale.mostrarInfo());
        System.out.println(rom.mostrarInfo());
        System.out.println(ny.mostrarInfo());
        System.out.println(ch.mostrarInfo());
        
    }
    
}
