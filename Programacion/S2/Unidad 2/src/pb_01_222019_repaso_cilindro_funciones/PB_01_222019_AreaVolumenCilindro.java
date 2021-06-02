/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_01_222019_repaso_cilindro_funciones;
import java.util.Scanner;
/**
 *
 * @author Ahedeijak
 */
public class PB_01_222019_AreaVolumenCilindro {
    public static void  main(String[] args){
//Declaración de variables.
        double radio, altura, area, volumen;
        Scanner read = new Scanner(System.in);
        
//Entrada de datos.
        System.out.println("Ingresa el valor del radio de la lata:");
        radio = read.nextDouble();
        System.out.println("Ingresa la altura de la lata: ");        
        altura = read.nextDouble();
//Proceso.
        volumen = Math.PI*Math.pow(radio, 2)*altura;
        area = 2*Math.PI * radio * (radio + altura);
        
//Salida.
        System.out.println("El area del cilindro es de: " +area);
        System.out.println("El volumen del cilindo es de: "+volumen);

    }
}
