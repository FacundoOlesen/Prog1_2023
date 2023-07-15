package TP6;

public class Ej14 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;

    public static void main(String[] args) {
        char[][] mat =  {{' ', 'a', 'b', 'c', 'd', ' ', 'z', ' ', 's', 'g', 'h', ' ', 'd', 'f', ' ', ' ', 'f','k', 'l', ' '},
                         {' ', 'z', 'h', ' ', 'w', 'z', 'z', ' ', 's', ' ', 'h', ' ', 'a', 'b', 'c', 'd', ' ','q', 'l', ' '},
                         {' ', 'h', 'h', ' ', 'd', ' ', 'z', ' ', 's', 'x', ' ', ' ', 'd', 'q', ' ', ' ', 'f','s', ' ', ' '},
                         {' ', 's', 'h', ' ', 'd', ' ', 'a', 'b', 'c', 'x', ' ', 'f', 'f', 'q', ' ', ' ', 'f','x', ' ', ' '}};

        char[] patron =  {' ', 'a', 'b', 'c', 'd', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',' ', ' ', ' '};
        imprimir_matriz_secuencias(mat);
        iterarPorFilas(mat, patron);
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

    public static boolean sonIguales(char[] arr, char[] patron, int ini, int fin, int iniPatron, int finPatron) {
        while (ini <= fin &&arr[ini] == patron[iniPatron]) {
                ini++;
                iniPatron++;
        }
        return ini > fin;
    }

    public static void iterarPorFilas(char[][]arr, char[]patron){
        for(int fila =0; fila<MAXFILA;fila++){
            procesarSecuencias(arr[fila], patron);
        }
    }

    public static void procesarSecuencias(char[] arr, char[] patron) {
        int ini = 0;
        int fin = -1;
        int iniPatron = buscarIni(patron, 0);
        int finPatron = buscarFin(patron, iniPatron);
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                int longitudArr = fin - ini + 1;
                int longitudPatron = finPatron - iniPatron + 1;
                if (longitudArr == longitudPatron && sonIguales(arr, patron, ini, fin, iniPatron, finPatron)) {
                    eliminarSecuencia(arr, ini, fin);
                    fin = ini;
                }
            }
        }
    }
}