package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej13 {
    public static void main(String[] args) {
        int opcion = obtenerOpcion(0);
        if (opcion!=1||opcion!=2||opcion!=3||opcion!=4){
            System.out.println("Error. La opcion ingresada: " + opcion + " no es valida.");
            return;
        }
        int r1=0, r2=0, r3=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese un numero real r1.");
            r1 =  Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero real r2.");
            r2 =  Integer.valueOf(entrada.readLine());;
            System.out.println("Ingrese un numero real r3.");
            r3 =  Integer.valueOf(entrada.readLine());
            } 
            catch (Exception e) {
                System.out.println(e);
            }
            realizarCalculos(opcion, r1, r2, r3);
    }

    public static int obtenerOpcion(int opcion){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese:\n1. Para calcular la raiz cuadradada de r1-r3 \n2. Para calcular el promedio de r1, r2 y r3. \n3. Para calcular el cociente de la raiz cudrada de (r3-r2) dividida por r1.\n4. Para calcular el cociente del promedio de los tres valores dividido pro la raiz cuadrada de r2.");
            opcion = Integer.valueOf(entrada.readLine());
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return opcion;
    }

    public static void realizarCalculos(int opcion, int r1, int r2, int r3){
       if (opcion==1){
            int resultado = r1-r3;
            if(resultado<0){
                System.out.println("Error. No se puede hacer una raiz de un numero negativo.");
            }
            else {
                System.out.println("La raiz cuadrada de " + r1 + " - " + r3  + " = " + Math.sqrt(resultado)); 
            }
       }

       if (opcion==2){
        System.out.println("El promedio de " + r1 + ", " + r2 + " y " + r3 + " es: " + (r1+r2+r3)/3);
       }

       if (opcion==3){
            if(r3-r2<0){
                System.out.println("Error no podemos hacer la raiz de un negativo");
            }
            else if(r1==0){
                System.out.println("Error r1 es igual a 0 y no se puede dividir un numero por 0.");
            }
            else {
                System.out.println("El cociente de la raiz cuadrada de " + r3 + " - " + r2 + " dividida por " + r1 + " es: " + Math.sqrt(r3-r2)/r1);
            }
       }

       if (opcion==4){
        int resultado= (int) Math.sqrt(r2);
        if(r2<0) {
            System.out.println("Error r2 es negativo y no se puede hacer la raiz cuadrada de un negativo.");
        }
        if(resultado==0){
            System.out.println("Error r2 es 0 y no se puede dividir un numero por 0.");

        }
        else{
            System.out.println("El cociente del promedio de " + r1 + ", " + r2 + " y " + r3 +  " divivido por la raiz cuadrada de "+ r2 + " es: " + ((r1+r2+r3)/3) /  resultado );
        }
       }
    }
}
