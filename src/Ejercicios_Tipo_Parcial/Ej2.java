package Ejercicios_Tipo_Parcial;


public class Ej2 {
    public static final int MAX = 21, SEPARADOR = -1, N = 2;

    public static void main(String[] args) {
        int[] arrDatos = { -1, 12, 22, 44, -1,23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55,-1, 23, 34, 57, -1 };
        int[] arrPatron = { -1, -1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        mostrarArreglo(arrDatos);
        System.out.println("Arreglo de datos con las secuencias patron eliminadas que se repitan mas que N");
        compararSecuenciasYEliminarlas(arrDatos, arrPatron);
        mostrarArreglo(arrDatos);
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + "|");
            System.out.println();
    }

    public static int obtenerIni(int[] arrDatos, int pos) {
        while (pos < MAX && arrDatos[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arrDatos, int pos) {
        while (pos < MAX && arrDatos[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquieda(int[] arrDatos, int pos) {
        while (pos < MAX - 1) {
            arrDatos[pos] = arrDatos[pos + 1];
            pos++;
        }
    }

    public static void eliminarSecuencia(int[] arrDatos, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquieda(arrDatos, ini);
        }
    }

    public static boolean compararSecuenciasDatosConSecuenciaPatron(int[] arrDatos, int[] arrPatron, int iniDatos, int finDatos, int iniPatron) {
        int i = iniDatos;
        int ip = iniPatron;
        while (i <= finDatos && arrDatos[i] == arrPatron[ip]) {
            i++;
            ip++;
        }
        return i > finDatos;
    }

    public static void compararSecuenciasYEliminarlas(int[] arrDatos, int[] arrPatron) {
        int iniDatos = 0, finDatos = -1, iniPatron = 0, finPatron = -1;

        iniPatron = obtenerIni(arrPatron, finPatron + 1);
        finPatron = obtenerFin(arrPatron, iniPatron);

        int cantSecuenciasRepetidas = 0;
        while (iniDatos < MAX) {
            iniDatos = obtenerIni(arrDatos, finDatos + 1);
            if (iniDatos < MAX) {
                finDatos = obtenerFin(arrDatos, iniDatos);
                if (compararSecuenciasDatosConSecuenciaPatron(arrDatos, arrPatron, iniDatos, finDatos, iniPatron)) {
                        cantSecuenciasRepetidas++;
                    if (cantSecuenciasRepetidas > N) {
                        eliminarSecuencia(arrDatos, iniDatos, finDatos);
                        iniDatos=finDatos;
                    }
                }
            }
        }
    }
}
