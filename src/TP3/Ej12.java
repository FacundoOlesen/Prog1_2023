package TP3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej12 {
    public static void main(String[] args) {
        tirarDado1000Veces();
    }

    public static void tirarDado1000Veces() {
        final int MAX = 1000;
        int dado = 0;
        int acum = 0;
        int numero = obtenerNumero();
        for (int i = 0; i <= MAX; i++) {
            dado = (int) (6 * Math.random() + 1);
            if (numero == dado) {
                acum++;
            }
        }
        System.out.println("El numero que ingresate " + "(" + numero + ")" + " salio en el dado un total de: " + acum + " veces");
    }

    public static int obtenerNumero() { 
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entre 1 y 6 y mostraremos cuantas veces salio tu numero en nuestro dado.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }
}
