/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_7_GUI;

/**
 *
 * @author ahedeijack
 */
public class Punto {
    private int x;
    private int y;
    
    public  Punto(){
        x = 0;
        y = 0;
    }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public double Distancia (Punto a){
        double dist = Math.sqrt((Math.pow(a.getX()-this.x, 2)+(Math.pow(a.getY()+this.y, 2))));
        return dist;
    }
}
