/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18131396_p2;

/**
 *
 * @author Cris
 */
 class Cliente {
    private String nombre;
    private Depositos dep_inicial;
    private Depositos dep_final;

    
       Cliente(String nombre, Depositos dep_inicial, Depositos dep_final) {
        this.nombre = nombre;
        this.dep_inicial = dep_inicial;
        this.dep_final = dep_final;
    }
      
       Cliente(Cliente copia) {
        this.nombre =copia. nombre;
        this.dep_inicial = copia.dep_inicial;
        this.dep_final = copia.dep_final;
    }
        Cliente(){
           this.nombre = "noID";
           this.dep_final = new Depositos();
           this.dep_final = new Depositos();
       }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Depositos getDep_inicial() {
        return dep_inicial;
    }

    public void setDep_inicial(Depositos dep_inicial) {
        this.dep_inicial = dep_inicial;
    }

    public Depositos getDep_final() {
        return dep_final;
    }

    public void setDep_final(Depositos dep_final) {
        this.dep_final = dep_final;
    }

    public Depositos depTotales (){
        return this.getDep_final().resta(this.getDep_inicial());
    }
}
