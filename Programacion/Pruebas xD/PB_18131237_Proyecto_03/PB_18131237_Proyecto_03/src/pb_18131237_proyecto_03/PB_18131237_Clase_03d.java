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
class BandaMs extends Nacional implements IMostrar {

    private int numAlbumes;
    
    //Constructores
    
    public BandaMs()
    {
        super();
        numAlbumes = 0; // 4 albumes los que ha hecho "Banda Ms"
    }      
    
    public BandaMs(String nom, String gen, int numInt, String est, int numAlb)
    {
        super(nom,gen,numInt,est);
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
        papel.setColor(Color.ORANGE);
        papel.fillOval(170,80,105,30); //ovalo de color negro
        papel.fillRect(182, 55, 80, 50); //rectangulo
        papel.fillOval(182, 50, 45, 20);
        papel.fillOval(217, 50, 45, 20);
        
        papel.setColor(Color.BLACK);
        papel.fillRect(182, 65, 80, 10);
        papel.drawLine(182, 80, 262, 80);
        
        papel.setColor(Color.red);
        papel.setFont(new Font("Courier",Font.ITALIC,12));
        papel.drawString("SOMBRERO", 188, 75);
        
        papel.setColor(Color.BLACK);
        papel.setFont(new Font("Calibri",Font.BOLD,14));
        papel.drawString(datos[0].getNombre(), 182, 305); //listo
        papel.drawString(datos[0].getGenero(), 182, 335);
        papel.drawString(datos[0].getNumIntegrantes()+"", 182, 361);
        papel.drawString(lugar[0], 182, 389);
        papel.drawString(numAlbum[0]+"", 182, 421);
        
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
