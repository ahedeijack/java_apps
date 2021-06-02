/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_ferreteria_hash;

/**
 *
 * @author Ahedeijack
 */
public class HashModulo {
    
    public static int hash_modulo_ubicar_pos(int []vec, int clave, int n)
    {
        //se recibe la clave para ubicarla en el arreglo
       int pos;
       pos = clave % n;
       for( ; ;)
       {
           //el vector debe de estar inicializado a ceros
           if(vec[pos]!=0) //si es diferente de cero 
               pos++;
           else
               break;
           
           if(pos>=n)
               pos = 0;
       }
       return pos;
    }
    
    public static int hash_modulo_buscar(int []vec, int clave, int n)
    {
        int pos, band = 0;
        pos = clave % n;
        for( ; ; )
        {
            if(vec[pos] != clave)
                pos++;
            else
                break;
            
            if(pos>=n)
                pos = 0;
            
            band++;
            if(band>n)
                return -1; //no lo encontro
        }
        return pos;
    }
}
