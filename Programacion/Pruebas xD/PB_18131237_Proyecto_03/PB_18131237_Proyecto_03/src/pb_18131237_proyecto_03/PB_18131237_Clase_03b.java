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
class Extranjero extends GrupoMusical {
    private String pais;

    //Constructores
    
    public Extranjero() {
        super();
        pais = "No-Id";
    }

    public Extranjero(String nom, String gen, int numInt, String pais) {
        super(nom,gen,numInt);
        this.pais = pais;
    }

    //Metodos get/set
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    } 
}
