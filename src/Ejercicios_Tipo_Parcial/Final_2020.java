package Ejercicios_Tipo_Parcial;
/*Dado un arreglo ARR de tamaño N de secuencias de enteros separadas por uno o más ceros, hacer un programa que
extraiga todas las secuencias con cantidad par de elementos y las copie en un arreglo PAR de enteros de tamaño N
(quedando separadas por un 0).
Observaciones generales:
_ARR está cargado inicialmente y PAR está inicializado con ceros.
_No se pueden utilizar estructuras auxiliares.
_Puede haber uno o más ceros al principio y al final del arreglo.
_Realizar el programa completo bien modularizado. */
public class Final_2020 {
    public static final int MAX =10;
    public static void main(String[] args) {
        int arr[]= {0,3,4,0,4,0,0,2,3,0};
        int par[]= {0,0,0,0,0,0,0,0,0,0};
        imprimir_arreglo_secuencias_int(arr);
        procesarSecuencias(arr, par);
        System.out.println("Arreglo PAR con las secuencias de ARR cuyo tamaño es par.");
        imprimir_arreglo_secuencias_int(par);


    }
    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }


    public static int obtenerIni(int[]arr, int pos){
        while(pos<MAX&&arr[pos]==0){
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[]arr, int pos){
        while(pos<MAX&&arr[pos]!=0){
            pos++;
        }
        return pos-1;
    }

    public static void copiarSecDeAEnPar(int[]arr, int[]par, int ini, int fin){
        for(int i=ini;i<=fin;i++){
            par[i]=arr[i];
        }
    }

    public static void procesarSecuencias(int[]arr, int[]par){
        int ini=0;
        int fin=-1;
        while(ini<MAX){
            ini = obtenerIni(arr, fin+1);
            if(ini<MAX){
                fin=obtenerFin(arr, ini);
                if((fin-ini+1) %2==0){                              
                    copiarSecDeAEnPar(arr, par, ini, fin);
                }
            }
        }
    }

}
