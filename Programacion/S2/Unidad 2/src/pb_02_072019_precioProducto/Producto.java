/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_072019_precioProducto;

/**
 *
 * @author aa603
 */
public class Producto { //Definicion de atributos
    private String descripcion;
    private double costo;
    private double margUt;
    private double porcDesc;
    private double porIva;
    
    
    public Producto(){ //Asignacion de atributos
        descripcion = "No-Id";
        costo = 0;
        margUt = 0;
        porcDesc = 0;
        porIva = 0;
    }
    
    public Producto (String desc, double costo, double marUt, double porcDes, double porcImp){ //Parametros enviados por el Usuario
        descripcion = desc;
        this.costo = costo; // this. es para hacer referencia dentro del objeto al objeto principal
        margUt = marUt;
        porcDesc = porcDes;
        porIva = porcImp;
        
    }
    //Get
    public String getDescpcion(){
     return descripcion;
    }
    public double getCosto(){
        return costo;
    }
    public double getMargUt(){
        return margUt;
    }
    public double getPorDesc(){
        return porcDesc;
    }
    public double getPorImp(){
        return porIva;
    }
    //Set
    public void setCosto(double costo){
        this.costo = costo;
    }
    public void setMargUt(double marUt){
        this.margUt = marUt;
    }
    public void setPorDesc(double porcDes){
        this.porcDesc = porcDes;
    }
    public void setPorImp(double porcImp){
        this.porIva = porcImp;
    }
    public String toString(){
        return descripcion + "Costo"+costo+" "+
                "MargUt" + margUt +" "+
                "PorcDesc"+porcDesc+" "+
                "PorcImp"+porIva+" ";
    }
    
    public double subTotal1(){
        return costo + marUt();
    }
    public double importeDescc(){
        return subTotal1()*porcDesc / 100;
    }
    public double subTotal2(){
        return subTotal1() - importeDescc();
    }
    public double marUt(){
        return costo * margUt / 100;
    }
    
    public double Precio(){
        double importeMargen = costo * margUt / 100;
        double subT1 = costo + importeMargen;
        double importeDescuento = subT1 * porcDesc / 100;
        double subT2 = subT1 = importeDescuento;
        double importeImpuesto = subT2 * porIva / 100;
        double precioFinal = subT2 + importeImpuesto;
        
        return precioFinal;
    }
}
