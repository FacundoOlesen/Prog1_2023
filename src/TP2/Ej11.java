package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej11 {
   public static void main(String[] args) {
    char c;
    int acumulador=0;
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

    try {
        System.out.println ("Ingrese un caracter.");
        c = entrada.readLine().charAt(0);

        while(c>='a'&&c<='z'){
            System.out.println ("Ingrese un caracter. (Las vocales seran contadas). (Caracter != letra miniscula para salir).");
            c = entrada.readLine().charAt(0);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                acumulador++;
            }
            System.out.println("Ingresaste " + acumulador + " Vocales");
        }
    } 
    
    catch (Exception e) {
        System.out.println(e);
    }
   } 
}
