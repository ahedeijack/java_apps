/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_examen_02;

/**
 *
 * @author RicardoMtz
 */
class Contenido {
    //Atributos
    private int barriles;
    private int galones;
    
    public Contenido()
    {
        barriles = 0;
        galones = 0;
    }
    
    public Contenido(int b, int g)
    {
        barriles = b;
        galones = g;
    }
    
    public Contenido(Contenido c)
    {
        barriles = c.barriles;
        galones = c.galones;
    }
    
    //Metodos Get/Set
    public int getBarriles()
    {
        return barriles;
    }
    public int getGalones()
    {
        return galones;
    }
    
    public void setBarriles(int b)
    {
        barriles = b;
    }
    public void setGalones(int g)
    {
        galones = g;
    }
    
    public String toString()
    {
        return barriles + " Barriles: " + galones + " galones";
    }
    
    //Operaciones
    public int galonesTotales()
    {
        return barriles * 42 + galones;
    }
    
    public Contenido suma(Contenido c)
    {
        int totGal = galonesTotales()+c.galonesTotales();
        
        int bar = totGal/42;
        int gal= totGal % 42;
        
        return new Contenido(bar,gal);
    }
    
    public Contenido resta(Contenido c)
    {
        int totGal = galonesTotales()-c.galonesTotales();
        
        int bar = totGal/42;
        int gal= totGal % 42;
        
        return new Contenido(bar,gal);
    }
}
