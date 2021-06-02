/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenregula2;

/**
 *
 * @author Ahedeijak
 */
public class Experimentos {
  private double masa;
  private double aceleracion;  
  
  public Experimentos(){
      masa = 0;
      aceleracion = 0;
  }
  
  public Experimentos(double m, double a){
      masa = m;
      aceleracion = a;
  }
  
  public void setMasa(double m){
      masa = m;
  }
  public double getMasa(){
      return masa;
  }
  
  public void setAceleracion(double a){
      aceleracion = a;
  }
  public double getAceleracion(){
      return aceleracion;
  }
  
  public double fuerza(){
      return (this.aceleracion * this.masa);
  }
}
