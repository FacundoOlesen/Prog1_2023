package TP6;
import java.util.Random;

public class Ej11 {
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
        recorrerFilas(mat);
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

    public static int sumaSecuencias(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static void recorrerFilas(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            recorrerSecs(mat[fila], fila);
        }
    }

    public static void recorrerSecs(int[] arr, int fila) {
        int ini = 0;
        int fin = -1;
        int iniciomayor = 0;
        int finmayor = 0;
        int sumamayor = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                int suma = sumaSecuencias(arr, ini, fin);
                if (suma > sumamayor) {
                    sumamayor = suma;
                    iniciomayor = ini;
                    finmayor = fin;
                }
                fin = ini;
            }
        }
        System.out
                .println("La mayor suma de la secuencia de la fila nro " + fila + " es " + sumamayor + " con inicio en "
                        + iniciomayor + " y fin en " + finmayor);
    }
}