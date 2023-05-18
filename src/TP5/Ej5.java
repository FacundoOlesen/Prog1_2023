package TP5;
import java.util.Random;

public class Ej5 {
    public static int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        char arr [] = new char [MAX];
        cargar_arreglo_aleatorio_char(arr);
        imprimir_arreglo_char(arr);
        intercambioArreglo(arr);
        System.out.println("\n");
        imprimir_arreglo_char(arr);

       

    }


    public static void cargar_arreglo_aleatorio_char(char [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(char)(r.nextInt(26) + 'a');
        }
        }
    
        public static void imprimir_arreglo_char(char [] arr){
            for (int pos = 0; pos < MAX; pos++){
            System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
            }
            }

    public static void intercambioArreglo(char[]arr){
        char retener;
        for(int i = 0; i<MAX/2;i++){
            retener=arr[i];
            arr[i]=arr[(MAX-1)-i];
            arr[(MAX-1)-i]=retener;
        }

    }
}
