/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

/**
 *
 * @author Daniel Garcia
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
    
    public Ventas(int num, String nom, double vtaTot, double comision)
    {
        super(num,nom);
        ventasTot = vtaTot;
        this.comision = comision;
    }
    
    //Métodos set y get
    
    
    public String toString()
    {
        return super.toString()+" Ventas tot:"+ventasTot+" %Comision"+comision;
    }
    
    public double sueldo()
    {
        return ventasTot * comision / 100;
    }
}