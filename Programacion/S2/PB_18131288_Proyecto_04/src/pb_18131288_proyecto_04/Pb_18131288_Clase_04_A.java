/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_04;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Ahedeijak
 */
class Dibujo {
    private int num;
    private int lado;
    private int posX;
    private int posY;
    private int color;

    public Dibujo() {
        num = 0;
        lado = 10;
        posX = 10;
        posY = 10;
        color = 0;
    }

    public Dibujo(int num, int posX, int posY, int lado, int color) {
        this.num = num;
        this.lado = lado;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void dibujar(Component zona){
        Graphics papel = zona.getGraphics();
        int posx = this.getPosX();
        int posy = this.getPosY();
        int colores = this.getColor();
        int numero = this.getNum();
        
        switch(colores){
            //Se hace un default y case0 para que cuando no se selecciona un RadioButton de colores se pinte de Gris Oscuro
            case 0: papel.setColor(Color.DARK_GRAY); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
            break;
            case 1: papel.setColor(Color.red); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
                    
            break;        
            case 2: papel.setColor(Color.GREEN); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
            break;
            case 3: papel.setColor(Color.blue); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
                    break;
            case 4: papel.setColor(Color.ORANGE); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
                    
            break;
            case 5: papel.setColor(Color.YELLOW); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
            break;
            case 6: papel.setColor(Color.MAGENTA); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
            break;
            default:papel.setColor(Color.DARK_GRAY); 
                    papel.fillRect(posx, posy, lado, lado);
                    papel.setColor(Color.white); 
                    papel.drawRect(posx, posy, lado-1, lado+1);
                    
            break;
        }
                    papel.setColor(Color.white);
                    papel.setFont(new Font("Centhury Gothic", Font.PLAIN, 10));
                    papel.drawString(""+numero, posx+5, posy+15);
    }
    
    
    
    
}
