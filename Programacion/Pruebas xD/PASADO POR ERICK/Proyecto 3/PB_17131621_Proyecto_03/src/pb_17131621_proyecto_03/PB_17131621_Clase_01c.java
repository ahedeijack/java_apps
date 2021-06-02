/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_03;

import java.awt.Component;

/**
 *
 * @author RicardoMtz
 */
class Electrica extends Herramienta {
    private String corriente;
    
    public Electrica()
    {
        super();
        corriente = "No-ID";
    }
    
    public Electrica(String corriente, int clave, String descripcion)
    {
        super(clave, descripcion);
        this.corriente = corriente;
    }
    
    public String getCorriente()
    {
        return corriente;
    }
    
    public void setCorriente(String corriente)
    {
        this.corriente = corriente;
    }
    
    public String visualizar()
    {
        return super.visualizar()+ " \nCorriente: "+corriente;
    }
    
    public void Mover(Component com)
    {
        
    }
    
}
