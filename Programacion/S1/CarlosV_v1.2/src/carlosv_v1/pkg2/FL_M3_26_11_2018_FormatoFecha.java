/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosv_v1.pkg2;
import java.util.Scanner;
/**
 *
 * @author aa505
 */
public class FL_M3_26_11_2018_FormatoFecha {
    public static void main (String[] args){
        int dia, mes, año, siglo;
        Scanner read = new Scanner(System.in);
        char formato, otraFecha;
        
        String [] mesCorto = new String[12];
        mesCorto[0] = "Ene";
        mesCorto[1] = "Feb";
        mesCorto[2] = "Mar";
        mesCorto[3] = "Abr";
        mesCorto[4] = "May";
        mesCorto[5] = "Jun";
        mesCorto[6] = "Jul";
        mesCorto[7] = "Ago";
        mesCorto[8] = "Sep";
        mesCorto[9] = "Oct";
        mesCorto[10] = "Nov";
        mesCorto[11] = "Dic";
        
        String [] mesLargo = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        System.out.println("Ingresa dos digitos para regrsar la fecha completa...");
        
        
        do{
        System.out.println("Ingresa los digitos del dia;");
        dia = read.nextInt();
        
        
        do{
        System.out.println("Ingresa los digitos para el mes...");
        mes = read.nextInt();
        } while (mes<1 || mes > 13);
        
        do{
        System.out.println("Ingresa los digitos para el año...(Los años son regresados a partir de los 1900's)");
        año = read.nextInt();
        } while (año < 0 || año >99);
        
        System.out.println("Formato corto o largo? (C/L)");
        formato = read.next().charAt(0);
        
       if (año>= 80){
           siglo = siglo = 1900 + año;
       } else {
           siglo = 2000 + año;
       }
        
       if (formato == 'C' || formato == 'c'){
           System.out.println(dia+"/"+mes+"/"+año);
       } else{
           System.out.println(dia+" de "+mesLargo[mes-1]+" de "+" "+siglo);  
       }
        System.out.println("Desea otra fecha? (S/N)");
        otraFecha = read.next().charAt(0);
        
        } while (otraFecha == 'S' ||otraFecha == 's');
    
    }
}
