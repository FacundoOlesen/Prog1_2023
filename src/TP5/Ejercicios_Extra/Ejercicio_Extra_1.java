package TP5.Ejercicios_Extra;
/*Determinar el inicio y fin de la secuencia que más números pares tiene (si hay más de una, quedarse con la
primera) */
public class Ejercicio_Extra_1 {
    public static final int MAX = 11, MAXVALOR = 9, MINVALOR = 1;

    public static void main(String[] args) {

        int arr[] = { 0, 2, 4, 5, 0, 8, 0, 17, 20, 22, 0 };
        imprimir_arreglo_secuencias_int(arr);
        obtenerSecConMasPares(arr);
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

    public static int contarCantPares(int[] arr, int ini, int fin) {
        int contadorpares = 0;
        for (int i = ini; i <= fin; i++) {
            if (arr[i] % 2 == 0) {
                contadorpares++;
            }
        }
        return contadorpares;
    }

    public static void obtenerSecConMasPares(int arr[]) {
        int ini = 0;
        int fin = -1;
        int inipar = 0;
        int finpar = 0;
        int cantparesMayor = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                int cantpares = contarCantPares(arr, ini, fin);
                if (cantpares > cantparesMayor) {
                    cantparesMayor = cantpares;
                    inipar = ini;
                    finpar = fin;
                }
            }
            fin = ini;
        }
        System.out.println("La secuencia con mas pares empieza en: " + inipar + " y termina en: " + finpar);
    }

}
