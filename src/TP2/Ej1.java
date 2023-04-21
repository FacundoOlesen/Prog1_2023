package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1 {
    public static void main(String[] args) {
        int numero;
        int numerosemana;
        int numero1;
        int numero2;
        int numero3;
        char letra;


        try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    

        System.out.println("Ingrese un numero entero");
        numero = Integer.valueOf(entrada.readLine());
        
        System.out.println("Ingrese un numero del 1 al 7. (1=Lunes, 7=Domingo)");
        numerosemana = Integer.valueOf(entrada.readLine());    

        System.out.println("Ingrese una letra");
        letra= entrada.readLine().charAt(0);

        System.out.println("Ingrese 3 numeros (1er.numero)");
        numero1 = Integer.valueOf(entrada.readLine());

        System.out.println("Ingrese 3 numeros (2do.numero)");
        numero2 = Integer.valueOf(entrada.readLine());

        System.out.println("Ingrese 3 numeros (3er.numero)");
        numero3 = Integer.valueOf(entrada.readLine());

        if(numero>0){
            System.out.println(numero + " Es positivo");
        }
        else {
            System.out.println(numero + " Es negativo");

        }

        if (numero>100){
            System.out.println(numero + " GRANDE");
        }
        
        else {
            System.out.println(numero + " CHICO");
        }

        switch(numerosemana){
            case 1: System.out.println("Lunes");
            break;
            case 2: System.out.println("Martes");
            break;
            case 3: System.out.println("Miercoles");
            break;
            case 4: System.out.println("Jueves");
            break;
            case 5: System.out.println("Viernes");
            break;
            case 6: System.out.println("Sabado");
            break;
            case 7: System.out.println("Domingo");
            break;
            default: System.out.println("Ingresaste un numero que no corresponde a ningun dia");
        }

        if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
            System.out.println(letra+ " Es vocal");
        }
        else {
            System.out.println(letra + " Es consonante");
        }

        if (numero1<numero2&&numero2<numero3){
            System.out.println(numero1 + ", " + numero2 + ", "+ numero3 + " Estan ordenados de manera creciente");
        }
        else if (numero1>numero2&&numero2>numero3){
            System.out.println(numero1 + ", " + numero2 + ", "+ numero3 + " Estan ordenados de manera decreciente");
        }

        else {
            System.out.println(numero1 + ", " + numero2 + ", "+ numero3 + " Error! Estan desordenados");

        }

        
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
