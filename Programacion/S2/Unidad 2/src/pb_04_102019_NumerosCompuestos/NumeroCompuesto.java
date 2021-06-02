/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_04_102019_NumerosCompuestos;

/**
 *
 * @author aa624
 */
public abstract class NumeroCompuesto {
    private int valor1;
    private int valor2;
    
    public NumeroCompuesto(){
        valor1 = 0;
        valor2 = 0;
    }
    
    public NumeroCompuesto(int v1, int v2){
        valor1 = v1;
        valor2 = v2;
    }
    
    protected void setValor1(int v1){
        valor1 = v1;
    }
    
    protected void setValor2(int v2){
        valor2 = v2;
    }
    
    public int getValor1(){
        return valor1;
    }
    
    public int getValor2(){
        return valor2;
    }
    
    public String desplegar(){
        return "{"+valor1+","+valor2+"}";
    }
    
    public abstract String mostrar();
}
