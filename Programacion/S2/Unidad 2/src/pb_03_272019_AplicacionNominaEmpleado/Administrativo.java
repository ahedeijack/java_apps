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
public class Administrativo extends Empleado {
    private int diasTrab;
    private double sueldoDia;
    
    public Administrativo()
    {
        super();
        diasTrab = 0;
        sueldoDia = 0;
    }   
    
    public Administrativo(int num, String nom, int diasT, double sueldoD)
    {
        super(num,nom);
        diasTrab = diasT;
        sueldoDia = sueldoD;
    }
    
    public int getDiasTrabajados()
    {
        return(diasTrab);
    }        
    
    public void setDiasTrabajados(int diasT)
    {
        diasTrab = diasT;
    }    
    
    public double getSueldoDiario()
    {
        return(sueldoDia);
    }        
    
    public void setSueldoDiario(double sueldoD)
    {
        sueldoDia = sueldoD;
    }  
    
    public String toString()
    {
        return(super.toString() + " Dias Trabajados: " + diasTrab + " Sueldo Diario: $" + sueldoDia);
    }     
    
    public double sueldo()
    {
        return(diasTrab * sueldoDia);
    }        
}
