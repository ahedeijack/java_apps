/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_01;

/**
 *
 * @author RicardoMtz
 */
class Rectangulo {
    
    //Atributos
    private String nombre;
    private double base;
    private double perimetro;
    
    //Metodos Constructores
    public Rectangulo()
    {
        nombre = "No-ID";
        base = 0;
        perimetro = 0;
    }
    
    public Rectangulo(String nom, double Base, double Perimetro)
    {
        nombre = nom;
        base = Base;
        perimetro = Perimetro;
    }
    
    //Metodos Get/Set
    public String getNombre()
    {
        return nombre;
    }
    public double getBase()
    {
        return base;
    }
    public double getPerimetro()
    {
        return perimetro;
    }
    
    
    public void setNombre(String nomb)
    {
        nombre = nomb;
    }
    public void setBase(double bas)
    {
        base = bas;
    }
    public void setPerimetro(double perim)
    {
        perimetro = perim;
    }
    
    //Metodos De Calculo O Proceso
    public double TotalBase()
    {
        return base * 2;
    }
    public double TotalAltura()
    {
        return perimetro - TotalBase();
    }
    public double Altura()
    {
        return TotalAltura() / 2;
    }
    public double Area()
    {
        return base * Altura();
    }
}
