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
class Zoe extends Nacional implements IMostrar {
    
    private int numAlbumes;
    
    //Constructores
    
    public Zoe()
    {
        super();
        numAlbumes = 0; // 5 albumes los que ha hecho "Zoe"
    }      
    
    public Zoe(String nom, String gen, int numInt, String est, int numAlb)
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
        papel.setColor(Color.black);
        papel.drawLine(30, 50, 100, 50); //Z = linea horizontal superior
        papel.drawLine(30, 140, 100, 50); //Z = diagonal
        papel.drawLine(30, 140, 100, 140); // Z = linea horizontal inferior
        papel.drawLine(30, 95, 380, 95); //Z = linea horizontal de en medio 
        papel.fillRect(30,40,70,10); //Rectangulo de la letra Z
                
        papel.drawLine(310,50,380,50); //E = linea horizontal superior
        papel.drawLine(310,140,380,140); //E = linea horizontal inferior
        papel.fillRect(310,40,70,10); //Rectangulo de la letra Z
        
        papel.setColor(Color.BLACK);
        papel.fillOval(140, 50, 130, 90); //O = ovalo de color negro
        
        papel.setColor(Color.WHITE); //color blanco
        papel.fillOval(150,60,110,70); //O = ovalo de color blanco
        
        papel.setColor(Color.PINK);
        papel.drawLine(220, 50, 190, 80); // diagonal
        
        papel.drawLine(190, 80, 220, 80); //Z = linea horizontal superior
        papel.drawLine(190, 110, 220, 80); //Z = diagonal
        papel.drawLine(190, 110, 220, 110); // Z = linea horizontal inferior
        
        papel.drawLine(220, 110, 190, 140); // diagonal
        
        papel.setColor(Color.red);
        papel.setFont(new Font("Courier",Font.ITALIC,14));
        papel.drawString("2019", 30, 50);
        
        papel.setColor(Color.BLACK);
        papel.setFont(new Font("Calibri",Font.BOLD,14));
        papel.drawString(datos[1].getNombre(), 182, 305); //listo
        papel.drawString(datos[1].getGenero(), 182, 335);
        papel.drawString(datos[1].getNumIntegrantes()+"", 182, 361);
        papel.drawString(lugar[1], 182, 389);
        papel.drawString(numAlbum[1]+"", 182, 421);
        
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
    public void mover(int y, Component comp, GrupoMusical datos[], String lugar [], int numAlbum []) {
        
        Graphics papel = comp.getGraphics();
        papel.setColor(Color.black);
        papel.drawLine(30, 50, 100, 50); //Z = linea horizontal superior
        papel.drawLine(30, 140, 100, 50); //Z = diagonal
        papel.drawLine(30, 140, 100, 140); // Z = linea horizontal inferior
        papel.drawLine(30, 95, 380, 95); //Z = linea horizontal de en medio 
                
        papel.drawLine(310,50,380,50); //E = linea horizontal superior
        papel.drawLine(310,140,380,140); //E = linea horizontal inferior
        
        
        papel.fillOval(140, 50, 130, 90); //O = ovalo de color negro
        
        papel.setColor(Color.WHITE); //color blanco
        papel.fillOval(155,65,100,60); //O = ovalo de color blanco
        
        papel.setColor(Color.PINK);
        papel.drawLine(220, 50, 190, 80); // diagonal
        
        papel.drawLine(190, 80, 220, 80); //Z = linea horizontal superior
        papel.drawLine(190, 110, 220, 80); //Z = diagonal
        papel.drawLine(190, 110, 220, 110); // Z = linea horizontal inferior
        
        papel.drawLine(220, 110, 190, 140); // diagonal
    }  

    
}
