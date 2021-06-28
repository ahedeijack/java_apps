/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_U3.E2;

/**
 *
 * @author Ahedeijak
 */
public class Directivo extends Empleado{
    private String departamento;
    
    public Directivo(){
        super();
        departamento = "NoID";
    }
    public Directivo(String nombre, String departamento){
        super(nombre);
        this.departamento = departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar() + " Dep: "+this.departamento; 
    }
    
    
    
    
}
