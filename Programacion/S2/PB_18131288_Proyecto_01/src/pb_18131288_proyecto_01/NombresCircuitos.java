/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_01;

import java.util.Random;

/**
 *
 * @author Ahedeijak
 */
public class NombresCircuitos {
    
    private static String [] nom = {"A ","B ","C ","D ","G ","H ","I ","J ","K "};
    private static String [] ape = {"19","21","23","55","80","99","77","57","666","18","06"};
    private static Random azar = new Random();
    
    public static String nextNombre()
    {
        return nom[azar.nextInt(nom.length)];
    }
    
    public static String nextNombreCompleto()
    {
        return nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)] + " " +
               ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreLegal()
    {
        return nom[azar.nextInt(nom.length)] + "-" +
               ape[azar.nextInt(ape.length)] + "-" +
               ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreCorto()
    {
        return nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)];
    }
    
}
