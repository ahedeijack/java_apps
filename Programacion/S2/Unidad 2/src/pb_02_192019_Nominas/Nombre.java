/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_192019_Nominas;

import java.util.Random;

/**
 *
 * @author aa601
 */
public class Nombre {
   
    public static String nom [] = {"Laura","Mizifu","Jesus","Alejandro","Pedro","Ulises","Ramon",
    "Hindira","Jose","Maria","Diego","Roberto","Adrian","Ivan","Alejandro","Francisco","Eusebio"};
    
    public static String ape [] = {"Joseph","Martinez","Lopez","Armendariz","Vazquez","Alanis","Santiago","Clinton","Claire",
    "Sanchez","Jaramillo","Escobar","Luna","Aguirre","Aguilera","Aguilar","Monar","Monira","Soza","Euclides","Vazconcelos"};
    
    public static Random azar = new Random();
    
    public static String nextNombre(){
    return nom[azar.nextInt(nom.length)];
    }

    public static String nextNombreCompleto(){
        return nom[azar.nextInt(nom.length)]+ " " + nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreLegal(){
        return nom[azar.nextInt(nom.length)]+ " " + nom[azar.nextInt(nom.length)] + " " +
               ape[azar.nextInt(ape.length)] + " " +ape[azar.nextInt(ape.length)];
    }
    
    public static String nextNombreCorto(){
        return nom[azar.nextInt(nom.length)]+ "" + 
               ape[azar.nextInt(ape.length)];
    }
    
}


