//Hacer un programa que dado una matriz de enteros de tamaño 4*5, encuentre la posición
//fila,columna de un número entero ingresado por el usuario. Si existe, muestre esa posición por
//pantalla, o indique que no existe.
package TP6.Ejemplos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejemplo3 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 4;

    public static void main(String[] args) {
        int[][] mat;
        mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(mat);
        imprimir_matriz(mat);
        int numero = obtenerNumero();
        imprimir_fila_columna_matriz(mat, numero);
    }

    public static void cargar_matriz(int[][] matint) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            matint[fila][0] = 0;
            matint[fila][MAXCOLUMNA - 1] = 0;
            for (int col = 1; col < MAXCOLUMNA - 1; col++) {
                if (r.nextDouble() < probabilidad_numero) {
                    matint[fila][col] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
                } else {
                    matint[fila][col] = 0;
                }

            }
        }
    }

    public static void imprimir_matriz(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {

                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int obtenerNumero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero entero: ");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static int obtenerPosArr(int[] arr, int numero) {
        int pos = 0;
        while (pos < MAXCOLUMNA && arr[pos] != numero) {
            pos++;
        }
        return pos;
    }

    public static void imprimir_fila_columna_matriz(int[][] mat, int numero) {
        int fila = 0;
        int columna = MAXCOLUMNA;
        while ((fila < MAXFILA) && (columna == MAXCOLUMNA)) {
            columna = obtenerPosArr(mat[fila], numero);
            if (columna == MAXCOLUMNA) {
                fila++;
            }
        }
        if ((fila < MAXFILA) && (columna < MAXCOLUMNA)) {
            System.out.println(numero + " se encuentra en " + fila + " y " + columna);
        } else {
            System.out.println(numero + " no se encuentra en la matriz");
        }
    }

}
