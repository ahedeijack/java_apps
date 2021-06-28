
package pa_19130520_proyecto_02;

public class PA_19130520_Clase_02_Cemento {
    private int tonelada;
    private int bulto;
    private int kilogramo;
            

    public PA_19130520_Clase_02_Cemento() {
        tonelada=0;
        bulto=0;
        kilogramo=0;
    }

    public PA_19130520_Clase_02_Cemento(int tonelada, int bulto, int kilogramo) {
        this.tonelada = tonelada;
        this.bulto = bulto;
        this.kilogramo = kilogramo;
    }
    
    public PA_19130520_Clase_02_Cemento(PA_19130520_Clase_02_Cemento cemento) {
        tonelada = cemento.tonelada;
        bulto = cemento.bulto;
        kilogramo = cemento.kilogramo;
    }

    public int getTonelada() {
        return tonelada;
    }

    public void setTonelada(int tonelada) {
        this.tonelada = tonelada;
    }

    public int getBulto() {
        return bulto;
    }

    public void setBulto(int bulto) {
        this.bulto = bulto;
    }

    public int getKilogramo() {
        return kilogramo;
    }

    public void setKilogramo(int kilogramo) {
        this.kilogramo = kilogramo;
    }
    
    @Override
    public String toString()
    {
        return "Toneladas: "+tonelada+" Bultos: "+bulto+" Kilogramos: "+kilogramo;
    }
    
    //metodos de proceso
    public int kilogramosTotales()
    {
        return tonelada * 1000 + bulto * 50 + kilogramo;
    }
    
    public PA_19130520_Clase_02_Cemento suma(PA_19130520_Clase_02_Cemento cemento)
    {
        int totKilogramos= kilogramosTotales()+cemento.kilogramosTotales();
        
        int toneladas =totKilogramos/1000;  //div
        int restoKilogramos=totKilogramos%1000;  //mod
        
        int bultos=restoKilogramos/16;  //div
        int kilogramos=restoKilogramos%16;  //mod
        
        PA_19130520_Clase_02_Cemento resultante=new PA_19130520_Clase_02_Cemento(toneladas,bultos,kilogramos);
        
        return resultante;
    }
    
    public PA_19130520_Clase_02_Cemento resta(PA_19130520_Clase_02_Cemento clasif)
    {
        int totKilogramos= kilogramosTotales()-clasif.kilogramosTotales();
        
        int toneladas=totKilogramos/128;  //div
        int restoKilogramos=totKilogramos%128;  //mod
        
        int bultos=restoKilogramos/16;  //div
        int kilogramos=restoKilogramos%16;  //mod
        
        PA_19130520_Clase_02_Cemento resultante=new PA_19130520_Clase_02_Cemento(toneladas,bultos,kilogramos);
        
        return resultante;
    }

    
}
