/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_02_veterinaria_pilas;

/**
 *
 * @author ahdeijack
 */
public class TipoElem {
    private String _nombre;
    private String _tipo;
    private int _noVacunas;
    private double _precioVacunas;
    private char _sexo;
    private int _edad;
    
    public TipoElem(String nombre, String tipo, int noVacunas, double precioVacunas, char sexo, int edad){
    _nombre = nombre;
    _tipo = tipo;
    _noVacunas = noVacunas;
    _precioVacunas = precioVacunas;
    _sexo = sexo;
    _edad = edad;
}
    public TipoElem(TipoElem copia){
    _nombre = copia.getNombre();
    _tipo = copia.getTipo();
    _noVacunas = copia.getNoVacunas();
    _precioVacunas = copia.getPrecioVacunas();
    _sexo = copia.getSexo();
    _edad = copia.getEdad();
}
    public TipoElem(){
        
    }
    

    public String getNombre() {
        return _nombre;
    }

    public String getTipo() {
        return _tipo;
    }

    public int getNoVacunas() {
        return _noVacunas;
    }

    public double getPrecioVacunas() {
        return _precioVacunas;
    }

    public char getSexo() {
        return _sexo;
    }

    public int getEdad() {
        return _edad;
    }
    
}