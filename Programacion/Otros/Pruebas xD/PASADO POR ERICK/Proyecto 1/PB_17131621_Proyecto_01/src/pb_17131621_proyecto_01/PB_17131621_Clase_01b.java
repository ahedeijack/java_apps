/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_01;

import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author RicardoMtz
 */
class Figura {
    private Rectangulo [] lista;
    
    public Figura()    
    {
        lista = new Rectangulo[3];
        
        for(int i=0; i<lista.length; i++)
            lista[i] = new Rectangulo();
    }
    
     public Figura(int n)
    {
        lista = new Rectangulo[n];
        for (int i=0; i<lista.length; i++)
            lista[i] = new Rectangulo();
    }
     
    public Rectangulo getRectangulo(int index)
    {
        return lista[index];
    }
    
    public void setRectangulo(Rectangulo e, int index)
    {
        lista[index] = e;
    }

    
    public void mostrar(JTable tabla, JLabel etiqueta1, JLabel etiqueta2)
    {
        double TotalArea=0;
        double TotalAltura=0;
        double PromedioAltura=0;
        
        
        for (int r=0; r<lista.length; r++)
        {
            tabla.setValueAt(lista[r].getNombre(), r, 0);
            tabla.setValueAt(lista[r].getBase(), r, 1);
            tabla.setValueAt(lista[r].Altura(), r, 2);
            tabla.setValueAt(lista[r].Area(), r, 3);
            tabla.setValueAt(lista[r].getPerimetro(), r, 4);        
            
            TotalArea+=lista[r].Area();
            TotalAltura+=lista[r].Altura();
            PromedioAltura= TotalAltura/lista.length;
        }
        etiqueta1.setText(TotalArea+"");
        etiqueta2.setText(PromedioAltura+"");
    }
    
    public void ordenarArea()
    {
        for (int i=0; i<lista.length-1; i++)
            for (int j=i+1; j<lista.length; j++)
                if (lista[i].Area()<lista[j].Area())
                {
                    Rectangulo aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
    }
    
    public void ordenarAlfabetico()
    {
        for (int i=0; i<lista.length-1; i++)
            for (int j=i+1; j<lista.length; j++)
                if (lista[i].getNombre().compareTo(lista[j].getNombre())>0)
                {
                    Rectangulo aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
    }
    
    public Rectangulo mayor()
    {
        Rectangulo may = lista[0];

        for (int i=1; i<lista.length; i++)
            if (lista[i].Area()>may.Area())
                may = lista[i];
        
        return may;
    }
    
    public Rectangulo menor()
    {
        Rectangulo men = lista[0];

        for (int i=1; i<lista.length; i++)
            if (lista[i].Area()<men.Area())
                men = lista[i];
        
        return men;
    }
}
