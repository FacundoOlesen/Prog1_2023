package TP5;

import java.util.Random;

public class Ej23 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[] = { 0, 3, 4, 5, 0, 3, 4, 5, 6, 2, 3, 0, 2, 3, 0, 6, 8, 7, 4, 0 };
        imprimir_arreglo_secuencias_int(arr);
        int fin = obtener_pos_fin(arr, MAX - 1);
        int ini = obtener_pos_ini(arr, fin);
        invertirOrdenUltimaSecuencia(arr, ini, fin);
        imprimir_arreglo_secuencias_int(arr);

    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > probabilidad_numero) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtener_pos_ini(int[] arr, int pos) {
        while (pos > 0 && arr[pos] != 0) {
            pos--;
        }
        return pos + 1;
    }

    public static int obtener_pos_fin(int[] arr, int pos) {
        while (pos > 0 && arr[pos] == 0) {
            pos--;
        }
        return pos;
    }

    public static void invertirOrdenUltimaSecuencia(int[] arr, int ini, int fin) {
        while (ini <= fin) {
            int aux = arr[ini];
            arr[ini] = arr[fin];
            arr[fin] = aux;
            ini++;
            fin--;
        }
    }
}
