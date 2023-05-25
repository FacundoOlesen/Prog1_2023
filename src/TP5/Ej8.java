package TP5;

import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej8 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MIN = 0;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimirArreglo(arr);
        int pos = obtenerPos();
        corrimiento_izquierda(arr, pos);
        System.out.println("Arreglo con corrimiento a izquierda: ");
        imprimirArreglo(arr);

    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimirArreglo(int arr[]) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arr[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static int obtenerPos() {
        int pos = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese la posicion para hacer el corrimiento a izquierda.");
            pos= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return pos;
    }

    public static void corrimiento_izquierda(int[]arr, int pos){
        int indice=MIN;
        while(indice<pos){
            arr[indice]=arr[indice+1];
            indice++;
        }

    }
}
