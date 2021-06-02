/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_01;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Ahedeijak
 */
public class Circuito {
    
private Corriente[] miCorriente;
    
public Circuito(){ //Cuando el circuito viene vacio
    miCorriente = new Corriente[30];
   
    for (int  i = 0; i<miCorriente.length; i++)
    miCorriente[i] = new Corriente();
 
    }
  
public Circuito(int n){
    
    miCorriente = new Corriente[n];

    for(int i = 0; i<miCorriente.length; i++)
    miCorriente[i] = new Corriente();
    
}

public void setCircuito (Corriente c, int posicion){
    miCorriente[posicion] = c;
}

public Corriente  getCorriente (int posicion){
    return miCorriente[posicion];
}

public int getTamano(){
    return miCorriente.length;
}

public Corriente mayor (){
Corriente may = miCorriente[0];

for (int i = 0; i<miCorriente.length; i++){
    if (miCorriente[i].resGalvanometro() > may.resGalvanometro()){
        may = miCorriente[i];
    }
}

return may;
}

public Corriente menor(){
Corriente men = miCorriente[0];

for (int i = 0; i<miCorriente.length; i++){
    if (miCorriente[i].resGalvanometro() < men.resGalvanometro()){
        men = miCorriente[i];
    }
}

return men;
}
 
public void ordenCorrienteGalvanometro(){
for (int i = 0; i<miCorriente.length-1; i++){
    for(int j = i+1; j<miCorriente.length; j++){
        if(miCorriente[i].resGalvanometro() < miCorriente[j].resGalvanometro()){
            Corriente ordenG = miCorriente[i];
            miCorriente[i] = miCorriente[j];
            miCorriente[j] = ordenG;
        }
        
    }
}
}

public void ordenAlfabetico(){
   for (int i = 0; i<miCorriente.length-1; i++){
    for(int j = i +1; j<miCorriente.length; j++){
        if (miCorriente[i].getNombre().compareTo(miCorriente[j].getNombre()) > 0){
            Corriente ordenA = miCorriente[i];
            miCorriente[i] = miCorriente[j];
            miCorriente[j] = ordenA;
        }
        
    }
}
}

 public void mostrar(JTable tabla, JLabel etiqueta)
    {
        DecimalFormat d = new DecimalFormat("#,###,##0.00");
        double total1 = 0 ;
        
        for (int r=0; r<miCorriente.length; r++)
        {
            tabla.setValueAt(miCorriente[r].getNombre(), r, 0);
            tabla.setValueAt(miCorriente[r].getVoltaje(), r, 1);
            tabla.setValueAt(d.format(miCorriente[r].resGalvanometro()), r, 2);
            tabla.setValueAt(miCorriente[r].getResistencia(), r, 3);
            tabla.setValueAt(miCorriente[r].getResMultiplicadora(), r, 4);
            
            total1 += miCorriente[r].resGalvanometro();
        }
        
        etiqueta.setText(d.format(total1 / miCorriente.length));
    }

}
