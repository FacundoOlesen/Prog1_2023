package TP6;

import java.util.Random;

public class Ej1 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 4;

    public static void main(String[] args) {
        int[][] mat;
        mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(mat);
        imprimir_matriz(mat);
        intercambiarContenidoPorFila(mat);
        System.out.println("Intercambios:");
        imprimir_matriz(mat);

    }

    public static void cargar_matriz(int[][] matint) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            matint[fila][0] = 0;
            matint[fila][MAXCOLUMNA - 1] = 0;
            for (int col = 1; col < MAXCOLUMNA - 1; col++) {
                if (r.nextDouble() < probabilidad_numero) {
                    matint[fila][col] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
                } else {
                    matint[fila][col] = 0;
                }

            }
        }
    }

    public static void imprimir_matriz(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {

                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static void intercambiarContenidoPorFila(int[][] mat) {
        int fila=0;
        while(fila < MAXFILA){
            int i = 0;
            int j = MAXCOLUMNA-1;
            while (i < j && fila<=MAXFILA) {
                int aux = mat[fila][i];
                mat[fila][i] = mat[fila][j];
                mat[fila][j] = aux;
                i++;
                j--;
               
            }
            fila++;
        }
        
    }

}
