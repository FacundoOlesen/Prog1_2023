package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej9 {
    public static void main(String[] args) {
        char c;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

        try {

            System.out.println ("Ingrese un caracter.");
            c = entrada.readLine().charAt(0);

            while ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')){
                if ((c >= 'a' && c <= 'z')){
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                        System.out.println(c+ " Es letra miniscula vocal");
                        System.out.println ("Ingrese un caracter. (Caracter no digito ni letra miniscula para salir).");
                         c = entrada.readLine().charAt(0);
                    }
                    else {
                        System.out.println(c+ " Es letra miniscula consonante");
                        System.out.println ("Ingrese un caracter. (Caracter no digito ni letra miniscula para salir).");
                        c = entrada.readLine().charAt(0);
                    }
                }

                else {
                    System.out.println(c+ " Es caracter digito");
                    System.out.println ("Ingrese un caracter. (Caracter no digito ni letra miniscula para salir).");
                    c = entrada.readLine().charAt(0);
                }
            }
            System.out.println( c+ " No es un caracter letra miniscula ni digito");

        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
