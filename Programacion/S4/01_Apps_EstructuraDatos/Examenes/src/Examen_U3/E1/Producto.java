/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_U3.E1;

/**
 *
 * @author Ahedeijak
 */
public abstract class Producto {
    
    private String descripcion;
    
        public Producto(){
            descripcion = "noID";
        }
        
        public Producto(String descripcion){
            this.descripcion = descripcion;
        }
        
    public String mostrar(){
        return "Descripcion: "+this.descripcion+"\n";
    }
    
    
}
