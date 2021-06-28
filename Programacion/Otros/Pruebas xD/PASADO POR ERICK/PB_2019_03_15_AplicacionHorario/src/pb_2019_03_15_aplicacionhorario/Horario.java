/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_15_aplicacionhorario;

/**
 *
 * @author aa625
 */
public class Horario {
    //Atributos
    private int horas;
    private int minutos;
    private int segundos;
    
    //Constructores
    public Horario()
    {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
    
    public Horario(int h, int m, int s)
    {
        horas = h;
        minutos = m;
        segundos = s;
    }
    
    public Horario(Horario h)
    {
        horas = h.horas;
        minutos = h.minutos;
        segundos = h.segundos;
    }
    
    //Métodos get/set
    public int getHoras()
    {
        return horas;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
    
    public int getSegundos()
    {
        return segundos;
    }
    
    public void setHoras(int h)
    {
        horas = h;
    }
    
    public void setMinutos(int m)
    {
        minutos = m;
    }
    
    public void setSegundos(int s)
    {
        segundos = s;
    }
    
    public String toString()
    {
        return horas+"h: "+minutos+"m: "+segundos+"s";
    }
    
    //Métodos de cálculo
    public int segundosTotales()
    {
        return horas * 3600 + minutos * 60 + segundos;
    }
    
    public Horario resta(Horario h)
    {
        int segTot = segundosTotales() - h.segundosTotales();
        
        int hor = segTot / 3600; //Div
        int restoSeg = segTot % 3600; //Mod
        int min = restoSeg / 60; //Div
        int seg = restoSeg % 60; //Mod
        
        return new Horario(hor,min,seg)
    }
}