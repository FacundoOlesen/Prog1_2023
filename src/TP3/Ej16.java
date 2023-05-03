package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej16 {
    public static void main(String[] args) {
        int mes= obtenerMes(0);
        while(mes>=1&&mes<=12){
            dias(mes);
        }
    }


    public static int obtenerMes(int mes){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese un numero natural.");
            mes = Integer.valueOf(entrada.readLine());
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return mes;
    }

    public static int dias(int mes){
        mes=obtenerMes(mes);
            switch(mes){
            case 1, 3, 5, 7, 8, 10, 12:
            System.out.println("El mes " + mes + " tiene 31 dias.");
            break;
            case 2:
            System.out.println("El mes " + mes + " tiene 28 dias.");
            break;
            case 4, 6, 9, 11:
            System.out.println("El mes " + mes + " tiene 30 dias.");
            break;
            default:
            System.out.println("El mes ingresado: " + mes + " no existe.");
        } 
        return mes;
    }
}
