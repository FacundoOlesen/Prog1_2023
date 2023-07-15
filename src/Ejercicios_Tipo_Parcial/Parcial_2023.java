package Ejercicios_Tipo_Parcial;
public class Parcial_2023 {
        public static final int REP = 3;
        public static final int MAX = 20;
    public static void main(String[] args) {
        int[] arr = { 0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 33, 0, 5, 98, 0 };
        mostrarArreglo(arr);
        eliminarSecuenciasRep(arr);
        mostrarArreglo(arr);
    }

       public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + "|");
        System.out.println();
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

     public static void corrimientoIzquieda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini+2; i <= fin; i++) {
            corrimientoIzquieda(arr, ini);
        }
    }

    public static boolean esRep(int[]arr, int ini, int fin){
        while(ini<=fin&&arr[ini]==arr[ini+1]){
            ini++;
        }
        return ini==fin;
    }

    public static void eliminarSecuenciasRep(int[]arr){
        int ini=0;
        int fin=-1;
        while(ini<MAX){
            ini=obtenerIni(arr, fin+1);
            if(ini<MAX){
                fin=obtenerFin(arr, ini);
                int longitud = fin-ini+1;
                if(longitud>REP&&esRep(arr, ini, fin)){
                    eliminarSecuencia(arr, ini, fin);
                    arr[ini]= -(longitud);
                    fin=ini;
                }
            }
        }
    }
}
