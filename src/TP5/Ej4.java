package TP5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej4 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        char arr[] = new char [MAX];
        char valor=0;
        cargar_arreglo_aleatorio_char(arr);
        imprimir_arreglo_char(arr);
        valor= obtenerValor(arr, valor);
        obtenerPos(arr, valor);
        
    }



    public static void cargar_arreglo_aleatorio_char(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }

    public static void imprimir_arreglo_char(char[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static char obtenerValor(char arr[], char valor) { 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una letra y la buscaremos en el arreglo.");
            valor = entrada.readLine().charAt(0);
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return valor;
    }

    public static void obtenerPos(char[]arr, char valor){
        
        for(int pos=0; pos<MAX; pos++){
            if(arr[pos]==valor){
                System.out.println(valor + " fue encontrado en la pos ->: " + pos);
            }
           
        }
    }
}
