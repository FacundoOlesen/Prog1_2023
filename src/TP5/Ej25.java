package TP5;

import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej25 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        int arrNuevo[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(arr);
        int numero = obtenerNumeroUsuario();
        compararNumeroConLongitudSecuencia(arr, arrNuevo,  numero);
        imprimir_arregloNuevo(arrNuevo);
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

    public static void imprimir_arregloNuevo(int[] arrNuevo) {
        System.out.print(
                "\nArreglo de secuencias con las secuencias del otro arreglo con la longitud del numero ingresado x el usuario.\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arrNuevo[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerNumeroUsuario() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(
                    "Ingrese un numero. Las secuencias de igual tamaño al numero serán copiadas en otro arreglo.");
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

    public static void compararNumeroConLongitudSecuencia(int[] arr, int[] arrNuevo,  int numero) {
        int ini = 0;
        int fin = -1;
        int j=0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            int longitud = (fin - ini) + 1;
            if (longitud == numero) {
                for (int i = ini; i <= fin; i++) {
                    arrNuevo[j] = arr[i];
                    j++;
                }
                fin=ini;
            }
        }
    }

}
