/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131250_proyecto_3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valentin_PC
 */
public class BandaNacional1 extends Nacional{
    
    private int albums;
    
    public BandaNacional1(){
    super();
    albums = 0;
    }
    
    public BandaNacional1(String nombre, String genero, int integrantes, String pais, int albums) {
        super(nombre, genero, integrantes, pais);
        this.albums = albums;
    }
    
     @Override
      public String mostrar(){
      return super.mostrar()+", albumes: "+this.albums;
  }

    public int getAlbumes() {
        return albums;
    }

    public void setAlbumes(int albumes) {
        this.albums = albumes;
    }
    
       @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical grupo []) {
        Graphics papel = comp.getGraphics();   
        int x = hor, y = ver;
         //Ss la zona en donde se hara el dibujo.
         //Dibujo 1
            
            papel.setColor(comp.getBackground());
            papel.fillRect(1, 1, 370, 215);
            
            papel.setColor(Color.WHITE);
            papel.fillRect(20+x, 15, 100, 100);
            
            //rectangulo del fondo
            papel.setColor(Color.BLUE);
            papel.fillRect(30+x, 55, 70, 55);
            
            papel.setColor(Color.RED);
            papel.fillOval(30+x, 20, 40, 40);
            
            papel.setColor(Color.YELLOW);
            papel.fillOval(70+x, 45, 40, 40);
          
            
            papel.setColor(Color.white);
            papel.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            
            papel.drawString("Nombre: "+this.getNombre(), 10, 50);
            papel.drawString("Genero: "+this.getGenero(), 10, 70);
            papel.drawString("Integrantes: "+this.getIntegrantes()+"", 10, 90);
            papel.drawString("Albumes: "+this.getAlbumes(), 10, 110);
            papel.drawString("Estado:"+this.getEstado(), 10, 130);
            papel.setFont(new Font("Century Gothic", Font.PLAIN, 8));
            papel.drawString(this.mostrar(), 10, 150);
            
               try {
            Thread.sleep(120);
        } catch (InterruptedException ex) {
            Logger.getLogger(Component.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      @Override
    public void mover(Component comp, GrupoMusical grupo []) {
        int x = 0, y = 0;
         for(int v = 1; v<55; v=v+5){
            for(int h = 1; h<55; h = h+5){
                x +=2;
                y += 2;
                this.dibujar(x, y, comp, grupo);
            }
        }
    
    }
    
}
