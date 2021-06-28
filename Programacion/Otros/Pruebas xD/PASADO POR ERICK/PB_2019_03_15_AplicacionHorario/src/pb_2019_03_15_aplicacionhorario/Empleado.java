/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_15_aplicacionhorario;

/**
 *
 * @author Daniel Garcia
 */
public class Empleado {
    private String nombre;
    private Horario entrada;
    private Horario salida;
    
    public Empleado()
    {
        nombre = "No-Id;";
        entrada = new Horario();
        salida = new Horario();
    }
    
    public Empleado(String nom, Horario e, Horario s)
    {
        nombre = nom;
        entrada = new Horario(e);
        salida = new Horario(s);
    }
    
    public void setSalida(Horario s)
    {
        salida = s;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public Horario getEntrada()
    {
        return entrada;
    }
    
    public Horario getSalida()
    {
        return salida;
    }
    
    public Horario tiempoTrabajado()
    {
        return salida.resta(entrada);
    }
}