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
public abstract class GrupoMusical {
    
   private String nombre;
    private String genero;
    private int integrantes;
    
    public GrupoMusical() {
        nombre = "noid";
        genero = "noid";
        integrantes = 0;
    }

    public GrupoMusical(String nombre, String genero, int integrantes) {
        this.nombre = nombre;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String mostrar(){
        return "Nombre: "+this.nombre+", Genero: "+this.genero+ ", Integrantes: "+this.integrantes;
    }
    
    public abstract void dibujar(int hor, int ver,Component comp, GrupoMusical grupo []);//Metodo para poder dibujar
    
    
    public abstract void mover(Component comp, GrupoMusical grupo []);
    
    
}
