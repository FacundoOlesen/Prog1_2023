package TP5.Bonus_Track_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej2 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MIN = 0;
    public static final char MINOPC = '1', MAXOPC = '4';

    public static void main(String[] args) {
        int arr[] = { 0, 20, 40, 10, 0, 0, 3, 5, 8, 0, 5, 7, 20, 0, 7, 6, 10, 5, 14, 0 };
        menu(arr);
    }

    public static void menu(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char opcion = '1';
        while (opcion >= MINOPC && opcion <= MAXOPC) {
            try {
                System.out.println(
                    "\nBienvenido al Supermercado Carrefive."
                    +"Ingrese:\n1. Y le pediremos un importe, luego le mostraremos la cantidad de tickets que superan el importe ingresado."
                    + "\n2. Y le pediremos una cantidad de articulos, luego le mostraremos los tickets que tengan una mayor cantidad de articulos que el numero ingresado."
                    + "\n3. Y le pediremos un importe, luego le mostraremos la cantidad de articulos que superan el importe ingresado."
                    + "\n4.Y le pediremos un importe promedio, luego le mostraremos la cantidad de tickets que superan el importe promedio ingresado."
                    + "\n0. Para salir.");
                    opcion = entrada.readLine().charAt(0);
                    int numero= obtenerNumero();
                    switch (opcion) {
                    case '1':
                    int ticketsmayoresimp= ticketsMayoresAImporte(arr, numero);
                    System.out.println("La cantidad de tickets cuyo importe es mayor que: " +numero +" es: " +ticketsmayoresimp);
                    break;
                    case '2':
                    int ticketsmayoresart=ticketsMayoresAArticulo(arr, numero);
                    System.out.println("La cantidad de tickets cuya cantidad de articulos es mayor que: " +numero +" es: " +ticketsmayoresart);
                    break;
                    case '3':
                    int articulosmayores= obtenerPreciosArtitulos(arr, numero);
                    System.out.println("La cantidad de articulos cuyo precio es mayor que: " + numero +" es: " +articulosmayores);
                    break;
                    case '4':
                    int ticketsmayorespromedio= ticketsMayoresAPromedio(arr, numero);
                    System.out.println("La cantidad de tickets cuyo precio promedio es mayor que: " + numero +" es: " +ticketsmayorespromedio);
                    break;
                    case '0':
                    System.out.println("Bye");
                    break;
                    default:
                    System.out.println("Error, la opcion: " + opcion + " no es valida.");
                    break;
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

     public static int obtenerNumero(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el importe/cant articulos segun haya elegido la opcion anterior.");
            numero= Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }
    //A
    public static int ticketsMayoresAImporte(int[] arr, int numero) {
        int ini=0;
        int fin=-1;
        int contador=0;
        while(ini<MAX){
            ini = buscarIni(arr, fin+1);
            if(ini<MAX){
                fin=buscarFin(arr, ini);
                int suma= obtenerSumaSec(arr, ini, fin);
                if(suma>numero){
                    contador++;
                    ini=fin;
                }
            }
        }
        return contador;
    }

    public static int obtenerSumaSec(int []arr, int ini, int fin){
        int suma=0;
        for(int i=ini; i<=fin;i++){
            suma+=arr[i];
        }
        return suma;
    }
    //B
    public static int ticketsMayoresAArticulo (int[]arr, int numero){
        int ini=0;
        int fin=-1;
        int contador=0;
        while(ini<MAX){
            ini = buscarIni(arr, fin+1);
            if(ini<MAX){
                fin=buscarFin(arr, ini);
                int longitud = (fin-ini)+1;
                if(longitud>numero){
                    contador++;
                    ini=fin;
                }
            }
        }
        return contador;
    }
    //C
    public static int obtenerPreciosArtitulos(int[] arr, int numero) {
        int pos = 0, contador=0;
        while (pos < MAX ) {
            if( arr[pos] > numero){
                contador++;
            }
            pos++;
        }
        return contador;
    }
    //D
    public static int ticketsMayoresAPromedio(int[]arr, int numero){
        int ini=0;
        int fin=-1;
        int contador=0;
        while(ini<MAX){
            ini = buscarIni(arr, fin+1);
            if(ini<MAX){
                fin=buscarFin(arr, ini);
                int promedio= obtenerPromedio(arr, ini, fin);
                if(promedio>numero){
                    contador++;
                    ini=fin;
                }
            }
        }
        return contador;
    }

    public static int obtenerPromedio(int[]arr, int ini, int fin){
        int suma=0;
        for(int i=ini;i<=fin;i++){
            suma+=arr[i];
        }
        return suma/(fin-ini)+1;
    }
}

