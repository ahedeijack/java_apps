/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appu2_recursividad;

/**
 *
 * @author ahdeijack
 */
public class MatRec {
    public static int Factorial(int n){
        int f = 1;
        if(n == 0 || n == 1)
            return f;
        else 
            f = n*Factorial (n - 1);
        return f;
    }
    
    public static double Factorial(double n){
        double f = 1;
        if(n == 0 || n == 1)
            return f;
        else 
            f = n*Factorial (n - 1);
        return f;
    }
    
    public static int Sumatoria(int n){
       /* int f = 1;
        if(n == 1)
            return f;
        else 
            f = n+Sumatoria (n - 1);
        return f;
*/
       
        if(n == 1)
            return 1;
        else 
            return  n+Sumatoria (n - 1);
      
       
    }
    
    public static double Sumatoria(double n){
        double f = 1;
        if(n == 1)
            return f;
        else 
            f = n+Sumatoria (n - 1);
        return f;
    }
}
