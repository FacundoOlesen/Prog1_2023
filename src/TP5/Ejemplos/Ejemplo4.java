package TP5.Ejemplos;

import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, encuentre la posición de un
//número entero ingresado por el usuario. Si existe, muestre esa posición por pantalla, o indique que no existe.
public class Ejemplo4 {
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MAX = 10;
    public static void main(String[] args) {
        int[] arrenteros = new int[MAX];
        int pos, numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            cargar_arreglo_aleatorio_int(arrenteros);
            imprimir_arreglo_int(arrenteros);

            System.out.println("Ingrese un numero entero :");
            numero = Integer.valueOf(entrada.readLine());

            pos = obtener_pos_arreglo(arrenteros, numero);
            if (pos < MAX) {
                System.out.println(numero + " está en " + pos);
            } 
            else {
                System.out.println("No existe " + numero);
            }
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int obtener_pos_arreglo(int[] arr, int numero) {
        int posicion = 0;
        while ((posicion < MAX) && (arr[posicion] != numero)) {
            posicion++;
        }
        return posicion;
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
