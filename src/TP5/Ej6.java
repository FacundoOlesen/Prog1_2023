package TP5;
import java.util.Random;

public class Ej6 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int arr [] = new int [MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimir_arreglo_int(arr);
        int pares= obtenerPares(arr);
        System.out.println("El arreglo tiene " + pares + " numeros pares.");

    }


    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }
    
    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arr[" + pos + "]=>: " + arr[pos]);
        }
    }

    //metodo de intercambiar arreglo
    //recorro el arreglo
    //arr[0]=arr[9]
    public static int obtenerPares(int[]arr){
        int acum=0;
        for (int i=0; i<MAX; i++){
            if(arr[i]%2==0){
                acum++;
            }
        }
        return acum;
    }
}
