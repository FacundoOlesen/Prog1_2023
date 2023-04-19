package TP1;

public class Ej8 {
    public static void main(String[] args) {
        boolean verdadero=true;
        boolean falso=false;

        try {
            System.out.println("Falso AND falso: " + (falso && falso));
            System.out.println("Falso AND verdadero: " + (falso && verdadero));
            System.out.println("Verdadero AND falso: " + (verdadero && falso));
            System.out.println("Verdadero AND verdadero: " + (verdadero && verdadero));
            
            System.out.println("\n");
            
            System.out.println("Falso OR falso: " + (falso || falso));
            System.out.println("Falso OR verdadero: " + (falso || verdadero));
            System.out.println("Verdadero OR falso: " + (verdadero || falso));
            System.out.println("Verdadero OR erdadero: " + (verdadero || verdadero));
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
