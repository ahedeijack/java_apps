/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenunidad2;

/**
 *
 * @author ahdeijack
 */
public class ExamenUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    for (int i = 6; i >= 0; i--){
        for (int ii = i; ii >= 0; ii--){
            System.out.println(Exa2(i, ii) + " ");
//            System.out.println(i+","+ii);
        }
        System.out.println();
    }
    }
    public static int Exa2(int n, int r){
        if (n == 0 || n == 1 || r == 0 || n == r){
        return 1;
        } else {
            return Exa2(n - 1, r) + Exa2(n - 1, r - 1);
        }
    }
}

    

