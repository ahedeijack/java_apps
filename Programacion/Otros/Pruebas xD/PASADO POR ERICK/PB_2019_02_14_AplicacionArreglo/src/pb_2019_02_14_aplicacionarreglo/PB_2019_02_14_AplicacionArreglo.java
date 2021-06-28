/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_02_14_aplicacionarreglo;

/**
 *
 * @author Daniel Garcia
 */
public class PB_2019_02_14_AplicacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arreglo uno = new Arreglo();
        Arreglo dos = new Arreglo(4);
        
        double [] x = (5,2,1,8,3,7,0);
        
        Arreglo tres = new Arreglo(x);
        
        System.out.println("uno -> "+uno);
        System.out.println("dos -> "+dos);
        System.out.println("tres -> "+tres);
        
        x[2] = 500;
        System.out.println("tres ->"+tres);
        System.out.println(tres.getValor(5));
        System.out.println(tres.getValor(10));
        
//        tres.setValor(1000, 4);
        System.out.println("tres -> "+tres" Mediana = "+tres.mediana());
        tres.ordenar();
        System.out.println("tres -> "+tres);
    }
}