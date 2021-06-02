/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author Ahedeijack
 */
public class TestJavaBeans {
    public static void main(String[] args){
    
        Persona persona = new Persona();
        
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println(persona.toString());
        
    }
    
    
    
}
