package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej12 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
            
            System.out.println ("Ingrese un entero: ");
            numero1 = Integer.valueOf(entrada.readLine());
            
            System.out.println ("Ingrese un entero nuevamente: ");
            numero2 = Integer.valueOf(entrada.readLine());
            int numero1modificado = numero1+1;
            int numero2modificado = numero2-1;


            System.out.println("Numero ingresado orginalmente: " + numero1 + " Numero modificado: " + (numero1modificado));
            System.out.println("Numero ingresado orginalmente: " + numero2 + " Numero modificado: " + (numero2modificado));

            


        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
