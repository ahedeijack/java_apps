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
class Individual extends Deporte {
    // Atributos
    private String tipoCalificacion;
    // Constructores
    public Individual() {
        super();
        tipoCalificacion = "";
    }
    public Individual(String tipoCalificacion, String descripcion, String escenario) {
        super(descripcion, escenario);
        this.tipoCalificacion = tipoCalificacion;
    }
    // Metodos
    public String getTipoCalificacion() {
        return tipoCalificacion;
    }
    public void setTipoCalificacion(String tipoCalificacion) {
        this.tipoCalificacion = tipoCalificacion;
    }
    public String ver()
    {
        return super.ver()+" \nTipo de calif: "+tipoCalificacion;
    }
    public void Desfilar(Component comp)
     {
         
     }
}
