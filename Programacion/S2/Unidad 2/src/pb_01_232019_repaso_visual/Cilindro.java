/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_01_232019_repaso_visual;

import pb_01_292019_Cilindro_POO.*;

/**
 *
 * @author aa603
 */
public class Cilindro {
    
//Atributos //Se pone por separado el tipo de dato.
    double radio;
    
    double altura;
    
    //Constructor
    public Cilindro (){
        radio = 0;
        altura = 0;
    }
    
    
    public Cilindro(double r, double h){
        radio = r;
        altura = h;
    }
    
    public Cilindro(Cilindro c){
        radio = c.getRadio();
        altura = c.getAltura();
    }
    
    
    @Override
    public String toString(){
     return "Radio: "+radio +" Altura: "+altura;   
    }
    
//Metodos //También se declara el tipo de regreso del metodo como proceso o calculo
    double area(){
    return 2 * Math.PI * radio * (radio + altura);    
    }
    
    double volumen(){
    return Math.PI * Math.pow(radio, 2) * altura;
    }
    
//Se agrega el metodo set & get. (Insertar Código > Setter & Getter)
    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) {
        if (r < 0){
            radio = -r;
        } else{
            radio = r;    
        }
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        if (a<0){
            Math.abs(a);
        } else {
            altura = a;
        }
    }
    
    
}
