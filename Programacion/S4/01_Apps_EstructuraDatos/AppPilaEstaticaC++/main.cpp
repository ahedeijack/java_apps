/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: pqdst
 *
 * Created on 31 de marzo de 2020, 03:06 PM
 */

#include <cstdlib>
#include <istream>
//#include <iostream> //es la entrada y salida de datos
#include "Menu.h"
#include "Pila.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
 int d,op;
 Pila pila;
 Menu menu;
 bool band=true;
 while(band)
 {
     //system("cls");// no uses cls
     system("cls");
     
     op = menu.opciones();
     switch(op)
        {
        
        case 1 : {
                    cout<<" Dato : ";
                    cin>>d;
                    if(pila.push(d))
                    {
                        cout<<" OK ";
                        //clrscr();
                        //system("cls");
                        pila.mostrar();
                    }
                    else
                       cout<<" Desbordamiento (Overflow) ";
                    }
                        //getch();
                    cin.get();//captura el enter que arriba usamos
                    cin.get();//se usara para detener la ejecucion
                    break;

        case 2: {
                    if(pila.pop(d))
                    {
                        cout<<"\n Dato eliminado : "<<d;
                        pila.mostrar();
                    }
                    else
                        cout<<" Pila vacia (Underflow)";
                    }
                     //getch();
                    cin.get();
                    cin.get();
                    break;

        case 3: band = false;// o solo usamos exit(0);
       }
    }
    
    return 0;
}

