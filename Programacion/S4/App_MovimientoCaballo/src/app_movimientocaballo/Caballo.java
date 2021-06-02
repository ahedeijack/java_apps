/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_movimientocaballo;

import javax.swing.JTable;

/**
 *
 * @author ahdeijack
 */
public class Caballo {
     static final int N = 8;
    static final int n = (N + 1);
    private int[][] tablero = new int[n][n];
    private boolean exito;
    private int[][] SALTO = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1},
    {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
    private int x0, y0;
// constructor

    public Caballo(int x, int y) throws Exception {
        
        x0 = 1;
        y0 = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                tablero[i][j] = 0;
            }
        }
        tablero[x0][y0] = 1;
        exito = false;
    }

    public boolean resolverProblema() {
        saltoCaballo(x0, y0, 2);
        return exito;
    }

    private void saltoCaballo(int x, int y, int i) {
        int nx, ny;
        int k;
        k = 0; // inicializa el conjunto de posibles movimientos
        do {
            k++;
            nx = x + SALTO[k - 1][0];
            ny = y + SALTO[k - 1][1];
// determina si nuevas coordenadas son aceptables
            if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N)
                    && (tablero[nx][ny] == 0)) {
                tablero[nx][ny] = i; // anota movimiento
                if (i < N * N) {
                    saltoCaballo(nx, ny, i + 1);
// se analiza si se ha completado la solución
                    if (!exito) { // no se alcanzó la solución
                        tablero[nx][ny] = 0; // se borra anotación
                    }
                } else {
                    exito = true; // tablero cubierto
                }
            }
        } while ((k < 8) && !exito);
    }
//muestra por pantalla los pasos del caballo

    void escribirTablero() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    void escribirTablero2(JTable tabla) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                tabla.setValueAt(tablero[i][j]+" ", i, j);
            }
            System.out.println();
        }
    }
}
