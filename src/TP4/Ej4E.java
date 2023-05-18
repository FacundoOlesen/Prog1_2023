package TP4;
/* public static int contarDigitos(int n) {
int contador = 0;
while (n != 0) {
n /= 10;
contador++;
}
return contador;
}
*/
public class Ej4E{
    public static void main(String[] args) {
        int numero = contarDigitos(5);
        System.out.println(numero);
    }

    public static int contarDigitos(int n) {
        int contador = 0;
        while (n !=0) {
            contador++;
        }
        return contador;
        }
   
}