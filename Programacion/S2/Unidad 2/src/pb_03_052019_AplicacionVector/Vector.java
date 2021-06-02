/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_052019_AplicacionVector;

/**
 *
 * @author aa622
 */
public class Vector {
    private double magnitud;
    private double angulo; // en grados
    
    public Vector()
    {
        magnitud = 0;
        angulo = 0;
    }
    
    public Vector(double mag, double ang){
        magnitud = mag;
        angulo = ang;
    }
    
    public void setMagnitud(double mag){
        magnitud = mag;
    }
    
    public void setAngulo(double ang){
        angulo = ang;
    }
    
    public void setRadianes(double rad){
        angulo = rad * 180 / Math.PI;
    }
    
    public void setXY(double x, double y){
        magnitud = Math.sqrt((x*x) + (y*y));
        setRadianes( Math.atan2(y, x) );
    }
    public double getMagnitud()
    {
        return magnitud;
    }
    
    public double getAngulo()
    {
        return angulo;
    }
    
    public double getRadianes(){
        return angulo * Math.PI / 180; // se regresa en radianes.
    }
    
    public double getX(){
        return magnitud * Math.cos(getRadianes()); 
    }
    
    public double getY() {
        return magnitud * Math.sin(getRadianes());
    }
    //
    
    public String toString()
    {
        return "Mag:"+magnitud+" Ang:"+angulo;
    }
    public Vector resta(Vector v){
        double sumaX = getX() - v.getX();
        double sumaY = getY() - v.getY();
            Vector resultante = new Vector();
        resultante.setXY(sumaX, sumaY);
        return resultante;
    }
    
    public Vector suma(Vector v)
    {
        // Este metodo involucra 3 objetos de la clase Vector():
        // 1.- El primer objeto es el que manda a llamar al metodo (this),
        // 2.- El segundo objeto es el que llega como parametro(v) y se va a sumar con el primero
        // 3.- El tercer objeto es el resultado de la suma(resultante) de los dos primeros vectores, y
        // es el que se retorna.

        double sumaX = getX() + v.getX();
        double sumaY = getY() + v.getY();
            Vector resultante = new Vector();
        resultante.setXY(sumaX, sumaY);
        return resultante;

    }
    
}
