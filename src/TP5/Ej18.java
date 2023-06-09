package TP5;

import java.util.Random;

public class Ej18 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(arr);
        compararLongitudesDeCadaSecuencia(arr);
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

    public static int obtenerIni(int arr[], int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static int sumarLongitudesDeCadaSecuencia(int[] arr, int ini, int fin) {
        int longitud = 0;
        for (int i = ini; i < fin; i++) {
            longitud = (fin - ini) + 1;
        }
        return longitud;
    }

    public static void compararLongitudesDeCadaSecuencia(int[] arr) {
        int ini = 0;
        int fin = -1;
        int iniciomayor = 0;
        int finmayor = 0;
        int secuenciamayor = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if(ini<MAX){
                fin = obtenerFin(arr, ini);
                int longitudsecuencia = sumarLongitudesDeCadaSecuencia(arr, ini, fin);
                if (longitudsecuencia > secuenciamayor) {
                    secuenciamayor = longitudsecuencia;
                    iniciomayor = ini;
                    finmayor = fin;
                    fin = ini;
                }
            }
        }
        System.out.println("La secuncia de mayor tamaño tiene una longitud de: " + ((finmayor - iniciomayor) + 1) + " y empieza en: "
                + iniciomayor + " y termina en: " + finmayor);
    }
}
