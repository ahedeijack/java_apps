/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropi;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class NumeroPi {

    /**
     * @param args the command line arguments
     */
    
    public static double pi(int n)
    {
        int d = 1, sig =1;
        double t, s =0;
        for(int i=1; i<=n; i++)
        {
            t = 1.0 / d * sig;
            s += t;
            d += 2;
            sig *= -1;
        }
        return s*4;
    }        
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos terminos de precisión requiere: ");
        int n = teclado.nextInt();
        
        System.out.println("Valor de Pi =" + pi(n));
        System.out.println("");
        System.out.println("Si ingresa '1,000,000,000 (mil millones)" + 
                           " los primeros 8 digitos son igual a pi = 3.14159265...'");
    }
    
    
}
