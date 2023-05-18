package TP5.Ejemplos;
import java.util.Random;

public class Ejemplo6 {
    final static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int valor=0;
        cargar_arreglo_aleatorio_int(arr);
        imprimir_arreglo_int(arr);
        buscar_pos_desordenado(arr,  valor);
        buscar_pos_ordenado(arr,  valor);
    }

    private static int buscar_pos_desordenado(int[] arr, int valor) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] != valor)) {
            pos++;
        }
        if (pos < MAX)
            return pos;
        else
            return -1;

    }

    private static int buscar_pos_ordenado(int[] arr, int valor) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] > valor)) {
            pos++;
        }
        if ((pos < MAX) && (arr[pos] == valor))
            return pos;
        else
            return -1;

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
}
