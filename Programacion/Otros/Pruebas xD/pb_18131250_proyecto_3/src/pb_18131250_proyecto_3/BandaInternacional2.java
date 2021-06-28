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
public class BandaInternacional2 extends Internacional{
    
    private int albums;
    
    public BandaInternacional2(){
    super();
    albums = 0;
    }
    
    public BandaInternacional2(String nombre, String genero, int integrantes, String pais, int albums) {
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
            
            //fondo negro
            papel.setColor(Color.BLACK);
            papel.fillRect(20+x, 15, 100, 100);
            
            //Cruz central
            papel.setColor(Color.WHITE);
            papel.fillRect(60+x, 20, 20, 90);
            papel.setColor(Color.WHITE);
            papel.fillRect(25+x, 55, 90, 20);
            
            //Letras
            papel.setFont(new Font("Arial Black", Font.PLAIN, 36));
            papel.drawString("M", 25+x, 50);
            papel.drawString("C", 80+x, 50);
            papel.drawString("R", 25+x, 105);
            papel.drawString("X", 80+x, 105);
            
            
            
            papel.setColor(Color.RED);
            papel.setFont(new Font("Century Gothic", Font.BOLD, 12));
            
            papel.drawString("Nombre: "+this.getNombre(), 10, 50);
            papel.drawString("Genero: "+this.getGenero(), 10, 70);
            papel.drawString("Integrantes: "+this.getIntegrantes()+"", 10, 90);
            papel.drawString("Albumes: "+this.getAlbumes(), 10, 110);
            papel.drawString("Estado:"+this.getPais(), 10, 130);
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
