/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_022019_Lista;

/**
 *
 * @author aa602
 */
public class Producto implements Comparable {
    String descripcion;
    int existencia;
    double precio;
    private static int tipoOrdenamiento; //0.-Existencia, 1.-Precio, 2.-Descripcion

    public Producto() {
    descripcion = "no id";
    existencia = 0;
    precio = 0;
    }

    public Producto(String descripcion, int existencia, double precio) {
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return descripcion + ". Existencia: " + existencia + ". $$" + precio + ".";
    }

    @Override
    public int compareTo(Object o) {
        Producto p = (Producto)o;
        
        int valor = 0;
        
        switch(tipoOrdenamiento){
            
            case 0: //Existencia
                valor = existencia - p.existencia;
                break;
                
            case 1: //Precio
                
                
                if(precio == p.precio)
                    valor = 0;
                  else 
                   if (precio > p.precio)
                       valor = 1;
                   else 
                       valor = -1;
                break;
                
            case 2: //Descripcion
                valor = descripcion.compareTo(p.descripcion);
                break;
            
        }
        return valor;
        
    }

    public static int getTipoOrdenamiento() {
        return tipoOrdenamiento;
    }

    public static void setTipoOrdenamiento(int tipoOrdenamiento) {
        Producto.tipoOrdenamiento = tipoOrdenamiento;
    }
    
    
    
    
    
}
