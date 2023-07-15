package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej3 {
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
        int fila = obtenerFila();
        int columna = obtenerColumna();
        realizarCorrimientoAPartirDePos(mat[fila], fila, columna);
        System.out.println("corrimiento");
        imprimir_matriz(mat);
    }

    public static void cargar_matriz(int[][] matint) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            matint[fila][0] = 0;
            matint[fila][MAXCOLUMNA - 1] = 0;
            for (int col = 0; col < MAXCOLUMNA; col++) {
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

    public static int obtenerFila() {
        int fila = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una fila del 0 al " + (MAXFILA - 1));
            fila = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return fila;
    }

    public static int obtenerColumna() {
        int columna = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una columna del 0 al " + (MAXCOLUMNA - 1));
            columna = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return columna;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAXCOLUMNA - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void realizarCorrimientoAPartirDePos(int[]arr, int fila, int columna) {
        if ((0 <= fila) && (fila < MAXFILA) && (0 <= columna) && (columna < MAXCOLUMNA)) {
            corrimientoIzquierda(arr, fila);
        }
    }
}
