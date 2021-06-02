/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_02;

/**
 *
 * @author RicardoMtz
 */
class Kiosco {
    private Perfume [] tienda;
    
    public Kiosco(int n)
    {
        tienda = new Perfume[n];
        
        for(int i=0; i<tienda.length; i++)
            tienda[i] = new Perfume();
    }
    
    public void setPerfume(Perfume p, int index)
    {
        tienda[index] = p;
    }
    
    public Perfume getPerfume(int index)
    {
        return tienda[index];
    }
    
    public int getTamaño()
    {
        return tienda.length;
    }
    
    public void ordenar()
    {
        for (int i=0; i<tienda.length-1; i++)
            for(int j=i+1; j<tienda.length; j++)
                if (tienda[i].contenidoVendido().onzasTotales()>
                    tienda[j].contenidoVendido().onzasTotales())
                {
                    Perfume aux = tienda[i];
                    tienda[i] = tienda[j];
                    tienda[j] = aux;
                }
    }
}
