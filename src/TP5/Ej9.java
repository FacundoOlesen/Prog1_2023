package TP5;
import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej9 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MIN = 0;
    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimirArreglo(arr);
        int numero= obtenerNuevoNumero();
        corrimiento_derecha(arr, numero);
        imprimirArreglo(arr);
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimirArreglo(int arr[]) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arr[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static int obtenerNuevoNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el numero que quiere ingresar en el arreglo. Se ingresara en la posicion 0.");
            numero= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static void corrimiento_derecha(int[]arr, int numero){
        int indice=MAX-1;
        while(indice>MIN){
            arr[indice]=arr[indice-1];
            indice--;
        }
        arr[0]=numero;
        
    }

}
