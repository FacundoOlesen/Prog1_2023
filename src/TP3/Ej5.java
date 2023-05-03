package TP3;

public class Ej5 {
    public static void main(String[] args) {
        obtenerIncremento();
        System.out.println("Termino.");
    }

    public static void obtenerIncremento(){
        final int MAX=4;
        for(int i=1;i<=MAX;i++){
            System.out.println(i);
        }
    }
}
