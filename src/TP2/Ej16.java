/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. 
 */

package TP2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej16 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        char c;
        int contadoractual=0;
        int contadormayor=0;
        try {
            for(int i=0;i<15;i++){
                System.out.println ("Ingrese un caracter.");
                c = entrada.readLine().charAt(0);

                if (c=='a'){
                    contadoractual++; 
                }
                
                else{
                    if(contadoractual>contadormayor){
                        contadormayor=contadoractual;
                    }
                    contadoractual=0;
                }
                

               
            }

           
            System.out.println("Ingresaste "+ contadormayor + " 'a'");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
