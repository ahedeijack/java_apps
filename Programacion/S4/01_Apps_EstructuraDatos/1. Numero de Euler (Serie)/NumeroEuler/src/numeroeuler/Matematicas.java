package numeroeuler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Matematicas {
    
     public static int factorialInt(int num)
    {
        int fac=1;
        if(num==0 || num==1)
            return 1;
        for(int i=2; i<=num; i++)      
            fac*=i;  
        return fac;
    }
     
    public static double factorialDouble(double num)
    {
        int fac=1;
        if(num==0 || num==1)
            return 1;
        for(int i=2; i<=num; i++)      
            fac*=i;  
        return fac;
    }
    
    public static long factorialLong(long num)
    {
        long fac=1;
        if(num==0 || num==1)
            return 1;
        for(int i=2; i<=num; i++)      
            fac*=i;  
        return fac;
    }
}
