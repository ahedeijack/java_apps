/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.ArrayList;
import javax.swing.ButtonGroup;

/**
 *
 * @author ahdeijack
 */
 class Pila {
   ArrayList<TipoElem> _elems;
   int _capacidad;
   
   public Pila(){
       _elems = new ArrayList<>();
       _capacidad = 0;
   }
   
   public Pila(int capacidad){
       _elems = new ArrayList<>();
       _capacidad = capacidad <= 0 ? 0 : capacidad;
   }
   
   public boolean Full(){
       return _capacidad > 0 && _capacidad == _elems.size();
   }
   
   public boolean Empty(){
       return _elems.isEmpty();
   }
   
   public void Push(TipoElem elem){
       if(! Full()){
           _elems.add(elem);
       }
   }
   
    public TipoElem Pop(){
       if(!this.Empty()){
           return _elems.remove(_elems.size()-1);
       } else {
           return new TipoElem();
       }
   }
    
     public int Length(){
       return _elems.size();
   }
   
   public void EliPenul(){
       if(_elems.size() > 1){
           _elems.remove(_elems.size()-2);
       }
   }
   
   public TipoElem Tope(){
       return ! Empty() ? _elems.get(_elems.size()-1) : new TipoElem();
   }
   
   public TipoElem Fondo(){
       if(_elems.size()>0){
           return _elems.get(0);
       } else {
           return new TipoElem();
       }
   }
   
   public void InterFondoTope(){
       if(_elems.size()>1){
           TipoElem fondo = new TipoElem(_elems.get(0));
           _elems.set(0, _elems.get(_elems.size()-1));
           _elems.set(_elems.size()-1, fondo);
       }
   }
   
   public void ElimTodosMenosTope(){
       while(_elems.size() > 1){
           _elems.remove(0);
       }
   }
   
   public void Inter2ElemsEnTope(){
       if(_elems.size()>1){
           TipoElem tope = new TipoElem(_elems.get(_elems.size()-1));
           _elems.set(_elems.size()-1,_elems.get(_elems.size()-2));
           _elems.set(_elems.size()-2, tope);
       }
   }
   
  public void InterPenUltAux(){
      Pila aux = new Pila();
            aux.Push(this.Pop());
            TipoElem seg = this.Pop();
            while(this.Length()>1){
                aux.Push(this.Pop());
            }
            TipoElem fondo = this.Pop();
            this.Push(seg);
            while(aux.Length()>1){
                this.Push(aux.Pop());
            }
            this.Push(fondo);
            this.Push(aux.Pop());
  }
   
 }
