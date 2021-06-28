/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongranja;

import java.util.Scanner;

/**
 *
 * @author lDestroyerl
 */
public class AplicacionGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double sumaTomate = 0, prodTomate;
        double sumaLechuga = 0, prodLechuga;
        double sumaChicharo =0, prodChicharo;
        double sumaZanahoria =0, prodZanahoria;
        double ventaTotalTomate, ventaTotalLechuga, ventaTotalChicharo, ventaTotalZanahoria;
        double precioTomate, precioLechuga, precioZanahoria, precioChicharo;
        double ventaTotal=0;
        
        System.out.println("Granjas El Pollon");
        
        System.out.println("");
        
        System.out.println("Ventas del 2018: Tomate");
        for(int n=0; n<12; n++)
        {
            System.out.println("Producción del mes " + (n+1) + "(en KG):");
            prodTomate = teclado.nextDouble();
            
            sumaTomate += prodTomate;
        }  
        
        System.out.println("Precio por kilo de Tomate");
        precioTomate = teclado.nextDouble();
        
        System.out.println("");
        
        System.out.println("Ventas del 2018: Lechuga");
        for(int n=0; n<12; n++)
        {
            System.out.println("Producción del mes " + (n+1) + "(en KG):");
            prodLechuga = teclado.nextDouble();
            
            sumaLechuga += prodLechuga;
        }
  
        System.out.println("Precio por kilo de Lechuga");
        precioLechuga = teclado.nextDouble();

        System.out.println("");
        
        System.out.println("Ventas del 2018: Zanahoria");
        for(int n=0; n<12; n++)
        {
            System.out.println("Producción del mes " + (n+1) + "(en KG):");
            prodZanahoria = teclado.nextDouble();
            
            sumaZanahoria += prodZanahoria;
        }
        
        System.out.println("Precio por kilo de Zanahoria");
        precioZanahoria = teclado.nextDouble();
        
        System.out.println("");
              
        System.out.println("Ventas del 2018: Chícharo");
        for(int n=0; n<12; n++)
        {
            System.out.println("Producción del mes " + (n+1) + "(en KG):");
            prodChicharo = teclado.nextDouble();
            
            sumaChicharo += prodChicharo;
        }
           
        System.out.println("Precio por kilo de Chicharo");
        precioChicharo = teclado.nextDouble();
        
        System.out.println("");
        
        ventaTotalTomate = sumaTomate * precioTomate;
        ventaTotalLechuga = sumaLechuga * precioLechuga;
        ventaTotalZanahoria = sumaZanahoria * precioZanahoria;
        ventaTotalChicharo = sumaChicharo * precioChicharo;
        
        ventaTotal = ventaTotalTomate + ventaTotalLechuga + ventaTotalZanahoria + ventaTotalChicharo;
        
        System.out.println("");
        
        if(sumaTomate > sumaLechuga && sumaTomate > sumaZanahoria && sumaTomate > sumaChicharo)
            System.out.println("El producto que mas vendió al año fue: Tomate (" + sumaTomate + " kg)");
        
        if(sumaLechuga > sumaTomate && sumaLechuga > sumaZanahoria && sumaLechuga > sumaChicharo)
            System.out.println("El producto que mas vendió al año fue: Lechuga (" + sumaLechuga + " kg)");
        
        if(sumaZanahoria > sumaLechuga && sumaZanahoria > sumaTomate && sumaZanahoria > sumaChicharo)
            System.out.println("El producto que mas vendió al año fue: Zanahoria (" + sumaZanahoria + " kg)");
        
        if(sumaChicharo > sumaLechuga && sumaChicharo > sumaZanahoria && sumaChicharo > sumaTomate)
            System.out.println("El producto que mas vendió al año fue: Chicharo (" + sumaChicharo + " kg)");
        
        System.out.println("");
        
        System.out.println("La producción del año fue:");
        System.out.println("Tomate: " + sumaTomate + " kg");
        System.out.println("Lechuga: " + sumaLechuga + " kg");
        System.out.println("Zanahoria: " + sumaZanahoria + " kg");
        System.out.println("Chicharo: " + sumaChicharo + " kg");
        
        System.out.println("");
        
        System.out.println("Ganancias por producto: ");
        System.out.println("Tomate: $" + ventaTotalTomate);
        System.out.println("Lechuga: $" + ventaTotalLechuga);
        System.out.println("Zanahoria: $" + ventaTotalZanahoria);
        System.out.println("Chicharo: $" + ventaTotalChicharo);
        
        System.out.println("");
        
        //opcional
        System.out.println("Venta total del año: $" + ventaTotal);
        
        
        System.out.println("Su compita Luis pa servirle a uste y a dios");
    }
    
}
