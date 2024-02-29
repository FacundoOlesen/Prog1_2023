package Ejercicios_Tipo_Parcial;

public class Extra_PreFinal {
    public final static int MAXFILA = 5;
    public final static int MAXCOLUMNA = 20;
    public final static char SEP = ' ';
    public final static int K = 2;
    public final static char L = 'F';

    public static void main(String[] args) {
        char[][] MAT = {
                { ' ', '1', '2', 'G', 'H', ' ', '2', 'A', '3', ' ', '3', 'R', 'B', 'J', ' ', '6', '5', 'K', ' ', ' ' },
                { ' ', ' ', '2', '1', '4', '5', ' ', 'R', 'P', ' ', 'D', '3', ' ', '7', 'M', 'N', 'W', ' ', ' ', ' ' },
                { ' ', '4', 'G', '8', ' ', '3', '5', '7', '1', ' ', ' ', '2', 'X', ' ', 'D', '4', '1', ' ', ' ', ' ' },
                { ' ', ' ', ' ', '5', 'T', 'T', 'M', ' ', 'A', 'P', '1', '1', ' ', '2', '1', '3', ' ', '1', '3', ' ' },
                { ' ', '6', '6', '4', ' ', '5', '4', ' ', ' ', 'A', '2', '1', '2', ' ', 'G', '4', '2', '1','8', ' ' }
        };
        ;
        imprimir_matriz_secuencias(MAT);
        System.out.println("");
        System.out.println("La cantidad de señales de posible origen extraterrestre es de: " + filasConsecutivas(MAT));
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


    public static boolean secuenciaExtraterrestre(char[] arr, int ini, int fin) {
        int acum = 0;
        for (int i = ini; i <= fin; i++) {
            if (arr[i] > L) {
                acum++;
            }
        }
        return acum >= K;
    }

    public static boolean filaExtraterrestre(char[] arr) {
        int ini = 0;
        int fin = -1;
        int acum = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                if (secuenciaExtraterrestre(arr, ini, fin)) {
                    acum++;
                }
                fin=fin+1;
            }
        }
        return acum >= 1;
    }

    public static int filasConsecutivas(char[][] MAT) {
        int acum = 0;
        for (int i = 0; i < MAXFILA - 1; i++) {
            if (filaExtraterrestre(MAT[i]) && filaExtraterrestre(MAT[i + 1])) {
                acum++;
            }
        }
        return acum;
    }
}
