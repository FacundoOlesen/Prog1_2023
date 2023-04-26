/*Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */

package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej18 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        int numero;
        int numero1;
        
        try {
            System.out.println("Ingrese un numero menor que 10 y mayor a 1 para entrar al while.");
            numero = Integer.valueOf(entrada.readLine());

            while(numero!=0){
                System.out.println("Ingrese un numero. Los ultimos 2 ingresados seran divididos");
                numero = Integer.valueOf(entrada.readLine());
                
                System.out.println("Ingrese un numero. Los ultimos 2 ingresados seran divididos");
                numero1 = Integer.valueOf(entrada.readLine());
                
                System.out.println(numero +" / " + numero1 + " = "+  numero/numero1);
            }
            
        } 
        
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
