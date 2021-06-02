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
class Nirvana extends Extranjero implements IMostrar {
  
    private int numAlbumes;
    
    //Constructores
    
    public Nirvana()
    {
        super();
        numAlbumes = 0; // 3 albumes los que ha hecho "Nirvana"
    }      
    
    public Nirvana(String nom, String gen, int numInt, String pais, int numAlb)
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
        papel.fillRect(170, 50, 150, 150);
        
        papel.setColor(Color.YELLOW);
        papel.drawOval(195, 85, 100, 100);
        papel.drawLine(210, 140, 230, 160); //boca: diagonal izquierda
        papel.drawLine(280, 140, 260, 160); //boca: diagonal derecha
        papel.drawLine(230, 160, 260, 160); //boca: linea vertical
        
        papel.setFont(new Font("AR BERKLEY",Font.BOLD,25));
        papel.drawString("X", 210, 125);
        papel.drawString("X", 250, 125);
        
        papel.setFont(new Font("Calibri",Font.BOLD,25));
        papel.drawString("NIRVANA",195,75);
        papel.setColor(Color.BLACK);
        papel.setFont(new Font("Calibri",Font.BOLD,14));
        papel.drawString(datos[3].getNombre(), 182, 305); //listo
        papel.drawString(datos[3].getGenero(), 182, 335);
        papel.drawString(datos[3].getNumIntegrantes()+"", 182, 361);
        papel.drawString(lugar[3], 182, 389);
        papel.drawString(numAlbum[3]+"", 182, 421);
        
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
