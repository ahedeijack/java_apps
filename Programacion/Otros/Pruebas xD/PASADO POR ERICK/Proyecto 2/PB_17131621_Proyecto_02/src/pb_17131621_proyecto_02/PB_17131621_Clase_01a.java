/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_02;

/**
 *
 * @author RicardoMtz
 */
class Contenido {
    //Atributos
    private int galones;
    private int pintas;
    private int onzas;
    
    public Contenido()
    {
        galones = 0;
        pintas = 0;
        onzas = 0;
    }
    
    public Contenido(int g, int p, int o)
    {
        galones = g;
        pintas = p;
        onzas = o;
    }
    
    public Contenido(Contenido c)
    {
        galones = c.galones;
        pintas = c.pintas;
        onzas = c.onzas;
    }
    
    //Get / Set
    public int getGalones()
    {
        return galones;
    }
    public int getPintas()
    {
        return pintas;
    }
    public int getOnzas()
    {
        return onzas;
    }
    
    public void setGalones(int g)
    {
        galones = g;
    }
    public void setPintas(int p)
    {
        pintas = p;
    }
    public void setOnzas(int o)
    {
        onzas = o;
    }
    
    public String toString()
    {
        return galones+" Galones: "+pintas+" Pintas: "+onzas+" Onzas";
    }
    
    //Operaciones
    public int onzasTotales()
    {
        return galones * 128 + pintas * 16 + onzas;
    }
    
    public double Dinero()
    {
        return onzasTotales() * 125.56;
    }
    
    public Contenido suma(Contenido c)
    {
        int totOnz = onzasTotales() + c.onzasTotales();
        
        int gal = totOnz / 128; //div
        int restoOnz = totOnz % 128; //mod
        int pin = restoOnz / 16; //div
        int onz = restoOnz % 16; //mod
        
        return new Contenido(gal,pin,onz);
    }
    
    public Contenido resta(Contenido c)
    {
        int totOnz = onzasTotales() - c.onzasTotales();
        
        int gal = totOnz / 128; //div
        int restoOnz = totOnz % 128; //mod
        int pin = restoOnz / 16; //div
        int onz = restoOnz % 16; //mod
        
        return new Contenido(gal, pin, onz);
    }
}
