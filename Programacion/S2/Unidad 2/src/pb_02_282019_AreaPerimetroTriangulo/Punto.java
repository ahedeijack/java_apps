/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_282019_AreaPerimetroTriangulo;

import pb_02_272019_AplicacionPunto.*;

/**
 *
 * @author aa603
 */
public class Punto {
    
    //Atributos
    private double x;
    
    private double y;
    //Constructores
    
    public Punto(){
        x = 0;
        y = 0;
    }
    
    public Punto(double x, double y){
       this.x = x;
       this.y = y;
    }
    
    public Punto(Punto p){
        x = p.x;
        y = p.y;
    }
    
    //Metodos set/get
    public void setX(double x){
     this.x = x;
    }
    public void setY(double y){
     this.y = y;   
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public String toString(){
        return  "("+x+"), "+"("+y+")";
    }
    
    //Metodos de calculo
    
    public double distancia(Punto p){
        //En este metodo se utilizan 2 objetos de la clase Punto:
        //1.-El que manda a llamar el metodo (this)
        //2.-El segundo es el que llega como parametro
        
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
    
    public Punto medio(Punto p){
        
    //En este metodo se utilizan 3 objetos de la clase Punto:
        //1.-El que manda a llamar el metodo (this)
        //2.-El segundo es el que llega como parametro (p)
        //3.-El que llega como resultado (m)
        double xm = (x + p.x) / 2;
        double ym = (y + p.y) / 2;
        
        Punto m = new Punto(xm, ym);
        
        return m;
    }
}
