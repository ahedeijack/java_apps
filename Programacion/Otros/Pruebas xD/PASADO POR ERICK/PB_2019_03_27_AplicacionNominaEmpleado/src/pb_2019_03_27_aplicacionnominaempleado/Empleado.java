/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleado;

/**
 *
 * @author Sebas
 */
public class Empleado {
    private int numero;
    private String nombre;
    
    public Empleado()
    {
        numero = 0;
        nombre = "No ID";
    }
    
    public Empleado(int num, String nom)
    {
        numero = num;
        nombre = nom;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public void setNumero(int num)
    {
        numero = num;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    
    @Override
    public String toString()
    {
        return numero+" - "+nombre;
    }
}
