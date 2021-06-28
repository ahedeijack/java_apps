/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

#include "Pila.h" //porque incluyo a iostream
#include "Menu.h"
//#include <iostream>
//using namespace std;

int Menu::opciones()
{
  int op;
     cout<<"\nTrabajando con una pila : "<<endl;
     cout<<"\n Que deseas hacer : ";
     cout<<"\n 1) Insertar Dato : ";
     cout<<"\n 2) Extraer Dato : ";
     cout<<"\n 3) Salir : ";
     cout<<"\n Opcion : ";
     cin>>op;
  return op;
}


