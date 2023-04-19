package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej10 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    

            System.out.println ("Ingrese un entero: ");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese un entero nuevamente: ");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Es el nro 1 mayor que el nro2? " + (numero1>numero2));
            System.out.println(numero1 % 2 == 0 && numero2 % 2 == 0) ;

        } catch (Exception e) {
            System.out.println(e); 
        }        
    }
}
