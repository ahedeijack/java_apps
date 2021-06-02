/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

import java.awt.Component;

/**
 *
 * @author Ahedeijak
 */
pubic class LittleJesus extends Nacional {
    private int albumes;

    public LittleJesus() {
        super();
        albumes = 0;
    }

  public LittleJesus(String nombre, String genero, int integrantes, String estado, int albumes) {
        super(nombre,  genero,  integrantes,  estado);
        this.albumes = albumes;
    }
  
 public int getAlbumes(){
    return this.albumes;
}
 
 public void setAlbumes(int albumes){
     this.albumes = albumes;
 }

 
    /**
     *
     * @return
     */
    @Override
  public String mostrarInfo(){
      return super.mostrarInfo()+", Albumes: "+this.albumes;
  }
  
   @Override
    public void dibujar(int hor, int ver, Component comp, PB_18131288_Clase_A gm []) 
    
    @Override
    public void mover(Component comp, GrupoMusical gm []) {
        int x = 0, y = 0;
         for(int v = 1; v<35; v=v+5){
            for(int h = 1; h<35; h = h+5){
                x +=2;
                y += 2;
                this.dibujar(x, y, comp, gm);
            }
        }
    }
  
  
    
    
    
    
    
    
}
