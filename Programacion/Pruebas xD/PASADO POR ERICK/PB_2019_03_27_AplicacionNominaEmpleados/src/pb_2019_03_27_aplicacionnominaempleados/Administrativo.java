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
public class Administrativo extends Empleado{
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
    
    public void setDiasTrabajados(int diasT)
    {
        diasTrab = diasT;
    }
    
    public int getDiasTrabajados()
    {
        return diasTrab;
    }
    
    public void setSueldoDiario(double sueldoD)
    {
        sueldoDia = sueldoD;
    }
    
    public double getSueldoDiario()
    {
        return sueldoDia;
    }
    
    public String toString()
    {
        return super.toString()+"Dias Trab:"+diasTrab+"Sueldo Dia:"+sueldoDia;
    }
    
    public double sueldo()
    {
        return diasTrab * sueldoDia;
    }
}