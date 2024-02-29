/* Se tiene una matriz precargada con secuencias de enteros distintos de cero en sus filas. Se pide guardar en un arreglo los números de filas de 
las primeras 4 filas que cumplen con la condición de tener a lo sumo 5 secuencias sin orden ascendente.
Observaciones: _el tamaño arreglo es igual a la cantidad de filas de la matriz, y está inicializado con -1,
_las secuencias están separadas por uno o más ceros, empiezan y terminan con uno o más ceros,
_realizar el programa completo sin realizar métodos de carga e impresión de matriz, ni utilizar estructuras auxiliares.
 */

package Ejercicios_Tipo_Parcial;

public class Recuperatorio_2022_Tema1 {
    public static final int MAXFILA = 10;
    public static final int MAXCOLUMNA = 30;

    public static void main(String[] args) {
        int[] arrint = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        int[][] matInt = {
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 2, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 2, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
                { 0, 3, 5, 1, 0, 2, 2, 0, 1, 2, 3, 0, 3, 4, 5, 0, 1, 2, 3, 4, 0, 3, 2, 1, 0, 4, 4, 4, 0, 0 },
        };

        imprimir_matriz_secuencias(matInt);
        imprimir_arreglo_secuencias_int(arrint);
        procesarSecs(matInt, arrint);
        System.out.println("");
        imprimir_arreglo_secuencias_int(arrint);

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
        while (pos < MAXCOLUMNA && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static boolean esAsc(int[] arr, int ini, int fin) {
        while (ini < fin && arr[ini] < arr[ini + 1]) {
            ini++;
        }
        return ini == fin;
    }

    public static boolean noEsAsc5Veces(int[] arr) {
        int ini = 0;
        int fin = -1;
        int contador = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                if (!esAsc(arr, ini, fin)) {
                    contador++;
                }
            }
        }
        return contador >= 5;
    }

    public static void procesarSecs(int[][] arr, int[] arrint) {
        int cant = 0;
        int fila = 0;
        while (fila < MAXFILA && cant < 4) {
            if (noEsAsc5Veces(arr[fila])) {
                arrint[cant] = fila;
                cant++;
            }
            fila++;
        }
    }
}
