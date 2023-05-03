package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej1{
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        int numero2=0;
        try {
            while(obtenerNumero()!=0){
                System.out.println("Ingrese un numero y lo imprimiremos.");
                numero2 = Integer.valueOf(entrada.readLine());
                System.out.println("Numero ingresado: " +numero2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    
    public static int obtenerNumero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        int numero1=0;
        try {
            System.out.println("Ingrese un numero != de 0");
            numero1 = Integer.valueOf(entrada.readLine());

            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return numero1;
    }
}