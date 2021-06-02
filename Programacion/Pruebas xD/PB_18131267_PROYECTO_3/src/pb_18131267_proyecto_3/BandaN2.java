/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131267_proyecto_3;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aa622
 */
public class BandaN2 extends Nacional{
    private int albums; //Un metodo creado 

    public BandaN2() {
        super();
        this.albums = 0;
    }

    public BandaN2( String nombre, String genero, int integrantes, String estado, int albumes) {
        super(nombre, genero, integrantes, estado);
        this.albums = albumes;
    }

    public int getalbumes() {
        return albums;
    }

    public void setAlbumes(int albumes) {
        this.albums = albumes;
    }
    

    @Override
  public String mostrarInfo(){
      return super.mostrarInfo()+", Albumes: "+this.albums;
  }
  
  @Override
    public void dibujar(int hor, int ver, Component comp, GrupoMusical gm []) {
        Graphics papel = comp.getGraphics();   
       
        int x = hor, y = ver;
        
         
         //Ss la zona en donde se hara el dibujo.
         papel.setColor(Color.lightGray);
         papel.fillRect(10, 10, 320, 230);
         
         //Dibujo 1
            
            papel.setColor(Color.YELLOW);
            papel.fillRect(80, 15+y, 200, 100);
            
            papel.setColor(Color.magenta);
            papel.setFont(new Font("Algerian", Font.BOLD, 32));
            papel.drawString("ENJEMBRE", 90, 70+y);
            papel.setFont(new Font("Century Gothic", Font.PLAIN, 12));
            papel.drawString("-PROANO . MMXIV . dC-", 110, 85+y);
          
            papel.setColor(Color.YELLOW);
            
            papel.setFont(new Font("IMPACT", Font.PLAIN, 10));
            
            papel.drawString("Nombre: ENJAMBRE", 10, 50);
            papel.drawString("Genero: "+gm[3].getGenero(), 10, 70);
            papel.drawString("Integrantes: "+gm[3].getIntegrantes()+"", 10, 90);
            papel.drawString("Albumes: "+this.getalbumes()+"", 10, 110);
            
            papel.drawString("ZACATECAS.", 10, 130);
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
