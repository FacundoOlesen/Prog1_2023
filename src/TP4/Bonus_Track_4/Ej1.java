package TP4.Bonus_Track_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej1 {
    public static int obtenerEntero(int inf, int sup) {
        // retorna un valor entero mayor o igual a inf y menor oigual a sup
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese la hora y minuto.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
        }
        public static void main(String[] args) {
        int horaApertura = 8; // hora de apertura
        int minutoApertura = 30; // minuto de apertura
        int horaCierre = 19; // hora de cierre
        int minutoCierre = 0; // minuto de cierre
        int hora = obtenerEntero(0, 23);
        int minuto = obtenerEntero(0, 59);
        // Comprobamos si la hora ingresada está dentro del horario de apertura y cierre
        if (hora > horaApertura ||(hora == horaApertura && minuto >= minutoApertura) && hora < horaCierre ||(hora == horaCierre && minuto <= minutoCierre)) {
            System.out.println("El comercio está abierto.");
        } 
        
        else {
        System.out.println("El comercio está cerrado.");
        }
        }
}
