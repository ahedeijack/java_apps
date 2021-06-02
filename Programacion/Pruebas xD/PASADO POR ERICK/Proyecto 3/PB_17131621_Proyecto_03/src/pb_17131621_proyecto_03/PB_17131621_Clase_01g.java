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
class Taladro extends Electrica {
    private String marca;
    
    public Taladro()
    {
        super();
        this.marca = "Hitachi";
    }
    
    public Taladro(String taladro, String corriente, int clave, String descripcion)
    {
        super(corriente, clave, descripcion);
        this.marca = marca;
    }
    
    public String getMarca() 
    {
        return marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String visualizar()
    {
        return super.visualizar()+"\n Marca: "+marca;
    }
    
    public void dibujar(int x, int y, Component comp)
    {
        Graphics hoja =comp.getGraphics();
        
        hoja.setColor(Color.orange);
        hoja.fillRect(x+170, 170, 70, 20);
        
        hoja.setColor(Color.GRAY);
        hoja.fillRect(x+170, 190, 10, 20);
        
        hoja.setColor(Color.GRAY);
        hoja.fillOval(x+235, 165, 10, 30);
        
        hoja.drawLine(x+236, 180, x+265, 180);
        
        hoja.setColor(Color.red);
        hoja.setFont(new Font("Courier",Font.ITALIC,18));
        hoja.drawString("Taladro", x+172, 188);
        
        
    }
    
    public void Mover(Component comp)
    {
        Graphics hoja =comp.getGraphics();
         int x = comp.getWidth()-400;
         int y = comp.getHeight()-250;
         
         for (int a = 285 ; a > 0; a--) {
            hoja.setColor(Color.orange);
            hoja.fillRect(x+170, 170, 70, 20);
        
            hoja.setColor(Color.GRAY);
            hoja.fillRect(x+170, 190, 10, 20);
        
            hoja.setColor(Color.GRAY);
            hoja.fillOval(x+235, 165, 10, 30);
        
            hoja.drawLine(x+236, 180, x+265, 180);
        
            hoja.setColor(Color.red);
            hoja.setFont(new Font("Courier",Font.ITALIC,18));
            hoja.drawString("Taladro", x+172, 188);

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
