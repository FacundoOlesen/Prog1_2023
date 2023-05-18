package TP5.Ejemplos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_Metodo_Seleccion_2 {
    public static void main(String[] args) {
        final int MAX = 10;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int arreglo[];
        arreglo = new int[MAX];

        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Digite un elemento en la posicion[" + i + "] : ");
                arreglo[i] = Integer.valueOf(entrada.readLine());
            }
            System.out.println("\nEl arreglo desordenado es: ");

            // METODO DE SELECCION:
            int minimo;
            int auxiliar;
            for (int i = 0; i < MAX; i++) {
                minimo = i;
                for (int j = i + 1; j < MAX; j++) {
                    if (arreglo[j] < arreglo[minimo]) {
                        minimo = j;
                    }
                }
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = auxiliar;
            }

            for (int i = 1; i < MAX; i++) {
                System.out.println("[" + i + "]" + " => " + arreglo[i]);
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}