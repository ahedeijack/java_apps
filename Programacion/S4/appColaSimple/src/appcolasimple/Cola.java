/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcolasimple;

/**
 *
 * @author X555Q
 */
public class Cola {
    int []vec;
    int p,u;//tam;
    
    public Cola(int  n)
    {
        p=u=-1;
        //tam =n;
        vec =  new int [n]; 
      
    }
    public boolean esta_llena()
    {
    if(u>=vec.length-1)
        return true;
    return false;
    }
    public boolean esta_vacia()
    {
    if(p==-1)
        return true;
    return false;
    }
    public boolean agregar(int dato){
    if(!esta_llena())
    {
      vec[++u]=dato;
      if(u==0)
          p=0;
      return true;
    }
      return false;
    }
     public boolean extraer(Numero dato){
if(!esta_vacia()){
dato.num = vec[p];
if(p==u){
    p = -1;
    u=p;
}
else
    p++;
return true;
     }
     return false;
}

public int primeroCola()
{
return p;
}

public void mostrar(){
    System.out.println("Datos en la Cola");
for(int i=0;i < vec.length;i++)
//while(!esta_vacia())
        System.out.println("Dato [" + p + "] : "+vec[p++]);
}


}