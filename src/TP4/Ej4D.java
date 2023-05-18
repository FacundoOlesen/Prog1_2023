package TP4;
/* public static int buscarMayor(int a, int b, int c) {
// retorna el mayor de los 3 números
int mayor = a;
if (b > mayor) {
mayor = b;
}
if (c > mayor) {
mayor = c;
}
return mayor;
}
*/
public class Ej4D{
    public static void main(String[] args) {
        int a= 3, b=4, c=12;
        int mayor= buscarMayor(a, b, c);
        System.out.println("El numero mayor entre: " + a +", " + b + " y "  + c+ " es: " + mayor );
    }

    
    public static int buscarMayor(int a, int b, int c) {
        // retorna el mayor de los 3 números
        int mayor = a;
        if (b > mayor) {
        mayor = b;
        }
        if (c > mayor) {
        mayor = c;
        }
        return mayor;
        }
}