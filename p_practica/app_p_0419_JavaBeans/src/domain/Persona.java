/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Ahedeijack
 */

//Para un javabean se requiere que se implemente el Serializable
//Y que todas las variables sean privadas, así como tener un
//constructor vacío y publico
public class Persona implements Serializable{
    
    private String nombre;
    private String apellido;
    
    public Persona(){
    
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Lo siguiente, es tener un metodo get y set por cada atributo privado.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
