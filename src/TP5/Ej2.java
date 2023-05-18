package TP5;
import java.util.Random;

public class Ej2 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int arr [] = new int [MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimir_arreglo_int(arr);
        int promedio= obtenerPromedio(arr);
        System.out.println("El promedio de los valores es:  " + promedio);
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
    public static int obtenerPromedio(int arr[]){
        int promedio=0;
        for (int pos=0;pos<MAX;pos++){
            promedio+=arr[pos];
        }
        return promedio/MAX;
    }
}
