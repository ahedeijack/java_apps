/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: jose_
 *
 * Created on 29 de abril de 2020, 04:41 PM
 */

#include <cstdlib>
#include <iostream> //INCLUYE LOS METODOS PARA LEER (cin) Y ESCRIBIR (cout) 
#include <stdio.h>
using namespace std;

/*
 * 
 */

//LISTA ENLAZADAS, TIENEN COMO PRINCIPAL BENEFICIO QUE SOLO LAS LIMITA LA CAPACIDAD DE MEMORIA
//PORQUE CRECEN DINAMICAMENTE 
struct Nodo
{
    int info;
    Nodo *sig; //PUNTERO AL SIGUIENTE ELEMENTO (TIPO NODO)
};

int main(int argc, char** argv) {
    int i;
    Nodo lista, *nodo;
    
    lista.sig = NULL;
    nodo = &lista; //Nodo apunta  al inicio de la lista
    nodo->info = 124;
   
    for(int i=0; i<=5; i++)
    {
        nodo->sig = new Nodo;
        nodo = nodo->sig; //EN LA PRIMRA OCASION, AQUI INICIA LA LISTA ENLAZADA CON NUESTROS
        
        nodo->info = i;
        nodo->sig = NULL;
    }    
    
    //DIRECCION FISICA DE LISTA, se obtiene con &lista
    printf("Dir de lista: %p, lista.sig = %p", &lista, lista.sig);
    
    nodo = lista.sig;
    while(nodo != NULL)
    {
        
        //cout<<"Dir: "<<hex<<&nodo->sig<<dec <<" Info: "<<nodo->info<<endl;
        
        // %p permite mostrar la direccion de los punteros 
        printf("\nDir: %p -> Valor: %d -> SIG: %p ", nodo, nodo->info, nodo->sig);
        nodo = nodo->sig;
    }    
    
    delete nodo; //ES NECESARIO USAR EL BORRADO DE LOS PUNTEROS
    return 0;
}


