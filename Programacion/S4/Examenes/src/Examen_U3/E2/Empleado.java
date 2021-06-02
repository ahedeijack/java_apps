/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_U3.E2;

/**
 *
 * @author Ahedeijak
 */
public abstract class Empleado implements Comparable {
    private String nombre;
    
    public Empleado(){
        nombre = "noId";
    }
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public String mostrar(){
        return "Nombre del trabajador: "+this.nombre;
    }

    @Override
    public int compareTo(Object o) {
        Empleado a = (Empleado)o;
        if(this.getNombre().equals(a.getNombre())){
            return 1;
        } else {
            return -1;
        }
        
    }
    
    
}
