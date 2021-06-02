/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_052019_AplicacionVector;

/**
 *
 * @author aa622
 */
public class PB_2019_03_01_aplicacionVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vector v1 = new Vector(70,15);
        
        Vector v2 = new Vector();
        v2.setMagnitud(120);
        v2.setAngulo(65);
        
        Vector R = v1.suma(v2);
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("----------------------------------");
        System.out.println(R);
        
        Vector opuesto = new Vector(R.getMagnitud(),R.getAngulo()+180);
        
        Vector nulo = R.suma(opuesto);
        System.out.println("\n"+opuesto+
                           "\n"+nulo);
        
        Vector v3 = new Vector(20, 65);
        
        Vector v4 = v2.resta(v3);
        
        System.out.println("Vector2 - Vector 3, es igual a "+v4);
        
        Vector v5 = new Vector();
        v5.setXY(-7, -4);
        
        System.out.println(v5);
    }
    
}
