/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_03;

import java.awt.Component;

/**
 *
 * @author RicardoMtz
 */
class Manual extends Herramienta {
    
    private String material;
    
    public Manual()
    {
        super();
        material = "No-ID";
    }
    
    public Manual(String material, int clave, String descripcion)
    {
        super(clave, descripcion);
        this.material = material;
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public void setMaterial(String material)
    {
        this.material = material;
    }
    
    public String visualizar()
    {
        return super.visualizar()+" \nMaterial: "+material;
    }
    public void Mover(Component comp)
    {
        
    }
    
}
