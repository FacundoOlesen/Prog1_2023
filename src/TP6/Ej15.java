package TP6;

public class Ej15 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;

    public static void main(String[] args) {
        char[][] mat =  {{' ', 'a', 'b', 'c', 'd', ' ', 'z', ' ', 'd', 'c', 'b', 'a', ' ', 'f', ' ', ' ', 'f','k', 'l', ' '},
                         {' ', 'z', 'h', ' ', 'w', 'z', 'z', ' ', 's', ' ', 'h', ' ', 'a', 'b', 'c', 'd', ' ','q', 'l', ' '},
                         {' ', 'h', 'h', ' ', 'd', ' ', 'z', ' ', 's', 'x', ' ', ' ', 'd', 'q', ' ', ' ', 'f','s', ' ', ' '},
                         {' ', 's', 'h', ' ', 'd', ' ', 'z', 'y', 'x', ' ', ' ', 'f', 'f', 'q', ' ', ' ', 'f','x', ' ', ' '}};

        imprimir_matriz_secuencias(mat);
        iterarPorFilas(mat);
        System.out.println("");
        imprimir_matriz_secuencias(mat);
    }
    public static void imprimir_matriz_secuencias(char[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + mat[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int buscarIni(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == ' ') {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != ' ') {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquierda(char[] arr, int pos) {
        while (pos < MAXCOLUMNA-1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(char[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }


    public static void iterarPorFilas(char[][]arr){
        for(int fila =0; fila<MAXFILA;fila++){
            procesarSecuencias(arr[fila]);
        }
    }

    public static boolean esDesc(char[]arr, int ini, int fin){
        while(ini<=fin&&arr[ini]>arr[ini+1]){
            ini++;
        }
        return ini>fin;
    }

    public static void procesarSecuencias(char[] arr) {
        int ini = 0;
        int fin = -1;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                if (esDesc(arr, ini, fin) &&fin-ini+1!=1){
                    eliminarSecuencia(arr, ini, fin);
                    fin = ini;
                }
            }
        }
    }
}