/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_ferreteria_hash;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author ahdeijack
 */
public class App_Ferreteria_Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tipoProductos[] = {"Martillo", "Pinza","Taladro","Cinta Metrica","Coples"}; 
        String [] tipoXpeso = {"Clavos", "Tornillos","Tachuelas","Taquetes","Cemento"};
        String tipoXmedida []= {"Tubo PVC","Canaleta","Cable Electrico","Manguera"};
        String [] medida = {"No. 1", "No. 2", "No. 3"};
        String [] marca = {"Trupper", "Pretool", "Urrea"};
        
        //Alreatoria la clave (de 4-5 digitos)
        //Precio entre $100.00 - $1000.$$
        //Cantidad aleatoria entre 5 - 15ks 
        Random r = new Random();
        
        Productos prod []= new Productos[7];
        //Usaremos decimal format para darle un formato al ID de las herramientas.
        DecimalFormat df = new DecimalFormat("0000");
        
         /* 
            
            Para poder identificar el tipo de producto, lo que haremos sera un random de cada uno de los
            tipos de productos que tenemos (Herramienta, Peso y Medida), y según el numero que toque,
            sera el tipo de producto que buscaremos. 
            
         */

        for (int i = 0; i < prod.length; i++) {
         int seleccion = r.nextInt(3)+1;
         int cantidad = r.nextInt(15)+1;
         int id = r.nextInt(9999);
         String tipo;
            
            switch(seleccion){
                case 1: //En caso de que sea tipo 1, seran herramientas. 
                      tipo = tipoProductos[r.nextInt(tipoProductos.length)];
                      prod[i] = new Productos(Integer.parseInt(df.format(id)),
                                                         cantidad,
                                                         tipo+" "+marca[r.nextInt(marca.length)],
                                                         cantidad*r.nextInt(850)+150);
                      break;
                case 2: //Caso 2, por peso.
                     tipo = tipoXpeso[r.nextInt(tipoXpeso.length)];
                      prod[i] = new Productos(Integer.parseInt(df.format(id)),
                                                         cantidad,
                                                         tipo+" "+marca[r.nextInt(marca.length)],
                                                         cantidad*r.nextInt(850)+150);
                      break;
                case 3: //Caso 3, por medida
                      tipo = tipoXmedida[r.nextInt(tipoXmedida.length)];
                      prod[i] = new Productos(Integer.parseInt(df.format(id)),
                                                         cantidad,
                                                         tipo+" "+medida[r.nextInt(medida.length)],
                                                         cantidad*r.nextInt(850)+150);
                      break;
                default:
                    prod[i] = new Productos();
                    break;
            }

        }
        
        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i].toString());
        }
       
    }
    /*
    clave, cant. descripcion. precio 
    */
    
}
