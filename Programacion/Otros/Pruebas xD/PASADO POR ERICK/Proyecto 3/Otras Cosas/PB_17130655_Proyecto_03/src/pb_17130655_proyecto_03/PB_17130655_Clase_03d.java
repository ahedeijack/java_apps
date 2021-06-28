/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17130655_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
class Ajedrez extends Individual {
    // Atributos
    private String jugador;
    // Constructores
    public Ajedrez() {
        super();
        this.jugador = "Bobby Fisher";
    }
    public Ajedrez(String jugador, String tipoCalificacion, String descripcion, String escenario) {
        super(tipoCalificacion, descripcion, escenario);
        this.jugador = jugador;
    }
    // Metodos
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    
    public String ver()
    {
        return super.ver()+"\n Jugador: "+jugador;
    }
    
    public void dibujar(int x,int y, Component comp)
    {
         Graphics hoja =comp.getGraphics();
        
          hoja.setColor(Color.white);
          hoja.fillRect(x+50, y+25, 180, 160);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+50, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+90, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+130, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+170, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+210, y+30, 20, 30);
          //
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+70, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+110, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+150, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+190, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          //
          hoja.fillRect(x+50, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+90, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+130, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+170, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+210, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          //
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+70, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+110, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+150, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+190, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          //
          hoja.fillRect(x+50, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+90, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+130, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+170, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+210, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
    }
    public void Desfilar(Component comp)
     {
         Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
             
          hoja.setColor(Color.white);
          hoja.fillRect(x+50, y+25, 180, 160);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+50, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+90, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+130, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+170, y+30, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+210, y+30, 20, 30);
          //
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+70, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+110, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+150, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+190, y+60, 20, 30);
          hoja.setColor(Color.BLACK);
          //
          hoja.fillRect(x+50, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+90, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+130, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+170, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+210, y+90, 20, 30);
          hoja.setColor(Color.BLACK);
          //
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+70, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+110, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+150, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+190, y+120, 20, 30);
          hoja.setColor(Color.BLACK);
          //
          hoja.fillRect(x+50, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+90, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+130, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+170, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          hoja.fillRect(x+210, y+150, 20, 30);
          hoja.setColor(Color.BLACK);
          
          try {
    Thread.sleep(20);
    } catch (InterruptedException ex) {
    Logger.getLogger(PB_17130655_Frame_03b.class.getName()).log(Level.SEVERE, null, ex);
    }
    hoja.clearRect(0, 0, 381, 239);
    //Va borrando las figuras despues de haber pasado por ahi
            
    comp.getGraphics().clearRect(5, 70, comp.getWidth()-10, comp.getHeight()-10);
    x++;        
    y++;
         }
     }
    
      
}
