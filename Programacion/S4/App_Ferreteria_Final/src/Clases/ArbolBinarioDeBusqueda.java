/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Ahedeijack
 */
public class ArbolBinarioDeBusqueda {
    int cont = 0;
    private class nodoArbol
    {
        private int dato; //string descripcion; double precio; int cantidad; podrian formar cada nodo del arbol
        private ArbolBinarioDeBusqueda der;
        private ArbolBinarioDeBusqueda izq;
         
        
        private void nodoArbol()
        {
            dato = 0;
            der = null;
            izq = null;
        }
    }
        
        nodoArbol raiz;
        
        public void ArbolBinarioDeBusqueda()
        {
            raiz = new nodoArbol();
        }
        public boolean estaVacio()
        {
            return raiz == null;
        }
        
        public void insertar(int valor)
        {
            if(estaVacio())
            {
                nodoArbol nuevo = new nodoArbol();
                nuevo.dato = valor;
                nuevo.der = new ArbolBinarioDeBusqueda();
                nuevo.izq = new ArbolBinarioDeBusqueda();
                raiz = nuevo;
            }
            else
            {
                if(valor > raiz.dato)
                {
                    raiz.der.insertar(valor);
                }
                if(valor < raiz.dato)
                {
                    raiz.izq.insertar(valor);
                }
            }
        }
        
    public ArrayList inOrden() {
        ArrayList l=new ArrayList();
        inOrden(raiz,l);
        return l;
    }
    
        private void inOrden(nodoArbol reco,ArrayList l) {
        if (reco != null) {
            inOrden(reco.izq.raiz,l);
            l.add(reco.dato + " ");
            inOrden(reco.der.raiz,l);
        }
    }
        
              public void RecInOrden(){
            if(!estaVacio()){
                 raiz.izq.RecInOrden();
                System.out.print(raiz.dato+" , ");
                raiz.der.RecInOrden();       
            }
        }
        
        public void RecPreOrden(){
            if(!estaVacio()){
                
                System.out.print(raiz.dato+" , ");
                raiz.izq.RecPreOrden();
                raiz.der.RecPreOrden();
                
            }
        }
        
        public void RecPosOrden(){
            if(!estaVacio()){
                raiz.izq.RecPosOrden();
                raiz.izq.RecPosOrden();
                System.out.print(raiz.dato + " , ");
            }
        }
        
        
        public int Menor(){
            nodoArbol nodoAux = raiz;
            int menor = raiz.dato;
            while(!nodoAux.izq.estaVacio()){
                nodoAux = nodoAux.izq.raiz;
                menor = nodoAux.dato;
            }
            return menor;
        }
        
        public int Mayor(){
            nodoArbol nodoAux = raiz;
            int mayor = raiz.dato;
            while(!nodoAux.der.estaVacio()){
                nodoAux = nodoAux.der.raiz;
                mayor = nodoAux.dato;
            }
            return mayor;
        }
        
        public boolean esHoja()
{
 boolean hoja = false;
    if( (raiz.izq).estaVacio() && (raiz.der).estaVacio() )
    {
        hoja = true;
    }
 return hoja;
}
        
public int buscarMenor() {
    ArbolBinarioDeBusqueda arbolActual = this;
        while( !arbolActual.raiz.izq.estaVacio() ) {
            arbolActual = arbolActual.raiz.izq;
        }
    int menor= arbolActual.raiz.dato;
    // arbolActual.raiz=null;
    return menor;
 }

public ArbolBinarioDeBusqueda buscar_(int valor)
{
    ArbolBinarioDeBusqueda arbol = null;
    if (!this.estaVacio())
    {
        if (valor == raiz.dato)
            {
            return this;
            }
            else {
            if (valor < raiz.dato)
                {
            arbol = raiz.izq.buscar_(valor);
            }
            else {
            arbol = raiz.der.buscar_(valor);
            }
        }
    }
    return arbol;
 }

 public void eliminar(int a)
 {
    ArbolBinarioDeBusqueda paraEliminar = buscar_(a);
    if (!paraEliminar.estaVacio())
    {
    if (paraEliminar.esHoja())
    {
    paraEliminar.raiz = null;
    }
    else
        {
            if(!paraEliminar.raiz.izq.estaVacio() && !paraEliminar.raiz.der.estaVacio())
            {
                paraEliminar.raiz.dato = paraEliminar.raiz.der.buscarMenor();
            }
            else
            {
            if (paraEliminar.raiz.izq.estaVacio())
                {
                    paraEliminar.raiz = paraEliminar.raiz.der.raiz;
                }
            else
                {
                    paraEliminar.raiz = paraEliminar.raiz.izq.raiz;
                }
            }
        }
    }
}
 
  public boolean siExiste(ArbolBinarioDeBusqueda arbol, int n){
    
      if(arbol == null){
         return false;
     } else if(arbol.raiz.dato == n ){
         return true;
     } else if (arbol.raiz.dato > n ) {
         return siExiste(arbol.raiz.izq, n);
     } else if (arbol.raiz.dato < n ) {
         return siExiste(arbol.raiz.der, n);
     } 
        return false;
 }
 
 
 
}
