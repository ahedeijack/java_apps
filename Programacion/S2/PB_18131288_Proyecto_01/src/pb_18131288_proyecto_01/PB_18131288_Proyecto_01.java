/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_01;

/**
 *
 * @author Ahedeijak
 */
public class PB_18131288_Proyecto_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Corriente c21= new Corriente();
        
        c21.setNombre("C21");
        c21.setResMultiplicadora(75);
        c21.setResistencia(5);
        c21.setVoltaje(480);
        
        System.out.println(c21);
        
        System.out.println("La corriente galvanizadora es de; "+c21.resGalvanometro());
    }
    
}
