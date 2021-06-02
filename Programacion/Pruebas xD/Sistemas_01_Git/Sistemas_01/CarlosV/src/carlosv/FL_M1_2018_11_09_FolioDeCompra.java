/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl_carlosv;
import java.util.Scanner;
/**
 *
 * @author aa504
 */
public class FL_M1_2018_11_09_FolioDeCompra {
     public static void main (String[] args){
         int ticket, descuento, cos1, cos2, cos3,cos4, compra;
         int res1, res2, res3, res4, desc_F;
         
         Scanner teclado = new Scanner(System.in);
         
         
         //datos de entrada; 
         System.out.println("ingresa los 4 digitos de tu tiicket! :");
         ticket = teclado.nextInt();
       
         System.out.print("Ingresa el valor de tu compra; ");
         compra = teclado.nextInt();
         
         cos1=ticket/10;
         res1=ticket%10;
         
         cos2=cos1/10;
         res2=cos1%10;
         
         cos3=cos2/10;
         res3=cos2%10;
         
         cos4=cos3/10;
         res4=cos3%10;
         
         descuento = (res1+res2+res3+res4)/4;
         desc_F=compra-descuento;
         
         System.out.print("El valor de tu compra fue $"+compra+", y tu descuento fue del %"+descuento);
         System.out.println("Por tanto, el valor final de tu compra es de $"+desc_F);
         
         
     }
    
    
}
