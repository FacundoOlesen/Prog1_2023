package TP3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej6 {
    public static void main(String[] args) {
        char c = obtenerCaracter();
        while (c >= 'a' && c <= 'z') {
            tablaMultiplicarNueve();
            c=obtenerCaracter();
        }
    }

    public static char obtenerCaracter() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char c = 'b';
        try {
            System.out.println("Ingrese un caracter letra miniscula.");
            c = entrada.readLine().charAt(0);
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }

    public static void tablaMultiplicarNueve() {
        final int MAX = 9;
        for (int i = 1; i <= MAX + 1; i++) {
            System.out.println(i + " * " + MAX + " = " + i * MAX);
        }
    }
}
