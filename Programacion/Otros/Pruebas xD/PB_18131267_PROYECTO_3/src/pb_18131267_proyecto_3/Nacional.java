/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131267_proyecto_3;

import java.awt.Component;

/**
 *
 * @author aa622
 */
public class Nacional extends GrupoMusical {
private String estado;
    
    
     public Nacional() {
        super();
        estado = "noID";
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
    public void dibujar(int hor, int ver, Component comp, GrupoMusical[] gm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover(Component comp, GrupoMusical[] gm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String mostrarInfo(){
        return super.desplegarDatos() + ", Estado: "+this.estado;
    }
    
    public int compareTo(Object o) {//Mandamos a llamar un objeto el cual difiere el tipo de objeto, pues solo se comparara un dato del objeto.
        Nacional bandaA = (Nacional)o;
        return  super.getIntegrantes() - bandaA.getIntegrantes();
    }
    
}
