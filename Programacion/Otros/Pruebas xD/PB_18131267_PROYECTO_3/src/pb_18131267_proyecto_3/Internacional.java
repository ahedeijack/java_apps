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
public class Internacional extends GrupoMusical{
    
    String pais;

    public Internacional() {
        super();
        pais = "noID";
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
    public void dibujar(int hor, int ver, Component comp, GrupoMusical gm []) {

    }
   

    @Override
    public void mover(Component comp, GrupoMusical gm []) {
        
    }
    
    public String mostrarInfo(){
        return super.desplegarDatos()+ "Pais: "+this.pais;
    }

    public int compareTo(Object o) { //Se manda a llamar un objeto del mismo tipo para hacer la comparacion
        Internacional bandaA = (Internacional)o;
        
        return  super.getIntegrantes() - bandaA.getIntegrantes();
    }
    
}
