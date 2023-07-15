package TP6.Bonus_Track_6;

public class Ej2 {
    public static final int MAXFILA = 31;
    public static final int MAXCOLUMNA = 17;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;

    public static void main(String[] args) {
        double[][] enero = {
                { 0, 3, 24, 7, 0, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 6, 4, 6, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 34, 7, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 42, 6, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 224, 7, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 41, 62, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 72, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 63, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 72, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 11, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 71, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 13, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 12, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 11, 335.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 4335.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 2222023.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 43.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 2103.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 4325.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 2023.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 435.717, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 203.56, 0, 929, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 4, 6, 1, 435.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 24, 7, 1, 203.56, 0, 99, 2, 87.5, 0, 12, 8, 3, 5, 1233.4, 0 },
                { 0, 5, 0, 0, 0, 435.77, 2, 0, 0, 91.3, 2, 20, 10, 0, 10, 10, 0 },
                { 0, 5, 4, 6, 1, 12125.77, 0, 87, 2, 91.3, 0, 0, 0, 0, 0, 0, 0 },
        };
        imprimir_matriz_secuencias(enero);
        cantidadDeTicketsQueSuperanUnImporteEnDia(enero);
        cantidadDeTicketsQueSuperanUnImporteEnMes(enero);
        cantidadDeTicketsConMasDeXArticulosEnUnDia(enero);
        cantidadDeTicketsConMasDeXArticulosEnUnMes(enero);
    }

    public static void imprimir_matriz_secuencias(double[][] matint) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print(" | " + matint[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static int buscarIni(double[] mat, int pos) {
        while (pos < MAXCOLUMNA && mat[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(double[] mat, int pos) {
        while (pos < MAXCOLUMNA && mat[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    // A
    public static void cantidadDeTicketsQueSuperanUnImporteEnDia(double[][] arr) {
        int dia = 0;
        double importe = 203.55;
        int contador = 0;
        int ini = 0;
        int fin = -1;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr[dia], fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr[dia], ini);
                if (arr[dia][fin] > importe) {
                    contador++;
                    ini = fin;
                }
            }
        }
        System.out.println("La cantidad de tickets en el dia " + dia + " que superan el importe de " + importe + " es: "
                + contador);
    }

    public static void cantidadDeTicketsQueSuperanUnImporteEnMes(double[][] arr) {
        int dia = 0;
        double importe = 203.55;
        int contador = 0;
        while (dia < MAXFILA) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA) {
                ini = buscarIni(arr[dia], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[dia], ini);
                    if (arr[dia][fin] > importe) {
                        contador++;
                        ini = fin;
                    }
                }
            }
            dia++;
        }
        System.out.println("La cantidad de tickets en el mes de enero que superan el importe de " + importe + " es: "
                + contador);
    }

    // B
    public static void cantidadDeTicketsConMasDeXArticulosEnUnDia(double[][] arr) {
        int dia = 0;
        int contador = 0;
        int ini = 0;
        int fin = -1;
        int cantarticulos = 2;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr[dia], fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr[dia], ini);
                double longitud = (fin - ini + 1) ;
                if (longitud / 2 > cantarticulos) {
                    contador++;
                    ini = fin;
                }
            }
        }
        System.out.println(
                "Cantidad de tickets en el dia: " + dia + " que tienen mas de " + cantarticulos + " articulos es: " + contador);
    }

    public static void cantidadDeTicketsConMasDeXArticulosEnUnMes(double[][] arr) {
        int dia = 0;
        int contador = 0;
        int cantarticulos = 2;
        while (dia < MAXFILA) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA) {
                ini = buscarIni(arr[dia], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[dia], ini);
                    double longitud = (fin - ini + 1) ;
                    if (longitud / 2 > cantarticulos) {
                        contador++;
                        ini = fin;
                    }
                }
            }
            dia++;
        }
        System.out.println(
                "Cantidad de tickets en el mes de enero que tienen mas de " + cantarticulos + " articulos es: " + contador);
    }
}