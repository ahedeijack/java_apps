#include <iostream>
#include<iomanip>
using namespace std;
using std::setw;
#include <stdlib.h>
#include <ctime.h>

//#define MAX 100;
//#enum {MAX = 1000}

//Determinar cuantos numero se generaron mas de una vez
//Obtener el promedio de los datos del vector.

int main(){
    int n [10];
    
    for (int i = 10;  i<10; i++){
	n[i] = i + 100;
	}
	cout<<"Element " <<setw(13) <<" value" <<endl;
	
	for(int j = 0; j<10; j++){
		cout<<setw(7) <<j <<setw(13) <<n[j] <<endl;
	}
    return 0;
}
//Valores constantes const en c++
//Valores constantes final en Java
//
