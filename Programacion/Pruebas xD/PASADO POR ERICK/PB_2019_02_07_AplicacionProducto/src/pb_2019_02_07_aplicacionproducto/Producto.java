/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_07_aplicacionproducto;

/**
 *
 * @author aa618
 */
public class Producto {
    private String descripcion;
    private double costo;
    private double margenUtilidad;
    private double porcDescuento;
    private double porcImpuesto;
    
    public Producto()
    {
        descripcion = "No ID";
        costo = 0;
        margenUtilidad = 0;
        porcDescuento = 0;
        porcImpuesto = 0;
    }
    
    public Producto(String descr, double costo, double margUt, double porcDesc, double porcImp)
    {
        descripcion = descr;
        this.costo = costo; // this es el objeto actual
        margenUtilidad = margUt;
        porcDescuento = porcDesc;
        porcImpuesto = porcImp;
    }
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public double getCosto()
    {
        return costo;
    }
    
    public double getMargnUtilidad()
    {
        return margenUtilidad;
    }
    
    public double getPorcentajeDescuento()
    {
        return porcDescuento;
    }
    
    public double getPorcentajeImpuesto()
    {
        return porcImpuesto;
    }
    
    public void setDescripcion(String descr)
    {
        descripcion = descr;
    }
    
    public void setCosto(double costo)
    {
        this.costo = costo;
    }
    
    public void setMargenUtilidad(double margUt)
    {
        margenUtilidad = margUt;
    }
    
    public void setPorcentajeDescuento(double porcDesc)
    {
        porcDescuento = porcDesc;
    }
    
    public void setPorcentajeImpuesto(double porcImp)
    {
        porcImpuesto = porcImp;
    }
    
    @Override
    public String toString()
    {
        return descripcion + "  Costo:$" + costo + 
                             "  MargUt:" + margenUtilidad + "%" + 
                             "  PorcDesc:" + porcDescuento + "%" +
                             "  PorcImp:" + porcImpuesto + "%";
    }
    
    public double importeMargenUtilidad()
    {
        return costo * margenUtilidad / 100;
    }
    
    public double subTotal1()
    {
        return costo + importeMargenUtilidad();
    }
    
    public double importeDescuento()
    {
        return subTotal1() * porcDescuento / 100;
    }
    
    public double subTotal2()
    {
        return subTotal1() - importeDescuento();
    }
    
    public double importeImpuesto()
    {
        return subTotal2() * porcImpuesto / 100;
    }
    
    public double precio()
    {
        return subTotal2() + importeImpuesto();
    }
}
