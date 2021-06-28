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
class GrupoMusical {
    private String nombre;
    private String genero;
    private int numIntegrantes;
    
    //Constructores

    public GrupoMusical() {
        nombre = "No-Id";
        genero = "No-Id";
        numIntegrantes = 0;
    }

    public GrupoMusical(String nombre, String genero, int numIntegrantes) {
        this.nombre = nombre;
        this.genero = genero;
        this.numIntegrantes = numIntegrantes;
    }

    //Metodos get/set
    
    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }   
}
