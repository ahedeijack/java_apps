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
 class Beisbol extends Conjunto {
     // Atributos
    private String jugador;
    // Constructores
    public Beisbol() {
        super();
        this.jugador = "Yovani Gallardo";
    }
    public Beisbol(String jugador, String numJugadores, String descripcion, String escenario) {
        super(numJugadores, descripcion, escenario);
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
      hoja.fillOval(x+70,y+50, 120, 120);
      hoja.setColor(Color.RED);
      hoja.drawLine(x+168, y+63, x+168, y+155);
      hoja.setColor(Color.RED);
      hoja.drawLine(x+90, y+63, x+90, y+155);
    }
    public void Desfilar(Component comp)
     {
         Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
            hoja.setColor(Color.white);
            hoja.fillOval(x+70,y+50, 120, 120);
            hoja.setColor(Color.RED);
            hoja.drawLine(x+168, y+63, x+168, y+155);
            hoja.setColor(Color.RED);
            hoja.drawLine(x+90, y+63, x+90, y+155);

          
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
