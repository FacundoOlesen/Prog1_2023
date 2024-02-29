/* Se tiene una matriz precargada con secuencias de enteros distintos de cero en sus filas. Además se tiene precargado un arreglo con algunos números 
de filas. Los números de filas no se repiten y están ubicados de forma consecutiva desde el principio del arreglo, luego se completa con -1. 
De dichas filas se pide eliminar la penúltima y la antepenúltima secuencia que tengan al menos 3 números impares.
Observaciones: _el tamaño arreglo es igual a la cantidad de filas de la matriz,
_las secuencias están separadas por uno o más ceros, empiezan y terminan con uno o más ceros,
_realizar el programa completo sin realizar métodos de carga e impresión de arreglo y matriz, ni utilizar estructuras auxiliares.

 */
package Ejercicios_Tipo_Parcial;

public class Recuperatorio_2022_Tema2 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;

    public static void main(String[] args) {
        int[] arrint = { -1, -1, -1, -1 };
        int[][] matInt = {
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 4, 3, 0, 3, 3, 5, 0, 3, 1, 3, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 2, 5, 0, 1, 2, 3, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 0 },
        };

        imprimir_matriz_secuencias(matInt);
        System.out.println("");
        imprimir_arreglo_secuencias_int(arrint);
        iterarPorFilas(matInt);

    }

    public static void imprimir_matriz_secuencias(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAXFILA; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos >= 0 && arr[pos] != 0) {
            pos--;
        }
        return pos + 1;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos >= 0 && arr[pos] == 0) {
            pos--;
        }
        return pos;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAXCOLUMNA - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }

    public static boolean cantidadNumerosImpartes(int[] arr, int ini, int fin) {
        int contador = 0;
        while (ini <= fin) {
            if (arr[ini] % 2 == 1) {
                contador++;
            }
            ini++;
        }
        return contador >= 3;
    }

    public static void iterarPorFilas(int[][] MAT) {
        for (int i = 0; i < MAXFILA; i++) {
            procesarSecs(MAT[i]);
        }
    }

    public static void procesarSecs(int[] arr) {
        int ini = 0;
        int fin = -1;
        int contador = 0;
        while (contador < 2) {
            fin = buscarFin(arr, MAXCOLUMNA - 1);
            if (fin < MAXCOLUMNA) {
                ini = buscarIni(arr, fin);
            }
            if (cantidadNumerosImpartes(arr, ini, fin)) {
                contador++;
                eliminarSecuencia(arr, ini, fin);
                fin = ini;
            }
        }

    }
}
