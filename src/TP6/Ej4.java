package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej4 {
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
        realizarCorrimientoYAgregarNumero(mat[fila], fila, columna);
        mat[fila][columna] = obtenerNumero();
        imprimir_matriz(mat);
    }

    public static void cargar_matriz(int[][] matint) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            matint[fila][0] = 0;
            matint[fila][MAXCOLUMNA - 1] = 0;
            for (int col = 0; col < MAXCOLUMNA ; col++) {
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

    public static int obtenerNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero, este sera agregado en la matriz.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
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

    public static void corrimiento_der_fila_columna(int[] arr, int pos) {
        int indice = MAXCOLUMNA - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }
    }

    public static void realizarCorrimientoYAgregarNumero(int[] arr, int fila, int columna) {
        if ((0 <= fila) && (fila < MAXFILA) && (0 <= columna) && (columna < MAXCOLUMNA)) {
            corrimiento_der_fila_columna(arr, fila);
        }
    }
}
