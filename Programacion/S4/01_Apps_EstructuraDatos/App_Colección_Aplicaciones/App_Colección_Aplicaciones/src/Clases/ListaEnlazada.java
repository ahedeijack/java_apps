package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class ListaEnlazada {
    Nodo primero;
    Nodo actual;
    
    public ListaEnlazada(){

    }
    
    public void Insertar(Nodo nodo){
        Nodo anterior;
        if(ListaVacia()||primero.valor>nodo.valor){
            primero= new Nodo(nodo.valor,nodo.nombres,nodo.iguales, primero);
        }
        else{
            anterior = primero;
            while(anterior.sig!=null && anterior.sig.valor<=nodo.valor)
                anterior = anterior.sig;
            anterior.sig = new Nodo(nodo.valor, nodo.nombres, nodo.iguales, anterior.sig);
        }
    }
    
    public void Mostrar(){
        Nodo aux;
        aux = primero;
        while(aux!=null){
            System.out.print(aux.valor+" -> ");
            aux = aux.sig;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public void Siguiente(){
        if(actual!=null)
            actual = actual.sig;
    }
    public void Primero(){
        actual = primero;
    }
    
    public void Borrar(int v){
        Nodo anterior, nodo;
        nodo = primero;
        anterior = null;
        while(nodo!=null && nodo.valor<v){
            anterior = nodo;
            nodo = nodo.sig;
        }
        if(nodo==null||nodo.valor!=v)
            return;
        else{
            if(anterior ==null)
                primero=nodo.sig;
            else
                anterior.sig=nodo.sig;
        }
    }

    public boolean ListaVacia(){
        if(primero==null)
            return true;
        return false;
    }
    
    public void Ultimo(){
        Primero();
        if(!ListaVacia())
            while(actual.sig!=null)
                Siguiente();
    }
    public boolean Actual(){
        if(actual!=null)
            return true;
        return false;
    }
    public int ValorActual(){
        return actual.valor;
    }
    
public void muestra(DefaultListModel jt, JList lista, String archivo){
     Nodo p1;
     p1 = primero;
     StringBuilder sb = new StringBuilder(1000);
     while(p1 != null){
              sb.append(p1.nombres).append("/");
              p1 = p1.sig;
     }  
             jt.addElement(sb+archivo);
             lista.setModel(jt);
    }

public String datosInfo(String v, String archivo){
    Nodo p1;
    p1 = primero;
    if(!ListaVacia() && p1.nombres.equals(v)){
       return p1.nombres+"/"+p1.sig+"/"+archivo;
    } else {
        p1 = p1.sig;
    }
    return "El archivo no se encontro...";
}

}
