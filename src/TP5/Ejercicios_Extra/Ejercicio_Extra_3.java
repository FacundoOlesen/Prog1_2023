package TP5.Ejercicios_Extra;

/*Implementar un programa que, dado un arreglo de enteros, elimine todas las secuencias que tienen al
menos un múltiplo de 2 y cuyo tamaño es impar. */
public class Ejercicio_Extra_3 {
    public static final int MAX = 12, MAXVALOR = 9, MINVALOR = 1;

    public static void main(String[] args) {
        int arr[] = { 0, 8, 4, -2, 0, 10, 5, 0, 1, 25, 3, 0 };
        imprimir_arreglo_secuencias_int(arr);
        System.out.println(
                "Arreglo con secuencias que tengan al menos un multiplo de 2 y cuyo tamano es impar eliminadas: ");
        eliminarSecuenciasConMultDeDosYTamanoImpar(arr);
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

    public static void corrimientoIzquieda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean obtenerSecuenciasConMultiploDeDos(int[] arr, int ini, int fin) {
        int pos= ini;
        while (pos <= fin && arr[pos] % 2 != 0) {
            pos++;
        }
        return pos<fin;
    }

    public static void eliminarSecunecia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquieda(arr, ini);
        }
    }

    public static void eliminarSecuenciasConMultDeDosYTamanoImpar(int[] arr) {
        int ini = 0;
        int fin = -1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                int longitud = (fin - ini) + 1;
                boolean tienemult = obtenerSecuenciasConMultiploDeDos(arr, ini, fin);
                if (longitud % 2 != 0 && tienemult) {
                    eliminarSecunecia(arr, ini, fin);
                    ini = fin;
                }
            }
        }
    }
}
