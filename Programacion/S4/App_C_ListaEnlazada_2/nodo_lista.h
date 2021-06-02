#ifndef NODO_LISTA_H
#define NODO_LISTA_H


class nodo_lista
	{
		 int dato;
		 nodo_lista *sig;
		 public:
		 nodo_lista(int d);
		 void inserta_s(nodo_lista *nodo);
		 void muestra();
	};
	
nodo_lista::nodo_lista(int d){
	 dato = d;
	 sig = NULL;
	}
	
void nodo_lista::inserta_s(nodo_lista *nodo){
	 if(sig == NULL){ //6
		 sig = nodo;
		 nodo->sig = NULL;//0
	 }
	 /*else {
	 nodo->sig = sig;
	 sig = nodo;
	 }*/
}



#endif /* NODO_LISTA_H */

