/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_colacircular;

/**
 *
 * @author ahdijack
 */
public class ColaCircularT <T>{
    Object[] vec;
	int P, U; //tam;

    public ColaCircularT(int n)
    {
            P = U = -1;
            vec = new Object[n];
    }
    
    public boolean insertar(T dato)
    {
        if((U == vec.length - 1) && (P == 0) || (U + 1 == P))
            return false;
        else if(U == vec.length - 1)
            U = 0;
        else
            U++;
        vec[U] = dato;
        if(P == -1)
            P = 0;
        return true;
    }   
    
    public T eliminar2()
    {
        if(P == -1)
            return null;
        T dato = (T)vec[P];
        vec[P] = null;
        if(P == U)
        {
            vec[P] = -1;
            P = U = -1;
        }    
        else
        {
            vec[P] = -1;
            P++;
        }    
        return dato;
    } 

    public T eliminar()
        {
            if(P == -1)
                return null;
            T dato = (T)vec[P];
            if(P == U)
            {
                vec[P] = -1;
                P = U = -1;
            }    
            else
            {
                vec[P] = -1;
                P++;
            }    
            return dato;
        }            
    
    public boolean esta_vacia()
    {
        return (P == -1);
    }        
    
    public boolean esta_llena()
    {
        //int resul = (U + 1) % tam;
        //return resul == P;
        
        return (((U + 1) % vec.length ) == P);
    }   
    
    public void mostrar()
        {
            System.out.println("Datos en la cola");
            for(int i = 0; i<vec.length && !esta_vacia(); i++)
                    System.out.println("Dato [" +i+ "] : " + vec[i]);
	}
    
}
