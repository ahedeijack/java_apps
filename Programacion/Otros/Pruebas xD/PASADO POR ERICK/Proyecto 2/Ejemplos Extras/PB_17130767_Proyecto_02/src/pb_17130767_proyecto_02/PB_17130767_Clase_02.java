/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130767_proyecto_02;

/**
 *
 * @author Gasparin
 */
class Inventario {

    private String nombre;
    private int galon;
    private int pinta;
    private int onza;
    private double ventas;
    
    
    public Inventario()
    {
        galon = 0;
        pinta = 0;
        onza = 0;
        ventas = 0;
    }
    
    public Inventario(int gal, int pin, int onz)
    {
        galon = gal;
        pinta = pin; 
        onza = onz;
    }
    
    public Inventario(Inventario i)
    {
        nombre = i.nombre;
        galon = i.galon;
        pinta = i.pinta;
        onza = i.onza;
        ventas = i.ventas;
    }
    
  
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    
    public int getGalon()
    {
        return galon;
    }
    
    public void setGalon(int gal)
    {
        galon = gal;
    }
    
    public int getPinta()
    {
        return pinta;
    }
    
    public void setPinta(int pin)
    {
        pinta = pin;
    }
    
    public int getOnza()
    {
        return onza;
    }
    
    public void setOnza(int onz)
    {
        onza = onz;
    }

    public double getVentas() 
    {
        return ventas;
    }

    public void setVentas(double Ven) 
    {
        ventas = Ven;
    }
    
    public int OnzasTotales()
    {
        return galon * 128 + pinta * 16 + onza;
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
