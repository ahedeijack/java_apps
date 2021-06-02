/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_272019_AplicacionEmpresa;

/**
 *
 * @author aa603
 */
public class Ventas extends Empleado{
    
    private double ventasTot;
    private double comision;
    
    public Ventas(){
        super();
        ventasTot = 0;
        comision = 0;
    }
    
    public Ventas(int num, String nom, double vTot, double comision ){
        super(num, nom);
        ventasTot = vTot;
        this.comision = comision;
    }
    public double getVentasTotales(){
        return ventasTot;
    }
    public double getComision(){
        return comision;
    }
    public void setVentasTotales(double vTot){
        ventasTot = vTot;
    }
    public void setComision(double comision){
        this.comision = comision;
    }
    public String toString(){
        return super.toString() + " • Ventas Totales: "+ventasTot+" • "+comision;
    }
    public double sueldo(){
        return ventasTot * comision/ 100;
    }
}
