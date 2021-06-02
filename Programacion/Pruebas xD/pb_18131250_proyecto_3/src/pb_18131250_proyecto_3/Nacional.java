/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131250_proyecto_3;

import java.awt.Component;

/**
 *
 * @author Valentin_PC
 */
public class Nacional extends GrupoMusical {
    
    private String estado;
    
    
     public Nacional() {
        super();
        estado = "noid";
    }

    public Nacional(String nombre, String genero, int integrantes,String estado) {
        super(nombre, genero, integrantes);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar() + ", Estado: "+this.estado;
    }
 
    @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical grupo []) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover(Component comp, GrupoMusical grupo []) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
