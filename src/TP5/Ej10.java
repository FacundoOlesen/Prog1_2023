package TP5;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej10 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MIN = 0;
    public static void main(String[] args) {
        
        int arr[] = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        imprimirArreglo(arr);
        int numero= obtenerNumeroAEliminar();
        int posicion =  obtenerPosicionNumero(arr, numero);
        if(numero==arr[posicion]){
            System.out.println("Arreglo con: " + numero + " eliminado: ");
            corrimiento_izquierda(arr, posicion);
            imprimirArreglo(arr);
        }
        else {
            System.out.println(numero +  " no está en el arreglo.");
        }
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
            System.out.println("Ingrese el numero que quiere eliminar del arreglo. (Se eliminara su primer existencia si existe)");
            numero= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int obtenerPosicionNumero(int[]arr, int numero){
        int pos=0; 
        for (int i=0; i<MAX; i++){
            if(arr[i]==numero){
                 pos = i;
                 return pos;
            }
        }
        return pos;
    }

    public static void corrimiento_izquierda(int[]arr, int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }

    }
}
