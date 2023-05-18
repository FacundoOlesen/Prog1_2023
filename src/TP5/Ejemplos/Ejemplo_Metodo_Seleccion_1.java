package TP5.Ejemplos;
import java.util.Random;

public class Ejemplo_Metodo_Seleccion_1 {
    public static final int MAX =10;
    public static void main(String[] args) {
        int[] arrentero;
        int aux;
        arrentero = new int[MAX];
        cargar_arreglo_aleatorio_int(arrentero);
        for (int recorredor = 0; recorredor < MAX; recorredor++) {

            for (int cursor = recorredor; cursor < MAX; cursor++) {

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
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(9 - 0 + 1) + 0);
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
