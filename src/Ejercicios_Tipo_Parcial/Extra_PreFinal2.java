package Ejercicios_Tipo_Parcial;

public class Extra_PreFinal2 {
    public final static int MAXFILA = 3;
    public final static int MAXCOLUMNA = 15;
    public final static int SEP = 0;

    public static void main(String[] args) {
        int[][] matriz = { { 0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0 },
                { 0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0 },
                { 0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0 },
        };
        int[] A1 = { 1, 2, 0 };
        int[] A2 = { 3, 0, 0 };
        iterar(matriz, A1, A2);
    }

    public static void imprimir_matriz_secuencias(int[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }

    public static int obtenerMayorPrecio(int[] arr, int ini, int fin) {
        int mayor = 0;
        while (ini <= fin) {
            if (arr[ini] > mayor) {
                mayor = arr[ini];
            }
            ini++;
        }
        return mayor;
    }

    public static void iterar(int[][] MAT, int[] A1, int[] A2) {
        for (int i = 0; i < MAXFILA; i++) {
            if (A1[i] != 0) {
                promedioMensualVentasMayorImporte(MAT[A1[i] - 1], i);
            }
            if (A2[i] != 0) {
                promedioDiarioDeVentasMayorAX(MAT[A2[i] - 1], i);
            }
        }
    }

    public static void promedioMensualVentasMayorImporte(int[] arr, int i) {
        int ini = 0;
        int fin = -1;
        int acumuladorPrecio = 0;
        int contador = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                acumuladorPrecio += obtenerMayorPrecio(arr, ini, fin);
                contador++;
            }
        }
        System.out.println("El promedio mensual es igual a: " + acumuladorPrecio / contador + " en el mes: " + (i + 1));
    }

    public static int obtenerPromedioDeVentaDia(int[] arr, int ini, int fin) {
        int contador = 0;
        int acum = 0;
        while (ini <= fin) {
            acum += arr[ini];
            contador++;
            ini++;
        }
        return acum / contador;
    }

    public static void promedioDiarioDeVentasMayorAX(int[] arr, int i) {
        int ini = 0;
        int fin = -1;
        int X = 600;
        int contador = 0;
        int cantsecuencias = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr, ini);
                if (obtenerPromedioDeVentaDia(arr, ini, fin) > X) {
                    contador++;
                }
                cantsecuencias++;
            }
        }
        if (contador == cantsecuencias) {
            System.out.println(
                    "Se cumplio que el promedio diario de ventas del mes: " + (i + 1)
                            + " en todos los dias del mes es mayor a " + X);
        } else {
            System.out.println(
                    "NO Se cumplio que el promedio diario de ventas del mes: " + (i + 1)
                            + " en todos los dias del mes es mayor a " + X);
        }
    }
}
