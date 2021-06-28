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
public class Internacional extends GrupoMusical {
    String pais;

    public Internacional() {
        super();
        pais = "noid";
    }

    public Internacional(String nombre, String genero, int integrantes, String pais) {
        super(nombre, genero, integrantes);
        this.pais = pais;
    }
    
    public String getPais(){
        return this.pais;
    }
    
    public void setPais(String pais){
    this.pais = pais;
    }
    
    
    @Override
    public String mostrar(){
        return super.mostrar() + ", Pais: "+this.pais;
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
