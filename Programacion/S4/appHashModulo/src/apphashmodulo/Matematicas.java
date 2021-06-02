package apphashmodulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Luis
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
        double fac=1.0;
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
    
    public static boolean esPrimo (int n)
    {
        boolean primo = true;
        int div = 2;
        while(div < n)
        {
            if(n%div ==0)
                return false;
            div++;
        }    
        return true;
    }      
    
    public static double serieE()
    {
        double serie = 0.0;
        double i = 0;
        do
        {
            serie += 1.0/factorialDouble(i);
            i++;
        } while (serie +0.000001 <= Math.E);
        System.out.println("Ultimo factorial calulado: " + i);
        return serie;
    }
    
    public static double serieEx(int termino, int x)
    {
        double sumatoria = 0, t=0;
        
        for(int i=0; i<termino; i++)
        {
            t = Math.pow(x, i) / Matematicas.factorialDouble(i);
            sumatoria += t;
        }  
        return sumatoria;
    }
    
    public static double serieEx1(double x)
    {
        double valor = Math.exp(x);
        double serie = 0.0;
        double i = 0;
        do
        {
            serie += Math.pow(x, i) / factorialDouble(i);
            i++;
        } while (serie + 0.000001 <= Math.exp(x));
        return serie;
    }        
    
    //agregar serie pi
    
    public static double pi(int n)
    {
        int d = 1, sig =1;
        double t, s =0;
        for(int i=1; i<=n; i++)
        {
            t = 1.0 / d * sig;
            s += t;
            d += 2;
            sig *= -1;
        }
        return s*4;
    }       
}
