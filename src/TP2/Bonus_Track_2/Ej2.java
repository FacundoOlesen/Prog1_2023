package TP2.Bonus_Track_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int dia;
        String nombre;
        double importe1=0;
        double importe2=0;
        String producto1;
        String producto2;
        double importetotal;
        double porcentaje_descuento;
        double descuento;
        int dni;
        int tope_reintegro;
        try {

        System.out.println ("Ingrese el dia de la compra (1=Martes, 2=Jueves, 3=Viernes, 4=Sabado Numeros restantes= cualq. otro dia): ");
        dia = Integer.valueOf(entrada.readLine());

        System.out.println ("Ingrese su nombre: ");
            nombre = entrada.readLine();

            System.out.println ("Ingrese su DNI: ");
            dni = Integer.valueOf(entrada.readLine());

            System.out.println ("Ingrese el producto 1: ");
            producto1 = entrada.readLine();

            System.out.println ("Ingrese el importe del producto 1: ");
            importe1 = Double.valueOf(entrada.readLine());

            System.out.println ("Ingrese el producto 2: ");
            producto2 = entrada.readLine();

            System.out.println ("Ingrese el importe del producto 2: ");
            importe2 = Double.valueOf(entrada.readLine());

            System.out.println("Nombre:  \t" + nombre);

            System.out.println("DNI:  \t" + dni);

            System.out.println("Producto   \t  Importe" );

            System.out.println(producto1 +  "     \t" + importe1);
            System.out.println(producto2 +  "     \t" + importe2);
            
            importetotal= importe1+importe2;
        if(dia==1){
            if(importetotal>13000){
                porcentaje_descuento=5;
                descuento=(importetotal*porcentaje_descuento)/100;
                System.out.println("El descuento es de: " + "\t" +  descuento);
                System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-descuento));
            }

            else if(importetotal>20000){
                porcentaje_descuento=7.5;
                descuento=(importetotal*porcentaje_descuento)/100;
                System.out.println("El descuento es de: " + "\t" +  descuento);
                System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-descuento));
            }
            else {
                System.out.println("Precio final de: " + "\t" + ((importe1+importe2)));
            }
        }

        if (dia==2){
           tope_reintegro = 3000;
           if(importetotal>=25000){
            porcentaje_descuento=10;
                descuento=(importetotal*porcentaje_descuento)/100;
                
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
            System.out.println("Precio final de: " + "\t" + ((importe1+importe2)));
        }
        }

        if((dia==3||dia==4)){
            if(importetotal>=15000){
                if((dni%2)==0){
                porcentaje_descuento=8;
                descuento=(importetotal*porcentaje_descuento)/100;
                System.out.println("El descuento es de: " + "\t" +  descuento);
                System.out.println("Precio final de: " + "\t" + ((importe1+importe2)-descuento));
                }         
        }
        
        else {
            System.out.println("Precio final de: " + "\t" + ((importe1+importe2)));
        }
        
    }
    else if(dia!=1&&dia!=2&&dia!=3&&dia!=4) {
        System.out.println("Precio final de: " + "\t" + ((importe1+importe2)));
    }
} 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
