  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphash;

/**
 *
 * @author D E L L P C
 */
public class Hash {
    
    public static int Hash_Modulo(int [] vec, int clave,int n)
    {//SE RECIBE LA CLAVE PARA UBICARLA EN EL ARREGLO
        int pos;
        //DETERMINAR SI N ES PRIMO, PREFERENTEMENTE DONDE SE DEFINE EL TAMAÑO DEL ARREGLO VEC - EN LA APP-
        pos = clave % n;//vec.length
        for(; ;)
        {
            //EL ARREGLO ESTA INICIALIZADO ORIGINALMENTE CON CEROS
            if(vec[pos] != 0)
                pos++;
            else
                break;
            if(pos >= n)
                pos =0;
        }
        return pos;
    }
    public static int HashTrunc(int [] vec, int clave, int n)
    {      
        
        String posicion;
        String cad = clave+"";
        int ind;
        char [] cadena = cad.toCharArray();
        
        posicion = Character.toString(cadena[0])+Character.toString(cadena[1]);
        
        ind = Integer.parseInt(posicion)+1;
        for(; ;)
        {
            if(vec[ind] != 0)
                ind++;
            else
                break;
            if(ind >= n)
                ind=0;
        }
        return ind;
        
        
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
    
    public static boolean EsPrimo(int n)
    {
        int div =2;
        while (div < n)
        {
            if(n%div ==0)
                return false;
            
            div++;
            
        }
    return true;
    
    }
    
}
