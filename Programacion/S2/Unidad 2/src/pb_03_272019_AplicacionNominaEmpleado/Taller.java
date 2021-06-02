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
public class Taller extends Empleado {
    private int piezas;
    private double precioUnit;
    
    public Taller()
    {
        super();
        piezas = 0;
        precioUnit = 0;
    }        
    
    public Taller(int num, String nom, int pzas, double preUni)
    {
        super(num,nom);
        piezas = pzas;
        precioUnit = preUni;
    }     
    
    public int getPiezas()
    {
        return(piezas);
    }
    
    public void setPiezas(int pzas)
    {
        piezas = pzas;
    }
    
    public double getPrecioUnitario()
    {
        return(precioUnit);
    }
    
    public void setPrecioUnitario(double preUni)
    {
        precioUnit = preUni;
    }      
    
    @Override
    public String toString()
    {
        return(super.toString() + " No. Piezas: " + piezas + " P. Unit: " + precioUnit);
    }        
    
    @Override
    public double sueldo()
    {        
        return(piezas * precioUnit);        
    }        
}


