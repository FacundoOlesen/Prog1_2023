package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej5 {
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
        int numero = obtenerNumero();
        obtenerColumnaYEliminarNumero(mat, numero);
        System.out.println("Matriz con " + numero + " eliminado:");
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
            System.out.println("Ingrese un numero, la primer ocurrencia de este sera eliminada de la matriz.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAXCOLUMNA - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static int buscarPosNumero(int[] arr, int numero) {
        int pos = 0;
        while (pos < MAXCOLUMNA && arr[pos] != numero) {
            pos++;
        }
        return pos;
    }

    public static void obtenerColumnaYEliminarNumero(int[][] mat, int numero) {
        int fila = 0;
        int columna = MAXCOLUMNA;
        while ((fila < MAXFILA) && (columna == MAXCOLUMNA)) {
            columna = buscarPosNumero(mat[fila], numero);
            if (columna == MAXCOLUMNA) {
                fila++;
            }
        }
        if ((fila < MAXFILA) && (columna < MAXCOLUMNA)) {
            System.out.println(numero + " se encuentra en " + fila + " y " + columna);
            corrimientoIzquierda(mat[fila], columna);
        } 
        else {
            System.out.println(numero + " no se encuentra en la matriz");
        }
    }
}
