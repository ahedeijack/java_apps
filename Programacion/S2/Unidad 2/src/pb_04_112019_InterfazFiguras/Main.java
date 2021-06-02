/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_04_112019_InterfazFiguras;

/**
 *
 * @author aa624
 */
public class Main {
    public static void main(String args[]){
        
        
        Circulo vicioso = new Circulo(15);
        Rectangulo pizarron = new Rectangulo(140,160);
        Triangulo amoroso = new Triangulo(12,18,9);
        
        mostrar(vicioso);
        mostrar(pizarron);
        mostrar(amoroso);
    }
    
    public static void mostrar(IFiguraPlana fig){
        System.out.println(fig+" Area: "+fig.area()+" Perimetro: "+fig.perimetro());
    }
}
