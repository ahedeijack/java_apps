/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml_proyecto_unidad_1_energias;
import java.util.Scanner;
/**
 *
 * @author Ahedeijack
 */
public class ML_Proyecto_Unidad_1_Energias {
//Declaración de metodos para el calculo de las energias. 
    public static double EnergiaCinetica (double Masa, double Velocidad){
           double EC;
           
           EC=0.5*Masa*Math.pow(Velocidad, 2);
           
           return EC;     
       }
    
     public static double EnergiaPotencial (double Masa, double Altura){
           double EP;
           
           EP=Masa*9.8*Altura;

           return EP;          
       }
     
      public static double MasaTotal (double Masa1, double Masa2, double Masa3){
           double MT;
           
           MT=Masa1+Masa2+Masa3;
           
           return MT;
                  
       }
    //Termino de la declaración de los metodos.
    
    public static void main(String[] args) {
//Declaración de variables, separados para cada objeto para tener un buen orden a la hora de asignar valores. 
        double energiaM1, energiaP1, energiaC1, high1, vel1, masa1, masaTotal, sumaEnergias;
        double energiaM2, energiaP2, energiaC2, high2, vel2, masa2;
        double energiaM3, energiaP3, energiaC3, high3, vel3, masa3;
//Finalización de la declaración de variables.

//Inicio de asignación de valores.
Scanner teclado = new Scanner(System.in);

System.out.println("Calculo de las Energias mediante Masa, Peso y Velocidad.");

//Asignación de valores del primer objeto.
System.out.println("Ingresa el valor de Masa del objeto 1:");
masa1 = teclado.nextDouble();
System.out.println("Ingresa el valor de la Velocidad del objeto 1:");
vel1 = teclado.nextDouble();
System.out.println("Ingresa el valor de la altura del objeto 1:");
high1 = teclado.nextDouble();

//Asignación de valores del segundo objeto.
System.out.println("Ingresa el valor de Masa del objeto 2:");
masa2 = teclado.nextDouble();
System.out.println("Ingresa el valor de la Velocidad del objeto 2:");
vel2 = teclado.nextDouble();
System.out.println("Ingresa el valor de la altura del objeto 2:");
high2 = teclado.nextDouble();

//Asignación de valores del tercer objeto.
System.out.println("Ingresa el valor de Masa del objeto 3:");
masa3 = teclado.nextDouble();
System.out.println("Ingresa el valor de la Velocidad del objeto 3:");
vel3 = teclado.nextDouble();
System.out.println("Ingresa el valor de la altura del objeto 3:");
high3 = teclado.nextDouble();

//Uso de los metodos creados para las operaciones. 
energiaP1 = EnergiaPotencial(masa1, high1);
energiaC1 = EnergiaCinetica(masa1, vel1);
energiaM1 = energiaP1+ energiaC1;

energiaP2 = EnergiaPotencial(masa2, high2);
energiaC2 = EnergiaCinetica(masa2, vel2);
energiaM2 = energiaP2+ energiaC2;

energiaP3 = EnergiaPotencial(masa3, high3);
energiaC3 = EnergiaCinetica(masa3, vel3);
energiaM3 = energiaP3+ energiaC3;

masaTotal = MasaTotal(masa1, masa2, masa3);
//Para obtener el resultado de la suma de las energias, se utiliza el mismo metodo de la suma de masas
//Es la misma operación matematica, así como el número de parametros requeridos para el metodo.
sumaEnergias = MasaTotal(energiaM1, energiaM2, energiaM3);

//Salida de la información de las energías. 
System.out.println("---");
System.out.println("Valores del objeto 1:");
System.out.println("Energía Potencial: "+energiaP1+"u");
System.out.println("Energía Cinetica: "+energiaC1+"u");
System.out.println("Energía Mecanica:"+energiaM1+"u");
System.out.println("---");
System.out.println("Valores del objeto 2:");
System.out.println("Energía Potencial: "+energiaP2+"u");
System.out.println("Energía Cinetica: "+energiaC2+"u");
System.out.println("Energía Mecanica:"+energiaM2+"u");
System.out.println("---");
System.out.println("Valores del objeto 3:");
System.out.println("Energía Potencial: "+energiaP3+"u");
System.out.println("Energía Cinetica: "+energiaC3+"u");
System.out.println("Energía Mecanica:"+energiaM3+"u");
System.out.println("---");
System.out.println("Suma total de las masas: "+masaTotal +"u.");
System.out.println("Suma total de las energias mecanicas: "+sumaEnergias+"u." );
    }
    
}
