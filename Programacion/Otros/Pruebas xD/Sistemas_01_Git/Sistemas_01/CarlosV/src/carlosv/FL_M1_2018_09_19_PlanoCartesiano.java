/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import java.util.Scanner;
import java.math.MathContext;
/**
 *
 * @author aa504
 */
public class FL_M1_2018_09_19_PlanoCartesiano {
    public static void main(String[] args){
      
        Scanner teclado = new Scanner(System.in);
        
        double x1, x2, y1, y2, distancia1, distancia2, x, y;
        
        System.out.println("Obten la distancia de los puntos en un plano cartesiano.");
        System.out.println("Ingresa el Valor de X del punto A : ");
        x1 = teclado.nextDouble();
        
        System.out.println("Ingresa el valor de Y del punto A : ");
        y1 = teclado.nextDouble();
        
        System.out.println("Ingresa el valor de X del punto B : ");
        x2 = teclado.nextDouble();
        
        System.out.println("Ingresa el valor de Y del punto B : ");
        y2 = teclado.nextDouble();
        
        
        distancia1 = Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2);
        distancia2 = Math.sqrt(distancia1);
        
        System.out.println("La distancia entre tus puntos es: "+distancia2+"U");
        
        
        
    }
    
    
}
