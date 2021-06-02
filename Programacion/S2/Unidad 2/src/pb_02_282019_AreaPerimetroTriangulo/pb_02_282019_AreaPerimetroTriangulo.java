//Desarrollar una aplicacion para calcular el Area y el perimetro 
//de un triangulo cuyos vertices son puntos en el plano cartesiano
package pb_02_282019_AreaPerimetroTriangulo;

/**
 *
 * @author aa603
 */
public class pb_02_282019_AreaPerimetroTriangulo {
    public static void main(String args[]){
        
        Punto M = new Punto(1,4);
        Punto P = new Punto(4,-2);
        Punto R = new Punto(-3,-2);
        Triangulo uno = new Triangulo(M, P, R);
        
        System.out.println("Punto 1: "+uno);
        System.out.println("Area = "+uno.area());
        
        Punto F = new Punto(1,-2);
        Triangulo T1 = new Triangulo(M, P, F);
        
        Triangulo T2 = new Triangulo();
        T2.setPuntoA(M);
        T2.setPuntoB(F);
        T2.setPuntoC(R);
        
        System.out.println("Area de T1: "+T1.area());
        System.out.println("Area de T2: "+T2.area());
        System.out.println("Area del triangulo 1: "+(T1.area()+T2.area()));
    }
}
