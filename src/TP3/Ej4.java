package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej4 {
    public static void main(String[] args) {
        while(obtenerNumero()!=0){
            multiplicarNumeros();
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
    
    public static void multiplicarNumeros(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        int numero1;
        int numero2;
        try {
            System.out.println("Ingrese el primer numero");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo numero");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println(numero1+ " * "+ numero2+  " = " +(numero1*numero2));
        } 
        catch (Exception e) {
            System.out.println(e);
        }  
    }
    
    }

