package TP4;
/*4)C)
c. public static boolean esPrimo(int numero) {
// devuelve si es primo el numero o no
int divisor=2;
if (numero < 2)
return false;
while (divisor < numero){
if (numero%divisor++==0)
return false;
}
return true;
} */
public class Ej4C {
    public static void main(String[] args) {
        int numero =3;
        boolean esPrimo = esPrimo(numero);
        System.out.println("El numero: " + numero + " es primo? " + esPrimo);
    }
    public static boolean esPrimo(int numero) {
        int divisor=2;
        if (numero < 2){
            return false;
        }

        while (divisor < numero){
            if (numero%divisor++==0){
                return false;
            }
        }
        return true;
    }
}
