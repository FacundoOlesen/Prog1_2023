package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej9 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 4;

    public static void main(String[] args) {
        int[][] mat;
        mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(mat);
        imprimir_matriz(mat);
        int fila = obtenerFila();
        int pos1 = obtenerNumero();
        int pos2 = obtenerNumero();
        ordenarArregloCrec(mat[fila], pos1, pos2);
        System.out.println("");
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

    public static int obtenerNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out
                    .println("Ingrese dos posiciones entre las cuales se ordenaran sus elementos de manera creciente.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int obtenerFila() {
        int fila = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out
                    .println("Ingrese la fila donde quiere ordenar los elementos. Valores entre 0 y " + (MAXFILA - 1));
            fila = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return fila;
    }

    public static void ordenarArregloCrec(int[] mat, int pos1, int pos2) {
        int aux;
        for (int i = pos1; i <= pos2; i++) {
            for (int j = i; j <= pos2; j++) {
                if (mat[i] > mat[j]) {
                    aux = mat[i];
                    mat[i] = mat[j];
                    mat[j] = aux;
                }
            }
        }
    }
}
