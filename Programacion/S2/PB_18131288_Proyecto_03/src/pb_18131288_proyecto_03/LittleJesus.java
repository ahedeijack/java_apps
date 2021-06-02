/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahedeijak
 */
public class LittleJesus extends Nacional {
    private int albumes;

    public LittleJesus() {
        super();
        albumes = 0;
    }

  public LittleJesus(String nombre, String genero, int integrantes, String estado, int albumes) {
        super(nombre,  genero,  integrantes,  estado);
        this.albumes = albumes;
    }
  
 public int getAlbumes(){
    return this.albumes;
}
 
 public void setAlbumes(int albumes){
     this.albumes = albumes;
 }

 
    /**
     *
     * @return
     */
    @Override
  public String mostrarInfo(){
      return super.mostrarInfo()+", Albumes: "+this.albumes;
  }
  
   @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical gm []) {
        Graphics papel = comp.getGraphics();   
        int x = hor, y = ver;
        
         
         //Ss la zona en donde se hara el dibujo.
         papel.setColor(Color.lightGray);
         papel.fillRect(100, 205, 320, 230);
         
         //Dibujo 1
            
            papel.setColor(Color.GRAY);
            papel.fillRect(320-x, 205+y, 80, 80);
            
            papel.setColor(Color.yellow);
            papel.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
            papel.drawString("FD", 325-x, 255+y);
            papel.drawString("L", 360-x, 265+y);
            
            papel.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 8));
            papel.drawString("Little", 380-x, 260+y);
            papel.drawString("Jesus", 380-x, 267+y);
            papel.setFont(new Font("Calibri", Font.PLAIN, 14));
            
            papel.drawString("Nombre: "+gm[0].getNombre(), 100, 220);
            papel.drawString("Genero: "+gm[0].getGenero(), 100, 240);
            papel.drawString("Integrantes: "+gm[0].getIntegrantes()+"", 100, 260);
            papel.drawString("Albumes: "+this.getAlbumes()+"", 100, 300);
            
            papel.drawString("CDMX, MX", 100, 280);
            
            papel.fillOval(328-x, 210+y, 20, 15);
            
            papel.setColor(Color.GRAY);
            papel.setFont(new Font("Sitka Small", Font.PLAIN,10));
            papel.drawString("F", 335-x, 220+y);
            
            papel.setColor(Color.yellow);
            papel.setFont(new Font("Sitka Small", Font.PLAIN,10));
            papel.drawString("de", 350-x, 220+y);
            papel.drawString("Lugar", 370-x, 220+y);
 
           
            
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
