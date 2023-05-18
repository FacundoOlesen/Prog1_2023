package TP4;
/* public static int divisorComunMaximo(int num1, int num2){
// determina el divisor común máximo de dos número
enteros
int dcm = 1;
int divisor = 2;
while (divisor < num1 && divisor < num2) {
if (num1 % divisor == 0 && num2 % divisor == 0) {
dcm = divisor;
}
divisor++;
}
return dcm;
}*/
public class Ej4G {
    public static void main(String[] args) {
        System.out.println(divisorComunMaximo(6, 9));
    }
    public static int divisorComunMaximo(int num1, int num2){
        // determina el divisor común máximo de dos número enteros
        int dcm = 1;
        int divisor = 2;
        while (divisor < num1 && divisor < num2) {
                if (num1 % divisor == 0 && num2 % divisor == 0) {
                dcm = divisor;
                }
            divisor++;
        }

        return dcm;
        }

}
