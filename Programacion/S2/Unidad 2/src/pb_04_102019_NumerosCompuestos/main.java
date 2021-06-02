/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_04_102019_NumerosCompuestos;

/**
 *
 * @author aa624
 */
public class main {
  public static void main(String args[]){
      //Al definir el metodo "Mostrar" en la clase padre, los demas objetos tienen que codificar el mismo metodo
      // NumeroCompuesto nc = new NumeroCompuesto(4,2); //No puede crearse un objeto de una clase abstracta
      Punto p = new Punto(-5,8);
      Fraccion f = new Fraccion(3,7);
      Complejo c = new Complejo(-9,6);
      NumeroCompuesto c2 = new Complejo(2,-7);
      NumeroCompuesto f2 = new Fraccion(1,5);
      
//      System.out.println(nc.desplegar());
      System.out.println(p.desplegar());
      System.out.println(f.desplegar());
      System.out.println(c.desplegar());
      System.out.println(c2.desplegar());
      System.out.println(f2.desplegar());
      
      System.out.println();
      
      
      System.out.println(p.mostrar());
      System.out.println(f.mostrar());
      System.out.println(c.mostrar());
      System.out.println(c2.mostrar());
      System.out.println(f2.mostrar());
      
      NumeroCompuesto [] num = new NumeroCompuesto[5];
      
      num[0] = p;
      num[1] = f;
      num[2] = c;
      num[3] = c2;
      num[4] = f2;
      
      System.out.println();
      
      for(NumeroCompuesto n:num)
          System.out.println(n.desplegar()+"  "+n.mostrar());
  }  
}
