package TP4;
/*
 public static boolean buscarDigito(int num, int digito) {
// determina si en num está presente un determinado
dígito
boolean encontrado = false;
int resto;
while (num > 0) {
resto = num % 10;
if (resto == digito) {
encontrado = true;
} else {
encontrado = false;
}
num = num / 10;
}
return encontrado;
}
 */
public class Ej4F {
    public static void main(String[] args) {
        boolean numero = buscarDigito(32322, 215);
        System.out.println(numero);
    }


    public static boolean buscarDigito(int num, int digito) {
        // determina si en num está presente un determinado dígito
        boolean encontrado = false;
        int resto;
        while (num > 0) {
            resto = num % 10;
            
            if (resto == digito) {
                encontrado = true;
            } 
            else {
                encontrado = false;
            }

            num = num / 10;
        }
        return encontrado;
        }
}
