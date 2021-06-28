package appevaluacionlistas;

public class AppEvaluacionListas {

    public static void main(String[] args) {
        ListaEnlazada_N lista = new ListaEnlazada_N();
        lista.Insertar(20);
        lista.Insertar(15);
        lista.Insertar(1);
        lista.Insertar(5);
        lista.Insertar(3);
        lista.Insertar(17);
        lista.Mostrar();
        lista.Borrar(5);
        lista.Mostrar();
        lista.Borrar(17);
        lista.Mostrar();
       
    }
    
}
