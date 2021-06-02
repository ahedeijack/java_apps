/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_012019_Obj2;

/**
 *
 * @author aa602
 */
public class PB_01_02_19_objetos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alm uno = new alm();
        alm dos = new alm("juan",90,50,70,75);
        alm tres = new alm(dos);
        uno.setNom("Raul");
        uno.setAsis(70);
        uno.setProye(70);
        uno.setExa(60);
        uno.setTar(70);
        
        tres.setNom("maria");
        System.out.println("calificación de "+uno.getNom() + " -->" + uno.cali());
        System.out.println("calificación de "+dos.getNom() + " -->" + dos.cali());
        System.out.println("calificación de "+tres.getNom() + " -->" + tres.cali());
        
        System.out.println();
        System.out.println(uno.toString());
        System.out.println(dos);
        System.out.println(tres);
    }
    
}
