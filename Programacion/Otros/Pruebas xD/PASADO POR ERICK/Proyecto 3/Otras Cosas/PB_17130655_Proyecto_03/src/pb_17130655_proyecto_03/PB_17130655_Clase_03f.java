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
class Boxeo extends Individual {
    // Atributos
    private String locutor;
    // Constructores
    public Boxeo() {
        super();
        this.locutor = "";
    }

    public Boxeo(String locutor, String tipoCalificacion, String descripcion, String escenario) {
        super(tipoCalificacion, descripcion, escenario);
        this.locutor = locutor;
    }
    // Metodos
    public String getLocutor() {
        return locutor;
    }

    public void setLocutor(String locutor) {
        this.locutor = locutor;
    }
    public String ver()
    {
        return super.ver()+"\n Locutor: "+locutor;
    }
    public void dibujar(int x,int y, Component comp)
    {
         Graphics hoja =comp.getGraphics();
         hoja.setColor(Color.RED);
        hoja.fillOval(x+75,y+25, 120, 120);
        hoja.setColor(Color.RED);
        //
        hoja.setColor(Color.RED);
        hoja.fillRect(x+24, y+55, 60, 60);
        
    }
    public void Desfilar(Component comp)
     {
         Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
            hoja.setColor(Color.RED);
            hoja.fillOval(x+75,y+25, 120, 120);
            hoja.setColor(Color.RED);
            //
            hoja.setColor(Color.RED);
            hoja.fillRect(x+24, y+55, 60, 60);
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
