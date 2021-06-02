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
public class Fraccion extends NumeroCompuesto implements IOperacionesBasicas{
    
    public Fraccion()
    {
        super();
    }
    public Fraccion(int num, int den)
    {
        super(num,den);
    }
    
    //metodos get/set;
    public int getNum()
    {
        return getValor1();
    }
    public int getDen()
    {
        return getValor2();
    }
    
    public void setNum(int num)
    {
        setValor1(num);
    }
    public void setDen(int den)
    {
        setValor2(den);
    }
    //
    public String desplegar()
    {
        return "[["+getNum()+","+getDen()+"]]";
    }
    @Override
    public String mostrar() {
        return getNum()+"/"+getDen();
    }

    @Override
    public String suma(Object o) {
        Fraccion f = (Fraccion)o;
        
        return new Fraccion(getNum() * f.getDen() + f.getNum() * getDen(),getDen()*f.getDen()).mostrar();
    }

    @Override
    public String resta(Object o) {
        Fraccion f = (Fraccion)o;
        
        return new Fraccion(getNum() * f.getDen() - f.getNum() * getDen(),getDen()*f.getDen()).mostrar();

    }
}
