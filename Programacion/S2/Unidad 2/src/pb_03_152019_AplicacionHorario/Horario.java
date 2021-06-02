/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_152019_AplicacionHorario;

/**
 *
 * @author aa603
 */
public class Horario {
    
    
    //Atributos
    private int mHoras;
    private int mMinutos;
    private int mSegundos;
    
    
    //Constructores
    public Horario(){
        mHoras = 0;
        mMinutos = 0;
        mSegundos = 0;
    }
    
    public Horario(int horas, int minutos, int segundos){
       mHoras = horas;
       mMinutos = minutos;
       mSegundos = segundos;
    }
    
    public Horario(Horario h){
        mHoras = h.mHoras;
        mMinutos = h.mMinutos;
        mSegundos = h.mSegundos;
    }
    
    //Métodos Get Set
    public int getHoras(){
        return mHoras;
    }
    
    public int getSegundos(){
        return mSegundos;
    }
    
    public int getMinutos(){
        return mMinutos;
    }
    
    public void setHoras(int horas){
        mHoras = horas;
    }
    
    public void setMinutos(int minutos){
        mMinutos = minutos;
    }
    
    public void setSegundos(int segundos){
        mSegundos = segundos;
    }
    
    public String toString(){
        return mHoras +
               "h: "+mMinutos +
               "m: "+mSegundos +
               "s. ";
    }
    
    public int segTotales(){ //Para convertir los objetos a segundos
        return (mHoras * 3600) + (mMinutos * 60) + mSegundos;
    }
    //Métodos de calculo
    public Horario suma(Horario h){
      int segundosTotales = segTotales() + h.segTotales();
      
      int divHor = segundosTotales / 3600; //DIV
      int modHor = segundosTotales % 3600; //MOD
      
      int min = modHor / 60;
      int seg = modHor % 60;
      
      return new Horario(divHor, min, seg);
    }
    
    public Horario resta(Horario h){
      int segundosTotales = segTotales() - h.segTotales();
      
      int divHor = segundosTotales / 3600; //DIV
      int modHor = segundosTotales % 3600; //MOD
      
      int min = modHor / 60;
      int seg = modHor % 60;
      
      return new Horario(divHor, min, seg);
    }
    
    
}
