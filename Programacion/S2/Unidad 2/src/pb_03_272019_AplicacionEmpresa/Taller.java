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
public class Taller extends Empleado {
 private int piezas;
 private double precioUnit;
 
    public Taller(){
     super();
     piezas = 0;
     precioUnit = 0;
    }
    
    public Taller(int num, String nom, int pzas, double precU){
        super(num, nom);
        piezas = pzas;
        precioUnit = precU;
    }
    public int getPiezas(){
        return piezas;
    }
    public double getPrecioUnitartio(){
        return precioUnit;
    }
    public void setPiezas(int pzas){
        piezas = pzas;
    }
    public void setPrecioUnitario(double precU){
        precioUnit = precU;
    }
    public String toString(){
        return super.toString()+ " • Piezas: "+piezas+" • Precio Unit: "+precioUnit;
    }
    
    public double sueldo(){
        return piezas * precioUnit;
    }
    
 
}
