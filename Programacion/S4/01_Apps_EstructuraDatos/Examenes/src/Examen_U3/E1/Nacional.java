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
public class Nacional extends Producto{
private String proveedor;
 
    public Nacional(){
        super();
        proveedor = "noID";
    }
    
    public Nacional(String descripcion, String proveedor){
        super(descripcion);
        this.proveedor = proveedor;
    }
    
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }
    public String getProveedor(){
        return this.proveedor;
    }
    
    public String mostrar(){
        return super.mostrar() + "Proveedor: "+this.proveedor+"\n";
    }
    
    
}
