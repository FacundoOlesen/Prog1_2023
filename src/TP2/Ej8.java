package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej8 {
    public static void main(String[] args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
            System.out.println("Ingrese un numero distinto de 0.");
            numero = Integer.valueOf(entrada.readLine());

            while(numero!=0){
                System.out.println("Ingrese un numero. (0 para salir).");
                numero = Integer.valueOf(entrada.readLine());
                System.out.println("Ingresaste: " + numero);
            }
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
