/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_eli;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahdeijack
 */
 class PA_18131285_Clase_E extends PA_18131285_Clase_C {
    private int pob;
    
    //New York tiene como capital New York
    //Colinda con Conneticut
    //8399 (Millones)
    
    
    public PA_18131285_Clase_E() {
    }

    public PA_18131285_Clase_E(int pob) {
        this.pob = pob;
    }

    public PA_18131285_Clase_E(int pob, String capital) {
        super(capital);
        this.pob = pob;
    }

    public PA_18131285_Clase_E(int pob, String capital, String nombre, String colindaCon) {
        super(capital, nombre, colindaCon);
        this.pob = pob;
    }

    public int getPoblacion() {
        return pob;
    }

    public void setPoblacion(int pob) {
        this.pob = pob;
    }

    //Metodos para dibujar y mover.
    
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()+", población: "+getPoblacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujar(int hor, int ver, Component comp, PA_18131285_Clase_A[] gm) {

         
        Graphics papel = comp.getGraphics();
         papel.setColor(Color.GRAY);
         papel.fillRect(1, 1, 580, 200);
        
                    
            papel.setColor(Color.white);
            papel.setFont(new Font("Impact", Font.ITALIC, 14));
            papel.drawString(this.mostrarInfo(), 1 , 30);
            papel.setFont(new Font("Lucida Bright", Font.PLAIN, 48));
            

  
            papel.setColor(Color.RED);
            papel.setFont(new Font("Book Antiqua", Font.PLAIN, 48));
            papel.drawString("N", 420+hor, 115);
            
            papel.setColor(Color.blue);
            papel.setFont(new Font("Lucida Bright", Font.PLAIN, 40));
            papel.drawString("Y", 425+hor, 115);

           
      


        try {
        Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Component.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void mover(Component comp, PA_18131285_Clase_A[] gm) {
int hor = 0, ver=0;
        for (int  i = 0; i < 400; i++) {
              this.dibujar(hor-i, ver, comp, gm);
        }
    }

}
