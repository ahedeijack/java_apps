/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Ferreteria_Binarios;

/**
 *
 * @author ahdeijack
 */
public class Productos {
    int clave; //Para el uso del hash 
    int cant;
    String descripcion;
    double precio; //Mayoreo, menudeo 

    public Productos() {
    }

    public Productos(int clave, int cant, String descripcion, double precio) {
        this.clave = clave;
        this.cant = cant;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + " ID |" + clave + "| Cantidad = " + cant + ", Descripcion = " + descripcion + ",  $$" + precio + '}';
    }
    
    
}
