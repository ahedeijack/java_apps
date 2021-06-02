/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_102019_ArchivoBinarioVisual;

import pb_05_082019_ArchivoVisual.*;
import java.util.Random;

/**
 *
 * @author aa623
 */
public class MiRandom extends Random{
    
    private static String [] nom = {"Aldo", "Luis","Franco", "Angel", "Jose","Jorge", "Brayan", "Mario", "Carlos", "Pedro"};
    private static String [] ape = {"Argumaniz", "Ramos", "Rendon","Adame", "Flores", "Ramirez", "Gutierrez", "Sandoval","Sevilla" , "Valenzuela"};
    
    
    public MiRandom()
    {
        super();
    } 
    
    public MiRandom(int x)
    {
        super(x);
    }        
    
    //Son estaticos porque quiere llamar a esos metodosa traves de la clase no del objeto (es mas facil acceder desde la clase)
    public  String nextNombre()
    {
        return(nom[nextInt(nom.length)]);
    }
    
    public String nextApellido()
    {
        return(ape[nextInt(ape.length)]);
    }
    
    public  String nextNombreCompleto()
    {
        return(nom[nextInt(nom.length)] + " " + ape[nextInt(ape.length)] + " " + ape[nextInt(ape.length)]);
    }  
    
    public  String nextNombreLegal()
    {
        return(ape[nextInt(ape.length)] + " " + ape[nextInt(ape.length)] + " " + nom[nextInt(nom.length)] );
    }     
    
    public  String nextNombreCorto()
    {
        return(nom[nextInt(nom.length)] + " " + ape[nextInt(ape.length)]);
    }   
    
    public int nextInt(int ini, int fin)
    {
        return (ini + nextInt(fin-ini+1));
    }        
    
    public int nextInt(int ini, int fin, int intervalo)
    {
        return (nextInt(ini/intervalo, fin/intervalo)*intervalo);
    }
    
    public double nextDouble(int ini, int fin, double intervalo)
    {
       return (nextInt((int)(ini/intervalo),(int)(fin/intervalo))*intervalo); //casteamos las divisiones para poder utilizar el otro metodo NextInt ^ ya que maneja puros enteros
    }        
}

