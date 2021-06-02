/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_03_272019_AplicacionEmpresa;

/**
 *
 * @author aa603
 */
public class Main {
    public static void main(String args[]){
        
        Empleado pedro = new Empleado(1,"Pedro Lopez");
        
        Administrativo laura = new Administrativo();
        laura.setNumero(7);
        laura.setNombre("Laurita");
        laura.setDiasTrabajados(15);
        laura.setSueldoDiario(400);
        
        Ejecutivo luis = new Ejecutivo(9, "Luis Perez", 30,600,5000);
        
        
        
        
        Taller javier = new Taller(5, "Javier Perez", 500,4);
        
        Ventas maria = new Ventas();
        maria.setNumero(5);
        maria.setNombre("Maria Lopez");
        maria.setVentasTotales(40000);
        maria.setComision(6);
        
        System.out.println(pedro);
        System.out.println(laura);
        System.out.println(luis);
        System.out.println(javier);
        System.out.println(luis);
        
        System.out.println("Sueldo de "+laura.getNombre()+" es de: "+laura.sueldo());
        System.out.println("Sueldo de "+luis.getNombre()+" es de: "+luis.sueldo());
        System.out.println("Sueldo de "+javier.getNombre()+" es de: "+javier.sueldo());
        System.out.println("Sueldo de "+maria.getNombre()+" es de: "+maria.sueldo());
        
        Empleado [] lista = new Empleado [6];
        
        lista[0] = pedro;
        lista[1] = laura;
        lista[2] = luis;
        lista[3] = javier;
        lista[4] = maria;
        lista[5] = new Ventas(8, "Raul Hernandez", 100000, 5);
        
        for(int i = 0; i<lista.length-1; i++){
            for(int j = i+1; j<lista.length; j++){
                if(lista[i].sueldo() < lista[j].sueldo()){
                    Empleado aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
        System.out.println();
        
        for(Empleado e:lista)
            System.out.println(e.getNum()+" • "+e.getNombre()+" • "+e.sueldo());
        
            }
}
