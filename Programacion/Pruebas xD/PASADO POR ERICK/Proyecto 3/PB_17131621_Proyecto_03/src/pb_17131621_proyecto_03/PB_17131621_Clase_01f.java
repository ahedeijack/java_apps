/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RicardoMtz
 */
class Martillo extends Manual {
    private String modelo;
    
    public Martillo()
    {
        super();
        this.modelo = "Uñas";
    }
    
    public Martillo(String martillo, String material, int clave, String descripcion)
    {
        super(material, clave, descripcion);
        this.modelo = modelo;
    }
    
    public String getModelo() 
    {
        return modelo;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String visualizar()
    {
        return super.visualizar()+"\n Modelo: "+modelo;
    }
    
    public void dibujar(int x, int y, Component comp)
    {
        Graphics hoja =comp.getGraphics();
        
        hoja.setColor(Color.yellow);
        hoja.fillRect(x+170, 170, 20, 100);
        
        hoja.setColor(Color.GRAY);
        hoja.fillOval(x+140, 165, 80, 15);
        
        //Tornillo
        hoja.drawLine(x+200, 200, x+210, 200);        
        hoja.drawLine(x+205, 200, x+205, 207);
        
        hoja.setColor(Color.red);
        hoja.setFont(new Font("Courier",Font.ITALIC,18));
        hoja.drawString("Martillo", x+220, 220);
        
    }
    
    public void Mover(Component comp)
    {
        Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
            hoja.setColor(Color.yellow);
            hoja.fillRect(x+170, 170, 20, 100);
        
            hoja.setColor(Color.GRAY);
            hoja.fillOval(x+140, 165, 80, 15);
        
            //Tornillo
            hoja.drawLine(x+200, 200, x+210, 200);        
            hoja.drawLine(x+205, 200, x+205, 207);
        
            hoja.setColor(Color.red);
            hoja.setFont(new Font("Courier",Font.ITALIC,18));
            hoja.drawString("Martillo", x+220, 220);

          try {
    Thread.sleep(20);
    } catch (InterruptedException ex) {
    Logger.getLogger(PB_17131621_Frame_02.class.getName()).log(Level.SEVERE, null, ex);
    }
    hoja.clearRect(0, 0, 381, 239);
    //Va borrando las figuras despues de haber pasado por ahi
            
    comp.getGraphics().clearRect(5, 70, comp.getWidth()-10, comp.getHeight()-10);
            
    x++;        
    y++;
         }
    }
}
