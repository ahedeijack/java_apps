package appferreteria_archivosbinario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahdeijack
 */
public class Producto {
    private int id;
    private String tipo;
    private String marca;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String tipo, String marca, int cantidad, double precio) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID: " + id + ", Tipo: " + tipo + ", Marca: " + marca + ", Cantidad: " + cantidad + ", Precio: " + precio + '}';
    }
    
    
}
