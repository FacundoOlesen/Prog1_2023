package TP4;
/* public static String decimalABinario(int num) {
// convierte un número decimal a su representación
binaria
String binario = "";
while (num > 0) {
int resto = num % 2;
binario = resto + binario;
num = num / 2;
}
return binario;
}*/
public class Ej4H {
    public static void main(String[] args) {
        System.out.println(decimalABinario(55));
    }
    public static String decimalABinario(int num) {
        // convierte un número decimal a su representación binaria
        String binario = "";
        while (num > 0) {
            int resto = num % 2;
            binario = resto + binario;
            num = num / 2;
        }
        return binario;
        }
}
