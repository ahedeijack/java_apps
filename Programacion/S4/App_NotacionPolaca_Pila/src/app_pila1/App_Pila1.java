/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pila1;

import java.util.Random;

/**
 *
 * @author user
 */
public class App_Pila1 {

    /**
     * @param args the command line arguments
     */
    //Establecer Jerarquia
    //De los elementos y operadores a utilizar
    //utilizar el elemento ENUM
      enum Simbolo{
	OPERANDO,
	PIZQ,
	PDER,
	SUMRES,
	MULTDIV,
	POW;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue(){
		return this.ordinal();
	}
        
	public static Simbolo forValue(int value)
	{
		return values()[value];
	}
 }

public class NotacionPolaca {
           
        public final StringBuilder ConvertirPosFija(String Ei)
	{
          // EL ARREGLO Epos debe ser de la cantidad de caracteres
          //que tiene la expresion excepto los parentesis
	        char[] Epos = new char[Ei.length()];
		//StringBuilder[] Epos = new StringBuilder[Ei.Length];   
	        int tam = Ei.length();
               //PARA PRUEBA
              //Epos = new StringBuilder(Ei.Length+2);

          //LA PILA DEBE SER SOLO DE LA CANTIDAD DE
          //OPERADORES QUE HAY EN LA EXPRESION
          
		Pila stack = new Pila(Ei.length());
		int i, pos = 0;
		for (i = 0; i < Epos.length; i++) //Ei.Length; i++)
		{
                 char car = Ei.charAt(i);
                 Simbolo actual = Tipo_y_Precedencia(car);
                 switch (actual)
                 {
		     //case 0: Epos[pos++] = car; break;
	           case OPERANDO:
			Epos[pos++] = car;
		   break;
		     //case 3:
		case SUMRES:
                {
		while (!stack.esta_vacia()&&(Tipo_y_Precedencia((char)stack.Tope()).getValue() >= actual.getValue()))
		{
		     Epos[pos++] = (char)stack.pop();
		}
	            stack.push(car);
		}
		break;
						//case 4:
		case MULTDIV:
		  {
		   while (!stack.esta_vacia() && Tipo_y_Precedencia((char)stack.Tope()).getValue() >= actual.getValue())
                    {
		      Epos[pos++] = (char)stack.pop();
                    }
		      stack.push(car);
		}
		break;
						//case 5:
		case POW:
		{
		  while (!stack.esta_vacia() && Tipo_y_Precedencia((char)stack.Tope()).getValue() >= actual.getValue())
		  {
			Epos[pos++] = (char)stack.pop();
		  }
			stack.push(car);
		}
		break;
		//case 1: stack.push(car); break;
		case PIZQ:
		   stack.push(car);
		break;
		//case 2:
		case PDER:
		{
	            char x = (char)stack.pop();
		       //int typ = Tipo_y_Precedencia(x);
	   	    while (Tipo_y_Precedencia(x) != Simbolo.PIZQ) //1)
		   {
			Epos[pos++] = x;
			x = (char)stack.pop();
	   	   }
		}
		break;
	    } //FIN DEL SWITCH
	   } //fin del for
	   while (!stack.esta_vacia())
	   {
	      if (pos < Epos.length)
	      {
	         Epos[pos++] = (char)stack.pop();
	      }
	      else
	      {
		break;
	      }
	   }
           
	   StringBuilder salida = new StringBuilder(Ei); //Epos.ToString());
	   for (int r = 0; r < Epos.length; r++)
	   {
	      salida.setCharAt(r, Epos[r]);
	   }
	   return salida;
    }//FIN DE NOTACION POLACA

    public Simbolo Tipo_y_Precedencia(char s)
    {
        Simbolo simbolo;
        //int simbolo;            
        switch (s)
        {
            case '+':
                  simbolo = Simbolo.SUMRES;
                  break;
            case '-': 
                  simbolo = Simbolo.SUMRES; 
                  break;
            case '*': 
                   simbolo = Simbolo.MULTDIV; 
                   break;
            case '/': 
                    simbolo = Simbolo.MULTDIV; 
                    break;
            case '^': 
                    simbolo = Simbolo.POW; 
                    break;
            case '(': 
                    simbolo = Simbolo.PIZQ; 
                    break;
            case ')': 
                    simbolo = Simbolo.PDER; 
                    break;
            default: 
                    simbolo = Simbolo.OPERANDO; 
                    break;
        }
        return simbolo;
    }
    //
}

    public static void main(String[] args) {
        // TODO code application logic here
    //
    
    
    
    //
        
    }
}
