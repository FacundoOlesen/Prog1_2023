package TP5.Ejemplos;

public class Ejemplo5 {
    final static int MAX = 5;

    public static void main(String[] args) {
        int[] B = new int[MAX];
        int a = 20;

        cargar_arreglo(B);

        System.out.println("Los datos son:");
        
        for (int pos = 0; pos < MAX; pos++){
            System.out.println(B[pos]);
        }
        cargar_variable_simple(a);
        System.out.println("La variable es:" + a);
    }

    private static void cargar_variable_simple(int c) {
        c = 10;
    }

    private static void cargar_arreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++)
            arr[pos] = pos * 2;
    }
}
