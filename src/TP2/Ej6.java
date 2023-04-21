package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej6 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

            System.out.println("Ingrese un numero entre 1 y 100");
            numero = Integer.valueOf(entrada.readLine());

            while((numero>=MIN) && (numero<=MAX)){
                if ((numero%2==0)&&(numero%3==0)){
                    System.out.println(numero + " Es multiplo de 2 y de 3");
                    System.out.println("Ingrese un numero entre 1 y 100. (Numero fuera de ese rango para salir.)");
                    numero = Integer.valueOf(entrada.readLine());
                }
                else {
                    System.out.println(numero + " No es multiplo de 2 y 3");
                    System.out.println("Ingrese un numero entre 1 y 100. (Numero fuera de ese rango para salir.)");
                    numero = Integer.valueOf(entrada.readLine());
                }
            }
            System.out.println("Numero ingresado fuera de rango.");
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
