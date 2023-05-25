package TP5;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej29 {
    public static final int MAX = 10;
    public static final int MIN = 0;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimir_arreglo_int(arr);
        int numero1 = 0;
        int numero2 = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entre 0 y 9.");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero entre 0 y 9.");
            numero2 = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        ordenarArregloCrecienteEntreDosPosiciones(arr, numero1, numero2);
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


    public static void ordenarArregloCrecienteEntreDosPosiciones(int[] arr, int numero1, int numero2) {
        int aux;
        for (int i = numero1; i <= numero2; i++) {
            for (int j = i; j <= numero2; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

}
