/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Scanner;
/**
 *
 * @author aa501
 */
public class FL_M3_21_11_2018_MayorMenorMediana {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int n, i, posicionMayor, posicionMenor;
        double mayor, menor, rango, mediana;
        
        System.out.println("Ingresa cuantos número seran: ");
        n = read.nextInt();
        
        double [] x = new double[n];
        posicionMayor= 0 ;
        mayor = 0;
        for(i = 0; i<x.length; i++){
            if(x[i]>mayor){
                mayor = x[i];
                posicionMayor= i;
            }
            
        }
    }
}
