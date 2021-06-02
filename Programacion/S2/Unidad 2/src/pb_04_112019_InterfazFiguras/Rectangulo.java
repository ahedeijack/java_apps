/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_04_112019_InterfazFiguras;

/**
 *
 * @author aa624
 */
public class Rectangulo implements IFiguraPlana{
    private double base;
    private double altura;

    public Rectangulo() {
        base = 0; altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double area() {
       return base*altura;
    }

    @Override
    public double perimetro() {
       return base+altura*2;
    }
    
    
}
