/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_192019_Nominas;

/**
 *
 * @author aa633
 */
public class Empleado {
    private String nombre;
    private int diasTrabajados;
    private double sueldoDiario;
    private int horasExtra;
    private double porcentajeImpuesto;
    
    public Empleado(){
        nombre = "hola";
        diasTrabajados = 0;
        sueldoDiario = 0;
        horasExtra = 0;
        porcentajeImpuesto = 0;
    }
    
    public Empleado(String nom, int diasTrab, double sueldoDia, int horExtra, double porcImp){
        nombre = nom;
        diasTrabajados = diasTrab;
        sueldoDiario = sueldoDia;
        horasExtra = horExtra;
        porcentajeImpuesto = porcImp;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public void setDiasTrabajados(int diasTrab){
        diasTrabajados = diasTrab;
    }
    public void setSueldoDiario(double sueldoDia){
        sueldoDiario = sueldoDia;
    }
    public void setHorasExtra(int horExtra){
        horasExtra = horExtra;
    }
    public void setPorcentajeImp(double porcImp){
        porcentajeImpuesto = porcImp;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDiasTrabajados(){
        return diasTrabajados;
    }
    public double getSueldoDiario(){
        return sueldoDiario;
    }
    public double getHorasExtra(){
        return horasExtra;
    }
    public double getPorcentajeImpuesto (){
        return porcentajeImpuesto;
    }
    
    public String toString(){
        return nombre +
                " Dias trabajados: "+diasTrabajados +
                " Sueldo dia: "+sueldoDiario + 
                " Horas Extras: "+horasExtra + 
                "% Impuesto: "+porcentajeImpuesto;
    }
    
        public double sueldoParcial(){
            return diasTrabajados*sueldoDiario;
        }
        public double importeHorasExtra(){
            return (sueldoDiario / 8) * horasExtra * 2;
        }
        public double sueldoBruto(){
            return sueldoParcial()+importeHorasExtra();
        }
        public double importeImpuesto(){
            return sueldoBruto() * porcentajeImpuesto / 100;
        }
    public double sueldo(){
        return sueldoBruto() - importeImpuesto();
    }
}
