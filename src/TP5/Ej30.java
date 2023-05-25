package TP5;

import java.util.Random;

public class Ej30{
    public static final int MAX = 10;
    public static final int MAXVALOR = 100;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        ordenarArregloCreciente(arr);
        System.out.println("ARREGLO ORDENADO DE FORMA CRECIENTE");
        imprimir_arreglo_int(arr);
        ordenarArregloDereciente(arr);
        System.out.println("ARREGLO ORDENADO DE FORMA DECRECIENTE");
        imprimir_arreglo_int(arr);

    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static void ordenarArregloCreciente(int[] arr) {
        int aux;
        for (int i = 0; i < MAX; i++) {
            for (int j = i; j < MAX; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
    public static void ordenarArregloDereciente(int[] arr) {
        int aux;
        for (int i = 0; i < MAX; i++) {
            for (int j = i; j < MAX; j++) {
                if (arr[i] < arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
