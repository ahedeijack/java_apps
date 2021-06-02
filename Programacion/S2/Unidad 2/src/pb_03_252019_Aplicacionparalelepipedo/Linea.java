/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_03_252019_Aplicacionparalelepipedo;

/**
 *
 * @author Ahedeijak
 */
public class Linea {
     protected  double largo;
    
    public  Linea(){
        largo = 0;
    }
    
    public Linea(double lar){
        this.largo = lar;
    }
    
    public String toString(){
        return "largo: "+largo;
    }
}
