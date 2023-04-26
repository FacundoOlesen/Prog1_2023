package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej20 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        int numero;
        char c;
        String texto;
        int numero1;
        int numero2;
        int numero6;
        int numero7;

        boolean esasc= true;
        try {

            System.out.println("Ingrese un != de 0");
            numero = Integer.valueOf(entrada.readLine());

            while(numero!=0){
                System.out.println ("Ingrese un caracter.");
                c = entrada.readLine().charAt(0);

                if(c=='a'){
                    System.out.println("Ingrese el texto y lo imprimimos");
                    texto = entrada.readLine();
                    System.out.println("Texto ingresado por el usuario: " + texto);
                }

                if(c=='b'){
                    System.out.println("Ingrese 5 numeros positivos");
                    numero2=0;

                    for(int i=0; i<5; i++){
                        System.out.println("Ingrese un numero");
                        numero1 = Integer.valueOf(entrada.readLine());
                        if(numero1<numero2){
                            esasc=false;  
                        }
                        numero2=numero1;
                    }
                   
                    if(esasc){
                        System.out.println("Ingresaste los numeros de manera ASCEDENTE");
                    }

                    else {
                        System.out.println("No ASCENDENTE");
                    }
                    
                }

                if(c=='c'){
                    System.out.println("Ingrese nro negativo");
                    numero6 = Integer.valueOf(entrada.readLine());

                    System.out.println("Ingrese nro negativo");
                    numero7 = Integer.valueOf(entrada.readLine());
                    int mult= numero6*numero7;
                    double raiz = Math.sqrt(mult);
                    System.out.println("La raiz de " + mult + " es "+ raiz);
                }

                if(c!='a'&&c!='b'&&c!='c'){
                    System.out.println ("Caracter erroneo. (Caracteres validos: A, B C)");
                    c = entrada.readLine().charAt(0);
                }
               
            }
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}