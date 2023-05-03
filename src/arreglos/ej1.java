package arreglos;

import java.util.Random;

public class ej1 {
    public static void main(String[] args) {
        int[] arrentero;
        int aux;
        arrentero = new int[8];
        cargar_arreglo_aleatorio_int(arrentero);
        for (int recorredor = 0; recorredor < 8; recorredor++) {

            for (int cursor = recorredor; cursor < 8; cursor++) {

                if (arrentero[recorredor] < arrentero[cursor]) {

                    aux = arrentero[recorredor];
                    arrentero[recorredor] = arrentero[cursor];
                    arrentero[cursor] = aux;
                }
            }
        }
        imprimir_arreglo_int(arrentero);
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < 8; pos++) {
            arr[pos] = (r.nextInt(9 - 0 + 1) + 0);
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < 8; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
