/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

import java.awt.Component;

/**
 *
 * @author Ahedeijak
 */
abstract class PB_18131288_Clase_A{
   private String nombre;
   private String genero;
   private int integrantes;

    public PB_18131288_Clase_A() {
        nombre = "noID";
        genero = "noID";
        integrantes = 0;
    }

    public PB_18131288_Clase_A(String nombre, String genero, int integrantes) {
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
    
    public String mostrarInfo(){
        return "Nombre: "+this.nombre+", Genero: "+this.genero+ ", Integrantes: "+this.integrantes;
    }
    
    public abstract void dibujar(int hor, int ver,Component comp, PB_18131288_Clase_A gm []); //Los tres valores que pide el metodo para hacer el dibujo. El valor extra es para 
                                                                                                                           //para hacer la comparacion.
    
    
    public abstract void mover(Component comp, PB_18131288_Clase_A gm []); //El metodo que sera utilizado para mover el dibujo.

    //No se codifica el metodo toString, en su lugar se utiliza el metodo mostrarInfo()
    
    
    
}
