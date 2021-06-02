/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_03_252019_Aplicacionparalelepipedo;

/**
 *
 * @author Ahedeijak
 */
public class Main {
    
    public static void main(String [] args){
        
        Linea regla = new Linea (30);
        
        Rectangulo ventana = new Rectangulo(200,80);
        
        Paralelepipedo escritorio = new Paralelepipedo(130, 75, 60);
        
        System.out.println(regla);
        System.out.println(ventana);
        System.out.println(escritorio);
        
        //Se puede crear objetos en una regerencia de su superclase directa o indirecta
        
        Linea puerta = new Rectangulo(90,120);
        Rectangulo caja = new Paralelepipedo(20,30,50);
        Linea lampara = new Paralelepipedo(60,130,15);
        
        //No se puede hacer a la inversa;
        
        // Rectangulo x = new Linea();
        
        //Se puede hacer un arreglo siempre y cuando se haga con el tipo de dato de la clase padre
        
        Linea [] varios = new Linea[6];
        
        varios[0] = regla;
        varios[1] = ventana;
        varios[2] = escritorio;
        varios[3] = puerta;
        varios[4] = caja;
        varios[5] = lampara;
        
        System.out.println();
        
        for(int i = 0; i<varios.length; i++){
            System.out.println(varios[i]);
        }
        
        for(Linea x:varios){
            System.out.println(x);
        }
        
        
        
    }
    
}
