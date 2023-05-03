package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej15 {
    public static void main(String[] args) {
        int numero = obtenerNumero(0);
        while(numero>0){
            sumatoria(numero) ;
        }
    }



    public static int obtenerNumero(int numero){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese un numero natural.");
            numero = Integer.valueOf(entrada.readLine());
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return numero;
    }

    public static int sumatoria(int numero){
        numero= obtenerNumero(numero);
        int sumatoria=1;
        sumatoria += numero;
        System.out.println("La sumatoria entre " + numero + " y 1 es: "+sumatoria);
        return sumatoria;
    }
}
