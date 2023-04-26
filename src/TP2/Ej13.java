package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej13 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        char c;
        int numero;
        try {
            System.out.println ("Ingrese un caracter letra miniscula.");
            c = entrada.readLine().charAt(0);
    
            while(c>='a'&&c<='z'){
                System.out.println("Ingrese un numero entre 1 y a 5.(Caracter letra para salir).");
                numero = Integer.valueOf(entrada.readLine());

                if(numero>=1&&numero<=5){
                    for(int multiplicador=1;multiplicador<=10;multiplicador++){
                         System.out.println(numero+" * "+multiplicador+" = "+(numero * multiplicador));
                    }
                }

                else{
                    System.out.println(numero+ " No esta entre 1 y 5");
                }
            }
        } 


        catch (Exception e) {
            System.out.println(e);
        }
    }
}
