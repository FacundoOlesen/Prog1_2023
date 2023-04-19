package TP1.Bonus_Track_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej1 {
    public static void main(String[] args) {
        final String leyenda="El precio lo pone el cliente";
        String fecha;
        String hora;
        int nroticket;
        int cuit;
        String cajero;
        int nrocaja;
        int dni;
        
       
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println ("Ingrese la fecha: ");
            fecha = entrada.readLine();

            System.out.println ("Ingrese la hora: ");
            hora = entrada.readLine();

            System.out.println ("Ingrese el numero de ticket: ");
            nroticket = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese el numero de CUIT: ");
            cuit = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese el nombre del cajero: ");
            cajero = entrada.readLine();

            System.out.println ("Ingrese el numero de caja: ");
            nrocaja = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese el numero de DNI: ");
            dni = Integer.valueOf(entrada.readLine());


            System.out.println(fecha + " - " + hora + " \t Ticker Nro. " +nroticket);

            System.out.println(" \t\tCUIT: " + cuit);

            System.out.println("Cajero: "  + cajero + " \t Caja: " + nrocaja);

            System.out.println("DNI: " + dni + " \t " + leyenda);
            


            


        } catch (Exception exc) {
            System.out.println( exc );
        }
    
    }
}

