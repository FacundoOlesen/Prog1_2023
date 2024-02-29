package Ejercicios_Tipo_Parcial;

public class Ejercicio_Tipo_Recuperatorio {
    public final static int MAXFILA = 3;
    public final static int MAXCOLUMNA = 20;
    public final static int SEP = 0;

    public static void main(String[] args) {
        int[][] matriz = { { 0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 25, 25, 0, -5, 3, 0, 25, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        imprimir_matriz_secuencias(matriz);
        for (int i = 0; i < MAXFILA; i++) {
            descomprimirSecuencia(matriz[i]);
        }
        System.out.println("");
        imprimir_matriz_secuencias(matriz);

    }

    public static void imprimir_matriz_secuencias(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoDerecha(int[] arr, int pos) {
        int indice = MAXCOLUMNA - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }
    }

    public static void descomprimo(int[] arr, int ini, int fin) {
        for (int i = 0; i < -arr[ini] - 2; i++) {
            corrimientoDerecha(arr, ini);
        }
    }

    public static void reemplazo(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            arr[i] = arr[fin];
        }
    }

    public static void descomprimirSecuencia(int[] arr) {
        int ini = 0;
        int fin = -1;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                int longitud = fin - ini + 1;
                if (longitud > 1 && arr[ini] < 0) {
                    descomprimo(arr, ini, fin);
                    int cant = -arr[ini] - 2;
                    reemplazo(arr, ini, ini + cant + 1);
                    fin = fin + cant;
                }
            }
        }
    }

}
