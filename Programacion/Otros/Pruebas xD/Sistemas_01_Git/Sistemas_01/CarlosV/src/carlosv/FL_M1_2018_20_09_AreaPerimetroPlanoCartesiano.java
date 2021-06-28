/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import java.util.Scanner;
/**
 *
 * @author aa501
 */
public class FL_M1_2018_20_09_AreaPerimetroPlanoCartesiano {
    
    public static double distanciaPuntos(double xb,double xa, double yb, double ya){
        double d;
        d = Math.sqrt(Math.pow(xb-xa, 2)+ Math.pow(yb-ya, 2));
        
        return d;
    }
    
    public static double areaTriangulos(double a, double b, double c){
        double s, area;
        s = ( a + b + c ) / 2;
        area = Math.sqrt (s *(s-a) * (s-b)* (s-c) ) ;
        return area;
    }
    
    
    public static void main(String[] args){
       double x1, y1, x2, y2,x3, y3, x4, y4, distancia1, distancia2, distancia3, distancia4, distancia5, areaT1, areaT2, area, perimetro;
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
    distancia3 = distanciaPuntos(x4,x3,y4,y3);
    distancia4 = distanciaPuntos(x1,x4,y1,y4);
    distancia5 = distanciaPuntos(x1,y1,x3,y3);
    
    areaT1=areaTriangulos(distancia1, distancia2, distancia5);
    areaT2=areaTriangulos(distancia3, distancia4, distancia5);
    area=areaT1+areaT2;
    perimetro = distancia1+ distancia2+ distancia3+ distancia4;
    
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia1+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia2+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia3+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia4+"U");
    System.out.println("La distancia entre tus puntos A+B es de :"+distancia5+"U");
    System.out.println("el area de tu figura es de :"+area+"U");
    System.out.println("el perimetro de tu figura es de :"+perimetro+"U");    
        
    }
    
}
