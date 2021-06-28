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
 class PA_18131285_Clase_D extends PA_18131285_Clase_B {
    //Colinda con Austria
    //Capital es Berlin
    //Habitantes 83,202 (Millones)
    private int habitantes;

    public PA_18131285_Clase_D() {
    }

    public PA_18131285_Clase_D(int habitantes) {
        this.habitantes = habitantes;
    }

    public PA_18131285_Clase_D(int habitantes, String moneda) {
        super(moneda);
        this.habitantes = habitantes;
    }

    public PA_18131285_Clase_D(int habitantes, String moneda, String nombre, String colindaCon) {
        super(moneda, nombre, colindaCon);
        this.habitantes = habitantes;
    }

    public int getPoblacion() {
        return habitantes;
    }

    public void setPoblacion(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()+", poblacion: "+getPoblacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujar(int hor, int ver, Component comp, PA_18131285_Clase_A[] gm) {

         
        Graphics papel = comp.getGraphics();
         papel.setColor(Color.GRAY);
         papel.fillRect(1, 1, 580, 200);
        
                    
            papel.setColor(Color.white);
            papel.setFont(new Font("Impact", Font.ITALIC, 14));
            papel.drawString("Berlin, "+this.mostrarInfo(), 1 , 30);
            papel.setFont(new Font("Calibri", Font.PLAIN, 14));
            
            papel.setColor(Color.BLACK);
            //Posición de X, Posición de Y. Tamaño A, Tamaño B
            papel.fillOval(400+hor, 60, 80, 80);
            
            papel.setColor(Color.red);
            papel.fillRect(420+hor, 75, 20, 5);
            papel.fillRect(440+hor, 75, 5, 40);
            papel.fillRect(440+hor, 115, 20, 5);
            papel.fillRect(420+hor, 93, 40, 5);
            papel.fillRect(460+hor, 75, 5, 20);
            papel.fillRect(420+hor, 93, 5, 20);


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
