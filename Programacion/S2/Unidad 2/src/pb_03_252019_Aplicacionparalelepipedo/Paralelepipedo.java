/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_03_252019_Aplicacionparalelepipedo;

/**
 *
 * @author Ahedeijak
 */
public class Paralelepipedo extends Rectangulo {
    
    protected double profundidad;
    
    public Paralelepipedo(){
        largo = 0;
        alto =0;
        profundidad = 0;
    }
    
    public Paralelepipedo(double lar, double alt, double pro){
        largo = lar;
        alto = alt;
        profundidad = pro;
    }
    
    public String toString(){
        return "largo: "+largo+" alto: "+alto+" profundidad: "+profundidad;
    }
    public double area(){
        return (largo*alto + largo*profundidad +alto*profundidad)*2;
    }
    
    public double volumen(){
        return largo * alto * profundidad;
    }
    
}
