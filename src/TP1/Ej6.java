package TP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej6 {
    public static void main(String[] args) {
        char tipofactura;
        int numero;
        String nombre;
        String producto1;
        String producto2;
        double importe1;
        double importe2;
        double importetotal;
        
       
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println ("Ingrese el tipo de factura: ");
            tipofactura = entrada.readLine().charAt(0);

            System.out.println ("Ingrese el numero de factura: ");
            numero = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese su nombre: ");
            nombre = entrada.readLine();

            System.out.println ("Ingrese el producto 1: ");
            producto1 = entrada.readLine();

            System.out.println ("Ingrese el importe del producto 1: ");
            importe1 = Double.valueOf(entrada.readLine());

            System.out.println ("Ingrese el producto 2: ");
            producto2 = entrada.readLine();

            System.out.println ("Ingrese el importe del producto 2: ");
            importe2 = Double.valueOf(entrada.readLine());

            importetotal= importe1+importe2;


            System.out.println("Factura" + tipofactura + "\tN" + numero);

            System.out.println("Nombre:" + nombre);

            System.out.println("Producto   \t  Importe" );
            System.out.println(producto1 + "   \t" + importe1);

            
            System.out.println(producto2 + "   \t" + importe2);

            System.out.println("Importe total" + "\t" + importetotal);


            


        } catch (Exception exc) {
            System.out.println( exc );
        }
    
    }
}
