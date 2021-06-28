/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131615_proyecto_04;

import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author alexc
 */
 class Boton extends JButton {
     //atributos
     private String signo;
     private String fuente;
     private int tamFuente;
     private int color;
     
     //constructores
     public Boton()
     {
         signo = "No-Id";
         setSize(80,80);
         setFont(new Font("Arial", Font.BOLD, 24));
        
     }
     
     public Boton(String sig,String fuente, int tamFuente,int color)
     {
         signo = sig;

         setSize(80,80);
         setFont(new Font("fuente", Font.BOLD, tamFuente));
        
     }
     
   //metodos set/get
    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public int getTamFuente() {
        return tamFuente;
    }

    public void setTamFuente(int tamFuente) {
        this.tamFuente = tamFuente;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
     
    public void mostrarSigno()
    {
        setText(signo+"");
    }
    
    
    
}
