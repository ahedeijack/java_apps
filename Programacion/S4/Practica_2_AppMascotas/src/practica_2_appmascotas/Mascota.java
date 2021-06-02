
package practica_2_appmascotas;

/**
 *
 * @DANIEL_CRUZ18131229_
 */
public class Mascota {
    private String nombre, sexo, tipo;
    private int edad, numVacunas;
    private double costVacunas;
    private String [ ] arrTipo = {"OSO", "PERRO", "GATO", "GORILLA", "LORO", "JAMÓN"};

    
    
    public void Copia(Mascota x){
        this.nombre = x.nombre;
        this.sexo = x.sexo;
        this.tipo = x.tipo;
        this.edad = x.edad;
        this.numVacunas = x.numVacunas;
        this.costVacunas = x.costVacunas;
    }
    
    public void Leer(String nombre, String tipo, int edad, int numVacunas, double costVacunas, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.tipo = tipo;
        this.edad = edad;
        this.numVacunas = numVacunas;
        this.costVacunas = costVacunas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumVacunas() {
        return numVacunas;
    }

    public double getCostVacunas() {
        return costVacunas;
    }    
    
    public String getArrTipo(int i){
        if (i<arrTipo.length)
        return arrTipo[i];    
        else
            return "N/A";
    }
    
    public int getArrTipoSize(){
        return arrTipo.length;
    }
}
