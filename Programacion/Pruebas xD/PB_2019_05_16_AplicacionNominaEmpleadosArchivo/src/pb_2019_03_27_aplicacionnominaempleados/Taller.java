/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

/**
 *
 * @author alope
 */
public class Taller extends Empleado{
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
        return piezas;
    }
    
    public double getPrecioUnitario()
    {
        return precioUnit;
    }
    
    public void setPiezas(int pzas)
    {
        piezas = pzas;
    }
    
    public void setPrecioUnitario(double preUni)
    {
        precioUnit = preUni;
    }
    
    public String toString()
    {
        return super.toString() + "  Piezas:"+piezas+" Precio Unit:"+precioUnit;
    }
    
    public double sueldo()
    {
        return piezas * precioUnit;
    }
}
