package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej5 {
    public static void main(String[] args) {
        double hora;
        int temperatura;
        char caracter;
        final int clavenumerica1 = 365;
        int clavenumerica2;
        int clavenumerica3;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
            System.out.println("Ingrese la hora");
            hora =  Double.valueOf(entrada.readLine());

            if((hora>=0)&&(hora<=5)){
                System.out.println("Ingrese la temperatura actual");
                temperatura = Integer.valueOf(entrada.readLine());

                if(temperatura<20){
                    System.out.println("Encender la calefaccion");
                }
                else if(temperatura>25){
                    System.out.println("Apagar calefaccion");
                }

                else if((temperatura>=20)&&temperatura<=25){
                    System.out.println("Calefacción encendida, no abra las ventanas!!!.");
                }
            }

            if((hora>=6)&&(hora<=11)) {
                System.out.println ("Ingrese un caracter letra miniscula ");
                caracter = entrada.readLine().charAt(0);

                if (caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u') {
                    if (hora==6){
                        System.out.println(hora + " Tiene 2 vocales");
                    }

                    else  if (hora==7){
                        System.out.println(hora + " Tiene 3 vocales");
                    }

                    else  if (hora==8){
                        System.out.println(hora + " Tiene 2 vocales");
                    }

                    else  if (hora==9){
                        System.out.println(hora + " Tiene 3 vocales");
                    }
                    else  if (hora==10){
                        System.out.println(hora + " Tiene 2 vocales");
                    }
                    else  if (hora==11){
                        System.out.println(hora + " Tiene 2 vocales");
                    }
                }

                else {
                    if (hora==6){
                        System.out.println(hora+ " Tiene 2 consonantes");
                    }    
                    else if (hora==7){
                        System.out.println(hora+ " Tiene 2 consonantes");
                    }       
                    else if (hora==8){
                        System.out.println(hora+ " Tiene 2 consonantes");
                    }  
                    else if (hora==9){
                        System.out.println(hora+ " Tiene 2 consonantes");
                    }  
                    else if (hora==10){
                        System.out.println(hora+ " Tiene 2 consonantes");
                    }  
                    else if (hora==11){
                        System.out.println(hora+ " Tiene 2 consonantes");
                    }            
                }

            }

            if((hora>=12)&&(hora<=17)&&hora%2==0){
                double promediopar= (hora*12)/100;
                System.out.println( "El promedio de la hora ingresada con el numero inferior del rango (12) ya que hora es par, es: " + promediopar);
            } 
            else if((hora>=12)&&(hora<=17)&&hora%2!=0) {
                double promedioimpar= (hora*17)/100;

                System.out.println("El promedio de la hora ingresada con el numero superior del rango (17) ya que hora es impar, es: " +promedioimpar);
            }


             if((hora>=18)&&(hora<=23)){
                System.out.println("Ingrese la clave numerica (debe coincidir con la clave almacenada anteriormente)");
                clavenumerica2 = Integer.valueOf(entrada.readLine());
                 if (clavenumerica2==clavenumerica1){
                    System.out.println("Ingrese una segunda clave de verificacion entre 100 y 999");
                    clavenumerica3 = Integer.valueOf(entrada.readLine());
                    if ((clavenumerica3>=100)&&(clavenumerica3<=999)) {
                        double digitoclaveconst = clavenumerica1/100;
                        double digitoclaveingresada = clavenumerica3/100;
                        if (digitoclaveingresada % digitoclaveconst == 0) {
                            System.out.println("Clave correcta");
                        }
                        else {
                            System.out.println("Clave incorrecta.");
                        }
                    }
                    else{
                        System.out.println("Numero fuera de entre 100 y 999");
                    }
                }

                else {
                    System.out.println("Clave no coincide.");
                }
             }

        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }   
}
