package TP5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej13 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MIN = 0;
    public static void main(String[] args) {
        int arr[] = {10, 9,8,7,6,5,4,3,2,1} ;
        int pos=0;
        imprimirArreglo(arr);
        int numero=obtenerNuevoNumero();
        pos=obtenerPosicionNumero(arr, numero);
        corrimiento_derecha(arr, pos);
        System.out.println("");
        imprimirArreglo(arr);
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
            System.out.println("Ingrese el numero que quiere ingresar en el arreglo.");
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
 


    public static void corrimiento_derecha(int[]arr, int pos){
        int indice= MAX-1;
        while(indice>pos){
            arr[indice]=arr[indice-1];
            indice--;
        }

    }

}
