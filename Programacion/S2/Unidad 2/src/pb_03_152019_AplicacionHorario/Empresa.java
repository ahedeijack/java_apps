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
public class Empresa {
    
    private Empleado[] miNegocio;
    
    public Empresa(int n){
        miNegocio = new Empleado[n];
        
        for(int i= 0; i<miNegocio.length; i++){
            miNegocio[i] = new Empleado();
        }
        
        
    }
    
    public void setEmpleado(Empleado e, int posicion){
        miNegocio[posicion] = e;
    }
    
    public Empleado getEmpleado(int posicion){
        return miNegocio[posicion];
    }
    
    public void ordenar(){
        for(int i= 0; i<miNegocio.length; i++){
            for(int j = i+1;j<miNegocio.length; j++){
                
                if(miNegocio[i].tiempoTrabajado().segTotales() >
                   miNegocio[j].tiempoTrabajado().segTotales()){
                   Empleado aux = miNegocio[i];
                   miNegocio[i] = miNegocio[j];
                   miNegocio[j] = aux;
                   
                    
                }
            }
        }
    }
    
}
