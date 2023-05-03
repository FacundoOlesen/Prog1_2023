package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej14 {
    public static void main(String[] args) {
        char c = obtenerCaracter(' ');
        while(c!='*'){
            imprimirTipoCaracter(c);
            return;
        }
    }



    public static char obtenerCaracter(char c){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        c=' ';
        try {
            System.out.println("Ingrese un caracter distinto de *");
            c = entrada.readLine().charAt(0);
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return c;
    }

    public static void imprimirTipoCaracter(char c){
        if (c>='a'&&c<='z'){
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("El caracter: " + c + " es vocal");
            }
            else{
                System.out.println("El caracter: " + c + " es consonante");
            }
        }

        if(c>='0'&&c<='9'){
            System.out.println("El caracter: " + c + " es digito.");
        }

    }
}
