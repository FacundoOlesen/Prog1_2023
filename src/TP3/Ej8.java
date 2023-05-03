package TP3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej8 {
    public static void main(String[] args) {
        char c = obtenerCaracter();
        int numero1=obtenerNumero1(0);
        int numero2=obtenerNumero2(0);

       switch(c){
        case'a': System.out.println(numero1+" + " + numero2 + " = " + suma(numero1, numero2));
        break;
        case'b': System.out.println(numero1+" - " + numero2 + " = " + resta(numero1, numero2));
        break;
        case'c': System.out.println(numero1+" * " + numero2 + " = " + multiplicacion(numero1, numero2));
        break;
        case'd': System.out.println(numero1+" / " + numero2 + " = " + division(numero1, numero2));
        break;
        default:System.out.println("Caracter invalido");
        break;
       }


    }

    public static char obtenerCaracter(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        char c='b';
        try {
            System.out.println("Ingrese un caracter (a=suma, b=resta, c=multiplicacion, d=division)");
            c = entrada.readLine().charAt(0);
            } 
            
            catch (Exception e) {
                System.out.println(e);
            }
            return c;
    }
    
    public static int obtenerNumero1(int numero1){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese un numero");
            numero1 = Integer.valueOf(entrada.readLine());
            } 
            catch (Exception e) {
                System.out.println(e);
            }  
            return numero1; 
    }

    public static int obtenerNumero2(int numero2){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
        try {
            System.out.println("Ingrese un numero");
            numero2 = Integer.valueOf(entrada.readLine());
            } 
            catch (Exception e) {
                System.out.println(e);
            }  
            return numero2; 
    }


    public static int suma(int numero1, int numero2){
         return numero1+numero2;
    }

    public static int resta(int numero1, int numero2){
        return numero1-numero2;
   }

   public static int multiplicacion(int numero1, int numero2){
   return numero1*numero2;
   }

   public static int division(int numero1, int numero2){
    return numero1/numero2;
}

}
