/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_162019_AplicacionEmpleadoHerenciaArchivo;

/**
 *
 * @author aa624
 */
public class Ventas extends Empleado{
    private double ventasTot;
    private double comision;
    
    public Ventas()
    {
        super();
        ventasTot = 0;
        comision = 0;
    }        
    
    public Ventas(int num, String nom, double venTot, double com)
    {
        super(num,nom);
        ventasTot = venTot;
        comision = com;
    }    

    public double getVentasTotales()
    {
        return(ventasTot);
    }        
    
    public void setVentasTotales(double venTot)
    {
        ventasTot = venTot;
    }  
    
    public double getComision()
    {   
        return(comision);
    }     
    
    public void setComision(double com)
    {
        comision = com;
    }        
    
    public String toString()
    {
        return(super.toString() + " Ven. Total: " + ventasTot + " Comisión: " + comision);
    }        
    
    public double sueldo()
    {
        return(ventasTot * comision) / 100;
    }        
}