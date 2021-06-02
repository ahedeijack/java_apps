/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130819_proyecto_02;

/**
 *
 * @author CaRlA
 */
class Inventario {
    //Atributos
    private String Nombre;
    private int Galon;
    private int Pinta;
    private int Onza;
    private double Ventas;
    
    //Constructores
    public Inventario()
    {
        Galon = Pinta = Onza = 0;
        Ventas = 0;
    }
    
    public Inventario(int gal, int pin, int onz)
    {
        Galon = gal;
        Pinta = pin;
        Onza = onz;
    }
    
    public Inventario(Inventario i)
    {
        Nombre = i.Nombre;
        Galon = i.Galon;
        Pinta = i.Pinta;
        Onza = i.Onza;
        Ventas = i.Ventas;
    }
    
    //Get/Set
    public String getNombre()
    {
        return Nombre;
    }
    
    public void setNombre(String nom)
    {
        Nombre = nom;
    }
    
    public int getGalon()
    {
        return Galon;
    }
    
    public void setGalon(int gal)
    {
        Galon = gal;
    }
    
    public int getPinta()
    {
        return Pinta;
    }
    
    public void setPinta(int pin)
    {
        Pinta = pin;
    }
    
    public int getOnza()
    {
        return Onza;
    }
    
    public void setOnza(int onz)
    {
        Onza = onz;
    }

    public double getVentas() 
    {
        return Ventas;
    }

    public void setVentas(double Ven) 
    {
        Ventas = Ven;
    }
    
    //Método de cálculo
    public int OnzasTotales()
    {
        return Galon * 128 + Pinta * 16 + Onza;
    }
    
    public Inventario Venta(Inventario i)
    {
         int totalParcial = OnzasTotales() - i.OnzasTotales();
         int Galones = totalParcial / 128;
         int GalonesRestantes = totalParcial % 128;
         int Pintas = GalonesRestantes / 16;
         int Onzas = GalonesRestantes % 16;
         
         if(Galones<0)
             Galones *= -1;
         
         if(Pintas<0)
            Pintas *= -1;
         
         if(Onzas<0)
             Onzas *= -1;
         
         return new Inventario(Galones, Pintas, Onzas);
    }
}
