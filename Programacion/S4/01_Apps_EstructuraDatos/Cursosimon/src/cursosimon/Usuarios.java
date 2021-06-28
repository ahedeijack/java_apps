/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosimon;


/**
 *
 * @author Ahedeijak
 */


public class Usuarios {
    //Crear el tipo de variable, en este caso sera el 'static' si es que genera un problema.
private static Persona persona;
private static Direccion direccion;
private static Usuario usuario;

//Se crea el constructor.
public Usuarios(){}
//Metodo Main crea una copia de la clase instanciada 
public static void main (String[] args){
  
 //Declaramos la variable (persona, direccion...)
 //Copiamos la clase (new Persona, New Direccion...)
 
persona = new Persona();
direccion = new Direccion();
usuario = new Usuario();

//Generamos la variable más el atributo de la clase que tenemos en esta misma.
direccion.setCalle("Fco Villa");
direccion.setCiudad("Gomez");
direccion.setCodigo_postal("7500");
direccion.setNumero("b512");

persona.setNombre("Juan alberto");
persona.setApellido("Ruiz Lopez");
persona.setEdad(20);
persona.setDireccion(direccion); //Hacer siempre una relación en las clases


usuario.setContraseña("Pedrito123");
usuario.setNombre_usuario("Perez Prado");
usuario.setPersona(persona); //Hacer relacion entre clases 
 
System.out.println(usuario.getNombre_usuario());
System.out.println(usuario.getPersona().getNombre());
System.out.println(persona.getNombre());

}
    
}
