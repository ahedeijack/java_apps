/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_272019_AplicacionPunto;

/**
 *
 * @author aa603
 */
public class pb_02_272019_AplicacionPunto {
 public static void main(String Args[]){
     
     Punto A = new Punto();
     A.setX(5);
     A.setY(3);
     
     Punto B = new Punto();
     
     B.setX(-2);
     B.setY(-4);
     
     double d = A.distancia(B);
     
     System.out.println("La distancia entre "+A+" y "+B+" es de: "+d);
     Punto M = A.medio(B);
     
     System.out.println("El punto medio de las distancias es "+M);
     
     
 }   
}
