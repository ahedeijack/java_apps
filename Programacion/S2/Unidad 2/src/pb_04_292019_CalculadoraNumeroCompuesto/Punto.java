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
public class Punto extends NumeroCompuesto implements IOperacionesBasicas{
    
    public Punto()
    {
        super();
    }
    public Punto(int x, int y)
    {
        super(x,y);
    }
    
    public int getX()
    {
        return getValor1();
    }
    public int getY()
    {
        return getValor2(); //lo hereda de la super clase
    }
    public void setX(int x)
    {
        setValor1(x);
    }
    public void setY(int y)
    {
        setValor2(y);
    }

    @Override
    public String mostrar() {
        return "("+getX()+","+getY()+")";
    }
    //la tomo de la interface
    @Override
    public String suma(Object o) {
        Punto p =(Punto)o; //se pasa una referencia objeto con la clase Punto
        
        return new Punto(getX()+p.getX(),getY()+p.getY()).mostrar(); //creando un nuevo punto con conversion a string
    }

    @Override
    public String resta(Object o) {
        Punto p =(Punto)o;
        return new Punto(getX()-p.getX(),getY()-p.getY()).mostrar();
    }
}
