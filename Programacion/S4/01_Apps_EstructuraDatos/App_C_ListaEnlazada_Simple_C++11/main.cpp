/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ahdeijack
 *
 * Created on April 29, 2020, 4:40 PM
 */

#include <cstdlib>
#include<iostream> //Incluye los metodos para leer y escribir.
#include<stdio.h>
//(cin =  entrada), (cout = salida)

//Las listas enlazadas sirven de manera principal
//para poder limitar la capacidad de memoria, pues crecen de 
//manera dinamica.
using namespace std;

/*
 * 
 */
struct Nodo {
    int info;
    Nodo *sig; //puntero al siguiente elemento.
};



int main(int argc, char** argv) {

    int i;
    Nodo lista, *nodo;
    
    
    lista.sig = NULL;
    nodo = &lista;
    
      //Se comento el nodo que apuntaba a info, se saco del for y se puso aca arriba.
        //nodo->info = 124;
    
    for(int i = 0; i<5; i++){
        nodo->sig = new Nodo;
        nodo = nodo->sig; //En la primera ocasion, aqui inicia la lista enlazada
        nodo ->info = i;
        nodo->sig = NULL;
    }
    
    printf("Dir de lista: %p , lista.sig = %p", &lista, lista.sig);
    
    nodo = lista.sig;
    
    while(nodo != NULL){
        //Se comento el codigo de salida anterior.
//        cout<<"Dir: " <<hex<<&nodo->sig <<dec <<", Info: "<<nodo->info<<endl;

        //Se utilizó el 'printf' para dar salida a las cadenas.
        printf("\Dir: %p -> Valor: %d -> SIG: %p ", nodo, nodo->info, nodo->sig);
                nodo = nodo->sig;
                
    }
 
    delete nodo; //se requiere, es necesario, si no, no dejara de buscar.
    
    return 0;
}

