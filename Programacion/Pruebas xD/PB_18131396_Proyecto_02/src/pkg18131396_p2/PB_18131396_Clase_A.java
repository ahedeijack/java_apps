/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18131396_p2;

/**
 *
 * @author Cris
 */
 class Depositos {
    private int talento, mina, dracma, obolo;

     Depositos(int obolo, int dracma, int mina, int talento) {
        this.talento = talento;
        this.mina = mina;
        this.dracma = dracma;
        this.obolo = obolo;
    }
    
 Depositos(Depositos copia){
        this.talento = copia.talento;
        this.mina = copia.mina;
        this.dracma = copia.dracma;
        this.obolo = copia.obolo;
}

     Depositos(){
        this.talento = 0;
        this.mina = 0;
        this.dracma = 0;
        this.obolo = 0;
    }
    
    public int getTalento() {
        return talento;
    }

    public void setTalento(int talento) {
        this.talento = talento;
    }

    public int getMina() {
        return mina;
    }

    public void setMina(int mina) {
        this.mina = mina;
    }

    public int getDracma() {
        return dracma;
    }

    public void setDracma(int dracma) {
        this.dracma = dracma;
    }

    public int getObolo() {
        return obolo;
    }

    public void setObolo(int obolo) {
        this.obolo = obolo;
    }
     
    public int oboloTotal(){
       return (talento*3600)+(mina*600)+(dracma*6)+(obolo);
    }
    
    public Depositos depObolos(int obolos, int dracma, int mina, int talentos){
        int obfinal = obolos+(dracma*6)+(mina*60)+(talentos+3600);
       
        int divTal = obfinal / 3600;
        int modTal = obfinal % 3600;
        
        
        int divMini = modTal / 600;
        int modMin = modTal %  600;
        
        int divDrac = modMin / 6;
        int obolis = modMin % 6;
        
        return new Depositos(obolis, divDrac, divMini, divTal);
    }
    
    public String toString(){
        return "         Obolos: "+this.obolo+
                    "        Dracmas: "+this.dracma+
                    "        Minas: "+this.mina+
                    "        Talentos: "+this.talento;
    }
    
    public Depositos suma(Depositos copia){
        int obfinal = oboloTotal() + copia.oboloTotal();
        
        int divTal = obfinal / 3600;
        int modTal = obfinal % 3600;
        
        
        int divMini = modTal / 600;
        int modMin = modTal %  600;
        
        int divDrac = modMin / 6;
        int obolis = modMin % 6;
        
        return new Depositos(obolis, divDrac, divMini, divTal);
      
    }
    
    public Depositos resta(Depositos copia){
        int obfinal = oboloTotal() - copia.oboloTotal();
        
        int divTal = obfinal / 3600;
        int modTal = obfinal % 3600;
        
        
        int divMini = modTal / 600;
        int modMin = modTal %  600;
        
        int divDrac = modMin / 6;
        int obolis = modMin % 6;
        
        return new Depositos(obolis, divDrac, divMini, divTal);
      
    }
    
}
