/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

import java.awt.Component;

/**
 *
 * @author Ahedeijak
 */
public class Internacional extends PB_18131288_Clase_A implements Comparable{

    String pais;

    public Internacional() {
        super();
        pais = "noID";
    }

    public Internacional(String nombre, String genero, int integrantes, String pais) {
        super(nombre, genero, integrantes);
        this.pais = pais;
    }
    
    public String getPais(){
        return this.pais;
    }
    
    public void setPais(String pais){
    this.pais = pais;
    }
    
    @Override
    public void dibujar(int hor, int ver, Component comp, PB_18131288_Clase_A gm []) {

    }
   

    @Override
    public void mover(Component comp, PB_18131288_Clase_A gm []) {
        
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "\nPais: "+this.pais;
    }

     @Override
    public int compareTo(Object o) { //Mandamos a llamar un objeto el cual difiere el tipo de objeto, pues solo se comparara un dato del objeto.
        Internacional bandaA = (Internacional)o;
        
        return  super.getIntegrantes() - bandaA.getIntegrantes();
    }
    
}
