/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_142019_AlicacionArreglo;

import java.util.Arrays;

/**
 *
 * @author aa603
 */
public class Arreglo {
    private double [] datos;
    
    public Arreglo(){ //Cuando el usario no pone nigun dato
        //Indicar tamaño por default
        datos = new double [10];//referencia del arreglo 
    }
    
    public Arreglo(int n ){ //Valor a recibir del usuario
        datos = new double [n];
    }
    
    public Arreglo(double []d){ //En caso de que llegue un arreglo como parametro
        datos = new double[d.length];
        
        for(int  i = 0; i<datos.length; i++){
            datos[i] = d[i];
        }
    }
    
    public double getValor(int posicion){ //El valor que se va a regresar
        
        if(posicion >=0 && posicion< datos.length){
        return datos[posicion];    
        }
        else
        return 0;
    }
    
    public void setValor(double valor, int posicion){
        if(posicion >=0 && posicion< datos.length){
        datos[posicion] = valor;    
        }

    }
    
    
    public String toString(){
        String cad = "{";
        
        for(int i=0; i<datos.length; i++ ){
            cad = cad + datos[i];
        
            if (i < datos.length-1){
                cad = cad + ",";
            }
        }
        
        cad = cad + "}";
        
        return cad;
    }
    
    double suma(){
        double total = 0;
        for (int i = 0; i<datos.length; i++){
            total = datos[i];
        }
        return total;
    }
    
    public double promedio(){
        return suma() / datos.length;
        
    }
    
    public double mayor(){
        double may = datos[0];
        for (int i = 0; i<datos.length; i++){
            if (datos[i] > may){
                may = datos[i];
            }
        }
           return may;
    }
    
    public double menor(){
        double men = datos[0];
        for(int i = 0; i<datos.length; i++){
            if(datos[i] < men){
                men = datos[i];
            }
            
        }
        return men;
    }
    
    public double rango(){
        double ran;
        return mayor() - menor();
    }
    
    public double mediana(){
        double med;
        double [] copia = datosOrdenados();
        for(int i = 0; i < copia.length; i++){
            copia[i] = datos[i];
        }
        
        if(copia.length%2 == 0){ //Tiene número par
            Arrays.sort(copia);
            med = (copia[copia.length/2-1]+copia[copia.length/2]/2);
        } else { //Tiene número par
            Arrays.sort(copia);
            med =  copia [(copia.length-1)/2];
        }
        return med;
    }
    
    public void ordenar(){
        Arrays.sort(datos);
    }
    
    public double [] datosOrdenados(){
         double [] copia = new double [datos.length];
        for(int i = 0; i < copia.length; i++){
            copia[i] = datos[i];
        }
        Arrays.sort(copia);
        return copia;
    }
}
