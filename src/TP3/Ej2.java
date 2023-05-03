package TP3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//PREGUNTAR WHILE INFINITO
public class Ej2 {
    public static void main(String[] args) {
        char c = obtenerCaracter();
        while ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
            if (c >= 'a' && c <= 'z') {
                switch (c) {
                    case 'a', 'e', 'i', 'o', 'u':
                        System.out.println("El caracter " + c + " es una vocal");
                        break;
                        default:
                        System.out.println("El caracter " + c + " es una consonante");
                        break;
                }
            }
             
            else {
                System.out.println("El caracter ingresado es digito: " + c);
            }
            c=obtenerCaracter();
        }

    }

    public static char obtenerCaracter() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char c = 'b';
        try {
            System.out.println("Ingrese un caracter");
            c = entrada.readLine().charAt(0);
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }
}
