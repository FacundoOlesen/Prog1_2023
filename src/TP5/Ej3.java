package TP5;
import java.util.Random;

public class Ej3 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int arr [] = new int [MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimir_arreglo_int(arr);
        int promedio= obtenerPromedio(arr);
        System.out.println("El promedio de los valores es:  " + promedio);
        int mayorapromedio=obtenerMayorAPromedio(arr, promedio);
        System.out.println("La cantidad de numeros que estan en el arreglo mayor al promedio es: " + mayorapromedio);
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
    
    public static int obtenerMayorAPromedio(int[]arr, int promedio){
        int acumulador=0;
        for (int pos=0;pos<MAX;pos++){
            if(arr[pos]>promedio){
                acumulador++;
            }
        }
        return acumulador;
    }
}
