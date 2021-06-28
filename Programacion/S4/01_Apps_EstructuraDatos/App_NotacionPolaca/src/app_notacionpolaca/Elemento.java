package app_notacionpolaca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahdeijack
 */
public class Elemento {
    private int entero;

    public Elemento(int entero) {
        this.entero = entero;
    }
    public Elemento(Elemento copia) {
        this.entero = copia.entero;
    }
    public Elemento() {
        this.entero = 0;
    }
    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    
}
