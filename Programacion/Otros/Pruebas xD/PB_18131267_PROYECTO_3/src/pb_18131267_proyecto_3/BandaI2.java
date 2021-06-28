/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131267_proyecto_3;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa622
 */
public class BandaI2 extends Internacional{
    
        private int albums;
    
    public BandaI2(){
    super();
    albums = 0;
    }
    
    public BandaI2( String nombre, String genero, int integrantes, String pais, int albums) {
        super(nombre, genero, integrantes, pais);
        this.albums = albums;
    }
    
     @Override
      public String mostrarInfo(){
      return super.mostrarInfo()+", albumes: "+this.albums;
  }

    public int getAlbumes() {
        return albums;
    }

    public void setAlbumes(int albumes) {
        this.albums = albumes;
    }
    
       @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical gm []) {
        Graphics papel = comp.getGraphics();   
  
        int x = hor, y = ver;
        
         
         //Ss la zona en donde se hara el dibujo.
         papel.setColor(Color.lightGray);
         papel.fillRect(10, 10, 320, 230);
        
            //Dibujo 1
            

            
            papel.setColor(Color.BLACK);
            papel.fillOval(100, 15+y, 100, 100);
            
            papel.setColor(Color.RED);
            papel.setFont(new Font("Bradley Hand ITC", Font.BOLD, 64));
            papel.drawString("SODA", 115, 70+y);
            papel.setFont(new Font("Calibri", Font.PLAIN, 8));
            
            papel.drawString("STEREO", 145, 110+y);
          
            papel.setColor(Color.YELLOW);
            papel.setFont(new Font("Calibri", Font.PLAIN, 17));
            
            papel.drawString("Nombre: SodaStereo", 10, 70);
            papel.drawString("Genero: "+gm[2].getGenero(), 10, 90);
            papel.drawString("Integrantes: "+gm[2].getIntegrantes()+"", 10, 110);
            papel.drawString("Albumes: "+this.getAlbumes()+"", 10, 130);
            papel.drawString("ARGENTINA.", 10, 150);
            
            
               try {
            Thread.sleep(120);
        } catch (InterruptedException ex) {
            Logger.getLogger(Component.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      @Override
    public void mover(Component comp, GrupoMusical gm []) {
        int x = 0, y = 0;
         for(int v = 1; v<35; v=v+5){
            for(int h = 1; h<35; h = h+5){
                x +=2;
                y += 2;
                this.dibujar(x, y, comp, gm);
            }
        }
    
    }
    
    
    
}
