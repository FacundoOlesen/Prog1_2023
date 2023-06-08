package TP5.Ejercicios_Extra;
/*Implementar un programa que, dado un arreglo de enteros, incremente en 1 cada elemento de una
secuencia, si la suma de los elementos de dicha secuencia es par. */
public class Ejercicio_Extra_2 {
    public static final int MAX = 12, MAXVALOR = 9, MINVALOR = 1;

    public static void main(String[] args) {
        int [] arr = {0, 8, 4, -2, 0, 10, 5, 0, 1, 25, 2, 0};
        imprimir_arreglo_secuencias_int(arr);
        obtenerSecParesEIncrementarlas(arr);
        System.out.println("Arreglo con las secuencias cuya suma sea par incrementado:");
        imprimir_arreglo_secuencias_int(arr);


    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
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

    public static int obtenerSumaCadaSecuencia(int arr[], int ini, int fin){
        int suma=0;
        for(int i=ini; i<=fin;i++){
            suma+=arr[i];
        }
        return suma;
    }

    public static void incrementarValoresSecuencia(int[]arr, int ini, int fin){
        for (int i=ini; i<=fin; i++){
            arr[i]++;
        }
    }

    public static void obtenerSecParesEIncrementarlas(int[]arr){
        int ini=0;
        int fin= -1;
        while(ini<MAX){
            ini=obtenerIni(arr, fin+1);
            if(ini<MAX){
                fin=obtenerFin(arr, ini);
                int suma = obtenerSumaCadaSecuencia(arr, ini, fin);
                if(suma%2==0){
                    incrementarValoresSecuencia(arr, ini, fin);
                    ini=fin;
                }
            }
        }
    }
}
