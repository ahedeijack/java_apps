/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: pqdst
 *
 * Created on 4 de mayo de 2020, 03:02 PM
 */

#include <cstdlib>
#include "nodo_lista.h"
#include <iostream>

using namespace std;

/*
 * 
 */
void nodo_lista::muestra()
		{
		 nodo_lista *p1;
		 p1 = this;
		 while(p1 != 0)
			 {
			 	cout<< p1->dato<<" ";
				p1 = p1->sig;
			}
		   cout<<'\n';
	    }

int main(int argc, char** argv) {
    
 nodo_lista *p = new nodo_lista(5);
 nodo_lista *n= p;
for(int i = 0; i < 5;i++)
	{
		 nodo_lista *o = new nodo_lista(i*i);
		 n->inserta_s(o);
		 n = o;
	}
 p->muestra();
 n->muestra();
 

    return 0;
}

