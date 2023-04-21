package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej2 {
    public static void main(String[] args) {
        int anio;
        int mes;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    

            System.out.println("Ingrese un numero de mes");
            mes = Integer.valueOf(entrada.readLine());

            if (mes==1){
                System.out.println("Enero tiene 31 dias");
            }

           else if (mes==2){
                System.out.println("Ingrese el anio para saber si es bisiesto o no");
                anio = Integer.valueOf(entrada.readLine());

                if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
                    System.out.println("Febrero tiene 28 dias (ya que es anio bisiesto) en el anio: " + anio);
                }
                
                else {
                    System.out.println("Febrero tiene 31 dias (ya que no es bisiesto) en el anio: " + anio);
                }
            }

            else  if (mes==3){
                    System.out.println("Marzo tiene 31 dias");
                }

                else   if (mes==4){
                    System.out.println("Abril tiene 30 dias");
                }
                else   if (mes==5){
                    System.out.println("Mayo tiene 31 dias");
                }
                else    if (mes==6){
                    System.out.println("Junio tiene 30 dias");
                }
                else   if (mes==7){
                    System.out.println("Julio tiene 31 dias");
                }
                else     if (mes==8){
                    System.out.println("Agosto tiene 31 dias");
                }
                else    if (mes==9){
                    System.out.println("Septiembre tiene 30 dias");
                }
                else   if (mes==10){
                    System.out.println("Octubre tiene 31 dias");
                }
                else    if (mes==11){
                    System.out.println("Noviembre tiene 30 dias");
                }
                else  if (mes==12){
                    System.out.println("Diciembre tiene 31 dias");
                }

                else {
                    System.out.println("Numero de mes ingresado inexistente");
                }
        } 
        
       
        catch (Exception e) {
           System.out.println(e);
        }
    }
}
