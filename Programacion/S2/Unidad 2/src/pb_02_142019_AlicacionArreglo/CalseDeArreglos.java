/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_142019_AlicacionArreglo;

/**
 *
 * @author aa603
 */
public class CalseDeArreglos {
    public static void main (String args[]){
        Arreglo uno = new Arreglo();
        Arreglo dos = new Arreglo(4);
        double [] x = {1,2,3,4,56,7,8,9,56};
        
        Arreglo tres = new Arreglo(x);
        
        System.out.println("uno   ->"+uno);
        System.out.println("dos   ->"+dos);
        System.out.println("tres  ->"+tres);
        
        x[2] = 500;
        
        System.out.println("tres  ->"+tres);
        
        System.out.println(tres.getValor(5));
        System.out.println(tres.getValor(10));
        
        tres.setValor(1000, 4);
        System.out.println("tres  ->"+tres);
        
        System.out.println("Objeto 'Tres' > "+tres+", Mediana = "+tres.mediana()+", Mayor = "+tres.mayor()+", Menor = "+tres.menor());
        
    }
}
