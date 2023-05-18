package TP5.Ejemplos;

import java.util.Random;

public class Ejemplo_Metodo_Seleccion_3 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        int[] arrentero;
        arrentero = new int[MAX];
        cargar_arreglo_aleatorio_int(arrentero);
        imprimir_arreglo_int(arrentero);
        seleccion(arrentero);
        imprimir_arreglo_int(arrentero);
    }

    
    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(9 - 0 + 1) + 0);
        }
    }
    
    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
    
    public static void seleccion(int arr[]) {
        int i, j, menor, pos, tmp;
        
        for (i = 0; i < MAX; i++) { // tomamos como menor el primero
            menor = arr[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición

            for (j = i + 1; j < MAX; j++) { // buscamos en el resto

                if (arr[j] < menor) { // del array algún elemento
                    menor = arr[j]; // menor que el actual
                    pos = j;
                
                }
            }
            
            if (pos != i) { // si hay alguno menor se intercambia
                tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        
        }
    }
}
