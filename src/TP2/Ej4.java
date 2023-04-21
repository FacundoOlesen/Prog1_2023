package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej4 {
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 999;
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
            System.out.println("Ingrese un numero entre " + MIN + " y " + MAX);
            numero = Integer.valueOf(entrada.readLine());

            if ((numero>=MIN) && (numero<=MAX)){
                if((numero >=MIN) && numero<=9){
                    System.out.println("El numero ingresado tiene 1 digito");
                }
               else if((numero>=10)&&(numero<=99)){
                    System.out.println(numero + " El numero ingresado tiene 2 digitos");
                }
                else {
                    System.out.println(numero + " Tiene 3 digitos");
                }
            }

            else {
                System.out.println("Ingresaste un numero fuera del rango");
            }

        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }


}
