package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej15 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        int numero;
        int numsingresados=0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int sumanrosingresados = 0;

        try {
            System.out.println("Ingrese un numero distino de 0 para entrar al bucle.");
            numero = Integer.valueOf(entrada.readLine());

            while(numero!=0){

                System.out.println("Ingrese un numero. Mientras el numero sea != de 0, le mostraremos el promedio de los numeros ingresados y cual fue el mayor y menor numero ingresado.");
                numero = Integer.valueOf(entrada.readLine());
                numsingresados++;
                sumanrosingresados+=numero;

                if (numero>min){  
                    min=numero;   
                }
                if (numero<max && numero!=0) { 
                    max=numero;   
                }
                
            }
            
            numsingresados--;
            System.out.println("Mayor nro " + min);
            System.out.println("Menor nro " + max);
            System.out.println("El promedio de los numeros ingresados es: " + sumanrosingresados + " / " + numsingresados + " = " + (sumanrosingresados/numsingresados));
            
            

        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
