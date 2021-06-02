/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_02_012019_Obj2;

/**
 *
 * @author aa602
 */
public class alm {
    //atributos
    private String nom;
    private int asis;
    private int tar;
    private int pry;
    private int exa;
    //constructores
    public alm(){
        nom = "no-id";
        asis = 0;
        tar = 0;
        pry = 0;
        exa = 0;
    }
    public alm(String name, int ast,int tr, int py, int ex){
        nom = name;
        asis = ast;
        tar = tr;
        pry = py;
        exa = ex;
    }
    public alm(alm a){
        nom = a.nom;
        asis = a.asis;
        tar = a.tar;
        pry = a.pry;
        exa = a.exa;
    }
    //get/set
    public String getNom(){
        return nom;
    }
    public int getAsist(){
        return asis;
    }
    public int getTareas(){
        return tar;
    }
    public int getProy(){
        return pry;
    }
    public int getExa(){
    return exa;
    }
    public void setNom(String nomb){
        nom = nomb;
    }
    public void setAsis(int asies){
        asis = asies;
    }
    public void setTar(int tare){
        tar = tare;
    }
    public void setProye(int proye){
        pry = proye;
    }
    public void setExa(int exi){
        exa = exi;
    }
     @Override
     public String toString(){
        return nom + 
                " asist: " + asis +
                " tareas: " + tar +
                " proy: " + pry +
                " examen: " + exa ;
    }
     //metodos de procesos
     public double cali(){
         return (asis*0.06)+(tar * 0.12)+(pry * 0.22)+(exa*0.7);
     }
}