package TP2.Bonus_Track_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        int numero;
        int cantpacientes=0;
        int edadpaciente;
        int pacientesmayores=0;
        int prestadores;
        int pacientesprestadaores=0;
        int acumuladorprestadores=0;
        int cantmasculinos;
        int cantfemeninos;
        int edadmasculino;
        int edadfemenino;
        int acumuladormasc=0;
        int acumuladorfem=0;
        int edadtotalmasc=0;
        int edadtotalfem=0;
        int obrasocial=0;
        int acumobrasocial=0;
        int acumuladornoobrasocial=0;
        
        try {
            System.out.println("Bienvenido a la Clinica Dolores. Ingrese:\n1. Para ingresar la cantidad de pacientes y sus edades. \n2. Para ingresar los prestadores e info. \n3. Para indicar el sexo y edad de los pacientes. \n4. Para indicar informacion acerca de la obra social del los pacientes.");
            numero = Integer.valueOf(entrada.readLine());

            if(numero==1){ 
                System.out.println("Ingrese la cantidad de pacientes. (Maximo 15)");
                cantpacientes = Integer.valueOf(entrada.readLine());
                if(cantpacientes>=0&&cantpacientes<=15){
    
                    for(int i=1; i<=cantpacientes; i++){
                        System.out.println("Ingrese la edad del paciente numero: " + i);
                        edadpaciente = Integer.valueOf(entrada.readLine());
                        if(edadpaciente>78){
                            pacientesmayores++;
                        }
                    }
                    System.out.println("La cantidad de pacientes mayores a 78 anios es: " + pacientesmayores);
                }
                
                else {
                    System.out.println("Error! Ingresaste una cantidad de pacientes erronea.");
                }
            }

            if (numero==2){
                System.out.println("Ingrese la cantidad de prestadores de servicios que tiene la clinica. (Maximo 10)");
                prestadores = Integer.valueOf(entrada.readLine());

                if (prestadores>=0&&prestadores<=10){
                    for(int i=1;i<=prestadores;i++){
                        System.out.println("Ingrese cantidad de pacientes que ha atendido el prestador numero " + i + " en los ultimos 2 dias" );
                        pacientesprestadaores = Integer.valueOf(entrada.readLine());
    
                        if(pacientesprestadaores>10){
                            acumuladorprestadores++;
                        }
                    }
    
                    System.out.println("La cantidad de prestadores que han atendido mas de 10 pacientes en los ultimos 2 dias son: " + acumuladorprestadores);
                }

                else {
                    System.out.println("Error! Ingresaste una cantidad de prestadores erronea.");
                }
            }

            if(numero==3){
                System.out.println("Ingrese la cantidad de pacientes masculinos. (Maximo 10)");
                cantmasculinos = Integer.valueOf(entrada.readLine());

                System.out.println("Ingrese la cantidad de pacientes femeninos. (Maximo 10)");
                cantfemeninos = Integer.valueOf(entrada.readLine());

                if(cantmasculinos<=10&&cantfemeninos<=10){
                    for(int i=1; i<=cantmasculinos;i++){
                        System.out.println("Ingrese la edad del paciente masculino numero : " + i);
                        edadmasculino = Integer.valueOf(entrada.readLine());
                        acumuladormasc++;
                        edadtotalmasc+=edadmasculino;
                    }

                    for(int i=1; i<=cantfemeninos;i++){
                        System.out.println("Ingrese la edad del paciente femenino numero : " + i);
                        edadfemenino = Integer.valueOf(entrada.readLine());
                        acumuladorfem++;
                        edadtotalfem+=edadfemenino;
                    }

                    System.out.println("La cantidad de pacientes de sexo masculino es: " + acumuladormasc + " y el promedio de las edades es de: " +  edadtotalmasc + " / " + acumuladormasc+  " = " +edadtotalmasc/acumuladormasc);
                    System.out.println("La cantidad de pacientes de sexo masculino es: " + acumuladorfem + " y el promedio de las edades es de: " +  edadtotalfem + " / " + acumuladorfem+  " = " +edadtotalfem/acumuladorfem);
                }

                else {
                    System.out.println("Error! Ingresaste mal la cantidad de pacientes.");
                }
            }

            if(numero==4){
                System.out.println("Ingrese la cantidad de pacientes. (Maximo 15)");
                cantpacientes = Integer.valueOf(entrada.readLine());
                if(cantpacientes<=15){
                    System.out.println(cantpacientes);
                    for(int i=1;i<=cantpacientes;i++){
                        System.out.println("Si el paciente numero: " +i + " tiene obra social pulse 1. De lo contrario pulse 0." );
                        obrasocial = Integer.valueOf(entrada.readLine());

                        if(obrasocial==1){
                            acumobrasocial++;
                        }
                        else {
                            acumuladornoobrasocial++;
                        }
                    }
                    System.out.println("La cantidad de pacientes CON obra socia es de: " + acumobrasocial);
                    System.out.println("La cantidad de pacientes SIN obra socia es de: " + acumuladornoobrasocial);
                }

                else {
                    System.out.println("Error! Ingreso mal la cantidad de pacientes.");
                }
            }

            else {
                System.out.println("Ingresaste la opcion: " + numero + " y no es valida, vuelva a intentar. \n");
                System.out.println("Ingrese:\n1. Para ingresar la cantidad de pacientes y sus edades. \n2. Para ingresar los prestadores e info. \n3. Para indicar el sexo y edad de los pacientes. \n4. Para indicar informacion acerca de la obra social del los pacientes.");
                numero = Integer.valueOf(entrada.readLine());
                
            }

        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
