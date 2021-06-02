/*
 *  Carlos Alberto Vázquez Aguirre 
 */
package Calculadora_Con_Funciones;

import static carlosv_v1.pkg2.FL_M2_13_11_2018_SenoDeÁnguloGrados.factorial;
import static carlosv_v1.pkg2.FL_M2_13_11_2018_SenoDeÁnguloGrados.potencia;

/**
 *
 * @author Ahedeijak
 */
public class Mate {
    public static double potencia(double base, int exponente){
        int limite;
        
        
       if (exponente < 0 )
           limite = -exponente;
       else 
           limite = exponente;
           
           
        double pot = 1; 
        int i;
        for (i = 1; i<=limite; i++){
        pot *=base;
    }
        if (exponente <0)
        return 1/pot;
        else return pot;
            
    }
    
    public static int div (double dividendo, double divisor){
      
        int cociente = 0 ;
        double residuo = dividendo;
        while (residuo >= divisor){
            residuo = residuo - divisor;
            cociente++;
        }      
        return cociente;
    }
    
    
    public static double mod (double dividendo, double divisor){
      
        double residuo = dividendo;
        while (residuo >= divisor)
        residuo = residuo - divisor;  
        return residuo;
    }
    
     public static  double factorial (int n){
        double fac = 1;
        int i = 1;
        
        for (i=1; i<=n; i++)
            fac *= i;
        return (int) fac;
    }
     
    public static double raiz(double n){
    double a =1;
    double b = n;
     double promedio;
     while(Mate.absoluto(a-b)>0.000001){
        promedio = (a+b)/2;
        a = promedio;
        b = n/a;
        }
    
    return a;
    } 
     
    public static double absoluto(double n){
        
        if (n>=0){ //positivo o 0.
            return 0;
        } else {
            return n*-1;
        }     
        
    }
   
    public static double permutacion(int n, int x){
       
       return factorial(n) / factorial(n-x);
   }
    
   public static double combinacion(int n, int x){
       return factorial(n)/(factorial(x) * factorial (n-x));
   } 
   
   public static double inverso(double n){
       return 1/n;
   }
   
   public static double sen(double angulo){
       double x, suma, termino;
       int p = 1, signo= 1, i;
       x =(angulo*pi())/180;
        p = 1;
        suma = 0;
        signo = 1;
        
        for (i = 1; i<=20; i++){
            termino = potencia(x,p)/factorial(p);
            suma = suma+(termino * signo);
            p = p +2;
            signo = signo *  (-1);
            
        }
     return suma;
   }
   
  public static double pi(){
      return 3.141592654;
  }
  
  public static double cos(double angulo){
      return raiz(1-potencia(sen(angulo),2));
  }
  
  public static double tan(double angulo){
      return sen(angulo)/cos(angulo);
  }
  
  public static double ctg(double angulo){
      return 1/tan(angulo);
  }
  
  public static double sec(double angulo){
      return 1/cos(angulo);
  }
  public static double csc(double angulo){
      return 1/ sen(angulo);
  }
  
  public static double claseA(double r, int n){
   int i, signo, d;
   double  suma, termino;
   d = 1;
   suma = 0;
   signo = 1;
   
   for (i=1; i<=n; i++){
       termino = Math.pow(r, i) / d;
       suma = suma + termino * signo;
       
       d = d + 3;
       signo = signo * (-1);
       
   }
   return suma;
  }
  
  public static double claseB(double r, int lim){
   int i, signo, d;
   double  suma, termino;
   d = 1;
   suma = 0;
   signo = 1;
   
   d = 1;
   suma = 0;
   signo = 1;
   i = 1;
   while (d<lim){
       termino = Math.pow(r, i) / d;
       suma = suma + termino * signo;
       i +=1;
       d = d + 3;
       signo = signo * (-1);
       
   }
   return suma;
  }
  
    
}
