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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahdeijack
 */
 class PA_18131285_Clase_G extends PA_18131285_Clase_B {
    private int pob;

    //Roma colinda con Pomezia
    //Capital Italia
    //Hpob 2873 (millones)

    public PA_18131285_Clase_G() {
    }

    public PA_18131285_Clase_G(int pob) {
        this.pob = pob;
    }

    public PA_18131285_Clase_G(int pob, String moneda) {
        super(moneda);
        this.pob = pob;
    }

    public PA_18131285_Clase_G(int pob, String moneda, String nombre, String colindaCon) {
        super(moneda, nombre, colindaCon);
        this.pob = pob;
    }

    public int getPoblacion() {
        return pob;
    }

    public void setPoblacion(int pob) {
        this.pob = pob;
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
            papel.drawString("Italia, "+this.mostrarInfo(), 1 , 30);
            papel.setFont(new Font("Windings", Font.PLAIN, 18));
            
            papel.setColor(Color.BLACK);
            //Posición de X, Posición de Y. Tamaño A, Tamaño B
            papel.fillOval(400+hor, 60, 80, 80);
            
        Random azar = new Random();
        switch (azar.nextInt(4)+1){
            case(1): papel.setColor(Color.yellow);
                        papel.drawString("", 415+hor, 105);

            break;
            case(2): papel.setColor(Color.pink);
                        papel.drawString("", 415+hor, 105);

            break;
            case(3): papel.setColor(Color.orange);
                        papel.drawString("", 415+hor, 105);

            break;
            case(4): papel.setColor(Color.MAGENTA);
                        papel.drawString("", 415+hor, 105);

            break;
            default: papel.setColor(Color.RED);
                        papel.drawString("", 415+hor, 105);
                        break;
        }



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
