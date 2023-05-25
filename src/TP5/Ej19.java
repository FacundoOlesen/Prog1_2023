package TP5;

import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej19 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(arr);
        int numero = obtenerNumeroUsuario();
        eliminarSecuenciasDeLongitudN(arr, numero);
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

    public static int obtenerNumeroUsuario() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(
                    "Ingrese un numero. Si ese numero es igual a la longitud de una secuencia, dicha secuencia sera eliminada.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int obtenerIni(int[] arr, int pos) {
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

    public static int obtenerLongitudesDeCadaSecuencia(int[] arr, int ini, int fin) {
        int longitud = 0;
        for (int i = ini; i <= fin; i++) {
            longitud = (fin - ini) + 1;
        }
        return longitud;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }

    public static void eliminarSecuenciasDeLongitudN(int[] arr, int numero) {
        int ini = 0;
        int fin = -1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            int longitud = obtenerLongitudesDeCadaSecuencia(arr, ini, fin);
            if (numero == longitud) {
               eliminarSecuencia(arr, ini, fin);
                fin = ini;
            }

        }
    }
}
