package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej3 {
    public static void main(String[] args) {
            final int numero;       
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un valor entero: ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("El numero ingresado es: " + numero);
                } 
                catch (Exception exc) {
                    System.out.println(exc);
                }
    } 
}
 