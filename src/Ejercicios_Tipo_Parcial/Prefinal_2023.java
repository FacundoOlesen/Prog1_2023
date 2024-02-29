package Ejercicios_Tipo_Parcial;

public class Prefinal_2023 {
    public final static int MAXFILA = 4;
    public final static int MAXCOLUMNA = 16;
    public final static char SEP = ' ';

    public static void main(String[] args) {
        char[][] documento = {
                { ' ', 'e', 'l', ' ', 'a', 'g', 'e', 'n', 't', 'e', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', 'J', 'a', 'm', 'e', 's', ' ', 'B', 'o', ' ', 's', 'e', ' ', ' ', ' ', ' ', ' ' },
                { ' ', 'e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a', ' ', 'e', 'n', ' ', ' ', ' ', ' ' },
                { ' ', 'C', 'o', 'l', 'o', 'n', 'i', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
        };
        imprimir_matriz_secuencias(documento);
        System.out.println("");
        System.out.println("Se encriptaron " + iterarPorFilas(documento) + " secuencias.");
        imprimir_matriz_secuencias(documento);
    }

    public static void imprimir_matriz_secuencias(char[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + mat[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int iterarPorFilas(char[][] documento) {
        int cant =0;
        for (int i = 0; i < MAXFILA; i++) {
             cant += procesarSecuencias(documento[i]);
        }
        return cant;
    }

    public static int buscarIni(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoDerecha(char[] arr, int pos) {
        int indice = MAXCOLUMNA - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }
    }

    public static boolean esNombrePropio(char[] arr, int ini) {
        return arr[ini] >= 'A' && arr[ini] <= 'Z';
    }

    public static void invertirSecuencia(char[] arr, int ini, int fin) {
        char aux = ' ';
        while (ini <= fin) {
            aux = arr[ini];
            arr[ini] = arr[fin];
            arr[fin] = aux;
            ini++;
            fin--;
        }
    }

    public static int duplicarNoVocalMiniscula(char[] arr, int ini, int fin) {
        int cantduplicados = 0;
        while (ini <= fin) {
            if (arr[ini] != 'a' && arr[ini] != 'e' && arr[ini] != 'i' && arr[ini] != 'o' && arr[ini] != 'u') {
                corrimientoDerecha(arr, ini);
                ini = ini + 2;
                fin = buscarFin(arr, ini);
                cantduplicados++;
            }
            ini++;
        }
        return cantduplicados;
    }

    public static int procesarSecuencias(char[] arr) {
        int ini = 0;
        int fin = -1;
        int cant = 0;
        int cantduplicados = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                if (esNombrePropio(arr, ini)) {
                    invertirSecuencia(arr, ini, fin);
                    cantduplicados = duplicarNoVocalMiniscula(arr, ini, fin);
                    fin = fin + cantduplicados;
                    cant++;
                }
            }
        }
        return cant ;
    }
}