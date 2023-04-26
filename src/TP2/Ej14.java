package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej14 {
    public static void main(String[] args) {
        int numero;
        int acumulador=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        try {

           for (int i=0;i<10;i++){
            System.out.println("Se le solicitara el ingreso de un numero 10 veces. Luego contaremos la cantidad de numeros pares ingresados.");
            numero = Integer.valueOf(entrada.readLine());

                if(numero%2==0){
                    acumulador++;
                }
            } 
            
            System.out.println("Ingresaste numeros pares "+acumulador++ + " veces");

        } 


        catch (Exception e) {
            System.out.println(e);
        }
    }
}
