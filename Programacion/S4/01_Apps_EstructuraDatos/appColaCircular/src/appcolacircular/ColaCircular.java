/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolacircular;

/**
 *
 * @author jose_
 */
public class ColaCircular {
    int [] datos;
    int tam, P, U;
    
    public ColaCircular(int n)
    {
        tam = n;
        datos = new int [tam];
        P = U = -1;
    }        
    
    public boolean insertar(int dato)
    {
        if((U == tam - 1) && (P == 0) || (U + 1 == P))
            return false;
        else if(U == tam - 1)
            U = 0;
        else
            U++;
        datos[U] = dato;
        if(P == -1)
            P = 0;
        return true;
    }    

    public boolean eliminar(Numero dato)
    {
        if(P == -1)
            return false;
        dato.num = datos[P];
        if(P == U)
        {
            datos[P] = -1;
            P = U = -1;
        }    
        else
        {
            datos[P] = -1;
            P++;
        }    
        return true;
    }        
    
    public boolean esta_vacia()
    {
        return (P == -1);
    }        
    
    public boolean esta_llena()
    {
        //int resul = (U + 1) % tam;
        //return resul == P;
        
        return (((U + 1) % tam ) == P);
    }        
}
