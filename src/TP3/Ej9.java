package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej9 {
    public static void main(String[] args) {
        int numero = obtenerNumero();
        while(numero!=0){
            char c= obtenerCaracter();
            if(c>='a'&&c<='z'){
                System.out.println("El caracter " + c + " es letra miniscula");
            }

            else if(c>='A'&&c<='Z'){
                System.out.println("El caracter " + c + " es letra mayuscula");
            }

            else if(c>='0'&&c<='9'){
                System.out.println("El caracter " + c + " es caracter digito");
            }

            else {
                System.out.println("El caracter " + c + " es un caracter especial");
    
            }
        }
        
    }

    public static int obtenerNumero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        int numero=0;
        try {
            System.out.println("Ingrese un numero entre 1 y 10 para entrar al bucle.");
            numero = Integer.valueOf(entrada.readLine());
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return numero;
    }

    public static char obtenerCaracter(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        char c=' ';
        try {
            System.out.println("Ingrese un caracter.");
            c = entrada.readLine().charAt(0);
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return c;
    }
}
