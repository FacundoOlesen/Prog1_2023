package TP6.Bonus_Track_6;

public class Ej1 {
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
        contarCantidadTickets(enero);
        calcularImportesMedioDeUnDia(enero);
        calcularImportesMedioDeUnaSemana(enero);
        calcularImportesMedioDeUnMes(enero);
        ticketMayorImporteDelMes(enero);
        ticketConMasProductosEnUnDia(enero);
        diaDelMesConMasProductosVendidos(enero);
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
    public static void contarCantidadTickets(double arr[][]) {
        int fila = 0;
        int contadorTickets = 0;
        while (fila < MAXFILA) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA && fila < MAXFILA) {
                ini = buscarIni(arr[fila], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[fila], ini);
                    contadorTickets++;
                    ini = fin;
                }
            }
            fila++;
        }
        System.out
                .println("\n La cantidad promedio de tickets por dia en el mes de enero es de:  "
                        + contadorTickets / MAXFILA);
    }

    // B
    public static void calcularImportesMedioDeUnDia(double[] arr[]) {
        // IMPORTE MEDIO DE UN DIA:
        int fila = 3; // CAMBIANDO EL NUMERO DE FILA VAS CAMBIANDO DE DIA.
        int contadorTickets = 0;
        double sumaImportes = 0;
        int ini = 0;
        int fin = -1;
        while (ini < MAXCOLUMNA && fila < MAXFILA) {
            ini = buscarIni(arr[fila], fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr[fila], ini);
                contadorTickets++;
                sumaImportes += arr[fila][fin];
                ini = fin;
            }
        }
        System.out
                .println("\n El importe medio de venta para el dia " + fila + " es: "
                        + sumaImportes / contadorTickets);
    }

    public static void calcularImportesMedioDeUnaSemana(double[][] arr) {
        // IMPORTE MEDIO DE UNA SEMANA:
        int primerdiasemana = 0;
        int ultimodiasemana = 6;
        int contadorTickets = 0;
        double sumaImportes = 0;
        while (primerdiasemana <= ultimodiasemana) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA && primerdiasemana < MAXFILA) {
                ini = buscarIni(arr[primerdiasemana], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[primerdiasemana], ini);
                    contadorTickets++;
                    sumaImportes += arr[primerdiasemana][fin];
                    ini = fin;
                }
            }
            primerdiasemana++;
        }
        System.out
                .println("\n El importe medio de venta para la semana 1 es "
                        + sumaImportes / contadorTickets);
    }

    public static void calcularImportesMedioDeUnMes(double[][] arr) {
        // IMPORTE MEDIO DE UN MES:
        int fila = 0;
        int contadorTickets = 0;
        double sumaImportes = 0;
        while (fila < MAXFILA) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA && fila < MAXFILA) {
                ini = buscarIni(arr[fila], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[fila], ini);
                    contadorTickets++;
                    sumaImportes += arr[fila][fin];
                    ini = fin;
                }
            }
            fila++;
        }
        System.out
                .println("\n El importe medio de venta para el mes de enero es "
                        + sumaImportes / contadorTickets);
    }

    // C
    public static void ticketMayorImporteDelMes(double[][] arr) {
        int fila = 0;
        int iniMayorImporte = 0;
        int finMayorImporte = 0;
        double mayorImporte = 0;
        while (fila < MAXFILA) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA) {
                ini = buscarIni(arr[fila], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[fila], ini);
                    if (arr[fila][fin] > mayorImporte) {
                        iniMayorImporte = ini;
                        finMayorImporte = fin;
                        mayorImporte = arr[fila][fin];
                        ini = fin;
                    }
                }
            }
            fila++;
        }
        System.out.println("\n El ticket de mayor importe del mes de enero es de: "
                + mayorImporte);
    }

    // D
    public static void ticketConMasProductosEnUnDia(double[][]arr) {
        int dia = 3; // CAMBIANDO EL NUMERO DE FILA VAS CAMBIANDO DE DIA.
        int ini = 0;
        int fin = -1;
        int longitudMayor = 0;
        int contadorTickets = 0;
        while (ini < MAXCOLUMNA) {
            ini = buscarIni(arr[dia], fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arr[dia], ini);
                if (fin - ini + 1 > longitudMayor) {
                    longitudMayor = fin - ini + 1;
                    contadorTickets++;
                }
                ini = fin;
            }
        }
        System.out.println("\n El ticket con mas productos vendidos en el dia " + (dia + 1) + " es el ticket numero "
                + contadorTickets + " del dia.");
    }

    // E
    public static void diaDelMesConMasProductosVendidos(double[][]arr) {
        int dia = 0; // CAMBIANDO EL NUMERO DE FILA VAS CAMBIANDO DE DIA.
        int diaMayor = 0;
        int longitudMayor = 0;
        while (dia < MAXFILA) {
            int ini = 0;
            int fin = -1;
            while (ini < MAXCOLUMNA) {
                ini = buscarIni(arr[dia], fin + 1);
                if (ini < MAXCOLUMNA) {
                    fin = buscarFin(arr[dia], ini);
                    if (fin - ini + 1 > longitudMayor) {
                        longitudMayor = fin - ini + 1;
                        diaMayor = dia;
                    }
                    ini = fin;
                }
            }
            dia++;
        }
        System.out.println("\n En el dia " + (diaMayor + 1) + " se vendio la mayor cantidad de productos.");
    }
}