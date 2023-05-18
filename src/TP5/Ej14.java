package TP5;

public class Ej14 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MIN = 0;

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        imprimirArreglo(arr);
        int pos = obtenerPosPar(arr);
        corrimiento_izquierda(arr, pos);
        System.out.println("");
        imprimirArreglo(arr);

    }

    public static void imprimirArreglo(int arr[]) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arr[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static int obtenerPosPar(int[] arr) {
        int pos = 0;
        int i=0;
        while ((i < MAX-1) ){
            if (arr[i] % 2 == 0) {
                corrimiento_izquierda(arr, i);
            }
            i++;
        }
        return pos;
    }

    public static void corrimiento_izquierda(int[] arr, int pos) {
        while (pos < MAX-1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }
}