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
public class Administrativo extends Empleado{
    
    private int diasTrab;
    private double sueldoDia;
    
    Administrativo(){
        super();
        diasTrab = 0;
        sueldoDia = 0;
        
    }
    Administrativo(int num, String nom, int dTrab, double sDiario){
        super(num, nom);
        diasTrab = dTrab;
        sueldoDia = sDiario;
    }
    //
    public int getDiasTrabajados(){
        return diasTrab;
    }
    public void setDiasTrabajados(int dTrab){
        diasTrab = dTrab;
    }
    //
    public double getSueldoDiario(){
        return sueldoDia;
    }
    public void setSueldoDiario(double sDiario){
        sueldoDia = sDiario;
    }
    
    @Override
    public String toString(){
        return super.toString() + " • Dias Trabajados: "+diasTrab+" • Sueldo Diario: "+sueldoDia;
    }
    
    public double sueldo(){
        return diasTrab*sueldoDia;
    }
    
}
