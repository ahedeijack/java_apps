/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ahdeijack
 */
public class Hash {
    
public static int plegamiento(int clave, int tam){
        String auxClave = String.valueOf(clave);
        String auxTabla = String.valueOf(tam-1);
        
        int pos = 0;
        String parte = "";
        
        for (int i = 0; i < auxClave.length(); i++) {
            parte  += auxClave.charAt(i)+"";
            
            if (parte.length() == auxTabla.length()) {
                pos+=Integer.parseInt(parte);
                parte ="";
                
            } else if (i == auxClave.length()-1) {
                pos += Integer.parseInt(parte);
            }
        }
        return pos;
    }

    public static int Hash_Buscar(int [] vec,int clave,int n)
    {
        int pos,band = 0;
        pos = clave % n;
        for(; ;)
        {
            if(vec[pos] != clave)
                pos++;
            else//SI NO LA ENCONTRO
                break;
            if(pos>=n)
                pos=0;
            band++;
            if(band> n )
                return -1;
        }
        return pos; 
    }
    
    
}
