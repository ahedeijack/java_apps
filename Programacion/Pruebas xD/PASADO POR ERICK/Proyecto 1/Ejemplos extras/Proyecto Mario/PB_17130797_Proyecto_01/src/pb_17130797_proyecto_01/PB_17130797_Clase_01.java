/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130797_proyecto_01;

/**
 *
 * @author Luis Mario
 */
class Rectangulo
{
    //Atributos
    String Nombre;
    private double Base;
    private double Perimetro;
    
//Constructores
public Rectangulo()
{
    
Nombre = "No-Id";
Base =0;
Perimetro = 0;


}
public Rectangulo(String Nom,double Base,double Peri)
{
    Nombre = Nom;
    Perimetro = Peri;
    this.Base = Base;
}

 //Mtodos Get/Set
public String getNombre()
{
    return Nombre;
}
public double getPerimetro()
{
    return Perimetro;
}
public double getBase()
{
    return Base;
}
public void setNombre(String Nomb)
{
    Nombre = Nomb;
}
public void setPerimetro(double Perime)
{
    Perimetro = Perime;
}
public void setBase(double base)
{
    Base = base;
}

    //Calculos
   public double BaseTotal()
   {
       return Base * 2;
   }
   public double AlturaTotal()
   {
       return Perimetro - BaseTotal();
   }
   public double Altura()
   {
       return AlturaTotal() / 2;
   }
   public double AreaTotal()
   {
       return Base * Altura();
   }
    
}


