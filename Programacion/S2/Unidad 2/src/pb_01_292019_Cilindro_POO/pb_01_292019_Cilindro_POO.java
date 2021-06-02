/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_01_292019_Cilindro_POO;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa603
 */
public class pb_01_292019_Cilindro_POO {
    public static void main (String[] args){
      //Tipo de Objeto ||   Nombre
        Cilindro            lata = new Cilindro();
        Cilindro botePintura = new Cilindro();
        Random rand = new Random();
        Scanner read = new Scanner(System.in);
        
        System.out.println("Radio de la lata: ");
                double rLata = read.nextDouble();
        System.out.println("Altura de la lata: ");
                double aLata = read.nextDouble();
        
        //Parametros que tiene nuestro nuevo objeto para regresar los datos.
        lata.setRadio(rLata);
        lata.setAltura(aLata);
                
                
        System.out.println("Radio del bote: ");
                double rBote = rand.nextInt(20)*.5*10;
        System.out.println("Altura del bote: ");
                double aBote = rand.nextInt(20)*.5*10;
                
        botePintura.radio = rBote;
        botePintura.altura = aBote;
        
        double lits1 = lata.volumen()/1000;
        double lits2 = botePintura.volumen()/1000;
        
        System.out.println("-");
        System.out.println("Area de la lata "+lata.area());
        System.out.println("Volumen de la lata "+lata.volumen());
        System.out.println("Litros de la lata "+lits1);
        System.out.println("Altura de la lata "+lata.getAltura());
        System.out.println("Radio de la lata "+lata.getRadio());

        System.out.println("-");
        System.out.println("Area del bote de pintura "+botePintura.area());
        System.out.println("Volumen del bote de pintura "+botePintura.volumen());
        System.out.println("Litros del bote de pintura "+lits2);
        System.out.println("Altura de la bote de pintura "+botePintura.getAltura());
        System.out.println("Radio de la bote de pintura "+botePintura.getRadio());
        
        
        
        Cilindro otro = new Cilindro(15,40);
        double lits3 = otro.volumen()/1000;

        System.out.println("-");
        System.out.println("Area del bote de otro "+otro.area());
        System.out.println("Volumen del bote de otro "+otro.volumen());
        System.out.println("Litros del bote de otro "+lits3);
        System.out.println("Altura de la bote de otro "+otro.getAltura());
        System.out.println("Radio de la bote de otro "+otro.getRadio());
        
        Cilindro otro2 = new Cilindro(botePintura);
        double lits4 = otro2.volumen()/1000;

        System.out.println("-");
        System.out.println("Area del bote de otro2 "+otro2.area());
        System.out.println("Volumen del bote de otro2 "+otro2.volumen());
        System.out.println("Litros del bote de otro2 "+lits4);
        System.out.println("Altura de la bote de otro2 "+otro2.getAltura());
        System.out.println("Radio de la bote de otro2 "+otro2.getRadio());
        
        System.out.println("Lata ->"+lata);
        System.out.println("Otro ->"+otro);
        System.out.println("Otro2 ->"+otro2);
        System.out.println("Bote ->"+botePintura);
        System.out.println("Mate ->"+lata.toString()); //toString obtiene los datos del objeto. 
    }
}
