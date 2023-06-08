package TP5.Bonus_Track_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MIN = 0;

    public static void main(String[] args) {
        int arr[] = { 0, 20, 40, 10, 0, 0, 3, 5, 8, 0, 5, 7, 20, 0, 7, 6, 10, 5, 14, 0 };
        menu(arr);
    }

    public static void menu(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        try {
            System.out.println(
                    "Bienvenido al Supermercado Carrefive. Ingrese:\n1. Para saber la cantidad de tickets emitidos este fin de semana. \n2. Para saber el importe total de ventas. \n3. Para saber cual fue el ticket de mayor importe y su valor. \n4. Para la mayor cantidad de articulos vendidos en un ticket.");
            opcion = Integer.valueOf(entrada.readLine());

            if (opcion == 1) {
                contarCantidadTickets(arr);
            }

            else if (opcion == 2) {
                calcularImporteTotal(arr);
            }

            else if (opcion == 3) {
                obtenerTicketMayorImporte(arr);
            }

            else if (opcion == 4) {
                calcularTickerMayorCantArticulos(arr);
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int obtenerIni(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void contarCantidadTickets(int arr[]) {
        int ini = 0;
        int fin = -1;
        int contador = -1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            contador++;
            ini = fin + 1;
        }
        System.out.println("La cantidad de tickets emitidos en la semana es de: " + contador);
    }

    public static void calcularImporteTotal(int[] arr) {
        int suma = 0;
        for (int i = 0; i < MAX; i++) {
            suma += arr[i];
        }
        System.out.println("El importe total de ventas de todos los tickets fue de: " + suma);
    }

    public static int obtenerSumasTickets(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static void obtenerTicketMayorImporte(int[] arr) {
        int ini = 0;
        int fin = -1;
        int iniciomayor = 0;
        int finmayor = 0;
        int sumamayor = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            int suma = obtenerSumasTickets(arr, ini, fin);
            if (suma > sumamayor) {
                sumamayor = suma;
                iniciomayor = ini;
                finmayor = fin;
            }
            fin = ini;
        }
        System.out.println(("El ticket de mayor importe empieza en: " + iniciomayor + " termina en: " + finmayor
                + " y la suma da: " + sumamayor));
    }

    public static void calcularTickerMayorCantArticulos(int[] arr) {
        int ini = 0;
        int fin = -1;
        int longitudmayor = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            int longitud = (fin - ini) + 1;
            if (longitud > longitudmayor) {
                longitudmayor = longitud;
            }
            ini = fin + 1;
        }
        System.out.println("La mayor cantidad de articulos vendidos en un ticket fue de: " + longitudmayor);
    }

}
