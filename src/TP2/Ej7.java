package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej7 {
    public static void main(String[] args) {
        char caracter;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
            System.out.println ("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);

            while (caracter != '*'){
                if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
                    System.out.println(caracter+ " Es un caracter vocal miniscula.");
                    System.out.println ("Ingrese un caracter (* Para salir).");
                    caracter = entrada.readLine().charAt(0);
                }

                else if((caracter>='0')&&(caracter<='9')) {
                    System.out.println(caracter + " Es caracter digito");
                    System.out.println ("Ingrese un caracter (* Para salir).");
                    caracter = entrada.readLine().charAt(0);
                }
                else {
                    System.out.println(caracter+" No es ni digito ni vocal miniscula");
                    System.out.println ("Ingrese un caracter (* Para salir).");
                    caracter = entrada.readLine().charAt(0);
                }
            }
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
