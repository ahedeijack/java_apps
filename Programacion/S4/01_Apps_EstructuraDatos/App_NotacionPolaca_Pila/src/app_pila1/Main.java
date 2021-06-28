/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pila1;

/**
 *
 * @author ahdeijack
 */

      enum Simbolo{
	OPERANDO,
	PIZQ,
	PDER,
	SUMRES,
	MULTDIV,
	POW;

	public int getValue(){
		return this.ordinal();
	}

 }
    public class NotacionPolaca{
        
public final StringBuilder convertirAnotacionPosFija(String infija) {
            //EI = Expresión infija.
            
            //El arreglo Epos (salida), debe ser de la cantidad de caracteres de la 
            //expresión infija. Excepto otros simbolos.
            
            char[] Epos = new char[infija.length()];
            
            Pila stack = new Pila(infija.length());
            int i, pos = 0;  
            
            for(i = 0; i<infija.length(); i++){
            char car = infija.charAt(i);
            Simbolo actual = Tipo_Y_Precedencia(car);
            
            switch(actual){
                case OPERANDO: Epos[pos++] = car;
                break;
                case SUMRES: {
                    while  (!stack.esta_vacia() &&( Tipo_Y_Precedencia((char)stack.Tope()).getValue()) >= stack.Tope() ){
                
                Epos[pos++] =(char)stack.pop();
                
                }
                stack.push(car);
                }
                break;
                
                case MULTDIV: {
                    while  (!stack.esta_vacia() &&( Tipo_Y_Precedencia((char)stack.Tope()).getValue()) >= stack.Tope() ){
                
                Epos[pos++] =(char)stack.pop();
                
                }
                stack.push(car);
                }
                break;
                case POW:
                    while  (!stack.esta_vacia() &&( Tipo_Y_Precedencia((char)stack.Tope()).getValue()) >= stack.Tope() ){
                
                Epos[pos++] =(char)stack.pop();
                
                }
                stack.push(car);
                
                break;
                
                case PIZQ:
                stack.push(car);
                break;
                
                case PDER:
                char x = (char)stack.pop();
                while(Tipo_Y_Precedencia(x) != Simbolo.PIZQ){
                    Epos[pos++] = x;
                    x = (char)stack.pop();
                }
                
                break;
            } // fin switch
}//Fin for

}
        
        //Metodo para determinar el tipo y precedencia del elemento
        //que se esta analizando. Regresa un tipo "Simbolo"
    
        public Simbolo Tipo_Y_Precedencia(char s){
            Simbolo simbolo;
            
            switch(s){
                case  '+':  
                case  '-':
                                simbolo = Simbolo.SUMRES;
                                break;
                case  '*':
                case '/':
                                simbolo = Simbolo.MULTDIV;
                                break;
                case'^':
                                simbolo = Simbolo.POW;
                                break;
                case '(':
                                simbolo = Simbolo.PIZQ;
                                break;
                case ')':
                                simbolo = Simbolo.PDER;
                                break;
                                
                default: simbolo = Simbolo.OPERANDO;
                            
                //Tarea, validar cuando sea un simbolo de interrogación
            }
            return simbolo;
        }
                


public class Main {
    public static void main (String args[]){
        String cadena = "4873+*2/+";
        StringBuilder sb = new StringBuilder(cadena);
        char [] validar = new char[54];
        
        
    }

}
