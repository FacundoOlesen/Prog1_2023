package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej13 {
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
        int numero = obtenerNumero();
        iterarFilaXFila(mat, numero);
        imprimir_matriz_secuencias(mat);

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

    public static int obtenerNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out
                    .println(
                            "Ingrese un numero y eliminaremos todas las secuencias que tengan la longitud del numero.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
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

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAXCOLUMNA - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }

    public static void iterarFilaXFila(int[][] mat, int numero) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            recorrerSecs(mat[fila], numero);
        }
    }

    public static void recorrerSecs(int[] arr, int numero) {
        int ini = 0;
        int fin = -1;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                int longitud = fin - ini + 1;
                if (longitud == numero) {
                    eliminarSecuencia(arr, ini, fin);
                    ini = fin;
                }
            }
        }
    }
}
