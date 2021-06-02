/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenregula1;

/**
 *
 * @author Ahedeijak
 */
public class Coche {
    String coche;
    double venta;
    double compra;
    double margen;
    
    public Coche(){
        coche = "null";
        venta = 0.0;
        compra = 0.0;
        margen = 0.0;
    }
    
    public Coche(String nombre, double com, double ven, double mar){
        coche = nombre;
        venta = ven;
        compra = com;
        margen = mar;
    }
    
    public String getNombre(){
        return coche;
    }
    public void setNombre(String nom){
        coche = nom;
    }
    
    public double getVenta(){
        return venta;
    }
    public void setVenta(double ven){
        venta = ven;
    }
    
    public double getCompra(){
        return compra;
    }
    public void setCompra(double com){
        compra = com;
    }
    
    
    public double margen(){
       return margen = (this.compra/this.venta)-1;
    }
}
