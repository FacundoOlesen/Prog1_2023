package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej10 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[][] mat;
        mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_secuencias(mat);
        imprimir_matriz_secuencias(mat);
        int pos = obtenerPosicion();
        int fila = obtenerFila();
        if (mat[fila][pos] == 0) {
            System.out.println("Error, en la posicion ingresada (" + pos + ") hay un separador.");
        } 
        else {
            System.out.println("El inicio de la secuencia indicada es: " + buscarIni(mat[fila], pos));
            System.out.println("El fin de la secuencia indicada es: " + buscarFin(mat[fila], pos));
        }
    }

    public static void cargar_matriz_secuencias(int[][] matint) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            matint[fila][0] = 0;
            matint[fila][MAXCOLUMNA - 1] = 0;
            for (int col = 1; col < MAXCOLUMNA - 1; col++) {
                if (r.nextDouble() > probabilidad_numero) {
                    matint[fila][col] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
                } else {
                    matint[fila][col] = 0;
                }

            }
        }
    }

    public static void imprimir_matriz_secuencias(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int obtenerPosicion() {
        int posicion = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out
                    .println("Ingrese la posicion de la secuencia que quiere ver el ini y fin.");
            posicion = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return posicion;
    }

    public static int obtenerFila() {
        int fila = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out
                    .println("Ingrese la fila de la secuencia.");
            fila = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return fila;
    }

    public static int buscarIni(int[] mat, int pos) {
        while (pos < MAXCOLUMNA && mat[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] mat, int pos) {
        while (pos < MAXCOLUMNA && mat[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }
}