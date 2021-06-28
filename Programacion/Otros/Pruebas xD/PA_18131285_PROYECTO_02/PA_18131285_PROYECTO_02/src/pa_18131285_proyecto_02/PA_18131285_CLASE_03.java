/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131285_proyecto_02;

/**
 *
 * @author gamer
 */
class moneda {
    private String nombre;
    private Saldo inicial;
    private Saldo Final;
    private Saldo Deposito;

    public moneda(){
        nombre = "no-ID";
        inicial = new Saldo();
        Final = new Saldo();
        Deposito = new Saldo();
    }
    
    public moneda(String nombre, Saldo inicial, Saldo Final, Saldo Deposito) {
        this.nombre = nombre;
        this.inicial = inicial;
        this.Final = Final;
        this.Deposito = Deposito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Saldo getInicial() {
        return inicial;
    }

    public void setInicial(Saldo inicial) {
        this.inicial = inicial;
    }

    public Saldo getFinal() {
        return Final;
    }

    public void setFinal(Saldo Final) {
        this.Final = Final;
    }

    public Saldo getDeposito() {
        return Deposito;
    }

    public void setDeposito(Saldo Deposito) {
        this.Deposito = Deposito;
    }
    
}
