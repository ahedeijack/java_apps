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
public interface IFiguraPlana {
    public static final double PII = 3.1415926; //Un atributo, es automaticamente public, static y final (Constante)
    
    
    public abstract double area(); //Los metodos de una interface, son automaticamente "public" y "abstract"
    double perimetro();            //Aunque nos se escriban esos modificadores
}
