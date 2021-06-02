//Carlos Alberto Vázquez Aguirre
package fl_18131288_proyecto_01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ahedeijack
 */
public class FL_18131288_Proyecto_01 {    

// Se generan los metodos que utilizaremos a lo largo de nuestro trabajo.
   //Los metodos a crear son 4. Calculo de Masa, Energia Cinetica, Energia Potencial y Sumas Finales. 
    
    public static double CalculoMasa(double energiaMecanica, double Velocidad, double Altura){
        double Masa;
        Masa= energiaMecanica/((Math.pow(Velocidad, 2)*0.5)+(Altura*9.8));
        return Masa;
        
    }
    
    public static double EnergiaCinetica(double Masa, double Velocidad){
    double EC;
    
    EC=0.5*Masa*Math.pow(Velocidad, 2);
    
    return EC;
    
    }
    
    public static double EnergiaPotencial(double Masa, double Altura){
        double EP;
        EP = Masa*9.8*Altura;
        return EP;
        
    }
    
    public static double SumasFinales(double valor1, double valor2, double valor3){
        double SumaFinal;
        SumaFinal=valor1+valor2+valor3;
        return SumaFinal;
        
    }
  
    //Una vez terminados los metodos, procedemos a crear nuestra aplicación.
    
    public static void main(String[] args) throws FileNotFoundException {
//Declaración de variables, separados para cada objeto para tener un buen orden a la hora de asignar valores. 
        double energiaM1, energiaP1, energiaC1, high1, vel1, masa1, masaTotal, sumaEnergias;
        double energiaM2, energiaP2, energiaC2, high2, vel2, masa2;
        double energiaM3, energiaP3, energiaC3, high3, vel3, masa3;
//Finalización de la declaración de variables.

//Inicio de asignación de valores.
Scanner teclado = new Scanner(new File("FL_18131288_Datos_01.txt"));

System.out.println("Calculo de las .-Energias y Masa-. mediante  Peso, Velocidad y Energia Mecanica.");
//Asignación de valores del primer objeto.
System.out.println("Ingresa el valor de la Velocidad del objeto 1:");
vel1 = teclado.nextDouble();
System.out.println("Ingresa el valor de la altura del objeto 1:");
high1 = teclado.nextDouble();
System.out.println("Ingresa la energia Mecanica 1: ");
energiaM1 = teclado.nextDouble();

//Asignación de valores del segundo objeto.
System.out.println("Ingresa el valor de la Velocidad del objeto 2:");
vel2 = teclado.nextDouble();
System.out.println("Ingresa el valor de la altura del objeto 2:");
high2 = teclado.nextDouble();
System.out.println("Ingresa la energia Mecanica 2: ");
energiaM2 = teclado.nextDouble();

//Asignación de valores del tercer objeto.
System.out.println("Ingresa el valor de la Velocidad del objeto 3:");
vel3 = teclado.nextDouble();
System.out.println("Ingresa el valor de la altura del objeto 3:");
high3 = teclado.nextDouble();
System.out.println("Ingresa la energia Mecanica 3: ");
energiaM3 = teclado.nextDouble();

//Uso de los metodos creados para las operaciones. 

//Calculo de valores del primer Objeto.
 masa1=CalculoMasa(energiaM1, vel1, high1);
 energiaC1=EnergiaCinetica(masa1, vel1);
 energiaP1=EnergiaPotencial(masa1, high1);

//Calculo de valores del segundo Objeto.
 masa2=CalculoMasa(energiaM2, vel2, high2);
 energiaC2=EnergiaCinetica(masa2, vel2);
 energiaP2=EnergiaPotencial(masa2, high2);
 
 //Calculo de valores del primer Objeto.
 masa3=CalculoMasa(energiaM3, vel3, high3);
 energiaC3=EnergiaCinetica(masa3, vel3);
 energiaP3=EnergiaPotencial(masa3, high3);
 
 //Uso del metodo de sumas para las energias y las masas.
 masaTotal= SumasFinales(masa1, masa2, masa3);
 sumaEnergias=SumasFinales(energiaM1, energiaM2, energiaM3);

 
//Salida de la información de los datos Obj1. 
System.out.println("-");
System.out.println("Valores del objeto 1:");
System.out.println("Masa calculada 1 es: "+masa1);
System.out.println("Energía Potencial: "+energiaP1+"u");
System.out.println("Energía Cinetica: "+energiaC1+"u");
System.out.println("Energía Mecanica:"+energiaM1+"u");
//Salida de la información de los datos Obj2. 
System.out.println("-");
System.out.println("Valores del objeto 2:");
System.out.println("Masa calculada 2 es: "+masa2);
System.out.println("Energía Potencial: "+energiaP2+"u");
System.out.println("Energía Cinetica: "+energiaC2+"u");
System.out.println("Energía Mecanica:"+energiaM2+"u");
//Salida de la información de los datos Obj3. 
System.out.println("-");
System.out.println("Valores del objeto 3:");
System.out.println("Masa calculada 3 es: "+masa3);
System.out.println("Energía Potencial: "+energiaP3+"u");
System.out.println("Energía Cinetica: "+energiaC3+"u");
System.out.println("Energía Mecanica:"+energiaM3+"u");
//Salida de las sumas de datos.
System.out.println("-");
System.out.println("Suma de energias mecanicas: "+sumaEnergias+"u");
System.out.println("Suma de masas:"+masaTotal+"u");
System.out.println("¡¡NOTA: RECUERDA QUE EL VALOR OBTENIDO SE PUEDE REDONDEAR CUANDO SE TIENE MAS DE 2 Ó 3 DECIMALES CONSECUTIVOS CON VALOR DE 9!!");
System.out.println("Nombre: Carlos Alberto Vázquez Aguirre. Nc: 18131288");
    }
    
}
    

