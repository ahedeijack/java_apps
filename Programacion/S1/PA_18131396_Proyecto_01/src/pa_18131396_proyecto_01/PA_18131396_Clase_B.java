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
 class Energia {
     double masa;
     double velocidad;
     double energia;
     double velLuz = 299798;

     public Energia(){
         this.velocidad = 0;
         this.energia = 0;
     }
    public Energia(double energia, double velocidad){
        this.velocidad = velocidad;
        this.energia = energia;
    }
    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

     
    public double obtenerMasa(){
        masa = (Math.pow(energia, 2)/1-((Math.pow(velocidad, 2))/(Math.pow(velLuz, 2))))/Math.pow(velLuz, 2);
        return masa;
    }
    
}
