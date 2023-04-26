package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej17 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        int numero;
        try {
             System.out.println("Ingrese un numero menor que 10 y mayor a 1.");
             numero = Integer.valueOf(entrada.readLine());
            
             for(int i=0;i<=numero;i++){
              System.out.println(numero-i);
             }   
        } 


        catch (Exception e) {
            System.out.println(e);
        }
    }
}
