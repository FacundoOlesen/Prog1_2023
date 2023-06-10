package TP5;



public class Ej20 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MAXP=3;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[]  = {0,3,4,5,0,7,6,4,3,2,0,3,2,3,0,3,4,5,0,0};
        int arrPatron[] = {3,4,5};
        imprimir_arreglo_secuencias_int(arr);
        eliminarSecuenciaPatron(arr, arrPatron);
        imprimir_arreglo_secuencias_int(arr);

    }


    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerIni(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquierda(int arr[], int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }

    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i<=fin;i++){
            corrimientoIzquierda(arr, ini);
        }
    }

    public static boolean compararSecuencias(int[]arr, int []arrPatron, int ini, int fin){
        int longitud= (fin-ini)+1;
        if(longitud==MAXP){
            int ip=0;
            while(ini<=fin&&arr[ini]==arrPatron[ip]){
                ini++;
                ip++;
            }
        }
        return ini>fin;
    }
    public static void eliminarSecuenciaPatron(int []arr, int[] arrPatron){
            int ini = 0;
            int fin = -1;
            while(ini<MAX){
                ini=obtenerIni(arr, fin+1);
                if(ini<MAX){
                    fin =obtenerFin(arr, ini);
                    if(compararSecuencias(arr, arrPatron, ini, fin)){
                        eliminarSecuencia(arr, ini, fin);
                        fin=ini;
                    }
                }

            }
      
    }
}
