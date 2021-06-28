package aplicación_01_numero_euler;

/**
 *
 * @author ahdeijack
 */
public class Matematicas {
    
    public static int Factorial(int n){
        
         int fac = 1;
         
         if(n == 1 || n == 0){
             return n;
         }
         int i = n;
                                    while(i > 1){
                                    fac *= i;
                                    i--;
        }
        return fac;
    }
    
    public static double Euler(int n){
        
        double eu = 0, suma = 0;
        for (int i = 1; i < n; i++) {
            eu = 1 / (double) Factorial(i);
            suma += eu;
        }
        return suma+1;
        
    }
    
}
