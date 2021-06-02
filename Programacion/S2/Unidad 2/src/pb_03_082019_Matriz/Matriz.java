/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_082019_Matriz;

/**
 *
 * @author aa603
 */
public class Matriz {

    private double [][] datos;
    
    public Matriz(){
    datos = new double [1][1];
    }
    
    public Matriz(int ren, int col){
        if (ren > 0  && col >0){
            datos = new double [ren][col];
        } else {
            datos = new double [1][1];
        }
 }
    
    public Matriz(double [][] d){
        datos = new double [d.length][d[0].length];
        
        for (int r = 0; r<d.length; r++){
            for(int c = 0; c<d[0].length; c++){
                datos[r][c] = d[r][c];
            }
        }
 }
    
    public int getRenglones(){
        return datos.length;
    }
    
    public int getColumnas(){
        return datos[0].length;
    }
    
    public void setValor(double valor, int ren, int col){
     if (ren>=0 && ren < getRenglones() && col >= 0 && col<getColumnas()){
        datos[ren][col] = valor;
     }
 }
    
    public double getValor(int ren, int col){
     if (ren>=0 && ren < getRenglones() && col >= 0 && col<getColumnas()){
        return datos[ren][col];
     } else {
         return 0;
     }
 }
    
    public void mostrar(){
        for(int r = 0; r<getRenglones(); r++){
            System.out.println("");
            for(int c = 0; c<getColumnas(); c++){
                System.out.print(datos[r][c]+"\t");
            }
        }
    }
    
    public Matriz suma(Matriz m){
        //Este metodo incolucra 3 objetos de la clase matriz
        //1.-El que manda a llamar al metodo (.this)
        //2,.El que llega como parametro (m)
       //3.-El resultado de sumar this y m (resultante)
        if (getRenglones() != m.getRenglones() || getColumnas()!= m.getColumnas()){
            return new Matriz();
        }
        
        Matriz resultante = new Matriz(getRenglones(), getColumnas());
        
        for(int r = 0; r<getRenglones(); r++){
            for(int c = 0; c<getColumnas(); c++){
                resultante.setValor(getValor(r,c)+m.getValor(r, c), r, c);
                
            }
        }
        
        return resultante;
        
    }
    
    public Matriz escalar(double escalar){
        Matriz resultante = new Matriz(getRenglones(), getColumnas());
        
        for(int r = 0; r<getRenglones(); r++){
            for(int c = 0; c<getColumnas(); c++){
                resultante.setValor(getValor(r,c)*escalar, r, c);
                
            }
        }
        
        return resultante;
        
    }
    
    public Matriz multiplicar(Matriz m){
        //Este metodo incolucra 3 objetos de la clase matriz
        //1.-El que manda a llamar al metodo (.this)
        //2,.El que llega como parametro (m)
       //3.-El resultado de multiplicar this y m (resultante)
        if (getColumnas() != m.getRenglones()){ //No se pueden multiplicar
            return new Matriz();
        }
        
        //Si se pueden multiplicar
        
        Matriz resultante = new Matriz(getRenglones(), m.getColumnas());
        double suma;
        
        for(int r = 0; r<resultante.getRenglones(); r++){
            for(int c = 0; c<resultante.getColumnas(); c++){
                resultante.setValor(getValor(r,c)+m.getValor(r, c), r, c);
                suma = 0;
                for(int k = 0; k<getColumnas(); k++){
                    suma += getValor(r,k) * m.getValor(k, r);
                }
                
                resultante.setValor(suma, r, c);
            
            }
            
        }
        
        return resultante;
        
    }
    
    public Matriz resta(Matriz m){
       
        
        return suma(m.escalar(-1));
        
    }
    
    
}
