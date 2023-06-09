package Ejercicios_Tipo_Parcial;

public class Ej3 {
    public static int MAX = 14;

    public static void main(String[] args) {
        int arr[] = { 0, 2, 5, 0, 1, 2, 0, 2, 2, 0, 0, 3, 1, 0 };
        mostrarArreglo(arr);
        analizarSecuencias(arr);
        mostrarArreglo(arr);

    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + "|");
        System.out.println();
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

    public static void invertirSec(int[] arr, int ini, int fin) {
        while (ini < fin) {
            int aux = arr[ini];
            arr[ini] = arr[fin];
            arr[fin] = aux;
            ini++;
            fin--;
        }
    }

    public static boolean esCrec(int[] arr, int ini, int fin) {
        int i = ini;
        while (ini <= fin && (arr[i] < arr[i + 1])) {
            ini++;
        }
        return ini > fin;
    }

    public static boolean esDecrec(int[] arr, int ini, int fin) {
        int i = ini;
        while (ini <= fin && (arr[i] > arr[i + 1])) {
            ini++;
        }
        return ini > fin;
    }

    public static void incrementarElementos(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            arr[i]++;
        }
    }

    public static void decrementarElementos(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            arr[i]--;
        }
    }

    public static void rellenarSec(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            arr[i] = -1;
        }
    }

    public static boolean esCapicua(int[] arr, int ini, int fin) {
        int i = ini;
        int j = fin;

        while (i <= j && arr[i] == arr[j]) {
            i++;
            j--;
        }
        return i > j;
    }

    public static void analizarSecuencias(int[] arr) {
        int ini = 0;
        int fin = -1;
        int contadorsec = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                contadorsec++;
                if (contadorsec % 2 == 0) {
                    if (esCrec(arr, ini, fin)) {
                        incrementarElementos(arr, ini, fin);
                    } else if (esDecrec(arr, ini, fin)) {
                        decrementarElementos(arr, ini, fin);
                    }
                }

                else {
                    if (esCapicua(arr, ini, fin)) {
                        rellenarSec(arr, ini, fin);
                    } else {
                        invertirSec(arr, ini, fin);
                    }

                }
                ini = fin;
            }
        }
    }
}
