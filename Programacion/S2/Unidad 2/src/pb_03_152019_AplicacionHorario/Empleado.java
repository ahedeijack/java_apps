/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_152019_AplicacionHorario;

/**
 *
 * @author aa603
 */
public class Empleado {
    
    private String miNombre;
    private Horario miEntrada;
    private Horario miSalida;
    
    public Empleado(){
        miNombre = "noID";
        miEntrada = new Horario();
        miSalida = new Horario();
    }
    
    public Empleado(String nombre, Horario entrada, Horario salida){
        miNombre = nombre;
        miEntrada = new Horario(entrada);
        miSalida = new Horario (salida);
    }
    
    public void setNombre(String nombre){
        miNombre = nombre;
    }
    
    public void setEntrada(Horario entrada){
        miEntrada = new Horario(entrada);
    }
    
    public void setSalida(Horario salida){
       miSalida = new Horario (salida);
    }
    
    public String getNombre(){
        return miNombre;
    }
    
    public Horario getEntrada(){
        return miEntrada;
    }
    
    public Horario getSalida(){
        return miSalida;
    }
    
    public Horario tiempoTrabajado(){
        
        return miSalida.resta(miEntrada);
    }
    
}
