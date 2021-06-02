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
public class Fraccion extends NumeroCompuesto {
    
    public Fraccion(){
        super();
    }
    
    public Fraccion(int num, int den){
        super(num, den);
    }
    
    public int getNumerador(){
        return getValor1();
    }
    public int getDenominador(){
        return getValor2();
    }
    
    public void setNumerador(int num){
        setValor1(num);
    }
    public void setDenominador(int den){
        setValor2(den);
    }
    
    public String desplegar(){
        return "[["+getNumerador()+","+getDenominador()+"]]";
    }

    @Override
    public String mostrar() {
       return getNumerador()+"/"+getDenominador();
    }
}
