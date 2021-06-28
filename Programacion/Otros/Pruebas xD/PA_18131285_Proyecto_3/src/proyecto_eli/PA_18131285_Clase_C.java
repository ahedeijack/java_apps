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
class PA_18131285_Clase_C extends PA_18131285_Clase_A {
private String capital;

    public PA_18131285_Clase_C() {
    }

    public PA_18131285_Clase_C(String capital) {
        this.capital = capital;
    }

    public PA_18131285_Clase_C(String capital, String nombre, String colindaCon) {
        super(nombre, colindaCon);
        this.capital = capital;
    }
    
       public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int compareTo(Object o) { //Mandamos a llamar un objeto el cual difiere el tipo de objeto, pues solo se comparara un dato del objeto.
         PA_18131285_Clase_C ciudadA = (PA_18131285_Clase_C)o;
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
        return super.mostrarInfo()+", "+ getCapital();
    }

 
    
}
