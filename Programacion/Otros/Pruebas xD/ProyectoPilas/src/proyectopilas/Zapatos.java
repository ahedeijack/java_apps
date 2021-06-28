/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;

/**
 *
 * @author AlbertoP_PC
 */
public class Zapatos {
    private String marca;
    private double medida;
    private double precio;

    public Zapatos(String marca, double medida, double precio) {
        this.marca = marca;
        this.medida = medida;
        this.precio = precio;
    }
    
    public Zapatos(Zapatos copia) {
        this.marca = copia.marca;
        this.medida = copia.medida;
        this.precio = copia.precio;
    }
    
    public Zapatos(){
        //null
    }
    
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }
    
}
