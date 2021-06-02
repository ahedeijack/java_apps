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
public class PB_2019_02_07_AplicacionProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto laptop = new Producto("Dell Inspiron", 7000, 15, 5, 16);
        
        System.out.println(laptop);
        System.out.println("Precio de "+laptop.getDescripcion() + ": $" + laptop.precio());
    }
    
}
