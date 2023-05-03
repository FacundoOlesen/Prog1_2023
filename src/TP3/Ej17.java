package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej17 {
    public static void main(String[] args) {
        char c = obtenerCaracter();
        while (c>='a'&&c<='z'){
            tablaMultiplicarNumero(0);
        }
    }


    public static int obtenerNumero(int numero){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese un numero entre 1 y 5 e imprimiremos su tabla de multiplicar.");
            numero = Integer.valueOf(entrada.readLine());
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return numero;
    }

    public static void tablaMultiplicarNumero(int numero){
        numero = obtenerNumero(numero);
        final int MAX = 10;
        if (numero>=1&&numero<=5){
                for(int i=1; i<=MAX; i++){
                    System.out.println(numero + " * " + i + " = " + numero*i);
                }
        }

        else {
            System.out.println("El numero ingresado (" + numero + ") No esta entre 1 y 5." );
        }
    }


    public static char obtenerCaracter(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        char c=' ';
        try {
            System.out.println("Ingrese un caracter letra miniscula.");
            c = entrada.readLine().charAt(0);
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return c;
    }
}
