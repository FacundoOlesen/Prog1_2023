package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej9 {
    public static void main(String[] args) {
            int numero;
            try {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    

                System.out.println ("Ingrese un entero: ");
                numero = Integer.valueOf(entrada.readLine());

                System.out.println(numero +  " /2 " + " = " + numero/2);
                System.out.println(numero +  " /3 " + " = " + numero/3);
                System.out.println(numero +  " /4 " + " = " + numero/4);
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
    }
}
