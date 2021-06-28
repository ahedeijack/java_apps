/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130655_proyecto_03;

import java.awt.Component;

/**
 *
 * @author Rodrigo
 */
class Conjunto extends Deporte {
    // Atributos
    private String numJugadores;
    // Constructores
    public Conjunto() {
        super();
        this.numJugadores = "";
    }
    public Conjunto(String numJugadores, String descripcion, String escenario) {
        super(descripcion, escenario);
        this.numJugadores = numJugadores;
    }
    // Metodos
    public String getNumJugadores() {
        return numJugadores;
    }
    public void setNumJugadores(String numJugadores) {
        this.numJugadores = numJugadores;
    }
    public String ver()
    {
        return super.ver()+" \nNumero de jugadores: "+numJugadores;
    }
    public void Desfilar(Component com)
     {
         
     }
}
