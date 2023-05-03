package TP3.Bonus_Track_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej1 {
    final int stockdisponible = 10;
    final int limiteseguridad = 10;
    public static void main(String[] args) {

    }


    public static void ingresarProducto(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int id_producto;
        String nombre;
        int fecha;
        int hora;
        int cantidad;
        String prioridad;

        try {
            System.out.println ("Ingrese el ID del producto");
            id_producto = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese su nombre ");
            nombre = entrada.readLine();
            System.out.println ("Ingrese la fecha");
            fecha = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese la hora");
            hora = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese la cantidad");
            cantidad = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese la prioridad.");
            prioridad = entrada.readLine();
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }


}
