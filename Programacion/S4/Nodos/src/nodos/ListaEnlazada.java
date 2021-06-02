/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author ahdeijack
 */
public class ListaEnlazada
{
Nodo primero;
Nodo actual;
public ListaEnlazada()
{
}
public void Insertar(int v)
{
Nodo anterior;
if(ListaVacia() || primero.valor > v)
{
primero = new Nodo(v, primero);
}
else
{
anterior = primero;
while(anterior.sig != null && anterior.sig.valor <= v)
anterior = anterior.sig;
anterior.sig = new Nodo(v, anterior.sig);
}
}
public void Mostrar()
{
Nodo aux;
aux = primero;
while (aux!=null)
{
System.out.print(aux.valor + "->");
aux = aux.sig;
}
System.out.print(" null ");
System.out.println();
}
public void Siguiente()
{
if(actual != null)
actual = actual.sig;
}
public void Primero()
{
actual = primero;
}

public void Borrar(int v)
{
Nodo anterior, nodo;
nodo = primero;
anterior = null;
while(nodo !=null && nodo.valor < v)
{
anterior = nodo;
nodo = nodo.sig;
}
if(nodo == null || nodo.valor != v)
return;
else
{
if(anterior ==null)
primero = nodo.sig;
else
anterior.sig = nodo.sig;
}
}
public boolean ListaVacia()
{
if(primero == null)
return true;
return false;
}
public void Ultimo()
{
Primero();
if(!ListaVacia())
while(actual.sig != null)
Siguiente();
}
public boolean Actual()
{
if(actual != null)
return true;
return false;
}
public int ValorActual()
{
return actual.valor;
}
}//FIN CLASE ListaEnlazada
