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
public class Paralelepipedo extends Rectangulo {
    
    private double profundidad;
    
    public Paralelepipedo(){
        super();
        profundidad = 0;
    }
    
    public Paralelepipedo(double lar, double alt, double pro){
        super(lar, alt);
        profundidad = pro;
    }
    
    public double getProfundidad(){
        return profundidad;
    }
    public void setProfundidad(double prof){
        profundidad = prof;
    }
    
    public String toString(){
        return super.toString()+" profundidad: "+profundidad;
    }
    public double area(){
        return (super.area() + getLargo()*profundidad +getAlto()*profundidad)*2;
    }
    
    public double volumen(){
        return super.area() *  profundidad;
    }
    
}
