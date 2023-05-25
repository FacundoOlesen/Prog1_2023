package TP5;

public class Ej22 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MAXP = 3;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[] = { 0, 3, 4, 5, 0, 3, 4, 5, 6, 2, 3, 0, 2, 3, 0, 3, 4, 5, 0, 0 };
        int P[] = { 3, 4, 5 };
        int R[] = { 4, 5, 6 };
        imprimir_arreglo_secuencias_int(arr);
        compararSecuenciasEIntercambiarlas(arr, P, R);
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

    
    public static boolean compararSecuencias(int[] arr, int[] P, int ini, int fin) {
        int longitud = (fin - ini) + 1;
        if (longitud == MAXP) {
            int i = ini;
            int ip = 0;
            while (i <= fin && arr[i] == P[ip]) {
                i++;
                ip++;
            }

            if (i > fin) {
                return true;
            } 
            else {
                return false;
            }
        }

        else {
            return false;
        }
    }
    
    public static void reemplazarOcurrenciasDeAPorR(int arr[], int[] r, int ini, int fin) {
        int j = 0;
        for (int i = ini; i <= fin; i++) {
            arr[i] = r[j];
            j++;
        }
    }
    public static void compararSecuenciasEIntercambiarlas(int arr[], int p[], int r[]) {
        int ini = 0;
        int fin = -1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            if (compararSecuencias(arr, p, ini, fin)) {
                reemplazarOcurrenciasDeAPorR(arr, r, ini, fin);
                fin = ini;
            }
        }

    }
}
