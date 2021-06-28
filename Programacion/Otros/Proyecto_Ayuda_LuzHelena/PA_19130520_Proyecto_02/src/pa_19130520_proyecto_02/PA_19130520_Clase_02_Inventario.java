/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130520_proyecto_02;

/**
 *
 * @author anton
 */
public class PA_19130520_Clase_02_Inventario {
    private String nombre;
    private PA_19130520_Clase_02_Cemento invInicial;
    private PA_19130520_Clase_02_Cemento invFinal;
    
    public PA_19130520_Clase_02_Inventario(){
        nombre="No-Id";
        invInicial=new PA_19130520_Clase_02_Cemento();
        invFinal =new PA_19130520_Clase_02_Cemento();
    }

    public PA_19130520_Clase_02_Inventario(String nombre, PA_19130520_Clase_02_Cemento invInicial, PA_19130520_Clase_02_Cemento invFinal) {
        this.nombre = nombre;
        this.invInicial = invInicial;
        this.invFinal = invFinal;
        
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PA_19130520_Clase_02_Cemento getEntrada() {
        return invInicial;
    }

    public void setEntrada(PA_19130520_Clase_02_Cemento invInicial) {
        this.invInicial = invInicial;
    }

    public PA_19130520_Clase_02_Cemento getSalida() {
        return invFinal;
    }

    public void setSalida(PA_19130520_Clase_02_Cemento invFinal) {
        this.invFinal = invFinal;
    }

    @Override
    public String toString() {
        return nombre+ " inventario inicial=" + invInicial + ", inventario final=" + invFinal;
    }
    
    //metodo de calculo o proceso
    public PA_19130520_Clase_02_Cemento tiempoTrabajado()
    {
        return invFinal.resta(invInicial);
    }

   
    
}
