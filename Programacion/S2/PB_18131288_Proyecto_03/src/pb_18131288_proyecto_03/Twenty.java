/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahedeijak
 */
public class Twenty extends Internacional{
int albumes;

    public Twenty() {
        super();
        albumes = 0;
    }

    public Twenty(int informacionB) {
        this.albumes = informacionB;
    }

    public Twenty( String nombre, String genero, int integrantes, String pais, int informacionB) {
        super(nombre, genero, integrantes, pais);
        this.albumes = informacionB;
    }
    
    
    public int getAlbumes() {
        return albumes;
    }

    public void setAlbumes(int albumes) {
        this.albumes = albumes;
    }
    
   
    
    @Override
      public String mostrarInfo(){
      return super.mostrarInfo()+", albumes: "+this.albumes;
  }

   @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical gm []) {
        Graphics papel = comp.getGraphics();   
        
        int x = hor;
        int y = ver;
        
         //Ss la zona en donde se hara el dibujo.
         papel.setColor(Color.lightGray);
         papel.fillRect(100, 205, 320, 230);
            
         //Dibujo Twenty
         
            //Rectangulo A   
            papel.setColor(Color.BLACK);
            papel.fillRect(320-x, 205+y, 80, 80);
            
            papel.setColor(Color.yellow);
            papel.fillOval(320-x, 205+y, 80, 80);
            papel.setColor(black);
            papel.fillOval(325-x, 210+y, 70, 70);
            
            papel.setColor(Color.yellow);
            papel.setFont(new Font("ITC Serif Gothic Std Light", Font.PLAIN, 30));
            papel.drawString("||=//", 335-x, 255+y);
            
            papel.setFont(new Font("Calibri", Font.PLAIN, 14));
            papel.drawString("Nombre: "+gm[2].getNombre(), 100, 220);
            papel.drawString("Genero: "+gm[2].getGenero(), 100, 240);
            papel.drawString("Integrantes: "+gm[2].getIntegrantes()+"", 100, 260);
            papel.drawString("Albumes: "+this.getAlbumes()+"", 100, 300);
            
            papel.drawString("OHIO, EEUU", 100, 280);
            
      
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
