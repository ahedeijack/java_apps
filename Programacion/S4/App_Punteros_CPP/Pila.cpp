/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pila.cpp
 * Author: The Survivor
 * 
 * Created on 30 de marzo de 2020, 04:27 PM
 */
#include <iostream>
#include "Pila.h"

Pila::Pila()
{
    datos = new int[MAX];
    tope = -1;
    for(int i = 0; i < tam; i++)
        datos[i] = 0;//inicializa a ceros el arreglo
     //obligatorio inicializar en c++
     
    undato = datos;
    
     for(int i = 0; i<tam; i++, undato++){
         datos[i] = 0;
     }
}

bool Pila::push(int valor)
{
    if(tope == tam -1)
        return false;
    else
    {
        datos[++tope]= valor;
        return true;
    }
}

//pase de la referencia
bool Pila::pop(int &valor)
{
     if(tope == -1)
        return false;
     else
     {
        valor = datos[tope--];
        return true;
     }
}

void Pila::mostrar()
{
    cout<<"\nDatos en la pila : \n";
    for(int i = 0; i <= tope; i++)
        cout<<"\n Dato[ "<<i<<" ] -> "<<datos[i];
    
    cout<<endl;
    undato = &datos[0];
    for(int i = 0; i<tam; i++){
        cout<<"Dir de dato: " <<i <<" " <<&datos[i] <<endl;
        cout<<"Dir de undato + i"<<" " <<*(undato+i) <<endl;
    }
}

