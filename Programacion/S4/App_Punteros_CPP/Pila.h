/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pila.h
 * Author: The Survivor
 *
 * Created on 30 de marzo de 2020, 04:27 PM
 */

#ifndef PILA_H
#define PILA_H

#include <iostream>
using namespace std;


const int MAX = 5;
enum {tam = MAX};

class Pila
{
     //int datos[tam];
    int *datos;
    int *undato;
    int tope;
 public:
     Pila();
     bool push(int valor);
     bool pop (int &valor);
     void mostrar();
};

#endif /* PILA_H */

