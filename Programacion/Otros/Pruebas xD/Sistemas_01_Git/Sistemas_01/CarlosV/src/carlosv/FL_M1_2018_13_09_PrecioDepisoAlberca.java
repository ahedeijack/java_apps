/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import  java.util.Scanner;
/**
 *
 * @author aa501
 */
public class FL_M1_2018_13_09_PrecioDepisoAlberca {
    public static void main (String[] args){
        double ladoAlberca, precioM2, precioPiso, area, diametro, radio, areaPiso, areaCirculo;
        Scanner teclado = new Scanner(System.in);


System.out.println("Calcula el precio de tu alberca y el area de instalación!");
System.out.println("Ingresa el area de tu alberca: ");
area = teclado.nextDouble();

System.out.println("Ingresa el precio del piso por M2:");
precioM2 = teclado.nextDouble();

ladoAlberca = Math.sqrt(area);
diametro = Math.sqrt((Math.pow(ladoAlberca, 2))+(Math.pow(ladoAlberca, 2)));
radio = diametro/2;
areaCirculo = Math.PI*Math.pow(radio,2);
areaPiso = areaCirculo-area;
precioPiso = areaPiso*precioM2;

System.out.println("Al area del piso a instalar es de : "+areaPiso+"m2.");
System.out.println("Y el precio será de: $"+precioPiso+".");

    }
}
