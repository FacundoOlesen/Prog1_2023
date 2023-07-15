package TP6.Ejemplos;

import java.util.Random;

public class Ejemplo2 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 4;

    public static void main(String[] args) {
        int[][] mat;
        mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(mat);
        imprimir_matriz(mat);
        imprimir_promedios_filas(mat);
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

    public static int promedio_fila(int[][] mat, int columna) {
        int promedio;
        int suma = 0;
        for (int fila = 0; fila < MAXFILA; fila++) {
            suma += mat[fila][columna];
        }
        promedio = suma / MAXFILA;
        return promedio;
    }

    public static void imprimir_promedios_filas(int[][] mat) {
        for (int columna = 0; columna < MAXCOLUMNA; columna++) {
            System.out.println("Promedio de la fila " + columna + " es " + promedio_fila(mat, columna));
        }
    }
}
