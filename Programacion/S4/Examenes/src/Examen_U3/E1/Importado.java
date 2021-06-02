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
public class Importado extends Producto{
    private double precio;
    
    public Importado(){
        super();
        precio = 0.0;
    }
    
    public Importado(String descripcion, double precio){
        super(descripcion);
        this.precio = precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public String mostrar(){
        return super.mostrar() + "Precio: "+this.precio;
    }
    
}
