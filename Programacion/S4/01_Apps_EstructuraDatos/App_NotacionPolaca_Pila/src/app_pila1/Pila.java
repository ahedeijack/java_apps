/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pila1;

/**
 *
 * @author user
 */
class Pila {
    int []vec;
    private boolean vacia;
    public boolean llena;
    int tope;
    
    public Pila(int n)
    {
        vec=new int[n];
        tope=0;
        vacia=true;
        llena=false;
        
    }
    
    public void push(int valor)
    {
        vacia=false;
        vec[tope++]=valor;
        if(tope==vec.length)
            llena=true;
    }
    
    public int pop()
            {
        if (--tope==0)
        vacia=true;
        llena=false;
        return vec[tope];
        
            }
    
    public boolean esta_vacia()
    {
       return vacia;
    }
    
    public boolean estaLlena()
    {
        return llena;
    }
    
    public int Tope(){
        return vec[tope-1];
    }
            
}
