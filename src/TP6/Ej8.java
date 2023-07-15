package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej8 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 4;

    public static void main(String[] args) {
        int[][] mat;
        mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(mat);
        ordenarArregloDereciente(mat);
        imprimir_matriz(mat);
        int numero = obtenerNumero();
        eliminarNumeroEnFila(mat, numero);
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
            System.out.println("Ingrese un numero, este sera eliminado en la matriz.");
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
            System.out.println(
                    "Ingrese la fila donde quiere ingresar el numero ingresado. Valores entre 0 y " + (MAXFILA - 1));
            fila = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return fila;
    }

    public static int buscarPosNumero(int[] arr, int numero) {
        int pos = 0;
        while (pos < MAXCOLUMNA && arr[pos] != numero) {
            pos++;
        }
        return pos;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAXCOLUMNA - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static int buscarPosicionDeNumeroIngresado(int[] arr, int numero) {
        int pos = 0;
        while (arr[pos] != numero && arr[pos] > numero) {
            pos++;
        }
        return pos;
    }

    public static void eliminarNumeroEnFila(int[][] mat, int numero) {
        int fila = obtenerFila();
        int pos = buscarPosicionDeNumeroIngresado(mat[fila], numero);
        if ((mat[fila][pos] == numero)) {
            corrimientoIzquierda(mat[fila], pos);
        }
    }

    public static void ordenarArregloDereciente(int[][] mat) {
        int fila = 0;
        while (fila < MAXFILA) {
            int aux;
            for (int i = 0; i < MAXCOLUMNA; i++) {
                for (int j = i; j < MAXCOLUMNA; j++) {
                    if (mat[fila][i] < mat[fila][j]) {
                        aux = mat[fila][i];
                        mat[fila][i] = mat[fila][j];
                        mat[fila][j] = aux;
                    }
                }
            }
            fila++;
        }
    }

}
