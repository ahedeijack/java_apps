/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package cursoalgoritmos;

import java.util.Random;

/**
 *
 * @author Ahedeijak
 */
public class CA_C_04 {

public static void main(String args[]){
  
    Random r = new Random();
    System.out.println(" ---");
    int reng = 3;
    int col = 3;
    
    int [][] datos = {{8,6,6},{6,6,4},{2,1,3}};
    
    for (int i = 0; i < datos.length; i++) {
        for (int j = 0; j<datos[0].length; j++){
            System.out.println(datos [i][j]+"");
        }
    }
    
    for (int i = 0; i<datos.length; i++){
        System.out.println("|");
            for (int j = 0; j<datos[0].length; j++){
                     System.out.println("|"+datos[i][j]);
            }
    }
    
    
    
}

    
}
