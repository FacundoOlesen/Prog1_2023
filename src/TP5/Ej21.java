package TP5;
public class Ej21 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int arr[]  = {0,0,2,4,0,5,4,2,0,0,0,6,3,2,1,0,0,0,2,0};
        imprimir_arreglo_secuencias_int(arr);
        eliminarSecuenciasConOrdenDescendente(arr);
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


    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean esDesc(int[]arr, int ini, int fin){
        while(ini<=fin&& arr[ini]>arr[ini+1]){
            ini++;
        }
        return ini>fin;
    }

    public static void eliminarSecuenciaDescendente(int[]arr, int ini, int fin){
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }

    public static void eliminarSecuenciasConOrdenDescendente(int[] arr) {
        int ini = 0;
        int fin = -1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if(ini<MAX){
                fin = obtenerFin(arr, ini);
                int longitud = fin-ini+1;
                if(esDesc(arr, ini, fin) && longitud !=1){
                    eliminarSecuenciaDescendente(arr, ini, fin);
                    fin=ini;
                }
            }
        }
    }
}
