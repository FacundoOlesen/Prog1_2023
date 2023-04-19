package TP1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej11 {
    public static void main(String[] args) {
        int numero;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    

            System.out.println ("Ingrese un entero: ");
            numero = Integer.valueOf(entrada.readLine());

            System.out.println("Es multiplo de 6 y 7?: "+(numero % 6 == 0 && numero % 7 == 0));

            System.out.println("Es mayor a 30 y multiplo de 2? "+(numero > 30  && numero % 2 == 0) + " \n Es menor a 30? "+ (numero<30));

            System.out.println("El cociente del nro ingresado divido por 5 es mayor que 10?: "+((numero / 5) > 10));


        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
