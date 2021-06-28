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
abstract class Herramienta {
    
    protected int clave;
    protected String descripcion;

    public Herramienta() {
        clave = 0;
        descripcion = "No-ID";
    }

    public Herramienta(int clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String visualizar()
    {
        return "Clave: "+clave+" \nDescripcion: "+descripcion;
    }
    
    public void dibujar(int x, int y, Component comp)
    {
        
    }
    public void Desfilar(Component comp)
    {
        
    }
    
    
    
    
    
    
}
