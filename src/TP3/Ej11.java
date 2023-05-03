package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej11 {
    public static void main(String[] args) {
        try {
            int numero;
            int maximo=0;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
            final int MAX = 20;
            for (int i=1; i<=MAX;i++ ){
                System.out.println("Ingrese el numero " + i+ " vez");
                numero = Integer.valueOf(entrada.readLine());
                maximo= retornoNumeros(numero, maximo);
            } 
            System.out.println("El numero mayor ingresado es: " + maximo);
    }
        catch (Exception e) {
            System.err.println(e);     
        }
    }
        
        
        
        public static int retornoNumeros(int numero1, int numero2){
            int maximo=0;
            if(numero1>numero2){
                maximo=numero1;
            }
            else if(numero2>numero1){
                maximo=numero2;
            }  
            return maximo;   
    }  
}
