package TP1.Bonus_Track_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej2 {
    public static void main(String[] args) {
        char tipofactura;
        int numero;
        String nombre;
        String producto1;
        String producto2;
        double importe1=0;
        double importe2=0;
        double importetotal=0;
        int dia;
        double porcentaje_descuento;
        double descuento; 
    
       
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println ("Ingrese el dia de la compra (1=Martes, 2=Jueves, Numeros restantes= cualq. otro dia): ");
            dia = Integer.valueOf(entrada.readLine());

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


            System.out.println("Factura " + tipofactura + "\tN " + numero);

            System.out.println("Nombre:  \t" + nombre);

            System.out.println("Producto   \t  Importe" );


            if(dia==1&&importetotal>13000){
                porcentaje_descuento=5;
                descuento=((importe1+importe2)*porcentaje_descuento)/100;
                System.out.println(producto1 + "   \t" + importe1);
                System.out.println(producto2 + "   \t" + importe2);
                System.out.println("El descuento es de: " + "\t" +  descuento);
                System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-descuento));
            }

            else if(dia==1&&importetotal>20000){
                porcentaje_descuento=7.5;
                descuento=((importe1+importe2)*porcentaje_descuento)/100;
                System.out.println(producto1 + "   \t" + importe1);
                System.out.println(producto2 + "   \t" + importe2);
                System.out.println("El descuento es de: " + "\t" +  descuento);
                System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-descuento));
            }

            else if(dia==2&&importetotal>25000){
                porcentaje_descuento=10;
                int tope_reintegro = 3000;
                System.out.println(producto1 + "    \t" + importe1);
                System.out.println(producto2 + "       \t" + importe2); 
                descuento=((importe1+importe2)*porcentaje_descuento)/100;
                if(descuento<=tope_reintegro){
                    System.out.println("El descuento es de: " + "\t" +  descuento);
                    System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-descuento));
                }
                else if(descuento>tope_reintegro)  {
                    System.out.println("El descuento es de: " + "\t" +  tope_reintegro);
                    System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-tope_reintegro));
                }
            }

            else {
                importetotal=importe1+importe2;
               
                System.out.println(producto1 +  "     \t" + importe1);
                System.out.println(producto2 +  "     \t" + importe2);
                System.out.println("   \t  Importe total" );

                System.out.println("   \t   " + importetotal);
            }


        } catch (Exception exc) {
            System.out.println( exc );
        }
    
    }
}
