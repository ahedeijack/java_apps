/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_01;

/**
 *
 * @author Ahedeijak
 */
public class Corriente {
    
    private String miCircuito;
    private double miVoltaje;
    private double miResistencia;
    private double miResMultiplicadora;
   
    public Corriente(){
        
    miCircuito = "no id.";
    miVoltaje = 0;
    miResistencia = 0;
    miResMultiplicadora = 0;
   
    }
    
    public Corriente(String nomCircuito, double voltaje, double resistencia, double resMulti){
    
    miCircuito = nomCircuito;
    miVoltaje = voltaje;
    miResistencia = resistencia;
    miResMultiplicadora = resMulti;
        
    }

        //Metodos Get
public void setNombre(String nombre ){
miCircuito = nombre;    
}
public void setVoltaje(double voltaje){
miVoltaje = voltaje;
}
public void setResistencia (double resistencia){
miResistencia = resistencia;
}
public void setResMultiplicadora (double resMulti){
miResMultiplicadora = resMulti;
}

        //Metodos Get
    public String getNombre(){
     return  miCircuito;
 }
    public double getVoltaje (){
 return miVoltaje;
 }
     public double getResistencia(){
 return miResistencia;
 }
     public double getResMultiplicadora(){
 return miResMultiplicadora;
 }
     
     public String toString(){
     return miCircuito + 
             " Voltaje: "+miVoltaje +
             " Resistencia: "+miResistencia+
             " Resistencia Multiplicadora: "+miResMultiplicadora; 
     }
     
     public double resGalvanometro(){
    double miResistenciaGal = 0;
    miResistenciaGal = (miVoltaje - miResistencia) / miResMultiplicadora;
         return miResistenciaGal;
         
             }
    
}
