/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_combinaciones_rec;

/**
 *
 * @author ahdeijack
 */
public class App_Combinaciones_Rec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num = Combinaciones(6,2);
        System.out.println(num);
    }
    
    public static int Combinaciones(int n, int r){
        // Formula de Stifel.
        // Tarea: Acabar C(4,2)
        int res = 0; //Casos especiales
        if (n<r||r==0||n==r) {
            return 1;
        } else {
            res = Combinaciones(n-1, r)+Combinaciones(n-1, r-1);
        }
        return res;
        
    }
    
    public static int CombinacionesFact(int n){
        if(n == 1 || n == 0|| n == n){
            return 1;
        }
        return CombinacionesFact(n) / (CombinacionesFact(n)*CombinacionesFact(n-1));
    }
    
}
