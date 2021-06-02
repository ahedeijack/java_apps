/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientos;

import javax.swing.JLabel;

/**
 *
 * @author jose_
 */
public class Ordenamiento {
    
    public void BurbujaDSC(int []vec, JLabel LabComp,JLabel LabInter)
    {                   // n-1
        
        int comp =0; //comparaciones que realiza el método
        int interc = 0; //intercambios que realiza el metodo
        for(int i=0; i<vec.length; i++)
            for(int j=vec.length-1; i<j ;j--)
            {
                comp++;
                if(vec[j-1] < vec[j])
                {
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    interc++;
                }    
            } 
        LabComp.setText("" + comp);
        LabInter.setText("" + interc);
    } 
    
    public void BurbujaASC(int []vec,JLabel LabComp,JLabel LabInter)
    {                   // n-1
        
        int comp =0; //comparaciones que realiza el método
        int interc = 0; //intercambios que realiza el metodo
        for(int i=0; i<vec.length; i++)
            for(int j=vec.length-1; i<j ;j--)
            {
                comp++;
                if(vec[j-1] > vec[j])
                {
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    interc++;
                }    
            } 
        LabComp.setText("" + comp);
        LabInter.setText("" + interc);
    } 
    
    public void BurbujaDSC_ConSeñal(int []vec, JLabel LabComp,JLabel LabInter)
    {                   // n-1
        
        int comp =0; //comparaciones que realiza el método
        int interc = 0; //intercambios que realiza el metodo
        boolean band;
        int i;
        for(i=0, band =false; i<vec.length && !band; i++)
        {    
            band = true;
            for(int j=vec.length-1; i<j ;j--)
            {
                comp++;
                if(vec[j-1] < vec[j])
                {
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    interc++;
                    band = false;
                }    
            } 
        }
        LabComp.setText("" + comp);
        LabInter.setText("" + interc);
    } 
    
    public void BurbujaASC_ConSeñal(int []vec, JLabel LabComp,JLabel LabInter)
    {                   // n-1
        
        int comp =0; //comparaciones que realiza el método
        int interc = 0; //intercambios que realiza el metodo
        int band;
        int i;
        for(i=0, band =0; i<vec.length && band==0; i++)
        {    
            band = 1;
            for(int j=vec.length-1; i<j ;j--)
            {
                comp++;
                if(vec[j-1] < vec[j])
                {
                    int aux = vec[j-1];
                    vec[j-1] = vec[j];
                    vec[j] = aux;
                    interc++;
                    band = 0;
                }    
            } 
        }
        LabComp.setText("" + comp);
        LabInter.setText("" + interc);
    } 
    
//    public void Burbuja2(int []vec)
//    {                   // n-1
//        
//        int comp =0; //comparaciones que realiza el método
//        int interc = 0; //intercambios que realiza el metodo
//        for(int i=0; i<vec.length; i++)
//        {
//            for(int j=i+1; j<vec.length; j++)
//            {
//                comp++;
//                if(vec[i] > vec[j])
//                {
//                    int aux = vec[i];
//                    vec[i] = vec[j];
//                    vec[j] = aux;
//                    interc++;
//                }    
//            } 
//        }    
//        System.out.println("Num. de Comparaciones: " + comp);
//        System.out.println("Num. de Intercambios: " + interc);
//    } 
//    
    public void Shaker_SortASC(int []vec, JLabel LabComp,JLabel LabInter)
    {
            int a, b, c, d, aux, inter=0, comp=0;
            c = 1;
            b = vec.length - 1;
            d = vec.length - 1;
            do
            {
                for (a = d; a >= c; --a)
                {   
                    comp++;
                    if (vec[a - 1] > vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        inter++;
                    }
                }
                c = b + 1;
                for (a = c; a < d + 1; ++a)
                {
                    comp++;
                    if (vec[a - 1] > vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        inter++;
                    }
                }
                d = b - 1;
            } while (c <= d);
            LabComp.setText("" + comp);
            LabInter.setText("" + inter);
    } 
    
    public void Shaker_SortDSC(int []vec, JLabel LabComp,JLabel LabInter)
    {
            int a, b, c, d, aux, inter=0, comp=0;
            c = 1;
            b = vec.length - 1;
            d = vec.length - 1;
            do
            {
                for (a = d; a >= c; --a)
                {
                    comp++;
                    if (vec[a - 1] < vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        inter++;
                    }
                }
                c = b + 1;
                for (a = c; a < d + 1; ++a)
                {
                    comp++;
                    if (vec[a - 1] < vec[a])
                    {
                        aux = vec[a - 1];
                        vec[a - 1] = vec[a];
                        vec[a] = aux;
                        b = a;
                        inter++;
                    }
                }
                d = b - 1;
            } while (c <= d);
            LabComp.setText("" + comp);
            LabInter.setText("" + inter);
    }
    
    public void Shell1(int[]vec, JLabel LabComp,JLabel LabInter)
    {
        boolean band;
        int i, comp=0, inter=0, inc = vec.length;
        while(inc > 1)
        {
            inc /= 2;
            band = true;
            while(band)
            {
                band = false;
                i=0;
                while((i+inc)< vec.length)
                {
                    comp++;
                    if(vec[i]>vec[i+inc])
                    {
                        int aux = vec[i]; //swap
                        vec[i] = vec[i+inc];
                        vec[i+inc] = aux;
                        band = true;
                        inter++;
                    }
                    i++; 
                }    
            }    
        }
        LabComp.setText("" + comp);
        LabInter.setText("" + inter);
    }        
  
    public void Shell2(int [] vec, JLabel LabComp,JLabel LabInter)
 {
     int comp, inter;
     comp = inter= 0;
     int i, j, k, s, w, aux;
     int []a = { 9, 5, 3, 3, 1 };
     /*implementar un metodo para obtener
     la mejor secuencia conforme a valor de N o length*/
     
     for (w = 0; w < a.length; w++)
     {//k respresenta el numero de posiciones a comparar
     k = a[w];
//     s = -k;
     for (i = k; i < vec.length; ++i)
     {
     aux = vec[i];
     j = i - k;
//     if (s == 0)
//     {
//     s = -k;
//     s++;
//     vec[s] = aux;
//     }
     comp++;
     while ( j >= 0&& aux < vec[j]  && j <= vec.length)
     {
     vec[j + k] = vec[j];
     j -= k;
     }
     vec[j + k] = aux;
     inter++;
     }//PRUEBA DE ESCRITORIO CON LOS DATOS DEL SHELL 1
     }
     LabComp.setText("" + comp);
     LabInter.setText("" + inter);
     }
    public void quickSort(int []vec, int izq, int der){
        
        int i,j,pivote,aux;
        i=izq;
        j=der;
        pivote = vec[(izq+der)/2];
        
        do{
            while(vec[i]<pivote&&i<der)
                i++;
            
            while(vec[j]>pivote&&j>izq)
                j--;
            
            if(i<=j){
                aux=vec[i];
                vec[i]=vec[j];
                vec[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(izq<j)
            quickSort(vec,izq,j);
        if(i<der)
            quickSort(vec,i,der);
    }
}
