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
public class Gerente extends Directivo{
    private String posgrado;
    
    public Gerente(){
        super();
        posgrado = "noID";
    }
    public Gerente(String nombre, String departamento, String posgrado){
        super(nombre, departamento);
        this.posgrado = posgrado;
    }
    
    public void setPosgrado(String posgrado){
        this.posgrado = posgrado;
    }
    public String getPosgrado(){
        return this.posgrado;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar() + " Posgrado: "+this.posgrado;
    }
    
    
}
