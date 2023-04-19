package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej7 {
        public static void main(String[] args) {
            double numero1;
            double numero2;
            double numero3;

            try {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

                System.out.println ("Ingrese el numero 1: ");
                numero1 = Double.valueOf(entrada.readLine());

                System.out.println ("Ingrese el numero 2: ");
                numero2 = Double.valueOf(entrada.readLine());

                System.out.println ("Ingrese el numero 3: ");
                numero3 = Double.valueOf(entrada.readLine());

                System.out.println("El resultado de "+ numero1 +" / "+ numero2+ " - " + numero3 + " Es: " + ((numero1/numero2)-numero3));
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
        }
}
