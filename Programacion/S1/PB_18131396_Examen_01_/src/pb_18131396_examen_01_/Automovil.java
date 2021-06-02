/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131396_examen_01_;

/**
 *
 * @author Hobbit
 */
public class Automovil {
    private String _modelo;
    private double _costo;
    private double _precio;
    
    public Automovil(){
        _modelo = "";
        _costo = 0;
        _precio =0;
    }

    public Automovil(String _modelo,double _costo, double _precio) {
        this._modelo = _modelo;
        this._costo = _costo;
        this._precio = _precio;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }

    public double getCosto() {
        return _costo;
    }

    public void setCosto(double _costo) {
        this._costo = _costo;
    }

    public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double _precio) {
        this._precio = _precio;
    }
    
    public double Utilidad(){
        double utld = (_precio/_costo) -1;
        return utld;
    }
    
}
