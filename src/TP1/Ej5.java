package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej5 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double altura;
        String ocupacion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println ("Ingrese su nombre: ");
            nombre = entrada.readLine();

            System.out.println ("Ingrese su edad: ");
            edad = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese su altura: ");
            altura = Double.valueOf(entrada.readLine());

            System.out.println ("Ingrese su ocupacion: ");
            ocupacion =  entrada.readLine();
            
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su edad es: " + edad);
            System.out.println("Su altura es: " + altura);
            System.out.println("Su ocupacion es: " + ocupacion);

        } catch (Exception exc) {
            System.out.println( exc );
        }
    
    }
}
