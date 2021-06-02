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
public class Bunbury extends Internacional {
    private int albumes;

    public Bunbury() {
        super();
        albumes = 0;
    }

    public Bunbury(int albumes) {
        this.albumes = albumes;
    }

    public Bunbury( String nombre, String genero, int integrantes, String pais, int albumes) {
        super(nombre, genero, integrantes, pais);
        this.albumes = albumes;
    }
    
   
    
    @Override
      public String mostrarInfo(){
      return super.mostrarInfo()+", albumes: "+this.albumes;
  }

    public int getAlbumes() {
        return albumes;
    }

    public void setAlbumes(int albumes) {
        this.albumes = albumes;
    }
    
       @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical gm []) {
        Graphics papel = comp.getGraphics();   
  
        int x = hor, y = ver;
        
         
         //Ss la zona en donde se hara el dibujo.
         papel.setColor(Color.lightGray);
         papel.fillRect(100, 205, 320, 230);
        
            //Dibujo 1
            

            
            papel.setColor(Color.YELLOW);
            papel.setFont(new Font("ITC Serif Gothic Std Light", Font.BOLD, 32));
            papel.drawString("BUNBURY", 290-x, 240+y);
            papel.setColor(black);
            papel.drawLine(352-x, 210+y, 355-x, 250+y);
            papel.drawLine(357-x, 210+y, 355-x, 250+y);
            papel.drawLine(352-x, 210+y, 357-x, 210+y);
            papel.setColor(Color.YELLOW);
            papel.setFont(new Font("Calibri", Font.PLAIN, 17));
            
            papel.drawString("Nombre: "+gm[3].getNombre(), 100, 220);
            papel.drawString("Genero: "+gm[3].getGenero(), 100, 240);
            papel.drawString("Integrantes: "+gm[3].getIntegrantes()+"", 100, 260);
            papel.drawString("Albumes: "+this.getAlbumes()+"", 100, 300);
            
            papel.drawString("Zaragoza, ES.", 100, 280);
            
            papel.setFont(new Font("ITC Serif Gothic Std Light", Font.BOLD, 10));
            papel.drawString("PALOSANTO", 360-x, 250+y);
            
            
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
