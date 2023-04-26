/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */

package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej10{
    public static void main(String[] args) {
        int numero;
        final int MIN = 1;
        final int MAX = 10;
        int sumanros=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

        try {
            System.out.println("Ingrese un numero entre 1 y 10.");
            numero = Integer.valueOf(entrada.readLine());

            while((numero >=MIN && numero <= MAX)){
                System.out.println("Ingrese un numero entre 1 y 10.");
                numero = Integer.valueOf(entrada.readLine());
                sumanros+=numero; // sumanros = sumanros+numero
            }
            System.out.println("La suma de todos los nros ingresados es: " + (sumanros));
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
