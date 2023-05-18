package TP5;
import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej7 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int arr[]=new int[MAX];
        int pos;
        cargar_arreglo_aleatorio_int(arr);
        imprimirArreglo(arr);
        System.out.println("Arreglo con corrimiento a derecha: ");
        pos=obtenerPos();
        corrimiento_der(arr, pos);
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

    public static void corrimiento_der(int[] arr, int pos) {
        int indice = MAX - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }
    }

    public static int obtenerPos(){
        int pos=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese la posicion para hacer el corrimiento a derecha.");
            pos= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return pos;
    }
}
