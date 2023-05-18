package TP5;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej11 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MIN = 0;
    public static void main(String[] args) {
        
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimirArreglo(arr);
        int numero= obtenerNumeroAEliminar();
        
            System.out.println("Arreglo con: " + numero + " eliminado: ");
            eliminar_ocurrencias(arr, numero);
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

    public static int obtenerNumeroAEliminar(){
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el numero que quiere eliminar del arreglo. (Se eliminaran todas sus existencias si existe)");
            numero= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static void eliminar_ocurrencias(int[]arr, int numero){
        for (int i=0; i<MAX; i++){
            if(arr[i]==numero){
               corrimiento_izquierda(arr, i);
            }
        }
    }

    public static void corrimiento_izquierda(int[]arr, int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }
}
