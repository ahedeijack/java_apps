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
class Perfume {
    //Atributos
    private String nombre;
    private Contenido contenidoInicial;
    private Contenido contenidoTerminal;
    
    public Perfume()
    {
        nombre = "No-ID";
        contenidoInicial = new Contenido();
        contenidoTerminal = new Contenido();
    }
    
    public Perfume(String nom, Contenido ini, Contenido ter)
    {
        nombre = nom;
        contenidoInicial = new Contenido(ini); //Constructor De Copia
        contenidoTerminal = new Contenido(ter);
    }
    
    //Get/Set
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    public void setContenidoInicial(Contenido ini)
    {
        contenidoInicial = ini;
    }
    public void setContenidoTerminal(Contenido ter)
    {
        contenidoTerminal = ter;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public Contenido getContenidoInicial()
    {
        return new Contenido(contenidoInicial);
    }
    public Contenido getContenidoTerminal()
    {
        return new Contenido(contenidoTerminal);
    }
    
    //Metodo
    public Contenido contenidoVendido()
    {
        return contenidoInicial.resta(contenidoTerminal);
    }
    public double Dinero()
    {
        return contenidoVendido().onzasTotales() * 125.56;
    }
}
