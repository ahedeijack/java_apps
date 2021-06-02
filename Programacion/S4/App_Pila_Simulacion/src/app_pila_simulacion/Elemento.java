/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pila_simulacion;

/**
 *
 * @author ahdeijack
 */
public class Elemento {
    private String _especialidad;
    private int _tamaño;
    private double _precio;

    Elemento(String _especialidad, int _tamaño, double _precio){
        this._especialidad = _especialidad;
        this._tamaño = _tamaño;
        this._precio = _precio;
    }
    
    Elemento(Elemento copia){
        _especialidad = copia.getEspecialidad();
        _tamaño = copia.getTamaño();
        _precio = copia.getPrecio();
    }

    Elemento() {
    //no hago nada
    
}

    public String getEspecialidad() {
        return _especialidad;
    }

    public void setEspecialidad(String _especialidad) {
        this._especialidad = _especialidad;
    }

    public int getTamaño() {
        return _tamaño;
    }

    public void setTamaño(int _tamaño) {
        this._tamaño = _tamaño;
    }

    public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double _precio) {
        this._precio = _precio;
    }
    
    public String toString(){
        return this.getEspecialidad()+" , "+this.getTamaño()+" , $$"+this.getPrecio();
    }
}
