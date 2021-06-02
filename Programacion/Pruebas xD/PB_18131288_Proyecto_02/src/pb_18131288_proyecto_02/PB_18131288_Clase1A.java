/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_02;

/**
 *
 * @author Ahedeijak
 */
 class PB_18131288_Clase1A {
    private int miMoyo;
    private int miCantara;
    private int miAzumbre;
    
    //Constructores 
    public PB_18131288_Clase1A(){
        miMoyo = 0;
        miCantara = 0;
        miAzumbre = 0;
    }
    
    public PB_18131288_Clase1A(int moyo, int cantara, int azumbre){
        miMoyo = moyo;
        miCantara = cantara;
        miAzumbre = azumbre;
            
    }
    
    public PB_18131288_Clase1A(PB_18131288_Clase1A copia){
        miMoyo = copia.miMoyo;
        miCantara = copia.miCantara;
        miAzumbre = copia.miAzumbre;
        
    }
    
    //Metodos get
    public int getMoyo(){
        return miMoyo;
    }
  
   public int getCantara(){
       return miCantara;
   }
   
   public int getAzumbre(){
       return miAzumbre;
   }
   
    //Metodos set
   public void setMoyo(int moyo){
       miMoyo = moyo;
   }
   public void setCantara(int cantara){
   miCantara = cantara;
   }
   public void setAzumbre(int azumbre){
   miAzumbre = azumbre;
   }
    
    //Constructores
public String toString(){
    return "M: "+miMoyo+
                "         C: "+miCantara+
            "             A: "+miAzumbre;
}

public int azumbresTotales(){
return (miMoyo * 128) + (miCantara * 8) + miAzumbre;
}
   
public PB_18131288_Clase1A suma (PB_18131288_Clase1A copia){
   int azumbresFinal = azumbresTotales() + copia.azumbresTotales();
   
   int divMoyos = azumbresFinal / 128;
   int modMoyos = azumbresFinal % 128;
   
   int cantaritas = modMoyos / 8;
   int azumbritas = modMoyos % 8;
   
   return new PB_18131288_Clase1A(divMoyos, cantaritas, azumbritas);
   
} 

public PB_18131288_Clase1A resta (PB_18131288_Clase1A copia){
   int azumbresFinal = azumbresTotales() -  copia.azumbresTotales();
   
   int divMoyos = azumbresFinal / 128;
   int modMoyos = azumbresFinal % 128;
   
   int cantaritas = modMoyos / 8;
   int azumbritas = modMoyos % 8;
   
   return new PB_18131288_Clase1A(divMoyos, cantaritas, azumbritas);
}

 public PB_18131288_Clase1A promedio(PB_18131288_Clase1A v, int n)
    {
        int promedio = v.azumbresTotales() / n;
        int moy = promedio / 128; //Determina el numero de moyos totales(resultado)
        int restoAzu = promedio % 128; //Determina el numero de moyos totales(resultado) 
        int can = restoAzu / 8; //Determina el numero de moyos totales(resultado)
        int azu = restoAzu % 8; //Determina el numero de azumbres totales(resultado)
        
        return new PB_18131288_Clase1A(moy, can, azu);
    }     


//Para poder regresar el valor de los azumbres, creamos un nuevo metodo que nos servira
//calculando los azumbres totales de nuestro Inv Inicial y Final. Para esto
//el metodo mandara a llamar un dato del tipo Hostal y regresara un dato double, pues el precio tiene decimales
//Se retara el dato local de tipos Hostal con el dato Hostal que mandamos a llamr
//A estos se les sacara el valor total de Azumbres y se multiplicara por el precio dado que es 1.58
public double precioAzumbres(PB_18131288_Clase1A copia, double precio){
    int Azumbres;
    Azumbres = azumbresTotales() - copia.azumbresTotales();
    double costeTotal = Azumbres * precio;
    
    return costeTotal;
}
    
    
    
    
}
