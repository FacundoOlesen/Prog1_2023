package TP5.Ejemplos;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
//precargado, imprima por pantalla el promedio de la suma de sus valores.
import java.util.Random;

public class Ejemplo3 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arrenteros = new int[MAX];

        int promedio;

        // cargar el arreglo con alguno de los métodos propuestos

        cargar_arreglo_aleatorio_int(arrenteros);
        imprimir_arreglo_int(arrenteros);
        promedio = promedio_arreglo(arrenteros);
        System.out.println("El promedio del arreglo es: " + promedio);
    }

    public static int promedio_arreglo(int[] arr) {
        int suma = 0;

        for (int pos = 0; pos < MAX; pos++) {
            suma += arr[pos];
        }
        return (suma / MAX);
    }

    // carga de arreglo de int con valores de MINVALOR a MAXVALOR
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