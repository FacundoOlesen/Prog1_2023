package TP5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1{
    public static int MAX = 15;
    public static void main(String[] args) {
       int arr[] = new int [MAX];
        cargarNumerosArreglo(arr);
        imprimirArreglo(arr);
    }


    public static void cargarNumerosArreglo(int arr[]) { 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for(int pos=0;pos<MAX;pos++){
                System.out.println("Ingrese 15 valores y los insertaremos en un arreglo.");
                arr[pos] = Integer.valueOf(entrada.readLine());
            }
            
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void imprimirArreglo(int arr[]){
        for (int pos=0;pos<MAX;pos++){
            System.out.println("arr[" + pos + "]=>: " + arr[pos]);
        }
    }
}