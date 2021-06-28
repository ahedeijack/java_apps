/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_eli;

import java.awt.Component;

/**
 *
 * @author ahdeijack
 */

abstract class PA_18131285_Clase_A {
    private String nombre;
    private String colindaCon;

    public PA_18131285_Clase_A() {
    }

    public PA_18131285_Clase_A(String nombre, String colindaCon) {
        this.nombre = nombre;
        this.colindaCon = colindaCon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColindaCon() {
        return colindaCon;
    }

    public void setColindaCon(String colindaCon) {
        this.colindaCon = colindaCon;
    }
    
    //No se codifica el metodo toString, en su lugar se utiliza el metodo mostrarInfo()
    public String mostrarInfo(){
        return getNombre()+","+getColindaCon();
    }
    
    public abstract void dibujar(int hor, int ver,Component comp, PA_18131285_Clase_A gm []);
        //Los tres valores que pide el metodo para hacer el dibujo. El valor extra es para 
        //para hacer la comparacion.
    
    
    public abstract void mover(Component comp, PA_18131285_Clase_A gm []); 
    //El metodo que sera utilizado para mover el dibujo.
    
}
