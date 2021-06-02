/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130852_proyecto_01;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PB_17130852_Proyecto_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo uno = new Rectangulo("Hoja",21,588);
        
        System.out.println(uno);
        System.out.println("Altura: "+uno.altura());
        System.out.println("Perimetro: "+uno.perimetro());
        
        //Para corroborar las operaciones
        
        Rectangulo dos = new Rectangulo("Hoja",22,589);
        
        System.out.println(dos);
        System.out.println("Altura: "+dos.altura());
        System.out.println("Perimetro: "+dos.perimetro());
        
        
        
    }
    
}
