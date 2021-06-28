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
class Llave extends Manual {
    private String tipo;
    
    public Llave()
    {
        super();
        this.tipo = "Combinada Plana";
    }
    
    public Llave(String llave, String material, int clave, String descripcion)
    {
        super(material, clave, descripcion);
        this.tipo = tipo;
    }
    
    public String getTipo() 
    {
        return tipo;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String visualizar()
    {
        return super.visualizar()+"\n Tipo: "+tipo;
    }
    
    public void dibujar(int x, int y, Component comp)
    {
        Graphics hoja =comp.getGraphics();
        
        hoja.setColor(Color.GRAY);
        hoja.fillRect(x+170, 170, 100, 20);
        
        hoja.setColor(Color.pink);
        hoja.setFont(new Font("Courrier", Font.ITALIC,18));
        hoja.drawString("Llave", x+195, 185);
        
        hoja.setColor(Color.GRAY);
        hoja.fillOval(x+145, 163, 30, 30);
        
        hoja.setColor(Color.white);
        hoja.fillOval(x+152, 170, 15, 15);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+270, 195, x+270, 165);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+270, 195, x+290, 195);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+270, 165, x+290, 165);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 165, x+290, 170);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 195, x+290, 190);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 190, x+280, 190);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 170, x+280, 170);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+280, 170, x+280, 190);
        
        
        
    }
    
    public void Mover(Component comp)
    {
     Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
            hoja.setColor(Color.GRAY);
        hoja.fillRect(x+170, 170, 100, 20);
        
        hoja.setColor(Color.pink);
        hoja.setFont(new Font("Courrier", Font.ITALIC,18));
        hoja.drawString("Llave", x+195, 185);
        
        hoja.setColor(Color.GRAY);
        hoja.fillOval(x+145, 163, 30, 30);
        
        hoja.setColor(Color.white);
        hoja.fillOval(x+152, 170, 15, 15);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+270, 195, x+270, 165);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+270, 195, x+290, 195);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+270, 165, x+290, 165);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 165, x+290, 170);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 195, x+290, 190);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 190, x+280, 190);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+290, 170, x+280, 170);
        
        hoja.setColor(Color.GRAY);
        hoja.drawLine(x+280, 170, x+280, 190);

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
