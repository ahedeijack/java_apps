/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_eli;

import java.awt.Component;

/**
 *
 * @author ahdeijack
 */
class PA_18131285_Clase_B extends PA_18131285_Clase_A {
    private String moneda;

    public PA_18131285_Clase_B() {
    }

    public PA_18131285_Clase_B(String moneda) {
        this.moneda = moneda;
    }

    public PA_18131285_Clase_B(String moneda, String nombre, String colindaCon) {
        super(nombre, colindaCon);
        this.moneda = moneda;
    }
    
    

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
     public int compareTo(Object o) { //Mandamos a llamar un objeto el cual difiere el tipo de objeto, pues solo se comparara un dato del objeto.
         PA_18131285_Clase_B ciudadA = (PA_18131285_Clase_B)o;
        return  super.getColindaCon().compareTo(ciudadA.getColindaCon());
    }
    
      @Override
    public void dibujar(int hor, int ver, Component comp, PA_18131285_Clase_A[] gm) {

    }

    @Override
    public void mover(Component comp, PA_18131285_Clase_A[] gm) {

    }
        
 @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+", "+ getMoneda();
    }
    

            
}
