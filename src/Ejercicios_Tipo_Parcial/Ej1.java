package Ejercicios_Tipo_Parcial;

public class Ej1 {
    public static final int MAX_A = 42;
    public static final int MAX_S = 20;
    public static final char SEPARADOR1 = ' ';
    public static final char SEPARADOR2 = ',';
    public static final char SEPARADOR3 = '.';

    public static void main(String[] args) {
        char[] arrA = { ' ', 'l', 'a', ' ', 'c', 'a', 's', 'a', ' ', 'r', 'o', 'j', 'a', ',', ' ', 'a', ' ', 'l', 'a',
                ' ', 'v', 'u', 'e', 'l', 't', 'a', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'e', 's', 'q', 'u', 'i', 'n', 'a',
                '.', ' ' };
        char[] arrS = { ' ', 'a', ' ', 'l', 'o', ' ', 'l', 'o', 's', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'l', 'a', 's',
                ' ' };
        mostrarArreglo(arrA);
        eliminarStopwordsDeA(arrA, arrS);
        System.out.println("");
        mostrarArreglo(arrA);

    }

    public static void mostrarArreglo(char[] arr) {
        for (int i = 0; i < MAX_A; i++)
            System.out.print(arr[i] + "|");
        System.out.println();
    }

    public static int obtenerIniA(char[] arr, int pos) {
        while (pos < MAX_A && (arr[pos] == SEPARADOR1 || arr[pos] == SEPARADOR2 || arr[pos] == SEPARADOR3))
            pos++;
        return pos;
    }

    public static int obtenerFinA(char[] arrA, int pos) {
        while (pos < MAX_A && arrA[pos] != SEPARADOR1 && arrA[pos] != SEPARADOR2 && arrA[pos] != SEPARADOR3) {
            pos++;
        }
        return pos - 1;
    }

    public static int obtenerIniS(char[] arrS, int pos) {
        while (pos < MAX_S&& arrS[pos] == ' ') {
            pos++;
        }
        return pos;
    }

    public static int obtenerFinS(char[] arrS, int pos) {
        while (pos < MAX_S && arrS[pos] != ' ') {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquieda(char[] arrA, int pos) {
        while (pos < MAX_A - 1) {
            arrA[pos] = arrA[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(char[] arrA, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquieda(arrA, ini);
        }
    }

    public static boolean compararSecuenciasDeAyS(char[] arrA, char[] arrS, int ini, int fin, int iniS) {
        while (ini <= fin && arrA[ini] == arrS[iniS]) {
            ini++;
            iniS++;
        }
        return ini>fin;
    }

    public static boolean encontrarSecuenciasDeAenS(char[]arrA, int ini, int fin, char[]arrS){
        int iniS=0;
        int finS=-1;
        boolean laEncontre=false;
        while(iniS<MAX_S && !laEncontre){
            iniS= obtenerIniS(arrS, finS+1);
            if(iniS<MAX_S){
                finS=obtenerFinS(arrS, iniS);
                if((fin-ini+1==finS-iniS+1)&&compararSecuenciasDeAyS(arrA, arrS, ini, fin, iniS)){
                    laEncontre=true;
                }
            }
        }
        return laEncontre;
    }
    public static void eliminarStopwordsDeA(char[] arrA, char[]arrS) {
        int ini = 0;
        int fin = -1;
        while (ini < MAX_A) {
            ini = obtenerIniA(arrA, fin + 1);
            if (ini < MAX_A) {
                fin = obtenerFinA(arrA, ini);
                if (encontrarSecuenciasDeAenS(arrA, ini, fin, arrS)) {
                    eliminarSecuencia(arrA, ini, fin);
                    fin=ini;
                }
            }
        }
    }
    
}
