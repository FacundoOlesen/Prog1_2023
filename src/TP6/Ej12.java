package TP6;

import java.util.Random;

public class Ej12 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;

    public static void main(String[] args) {
        char[][] mat;
        mat = new char[MAXFILA][MAXCOLUMNA];
        cargar_matriz_secuencias(mat);
        imprimir_matriz_secuencias(mat);
        iterarFilaXFila(mat);
    }

    public static void cargar_matriz_secuencias(char[][] matint) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            matint[fila][0] = ' ';
            matint[fila][MAXCOLUMNA - 1] = ' ';
            for (int col = 1; col < MAXCOLUMNA - 1; col++) {
                if (r.nextDouble() > probabilidad_letra) {
                    matint[fila][col] = (char) (r.nextInt(26) + 'a');
                } else {
                    matint[fila][col] = ' ';
                }

            }
        }
    }

    public static void imprimir_matriz_secuencias(char[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }

    }

    public static int buscarUltimoIni(char arr[], int pos) {
        while (pos > 0 && arr[pos] != ' ') {
            pos--;
        }
        return pos + 1;
    }

    public static int buscarUltimoFin(char[] arr, int pos) {
        while (pos > 0 && arr[pos] == ' ') {
            pos--;
        }
        return pos;
    }

    public static void iterarFilaXFila(char[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            recorrerSecs(mat[fila]);
        }
    }

    public static void recorrerSecs(char[] arr) {
        int anteultimoini = 0;
        int anteultimofin = 0;
        int fin = buscarUltimoIni(arr, MAXCOLUMNA - 1);
        int ini = buscarUltimoFin(arr, fin);
        int aux = ini - 1;

        while (fin > 0 && arr[aux] == ' ') {
            aux--; // Calculo anteultimo FIN
        }
        anteultimofin = aux;

        while (ini > 0 && arr[aux] != ' ') {
            aux--; // Calculo anteultimo INICIO
        }

        anteultimoini = aux + 1;
        System.out.println("La anteultima secuencia va de: " + anteultimoini + " a: " + anteultimofin);
    }

}