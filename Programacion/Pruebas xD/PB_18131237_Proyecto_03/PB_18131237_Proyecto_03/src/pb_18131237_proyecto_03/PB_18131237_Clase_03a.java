/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131237_proyecto_03;

/**
 *
 * @author lDestroyerl
 */
class Nacional extends GrupoMusical{
    private String estado;

    //Constructores
    
    public Nacional() {
        super();
        estado = "No-Id";
    }

    public Nacional(String nom, String gen, int numInt, String est) {
        super(nom,gen,numInt);
        estado = est;
    }

    //Metodos get/set
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
