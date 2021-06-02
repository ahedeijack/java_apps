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
public class Taller extends Empleado{
    private int piezas;
    private double precioUnit;
    
    public Taller()
    {
        super();
        piezas = 0;
        precioUnit = 0;
    }
    
    public Taller(int num, String nom, int pzas, doubleprUni)
    {
        super(num, nom);
    }
    
    //Métodos set y get
    
    
    
    public String toString()
    {
        return super.toString() + " Piezas:"+piezas+" Precio unit:";
    }
}