/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

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
 * @author Ahedeijak
 */
 class ClaseA extends Nacional{
    private int albumes; //Un metodo creado 

    public ClaseA() {
        super();
        this.albumes = 0;
    }

    public ClaseA( String nombre, String genero, int integrantes, String estado, int albumes) {
        super(nombre, genero, integrantes, estado);
        this.albumes = albumes;
    }

    public int getalbumes() {
        return albumes;
    }

    public void setAlbumes(int albumes) {
        this.albumes = albumes;
    }
    

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
            
            //Vertical A
            papel.setColor(black);
            papel.drawLine(400-x, 205+y, 400-x, 250+y);
            
            //Vertical B
            papel.setColor(black);
            papel.drawLine(320-x, 205+y, 320-x, 250+y);
            
            //Diagonal A
            papel.setColor(black);
            papel.drawLine(320-x, 250+y, 360-x, 300+y);
            
            //Diagonal B
            papel.setColor(black);
            papel.drawLine(400-x, 250+y, 360-x, 300+y);
            
            //Rectangulo A
            papel.setColor(black);
            papel.fillRect(320-x, 205+y, 80, 25);
            
            papel.setColor(Color.white);
            papel.setFont(new Font("Impact", Font.BOLD, 16));
            papel.drawString("BASTÖN", 335-x, 222+y);
            papel.setFont(new Font("Calibri", Font.PLAIN, 14));
            
            papel.drawString("Nombre: "+gm[1].getNombre(), 100, 220);
            papel.drawString("Genero: "+gm[1].getGenero(), 100, 240);
            papel.drawString("Integrantes: "+gm[1].getIntegrantes()+"", 100, 260);
            papel.drawString("Albumes: "+this.getalbumes()+"", 100, 300);
            
            papel.drawString("Baja Cal. Sur, MX", 100, 280);
            
//papel.drawString(A.mostrarInfo(), 100, 200); //bug 1: Se puede utilizar el 'mostrar info', pero no ya que un bug hace que no siempre funcione el salto de linea y hace que todo se vea en una sola.
            //Logo central A
            papel.setColor(black);
            papel.fillOval(345-x, 235+y, 30, 30);
            
            //Logo central B
            papel.setColor(white);
            papel.fillOval(355-x, 245+y, 10, 10);
            
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
