package TP5;

import java.util.Random;

public class Ej15 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(arr);
        int ini= obtener_inicio_secuencia(arr, MINVALOR);
        int fin=obtener_fin_secuencia(arr, ini);
        System.out.println("La primer secuncia empieza en: " + ini + " y termina en: " + fin);
        

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

    public static int obtener_fin_secuencia(int[] arr, int ini) {
        while (ini < MAX && arr[ini] != 0)
            ini++;
        return ini - 1;
    }

    public static int obtener_inicio_secuencia(int[] arr, int ini) {
        while (ini < MAX && arr[ini] == 0) {
            ini++;
        }
        return ini;
    }
}
