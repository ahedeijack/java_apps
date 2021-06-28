/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130655_proyecto_03;

import java.awt.Component;

/**
 *
 * @author Rodrigo
 */
class Deporte {
    // Atributos
    private String descripcion;
    private String escenario;
    // Constructores
    public Deporte() {
        this.descripcion = "No-Id";
        this.escenario = "No-Id";
    }
    public Deporte(String descripcion, String escenario) {
        this.descripcion = descripcion;
        this.escenario = escenario;
    }
    // Metodos

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }
    
    public String ver()
   {
       return descripcion+" \nEstadio: "+escenario;
   }
    public void dibujar(int x,int y,Component comp)
     {
         
     }
    public void Desfilar(Component comp)
     {
         
     }
    
    
}
