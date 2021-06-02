/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_282019_AreaPerimetroTriangulo;

/**
 *
 * @author aa603
 */
public class Triangulo {
   
    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;
 
    //Constructores.
    public Triangulo(){
       puntoA = new Punto();
       puntoB = new Punto();
       puntoC = new Punto();
    }
    
    public Triangulo(Punto a,Punto c, Punto b){
       puntoA = a;
       puntoB = b;
       puntoC = c;
    }
    
    //Metodos set
    
    public void setPuntoA(Punto a){
        puntoA = a;
    }
    
    public void setPuntoB(Punto b){
        puntoB = b;
    }
    
    public void setPuntoC(Punto c){
        puntoC = c;
    }
    
    //Metodos get
    public Punto getPuntoA(){
        return puntoA;
    }
    public Punto getPuntoB(){
        return puntoB;
    }
    public Punto getPuntoC(){
        return puntoC;
    }
    
    public String toString(){
       return "A: "+puntoA+", B: "+puntoB+", C:"+puntoC;
    }
    
    //Metodos de proceso
    
    public double lado1(){
        return puntoA.distancia(puntoB);
    }
    public double lado2(){
        return puntoB.distancia(puntoC);
    }
    public double lado3(){
        return puntoC.distancia(puntoA);
    }
    
    public double perimetro(){
        return (lado1()+lado2()+lado3());
    }
    public double area(){
        double s = (perimetro()/2);
        return Math.sqrt(s*(s-lado1())*(s-lado2())*(s-lado3()));
    }
}
