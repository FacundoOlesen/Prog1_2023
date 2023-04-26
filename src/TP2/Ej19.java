/*
 * Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2019 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente.
 */
package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej19 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        int mes;
        int anio;
        try {
            System.out.println("Ingrese un nro de mes");
            mes = Integer.valueOf(entrada.readLine());

            switch(mes){
                case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("El mes ingresado posee 31 dias");
                break;
                case 4,6,9,11:
                System.out.println("El mes ingresado posee 30 dias");
                break;
                case 2:
                System.out.println("Ingrese un el anio (entre 2000 y 2019) del mes");
                anio = Integer.valueOf(entrada.readLine());
                if(anio>=2000&&anio<=2019) {
                    if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                        System.out.println("Febrero tiene 28 dias (ya que es anio bisiesto) en el anio: " + anio);
                    }
                    else {
                        System.out.println("Febrero tiene 31 dias (ya que no es bisiesto) en el anio: " + anio);
                    }
                }

                else {
                    System.out.println("Anio fuera de rango");
                }
                default:
                System.out.println("Mes erroneo");
                break;
            }
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
