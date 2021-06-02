/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131396_proyecto_01;

/**
 *
 * @author Hobbit
 */
class FMM {
    
    private String nombre;
    private ModulosMod sistema;
    private Object fmm;
   
    public FMM() {
    nombre = "";
    sistema = new ModulosMod();
    
    }


    FMM(String string, ModulosMod sist, Object fmm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public ModulosMod getSistema(){
        return sistema;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public void setSistema(ModulosMod sis){
        sistema = new ModulosMod(sis);
    }
    
    public Object getFmm(){
        return fmm;
    }
    
}
