/*
 *  Carlos Alberto Vázquez Aguirre 
 */
package fl_carlosv;

import java.util.Scanner;

/**
 *
 * @author Ahedeijak
 */
public class FL_M2_2018_25_10_CicloPara {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    String mensaje;
        int i, n;
        
        System.out.println("Ingresa cuantas repetciones se hará el mensaje");
        n = entrada.nextInt();
        
        System.out.println("Que mensaje saldra?(Cambia los expacios por '_')");
        mensaje = entrada.next();
        
        for (i = 1; i<=n; i++)
        {
        System.out.println(i+".-"+mensaje);
        }
        
    }                   
    
}
