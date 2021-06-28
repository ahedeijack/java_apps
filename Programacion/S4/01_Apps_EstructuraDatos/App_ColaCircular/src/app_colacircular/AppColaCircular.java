/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_colacircular;

import java.util.Random;

/**
 *
 * @author ahdijack
 */
public class AppColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaCircular colacirc = new ColaCircular(5);
        int cont = 0;
        Numero N = new Numero();
        Random r = new Random();
        
        while(!colacirc.esta_llena())
        {
            int val = r.nextInt(99)+10;
            if(colacirc.insertar(val))
            {
                System.out.println("Dato insertado " + val);
                cont++;
            } 
            else
            {
                System.out.println("\n Overflow, cola llena ");
            }    
            if (cont == 3)
                colacirc.eliminar(N);
            
            while(cont > 0)
            {
                if(colacirc.eliminar(N))
                    System.out.println("\n Dato extraido" + N.num);
                else
                {
                    System.out.println("\n Underflow, cola vacia :");
                    break;
                }    
            }    
        }    
    }
    
}
