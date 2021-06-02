/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131396_proyecto_01;

/**
 *
 * @author ahdeijack
 */
class Cuerpo {
    public String nombre;
    public Energia energia;

    public Cuerpo(){
        this.nombre = "";
        this.energia = null;
    }
    public Cuerpo(String nombre, Energia energia){
        this.nombre = nombre;
        this.energia = energia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }
    
    public String mostrarDatos(){
        return this.nombre+", masa: "+energia.obtenerMasa();
    }
    
}
