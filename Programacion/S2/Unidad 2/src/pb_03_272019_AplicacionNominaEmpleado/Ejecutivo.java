/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_272019_AplicacionNominaEmpleado;

/**
 *
 * @author aa623
 */
public class Ejecutivo extends Administrativo {
    private double bono;
    
    public Ejecutivo()
    {
        super();
        bono = 0;
    }
    
    public Ejecutivo(int num, String nom, int diasT, double sueldoD, double bono)
    {
        super(num,nom,diasT,sueldoD);
        this.bono = bono;
    }  
    
    public double getBono()
    {
        return(bono);
    }     
    
    public void setBono(double bono)
    {
        this.bono = bono;
    }        
    
    public String toString()
    {
        return(super.toString() + " Bono: $" + bono);
    }        
    
    public double sueldo()
    {
        return(super.sueldo() + bono);
    }        
           
            
}
