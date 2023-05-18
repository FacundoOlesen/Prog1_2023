package TP5.Ejemplos;

import java.util.Random;

public class Ejemplo7 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arrenteros = new int[MAX];
        cargar_arreglo_aleatorio_int(arrenteros);
        ordenar_arreglo(arrenteros);
        imprimir_arreglo_int(arrenteros);
        int  numero;
        numero = 4; // es para el ejemplo pero se puede pedir por consola por ejemplo
        buscar_pos_arreglo_ord_crec(arrenteros, numero);
        
    }

    // La posición que retorna no necesariamente significa que esté ahí, es donde
    // debería estar
    public static void buscar_pos_arreglo_ord_crec(int[] arr, int numero) {
        for(int pos=0; pos<MAX; pos++){
            if(arr[pos]==numero){
                System.out.println(numero + " fue encontrado en la pos ->: " + pos);
            }
           
        }

    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

     public static void ordenar_arreglo(int[]arr){
        int aux;
        for (int recorredor = 0; recorredor < MAX; recorredor++) {
            for (int cursor = recorredor; cursor < MAX; cursor++) {
                if (arr[recorredor] < arr[cursor]) {
                    aux = arr[recorredor];
                    arr[recorredor] = arr[cursor];
                    arr[cursor] = aux;
                }
            }
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
