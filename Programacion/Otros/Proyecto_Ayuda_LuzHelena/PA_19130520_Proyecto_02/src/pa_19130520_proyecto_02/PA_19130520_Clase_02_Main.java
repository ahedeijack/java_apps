
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_19130520_proyecto_02;

/**
 *
 * @author anton
 */
public class PA_19130520_Clase_02_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioXlitro=9.53;
        PA_19130520_Clase_02_Cemento soriana = new PA_19130520_Clase_02_Cemento(1,53,19);
        PA_19130520_Clase_02_Cemento abastos = new PA_19130520_Clase_02_Cemento(2,13,52);
        //PE_19130520_Clase_01a alianza = new PA_19130520_Clase_02_Cemento(5,4,6);
        
        System.out.println("el precio por litro es: $" + precioXlitro);
        System.out.println("_______________________");
        
        System.out.println("LOCAL    GALON      PINTA      ONZA");
        
        System.out.println("soriana: " + soriana);
        System.out.println("abastos: " + abastos);
        //System.out.println(alianza);
        
        PA_19130520_Clase_02_Cemento resSuma = soriana.suma(abastos);
        
        System.out.println("___________________________");
        System.out.println(resSuma);
        
        //PE_19130520_Clase_01a resResta=soriana.resta(abastos);
        
        //System.out.println("");
        //System.out.println(resResta);
    }
    
}
