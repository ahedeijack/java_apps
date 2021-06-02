/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plegamiento;

/**
 *
 * @author ahdeijack
 */
public class Hash {
    private Elemento tabla[];
    private int tamTabla;
    
    public Hash(int vec){
        this.tamTabla = vec;
        this.tabla = new Elemento[tamTabla];
        
        for (int i = 0; i < tamTabla; i++) 
            this.tabla[i] = null;
        
    }
    
        public  int plegamiento(int clave){
        String auxClave = String.valueOf(clave);
        String auxTabla = String.valueOf(this.tamTabla-1);
        
        int pos = 0;
        String parte = "";
        
        for (int i = 0; i < auxClave.length(); i++) {
            parte  += auxClave.charAt(i)+"";
            
            if (parte.length() == auxTabla.length()) {
                pos+=Integer.parseInt(parte);
                parte ="";
                
            } else if (i == auxClave.length()-1) {
                pos += Integer.parseInt(parte);
            }
        }
        return pos;
    }
        
}
