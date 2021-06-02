/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131237_proyecto_03;

import java.awt.Component;
import javax.swing.JLabel;

/**
 *
 * @author lDestroyerl
 */
interface IMostrar {
    
    void dibujar(Component comp, GrupoMusical datos[], String lugar [], int numAlbum []);
    
    void mover(int x, Component comp, GrupoMusical datos[], String lugar [], int numAlbum []);
}
