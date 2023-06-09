/*Se tiene un arreglo de secuencias arr_sec de caracteres separados por '-', un arreglo reemplazo de caracteres (ambos con longitud MAX)
 *y un rango de valores min_sec y max_sec (min_sec < max_sec) dados. Se pide que para las secuencias que estén en este rango:
 -Eliminar aquellas que su tamaño sea multiplo de 2 o 5.
 -Caso contrario, reemplezar la secuencia por parte del arreglo reemplazo.
 */

package Ejercicios_Tipo_Parcial;

public class Ej4 {
    public static final int MAX = 14;
    public static final int MIN_SEC = 1;
    public static final int MAX_SEC = 3;
    public static final int MULTIPLO1 = 2;
    public static final int MULTIPLO2 = 5;
    public static final char SEPARADOR = '-';
    public static void main(String[] args) {
        char[] arr_sec = { '-', 'h', 'o', 'r', 'n', 'o', '-', 'y', '-', 'm', 'a', 's', '-', '-' };
        char[] reemplazo = { 'd', 'a', 't', 'x', 'h', 'a', 't', 'm', 'q', 'm', 'a', 's', 'y', 'y' };
        System.out.println("ARR_SEC: ");
        mostrarArreglo(arr_sec);
        System.out.println("REEMPLAZO: ");
        mostrarArreglo(reemplazo);
        procesarSecuencias(arr_sec, reemplazo);
        System.out.println("ARR_SEC MODIFICADO: ");
        mostrarArreglo(arr_sec);

    }

    public static void mostrarArreglo(char[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + "|");
            System.out.println();
    }

    public static int buscarIni(char[]arr_sec, int pos){
        while(pos<MAX&&arr_sec[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[]arr_sec, int pos){
        while(pos<MAX&&arr_sec[pos]!=SEPARADOR){
            pos++;
        }
        return pos-1;
    }

    public static void corrimientoIzquierda(char[]arr_sec, int pos){
        while(pos<MAX-1){
            arr_sec[pos]=arr_sec[pos+1];
            pos++;
        }
    }

    public static void eliminarSecuencia(char[]arr_sec, int ini, int fin){
        for(int i=ini; i<=fin;i++){
            corrimientoIzquierda(arr_sec, ini);
        }
    }

    public static void reemplazoSecuencia(char[]arr_sec, int ini, int fin, char[]reemplazo){
        int j=0;
        for(int i=ini; i<=fin;i++){
            arr_sec[i]=reemplazo[j];
            j++;
        }
    }
    
    public static void procesarSecuencias(char[]arr_sec, char[]reemplazo){
        int ini=0;
        int fin=-1;
        int contador=0;
        while(ini<MAX){
            ini=buscarIni(arr_sec, fin+1);
            if(ini<MAX){
                fin=buscarFin(arr_sec, ini);
                contador++;
                if(contador>=MIN_SEC&&contador<=MAX_SEC){
                    int longitud = fin-ini+1;
                    if(longitud%MULTIPLO1==0||longitud%MULTIPLO2==0){
                        eliminarSecuencia(arr_sec, ini, fin);
                        fin=ini;
                    }
                    else {
                        reemplazoSecuencia(arr_sec, ini, fin, reemplazo);
                    }
                }
            }
        }
    }

}
