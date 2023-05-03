package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej3 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        int numero1=obtenerNumero();
        int numero2=0;
        
        while(numero1>0){
            try {
                System.out.println("Ingrese un numero y lo imprimiremos.");
                numero2 = Integer.valueOf(entrada.readLine());
                
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Numero natural ingresado: " + numero2);
        }
            
    }


    public static int obtenerNumero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        int numero1=0;
        try {
            System.out.println("Ingrese un numero natural para entrar al bucle.");
            numero1 = Integer.valueOf(entrada.readLine());

            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return numero1;
    }
}
