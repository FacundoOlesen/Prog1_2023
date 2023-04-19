package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej4 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println ("Ingrese un valor entero: ");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese un valor entero: ");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese un valor entero: ");
            numero3 = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese un valor entero: ");
            numero4 = Integer.valueOf(entrada.readLine());
            
            System.out.println ("Ingrese un valor entero: ");
            numero5 = Integer.valueOf(entrada.readLine());
            
            System.out.println(numero5);
            System.out.println(numero4);
            System.out.println(numero3);
            System.out.println(numero2);
            System.out.println(numero1);
                } 
                catch (Exception exc) {
                    System.out.println(exc);
                }

    }
}
