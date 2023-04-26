package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej12 {
   public static void main(String[] args) {
     char MIN = 'z';
     char MAX = 'a';
     char c;
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

    try {
        System.out.println ("Ingrese un caracter.");
        c = entrada.readLine().charAt(0);

        while(c>='a'&&c<='z'){
            
            if (c<MIN){
                MIN=c;
            }

            if(c>MAX){
               MAX=c;
            }
            
            System.out.println ("Ingrese un caracter. (La menor y mayor letra que ingrese sera mostrada luego) 0 para salir.");
            c = entrada.readLine().charAt(0);
            
        }
        System.out.println("La letra mas chica ingresada es: " + MIN);
        System.out.println("La letra mas grande ingresada es: " + MAX);
    } 
    
    catch (Exception e) {
        System.out.println(e);
    }
   } 
}
