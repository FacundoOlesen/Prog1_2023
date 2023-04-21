package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej3 {
    public static void main(String[] args) {
        int numero; 

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
            System.out.println("Ingrese un numero mayor de 50");
            numero = Integer.valueOf(entrada.readLine());

            if (numero>50){
                System.out.println(numero + " Es mayor que 50 pero no multiplo de 2 y 3");
                if ((numero%2==0)&&numero%3==0) {
                    System.out.println(numero + " Es mayor que 50 y multiplo de 2 y 3");
                }
            }

            else {
                System.out.println(numero + " No es mayor que 50 ni multiplo de 2 y 3");
            }
        } 
        
        catch (Exception e) {
            System.out.println(e);        
        }   
    }
}
