/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import java.util.Scanner;
/**
 *
 * @author aa520
 */
public class FL_M1_2018_14_09_AreaPlacaPintada {
    
    public static double arearectangulo (double base, double altura){
        double area;
        area = base*altura;
        return area;  
    }
    
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        double baseRP, alturaRP, baseRS, alturaRS, baseRT, alturaRT, areaPintura, areaR1, areaR2, areaR3;

        System.out.print("Ingresa la altura del rectangulo principal:");
        baseRP = teclado.nextDouble();
        System.out.print("Ingresa la base del rectangulo principal:");
        alturaRP = teclado.nextDouble();
        System.out.print("Ingresa la altura del primer orificio:");
        alturaRS = teclado.nextDouble();
        System.out.print("Ingresa la base del primer orificio:");
        baseRS = teclado.nextDouble();
        System.out.print("Ingresa la altura del segundo orificio:");
        alturaRT = teclado.nextDouble();
        System.out.print("Ingresa la base del segundo orificio:");
        baseRT = teclado.nextDouble();
        
        areaR1=arearectangulo(baseRP, alturaRP);
        areaR2=arearectangulo(baseRS, alturaRS);
        areaR3=arearectangulo(baseRT, alturaRT);
        
        areaPintura=areaR1-(areaR2+areaR3);
        System.out.println("El area a pintar es:"+areaPintura+"U");
        
        
        
    }
   
    
    
    }
 
    
