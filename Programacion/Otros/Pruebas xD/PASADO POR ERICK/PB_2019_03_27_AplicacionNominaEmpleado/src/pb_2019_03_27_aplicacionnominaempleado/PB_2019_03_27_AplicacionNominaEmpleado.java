/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleado;

/**
 *
 * @author Sebas
 */
public class PB_2019_03_27_AplicacionNominaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado pedro = new Empleado(1, "Pedro Arias");
        
        Administrativo laura = new Administrativo();
        laura.setNumero(2);
        laura.setNombre("Laura Gomez");
        laura.setDiasTrabajados(15);
        laura.setSueldoDiario(400);
        
        Ejecutivo luis = new Ejecutivo(3, "Luis Perez", 30, 600, 5000);
        
        System.out.println(pedro);
        System.out.println(laura);
        System.out.println(luis);
        
        System.out.println();
        System.out.println("El sueldo de "+laura.getNombre()+" es $"+laura.sueldo());
        System.out.println("El sueldo de "+luis.getNombre()+" es $"+luis.sueldo());
    }
    
}
