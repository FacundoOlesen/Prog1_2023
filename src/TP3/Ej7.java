package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej7 {
    public static void main(String[] args) {
        while(obtenerNumero()!=0){
            int sumatoria=sumatariaNumeros();
            System.out.println("La sumatoria de 1 a 200 da: " + sumatoria);
            return;
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


    public static int sumatariaNumeros(){
        final int MAX=200;
        int sumatoria;
        int suma=0;
        for (int i=1; i<=MAX;i++){
            suma+=i;
        }
        sumatoria=suma;
        return sumatoria;
    }

}
