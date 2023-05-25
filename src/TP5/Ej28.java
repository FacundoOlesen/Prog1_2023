package TP5;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej28 {
    public static final int MAX = 10;
    public static final int MIN = 0;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        ordenarArregloCreciente(arr);
        imprimir_arreglo_int(arr);
        int numero = obtenerNumeroUsuario();
        int pos = buscarPosicionDeNumeroIngresado(arr, numero);
        if(numero!=arr[pos]){
            System.out.println("El numero ingresado (" + numero + ") no está en el arreglo.");
        }
        else{
            System.out.println("El numero ingresado (" + numero + ") está en la posicion: " + pos);
            corrimientoIzquierda(arr, pos);
            System.out.println("Arreglo con: " + numero+ " eliminado.");
            imprimir_arreglo_int(arr);
        }
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

    public static int obtenerNumeroUsuario() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero. Eliminaremos la primer ocurrencia de su numero.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int buscarPosicionDeNumeroIngresado(int[] arr, int numero) {
        int pos = 0;
        while (arr[pos]!=numero&&pos<numero) {
            pos++;
        }
        return pos;
    }

    public static void corrimientoIzquierda(int[]arr, int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }

    public static void ordenarArregloCreciente(int[] arr) {
        int aux;
        for (int i = 0; i < MAX; i++) {
            for (int j = i; j < MAX; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

}
