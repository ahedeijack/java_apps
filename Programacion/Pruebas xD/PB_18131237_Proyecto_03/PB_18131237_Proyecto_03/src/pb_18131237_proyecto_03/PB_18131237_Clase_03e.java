/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131237_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author lDestroyerl
 */
class FooFighter extends Extranjero implements IMostrar {

    private int numAlbumes;
    
    //Constructores
    
    public FooFighter()
    {
        super();
        numAlbumes = 0; // 9 albumes los que ha hecho "Foo Fighters"
    }      
    
    public FooFighter(String nom, String gen, int numInt, String pais, int numAlb)
    {
        super(nom,gen,numInt,pais);
        numAlbumes = numAlb;
    } 
    
     public int getNumAlbumes() {
        return numAlbumes;
    }

    public void setNumAlbumes(int numAlbumes) {
        this.numAlbumes = numAlbumes;
    }
    
    @Override
    public void dibujar(Component comp, GrupoMusical datos[], String lugar [], int numAlbum []) {
        Graphics papel = comp.getGraphics();
        papel.setColor(Color.BLACK);
        papel.fillOval(170, 50, 170, 170);
        
        papel.setColor(Color.WHITE);
        papel.fillOval(175, 55, 160, 160);
        
        papel.setColor(Color.BLACK);
        papel.fillOval(180, 60, 150, 150);
        
        papel.setColor(Color.RED);
        papel.fillOval(185, 65, 140, 140);
        
        papel.setColor(Color.BLACK);
        papel.fillRect(200, 150, 110, 20);
        
        papel.setColor(Color.white);
        papel.setFont(new Font("Courier",Font.ITALIC,12));
        papel.drawString("FOO FIGHTERS", 210, 165);
        
        papel.drawLine(230, 180, 280, 180);
        
        papel.setColor(Color.black);
        papel.setFont(new Font("AR BERKLEY",Font.BOLD,50));
        papel.drawString("FF", 195, 130);
        
        papel.setColor(Color.BLACK);
        papel.setFont(new Font("Calibri",Font.BOLD,14));
        papel.drawString(datos[2].getNombre(), 182, 305); //listo
        papel.drawString(datos[2].getGenero(), 182, 335);
        papel.drawString(datos[2].getNumIntegrantes()+"", 182, 361);
        papel.drawString(lugar[2], 182, 389);
        papel.drawString(numAlbum[2]+"", 182, 421);
        
        try {
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
        Logger.getLogger(PB_18131237_Frame_03.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        papel.setColor(Color.gray);
        papel.fillRect(0, 0, 600, 250);
        papel.fillRect(180,290,200,200);
    }

    @Override
    public void mover(int x, Component comp, GrupoMusical datos[], String lugar [], int numAlbum []) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
