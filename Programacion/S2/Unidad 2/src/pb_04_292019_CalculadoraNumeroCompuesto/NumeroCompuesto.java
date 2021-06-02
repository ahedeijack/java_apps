/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_04_292019_CalculadoraNumeroCompuesto;

/**
 *
 * @author aa630
 */
public abstract class NumeroCompuesto {
    //atributos:
    private int valor1;
    private int valor2;
    //constructor:
    protected NumeroCompuesto()//porque solo se utilizan para las clases derivadas
    {
        valor1 =0;
        valor2=0;
    }
    protected NumeroCompuesto(int val1, int val2)
    {
        valor1 = val1;
        valor2 = val2;
    }
    //metodos get y set:
    protected int getValor1()
    {
        return valor1;
    }
    protected int getValor2()
    {
        return valor2;
    }
    protected void setValor1(int val1)
    {
        valor1 = val1;
    }
    protected void setValor2(int val2)
    {
        valor2 = val2;
    }
    //metodo de proceso 
    public String desplegar()
    {
        return "{"+valor1+","+valor2+"}";
    }
    
    public abstract String mostrar(); 
   
}
