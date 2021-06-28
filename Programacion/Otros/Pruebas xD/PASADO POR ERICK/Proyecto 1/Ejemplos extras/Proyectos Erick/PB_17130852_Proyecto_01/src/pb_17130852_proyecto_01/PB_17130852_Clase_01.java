/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130852_proyecto_01;

/**
 * 
 * @author NICODANA
 */
 class Rectangulo {
     
   // atributos
   private String nombre;
   private double base;
   private double area; 
   
   //constructores
   
   public Rectangulo()
   {
       nombre = "No-ID";
       base = 0;
       area = 0;
   }
   
   public Rectangulo(String nom, double ba, double ar)
   {
       nombre = nom;
       base = ba;
       area = ar;
   }
   
   public Rectangulo(String nom, double ba, double ar,double alt,double per)
   {
       nombre = nom;
       base = ba;
       area = ar;
   }
   
   //Metodos Get / Set
   public String getNombre()
    {
        return nombre;
    }
   
   public double getBase()
   {
       return base;
   }
    
   public double getArea()
   {
       return area;
   }
      
   
   public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
   
   public void setBase(double bas)
    {
        base = bas;
    }
   
   public void setArea(double are)
   {
       area =  are;
   }
   
    //Metodos de calculo
    
    public double altura()
    {
        return area / base;
    }
    
    public double perimetro()
    {
        return (base + altura()) * 2;
    }

}
