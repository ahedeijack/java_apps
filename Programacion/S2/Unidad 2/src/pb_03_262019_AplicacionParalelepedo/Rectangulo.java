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
public class Rectangulo extends Linea {
    
    private double alto;
    
    public Rectangulo(){
        super(); //Llamado al constructor de su superclase (Linea), Debe ser la primer instruccion desde el consructor si no hay error
        alto = 0;
        
    }
    public Rectangulo(double alt, double lar){
        super(lar);
        alto = alt;
    }
    
    public double getAlto(){
        return alto;
    }
    public void setAlto(double alt){
        alto = alt;
    }
    
    
    
    public String toString(){
        return super.toString()+" alto: "+alto;
    }
    
    public double perimetro(){
        return (getLargo()*alto)*2;
    }
    
    public double area(){
        return getLargo()*alto;
    }
    
    
    
    
}
