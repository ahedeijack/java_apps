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
 public class Nacional extends PB_18131288_Clase_A implements Comparable { //Se implementa la clase Comparable para hacer la comparacion de los dibujos que se hara.
private String estado;
    
    public Nacional() {
        super();
        estado = "noID";
    }

    public Nacional(String nombre, String genero, int integrantes,String estado) {
        super(nombre, genero, integrantes);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }




@Override
   public String mostrarInfo(){
       return super.mostrarInfo()+", Estado: "+this.estado;
   }

    @Override
    public void dibujar(int hor, int ver, Component comp, PB_18131288_Clase_A gm []) {
                //Bug 2: El objeto se mandaba nulo por el frame "null pointer"
    }

    @Override
    public void mover(Component comp, PB_18131288_Clase_A gm []) {

    }

    @Override
    public int compareTo(Object o) {//Mandamos a llamar un objeto el cual difiere el tipo de objeto, pues solo se comparara un dato del objeto.
        Nacional bandaA = (Nacional)o;
        return  super.getIntegrantes() - bandaA.getIntegrantes();
    }


}