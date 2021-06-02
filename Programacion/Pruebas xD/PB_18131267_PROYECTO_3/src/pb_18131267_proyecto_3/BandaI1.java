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
public class BandaI1 extends Internacional{
    private int albums;
    
    public BandaI1(){
    super();
    albums = 0;
    }
    
    public BandaI1( String nombre, String genero, int integrantes, String pais, int albums) {
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
            

             papel.setColor(Color.WHITE);
            papel.fillRect(100, 15+y, 100, 100);
            
            papel.setColor(Color.RED);
            papel.setFont(new Font("Courier New", Font.BOLD, 64));
            papel.drawString("30", 115, 70+y);
            papel.setFont(new Font("Courier New", Font.PLAIN, 16));
            papel.drawString("SECONDS", 115, 90+y);
            papel.drawString("TO", 115, 100+y);
            papel.drawString("MARS", 115, 110+y);
          
            papel.setColor(Color.YELLOW);
            papel.setFont(new Font("Calibri", Font.PLAIN, 17));
            
            papel.drawString("Nombre: 30STM", 10, 50);
            papel.drawString("Genero: "+gm[1].getGenero(), 10, 70);
            papel.drawString("Integrantes: "+gm[1].getIntegrantes()+"", 10, 90);
            papel.drawString("Albumes: "+this.getAlbumes()+"", 10, 110);
            papel.drawString("EEUU.", 10, 130);
            
            
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
