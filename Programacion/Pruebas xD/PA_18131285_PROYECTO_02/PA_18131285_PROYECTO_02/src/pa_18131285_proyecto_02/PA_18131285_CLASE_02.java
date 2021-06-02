/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131285_proyecto_02;

/**
 *
 * @author gamer
 */
 class Saldo {
     private int libra;
    private int chelin;
    private int penique; 
    
    //Constructores
    public Saldo(){
        libra = 0;
        chelin = 0;
        penique = 0;
    }
    
    public Saldo(int lib, int chl, int pen){
        libra = lib;
        chelin = chl;
        penique = pen;
    }
    
    public Saldo(Saldo s){
        libra = s.libra;
        chelin = s.chelin;
        penique = s.penique;
    }

    public int getLibra() {
        return libra;
    }

    public void setLibra(int libra) {
        this.libra = libra;
    }

    public int getChelin() {
        return chelin;
    }

    public void setChelin(int chelin) {
        this.chelin = chelin;
    }

    public int getPenique() {
        return penique;
    }

    public void setPenique(int penique) {
        this.penique = penique;
    }
    
    public  int LibrasTotales(){
        return (int) (chelin * 0.75 + penique * 0.240 + libra);
    }
    
    public Saldo Suma(Saldo s){
        int  librastot = LibrasTotales() + s.LibrasTotales();
        int chelines = librastot/4;
        int peniques = librastot/240;
        int libras = librastot;
        return new Saldo (libras, chelines, peniques);
    }
    
    public Saldo resta(Saldo r){
        int  librastot = LibrasTotales() + r.LibrasTotales();
        int chelines = librastot/4;
        int peniques = librastot/240;
        int libras = librastot;
        return new Saldo (libras, chelines, peniques);
    }
    
    
    public String toString(){
        return "Libras: " + libra +
               " | Chelines: " + chelin +
               " | Peniques: " + penique ;
    }
}
