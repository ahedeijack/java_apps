/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_192019_Nominas;

/**
 *
 * @author aa633
 */
public class Main {
    public static void main (String args[]){
      Empleado Juan = new Empleado("Juan Perez", 14,250,5,8);
      
      System.out.println(Juan);
      
      System.out.println("El sueldo de "+Juan.getNombre()+ " es de:  "+Juan.sueldo());
      
      Empleado Maria = new Empleado();
      
      Maria.setNombre("Maria Lopez");
      Maria.setDiasTrabajados(30);
      Maria.setHorasExtra(1);
      Maria.setSueldoDiario(300);
      Maria.setPorcentajeImp(20);
      
      System.out.println(Maria);
      System.out.println("El sueldo de "+Maria.getNombre()+" es de "+Maria.sueldo());
    }
}
