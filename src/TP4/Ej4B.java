package TP4;

/*4)B)
public static int obtenerSumatoria(int natural){
// obtiene la sumatoria de los primeros n naturales
int resultado=1;
while (natural>0)
resultado+=natural--;
return resultado;
}*/

public class Ej4B {
    public static void main(String[] args) {
        int numero = 5;
        int sumatoria =obtenerSumatoria(numero);
        System.out.println("La sumatoria de: " + numero + " es: " + sumatoria);

    }
    public static int obtenerSumatoria(int natural){
        // obtiene la sumatoria de los primeros n naturales
        int resultado=0;
        int aux=natural;
        while (aux>0){
            resultado+=natural;
            aux--;
        }
        return resultado;
        }
}
