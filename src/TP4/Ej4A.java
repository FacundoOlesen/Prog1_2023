package TP4;
/*
4)A)
public static int obtenerFactorial(int numero){
// obtiene el factorial de numero
int resultado=numero;
while (numero>0)
    resultado*=--numero;
    return resultado;
}*/
public class Ej4A {
    public static void main(String[] args) {
        int numero = 12;
        int resultado;
        resultado= obtenerFactorial(numero);
        System.out.println("Factorial de: " + numero + " = " + resultado );
    }
   
    public static int obtenerFactorial(int numero){
        // obtiene el factorial de numero
        int resultado=numero;
        while (numero>1)  {
            numero--;
            resultado*=numero;
        }

        return resultado;
    }

    
 




}
