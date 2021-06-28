/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author pqdst
 */

/*
se requiere establecer la jerarquia de los  elementos y operadores a utilizar,
utilizaremos un "enumerado" <<enum>>, permite definir nuevos tipos de dato
*/

enum simbolo{
    Operando,
    ParIzq,
    ParDer,
    SumRes,
    MultiDiv,
    Pow;
    /*
    los enumerados tienen un constructor el cual debe de ser provado, 
    si no lo estribimos el compilador usara el predetrminado
    */
    public int getValue(){
        return this.ordinal();
    }
}

public class NotacionPolaca {
    
    public final StringBuilder convertirANotacionPostFija(String ExpInfija){
        /*el arreglo <<Epos>> es la salida 
          y debe de ser de la cantidad de caracteres de la expresion infija*/
        char[] Epos = new char[ExpInfija.length()];
        PilaChar opr = new PilaChar(ExpInfija.length());
        /*en el proceso de conversion se lamacenan los operadores*/
        
        int i, pos =0;/*pos se utiliza para manejar/manipular la Epos*/
        for (i = 0; i < ExpInfija.length(); i++) {
            /*se recorre desde la izquierda la expresion infija*/
            char car = ExpInfija.charAt(i);
            simbolo actual = Tipo_Y_Presedencia(car);
            
            switch(actual){
                case Operando:
                    Epos[pos++] = car; //si es operando se inserta en la salida
                    break;
                    
                case SumRes:{
                    
                    while(!opr.isEmpty() && Tipo_Y_Presedencia((char)opr.tope()).getValue() >= actual.getValue()){
                        Epos[pos++] = (char)opr.pop();
                    }
                    opr.push(car);
                }
                    break;
                    
                case MultiDiv:{
                    
                    while(!opr.isEmpty() && Tipo_Y_Presedencia((char)opr.tope()).getValue() >= actual.getValue()){
                        Epos[pos++] = (char)opr.pop();
                    }
                    opr.push(car);
                }
                    break;
                    
                case Pow:{
                    
                    while(!opr.isEmpty() && Tipo_Y_Presedencia((char)opr.tope()).getValue() >= actual.getValue()){
                        Epos[pos++] = (char)opr.pop();
                    }
                    opr.push(car);
                }
                    break;
                    
                case ParIzq:
                    opr.push(car);
                    break;
                    
                case ParDer:
                    char x = (char)opr.pop();                                                       
                            while(Tipo_Y_Presedencia(x) != simbolo.ParIzq) 
                        {
                            Epos[pos++] = x;
                            x = (char)opr.pop();
                          }
                    break;
            }//fin del switch
        }//fin del for
        
        
        while(!opr.isEmpty()){
            if(pos < Epos.length)
                         Epos[pos++] = (char)opr.pop();
            else{
                        break;
                    }
            }
        
        StringBuilder salida = new StringBuilder(ExpInfija);
        for (int j = 0; j < Epos.length; j++) {
            salida.setCharAt(j, Epos[j]);
        }
        return salida;
    }
    
    /* metodo para determinar el tipo y presedencia
      del elemento que se esra analizando (regresa un tipo <<Simbolo>>)*/
    
    public simbolo Tipo_Y_Presedencia(char s){
        
        simbolo simb;
        
        switch(s){
            case '+':
            case '-':
                simb = simbolo.SumRes;
                break;
                
            case '*':
            case '/':
                simb = simbolo.MultiDiv;
                break;
                
            case '^':
                simb = simbolo.Pow;
                break;
                
            case '(':
                simb = simbolo.ParIzq;
                break;
                
            case ')':
                simb = simbolo.ParDer;
                break;
                
            default: simb = simbolo.Operando;
                break;
        }
        return simb;
    }
}
