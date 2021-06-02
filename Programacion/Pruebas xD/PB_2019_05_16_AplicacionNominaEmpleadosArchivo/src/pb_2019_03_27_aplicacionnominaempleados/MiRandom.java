/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

import java.util.Random;

/**
 *
 * @author alope
 */
public class MiRandom extends Random{
    private static String [] nom = {"Juan","Maria","Pedro","Luis","Laura","Raul","Martha","Jesus","Fernanda","Jaime",
                                    "Armando","Jorge","Jose","Yolanda","Diana","Elena","Consuelo","Beatriz"};
    private static String [] ape = {"Lopez","Perez","Garcia","Mendez","Ruiz","Hernandez","Gomez","Gonzalez","Favela",
                                    "Salazar","Rangel","Arias","Ramirez","Blanco","Ruiz","Valdes","Alvarado","Mares"};
    
    public MiRandom()
    {
        super();
    }
    
    public MiRandom(int x)
    {
        super(x);
    }
    
    public String nextNombre()
    {
        return nom[nextInt(nom.length)];
    }
    
    public String nextApellido()
    {
        return ape[nextInt(ape.length)];
    }

    public String nextNombreCompleto()
    {
        return nom[nextInt(nom.length)] + " " +
               ape[nextInt(ape.length)] + " " +
               ape[nextInt(ape.length)];
    }
    
    public String nextNombreLegal()
    {
        return ape[nextInt(ape.length)] + " " +
               ape[nextInt(ape.length)] + " " +
               nom[nextInt(nom.length)];
    }
    
    public String nextNombreCorto()
    {
        return nom[nextInt(nom.length)] + " " +
               ape[nextInt(ape.length)];
    }
    
    public int nextInt(int ini, int fin)
    {
        return ini + nextInt(fin-ini+1);
    }
    
    public int nextInt(int ini, int fin, int intervalo)
    {
        return nextInt(ini/intervalo,fin/intervalo)*intervalo;
    }
    
    public double nextDouble(int ini, int fin, double intervalo)
    {
        return nextInt((int)(ini/intervalo),(int)(fin/intervalo))*intervalo;
    }
}
