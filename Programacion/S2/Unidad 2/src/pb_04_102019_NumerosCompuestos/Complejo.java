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
public class Complejo extends NumeroCompuesto {
  
    Complejo(){
        super();
    }
    Complejo(int real, int img){
        super(real, img);
    }
    
    public void setReal(int real){
        setValor1(real);
    }
    public void setImg(int img){
        setValor2(img);
    }
    
    public int getReal(){
        return getValor1();
    }
    public int getImg(){
        return getValor2();
    }

    @Override
    public String mostrar() {

        String cad = getReal()+"";
        if(getImg() >= 0){
            cad = cad + "+";
        }
        
        cad = cad + getImg() + "i";
        return cad;
        
    }
    
    
    
}
