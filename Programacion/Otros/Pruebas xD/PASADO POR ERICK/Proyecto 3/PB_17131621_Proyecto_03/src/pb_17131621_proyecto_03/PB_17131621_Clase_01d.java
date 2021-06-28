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
class Desarmador extends Manual {
    private String forma;
    
    public Desarmador()
    {
        super();
        this.forma = "Punta Plana";
    }
    
    public Desarmador(String forma, String material, int clave, String descripcion) 
    {
        super(material, clave, descripcion);
        this.forma = forma;
    }
    
    public String getForma()
    {
        return forma;
    }
    
    public void setForma(String forma)
    {
        this.forma = forma;
    }
    
    public String visualizar()
    {
        return super.visualizar()+"\n Forma: "+forma;
    }
    
    public void dibujar(int x, int y, Component comp)
    {
        Graphics hoja =comp.getGraphics();
        
        hoja.setColor(Color.YELLOW);
        hoja.fillOval(x+167, 210, 15, 60);
        
        hoja.setColor(Color.GRAY);
        hoja.fillRect(x+170, 170, 10, 50);
        
        hoja.drawLine(x+175, 170, x+175, 160);
        
        hoja.setColor(Color.MAGENTA);
        hoja.setFont(new Font("Courier",Font.ITALIC,18));
        hoja.drawString("Desarmador", x+190, 200);
        
    }
    
    public void Mover(Component comp)
    {
         Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
            hoja.setColor(Color.YELLOW);
            hoja.fillOval(x+167, 210, 15, 60);
        
            hoja.setColor(Color.GRAY);
            hoja.fillRect(x+170, 170, 10, 50);
        
            hoja.drawLine(x+175, 170, x+175, 160);
        
            hoja.setColor(Color.MAGENTA);
            hoja.setFont(new Font("Courier",Font.ITALIC,18));
            hoja.drawString("Desarmador", x+190, 200);

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


         
