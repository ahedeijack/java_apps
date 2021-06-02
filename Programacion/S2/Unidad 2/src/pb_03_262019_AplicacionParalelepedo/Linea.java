/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_03_262019_AplicacionParalelepedo;

import pb_03_252019_Aplicacionparalelepipedo.*;

/**
 *
 * @author Ahedeijak
 */
public class Linea {
     private double largo;
    
    public  Linea(){
        largo = 0;
    }
    
    public Linea(double lar){
        this.largo = lar;
    }
    
    public double getLargo(){
        return largo;
    }
    
    
    public String toString(){
        return "largo: "+largo;
    }
}
