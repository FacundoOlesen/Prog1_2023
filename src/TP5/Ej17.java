package TP5;

import java.util.Random;

public class Ej17 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int ini=0, fin =0;
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(arr);
        obtenerAnteUltimaSecuencia(arr, ini, fin);
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

    public static int obtener_pos_ini(int arr[], int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtener_pos_fin(int[] arr, int pos) {
       
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos -1;
    }

  //ARRANCAR DE ATRAS Y LA ANTEULTIMA VA A SER LA ULTIMA -1 
  //Recorro desde la ult secuen hasta un el primer 0 q encuentre, ese va a ser el fin
  //Recorro desde el fin hasta el proximo 0 +1, ese va a ser el inicio.

    public static void obtenerAnteUltimaSecuencia(int arr[], int ini, int fin){
        int indice=0;
        int anteultimoini=0;
        int anteultimofin=0;
        while(indice<MAX){
            ini= obtener_pos_ini(arr, indice);
            fin=obtener_pos_fin(arr, ini);
            
            indice=fin+1;

        }
       
    }

}
