package practica_2_appmascotas;

import java.util.Random;

public class Nombre {
    private static Random azar = new Random ();
    private static String [] nom = {"Shawn", "Ariana", "Dilan", "Daniel", "Carlitos", "Pollo", "Iván", "Uziel", "Ricardo"};
    
    
    public String nextNombre(){
        return nom[azar.nextInt(nom.length)];
    }
    
    
}
