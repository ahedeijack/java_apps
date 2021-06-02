/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_03_252019_Aplicacionparalelepipedo;

/**
 *
 * @author Ahedeijak
 */
public class Rectangulo extends Linea {
    
    protected double alto;
    protected double largo;
    
    public Rectangulo(){
        largo = 0; 
        alto = 0;
        
    }
    public Rectangulo(double alt, double lar){
        largo = alt;
        alto = lar;
    }
    
    public String toString(){
        return "largo: "+largo+" alto: "+alto;
    }
    
    public double perimetro(){
        return (largo*alto)*2;
    }
    
    public double area(){
        return largo*alto;
    }
    
    
    
    
}
