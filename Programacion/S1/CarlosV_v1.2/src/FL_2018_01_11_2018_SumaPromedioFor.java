
import java.util.Scanner;

/*
 *  Carlos Alberto Vázquez Aguirre 
 */

/**
 *
 * @author Ahedeijak
 */
public class FL_2018_01_11_2018_SumaPromedioFor {
    
    public static void main (String[] args){
     double suma, x, promedio;
     int n, i;
     suma = 0;
     Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el cuantas repetciones harás? ");
        n = entrada.nextInt(); //'n' son las veces que el ciclo se repetira. 
        
        
        if (n== 0)
            System.out.println("Entonces no harás ningún ciclo. xd");
        
        for(i=1; i<=n; i++){
            System.out.println("Valor "+i+": ");
            x = entrada.nextDouble();
            suma = suma + x;
        
        }
        if (n==0)
            promedio = 0;
        else 
            promedio = suma/n;
        
System.out.println("La suma fue de:  "+suma);        
System.out.println("Tu promedio fue de:  "+promedio);
        
    }
}
