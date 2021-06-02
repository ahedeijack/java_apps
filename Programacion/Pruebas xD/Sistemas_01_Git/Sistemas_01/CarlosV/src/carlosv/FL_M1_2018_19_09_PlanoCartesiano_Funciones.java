package fl_carlosv;
import java.util.Scanner;

public class FL_M1_2018_19_09_PlanoCartesiano_Funciones {
    
    public static double distanciaPuntos(double xa, double ya, double xb, double yb){
        double d;
        d = Math.sqrt(Math.pow((xb-xa), 2)+ Math.pow((yb-ya), 2));
        
        return d;
    }
    
    public static void main(String[] args){
    double x1, y1, x2, y2, distancia;
    
    Scanner teclado = new Scanner(System.in);    
    System.out.println("dos puntos...");
    
    System.out.println("Valor de X del punto A: ");
    x1 = teclado.nextDouble();
    System.out.println("Valor de Y del punto A: ");
    y1 = teclado.nextDouble();
    System.out.println("Valor de X del punto B: ");
    x2 = teclado.nextDouble();
    System.out.println("Valor de Y del punto B: ");
    y2 = teclado.nextDouble();
    
    distancia = distanciaPuntos(x1,y1,x2,y2);
    
    System.out.println("La distancia entre tus puntos es de :"+distancia+"U");
    
    }
}
