/*
 *  Carlos Alberto Vázquez Aguirre 
 */
package fl_carlosv;

import java.util.Scanner;

/**
 *
 * @author Ahedeijak
 */
public class FL_M1_2018_20_09_AreaPerimetroCuadrilatero_v2 {
    
     public static double distanciaPuntos(double xb,double xa, double yb, double ya){
        double d;
        d = Math.sqrt(Math.pow(xb-xa, 2)+ Math.pow(yb-ya, 2));
        
        return d;
    }
    
    public static void main(String[] args){
       double x1, y1, x2, y2,x3, y3, x4, y4, distancia1, distancia2, distancia3, distancia4;
    Scanner teclado = new Scanner(System.in);    
    System.out.println("Veamo, tienes dos puntos, ok? entonces dame valores...");
    
    System.out.println("Valor de X del punto A: ");
    x1 = teclado.nextDouble();
    System.out.println("Valor de Y del punto A: ");
    y1 = teclado.nextDouble();
    System.out.println("Valor de X del punto B: ");
    x2 = teclado.nextDouble();
    System.out.println("Valor de Y del punto B: ");
    y2 = teclado.nextDouble();
    System.out.println("Valor de X del punto C: ");
    x3 = teclado.nextDouble();
    System.out.println("Valor de Y del punto C: ");
    y3 = teclado.nextDouble();
    System.out.println("Valor de X del punto D: ");
    x4 = teclado.nextDouble();
    System.out.println("Valor de Y del punto D: ");
    y4 = teclado.nextDouble();
    
    distancia1 = distanciaPuntos(x2,x1,y2,y1);
    distancia2 = distanciaPuntos(x3,x2,y3,y2);
    distancia3 = distanciaPuntos(x4,x3,y4,y4);
    distancia4 = distanciaPuntos(x1,x4,y1,y4);
    
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia1+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia2+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia3+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia4+"U");
           
    }
}
