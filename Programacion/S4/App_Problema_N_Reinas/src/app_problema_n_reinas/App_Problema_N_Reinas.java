/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_problema_n_reinas;

import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class App_Problema_N_Reinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] tablero;
        boolean ward = true;
        int tam = 0;
        do {
            ward = true;
            try{
                tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del tablero!"));
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error en el dato ingresado...", "Error",JOptionPane.WARNING_MESSAGE);
                ward = false;
            }
        } while (ward == false);
        tablero = generarTablero(tam);
        imprimirMatriz(tablero);
        System.out.println("  -  ");
        ubicarReina(tablero, 0);
    }
    
    public static void ubicarReina(String [][] tablero, int etapa){
        for (int i = 0; i < tablero.length; i++) {
            if(isValido(tablero, i, etapa)){
                tablero[i][etapa] = "D";
                
                if (etapa<tablero.length -1){
                    ubicarReina(tablero, etapa+1);
                } else {
                    imprimirMatriz(tablero);
                    System.out.println("- - - - - - - -");
                }
                
                tablero[i][etapa] = " ";
            }
        }
    }
    
    public static boolean isValido(String[][] tablero, int i, int etapa){
        for (int x = 0; x < etapa; x++) {
            if(tablero[i][x].equals("D")){
                return false;
            }
        }
        
        for (int j = 0; j < tablero.length && (i - j)>=0 && (etapa-j) >= 0; j++) {
            if(tablero[i-j][etapa-j].equals("D")){
               return false; 
            }
        }
        
        for (int j = 0; j < tablero.length && (i+j)<tablero.length && etapa - j >= 0; j++) {
            if(tablero[i+j][etapa - j].equals("D")){
                return false;
            }
        }
        
        return true;
    }
    
    public static String[][] generarTablero(int length){
        String[][] res = new String[length][length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[i][j] = " ";
            }
        }
        return res;
    }
    
    public static void imprimirMatriz(String[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]+ "☼");
            }
            System.out.println("");
        }
    }
    
}
