package Ejercicios_Tipo_Parcial;

public class Recuperatorio_2023 {
    public final static int MAXFILA = 7;
    public final static int MAXCOLUMNA = 20;
    public final static int MAXARRENTRENAMIENTO = 7;
    public final static double P = 0.5;

    public static void main(String[] args) {
        int[][] matrizEntrenamiento = {
                { 0, 300, 298, 298, 297, 0, 240, 233, 333, 100, 0, 257, 254, 254, 0, 234, 230, 222, 0, 0 },
                { 0, 310, 302, 284, 271, 0, 280, 263, 263, 0, 0, 0, 264, 264, 0, 234, 230, 0, 0, 0 },
                { 0, 310, 302, 294, 0, 0, 250, 243, 0, 245, 0, 257, 255, 253, 0, 234, 229, 0, 0, 0 },
                { 0, 315, 320, 395, 398, 0, 351, 333, 353, 0, 0, 0, 334, 354, 0, 454, 490, 499, 0, 0 },
                { 0, 410, 400, 397, 0, 0, 250, 243, 0, 0, 0, 257, 255, 253, 0, 234, 229, 220, 0, 0 },
                { 0, 0, 420, 430, 430, 450, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 415, 425, 435, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        int[] arregloEntrenamiento = { 1, 2, 5, 0, 0, 0, 0 };
        imprimir_matriz_secuencias(matrizEntrenamiento);
        System.out.println("");
        imprimir_matriz_secuencias(matrizEntrenamiento);
        System.out.println("");
        imprimir_arreglo_secuencias_int(arregloEntrenamiento);
        procesarEntrenamiento(arregloEntrenamiento, matrizEntrenamiento);

    }

    public static void imprimir_matriz_secuencias(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAXARRENTRENAMIENTO; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        while (pos < MAXARRENTRENAMIENTO - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean esProgresivo(int[] arr, int ini, int fin) {
        while (ini < fin && arr[ini] >= arr[ini + 1]) {
            ini++;
        }
        return ini == fin;
    }

    public static boolean entrenamientoProgresivo(int[] mat) {
        int ini = 0;
        int fin = -1;
        boolean progesivo = true;
        while (ini < MAXCOLUMNA && progesivo) {
            ini = buscarIni(mat, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(mat, ini);
                progesivo = esProgresivo(mat, ini, fin);
            }
        }
        return progesivo;
    }

    public static void procesarEntrenamiento(int[] arreglo, int[][] matriz) {
        int i = 0, diasEntrenamiento = 0, diasCumplio = 0;
        while ((i < MAXFILA) && (arreglo[i] != 0)) {
            if (entrenamientoProgresivo(matriz[arreglo[i] - 1])) {
                diasCumplio++;
                corrimientoIzquierda(arreglo, i);
            }
             else {
                i++;
            }
            diasEntrenamiento++;
        }
        System.out.println("El atleta hizo el entrenamiento progresivo durante: " + diasCumplio + " dias.");
        double porcentaje = (double) diasCumplio / diasEntrenamiento;
        if (porcentaje > P) {
            System.out.println("Cumplio con el objetivo ya que el " + porcentaje
                    + "% de los dias hizo el entrenamiento progresivo");
        } else {
            System.out.println("NO cumplio con el objetivo ya que solo el " + porcentaje
                    + "% de los dias hizo el entrenamiento progresivo");
        }
    }
}
