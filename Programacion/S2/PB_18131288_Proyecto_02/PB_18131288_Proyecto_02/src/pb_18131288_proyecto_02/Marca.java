/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_02;

/**
 *
 * @author Ahedeijak
 */
public class Marca {
    private String miHostal;
    private Hostal miInicial;
    private Hostal miFinal;
    
    //Constructores
    public Marca(){
        miHostal = "noId";
        miInicial = new Hostal();
        miFinal = new Hostal();
    }
    
    public Marca(String noNombre, Hostal noInicial, Hostal noFinal){
        miHostal = noNombre;
        miInicial = new Hostal (noInicial);
        miFinal = new Hostal (noFinal);
    }
    
    //Set
    public void setHostal(String noNombre){
        miHostal = noNombre;
    }
    public void setInicial(Hostal noInicial){
        miInicial = noInicial;
    }
    public void setFinal(Hostal noFinal){
        miFinal = noFinal;
    }
    
    //Get
    public String getHostal(){
        return miHostal;
    }
    public Hostal getInicio(){
        return miInicial;
    }
    public Hostal getFinal(){
        return miFinal;
    }
    //Metodos
    public Hostal hostalesVendidos(){
        return miInicial.resta(miFinal);
    }
    
}
