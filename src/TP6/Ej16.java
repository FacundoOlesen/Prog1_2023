package TP6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej16 {
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;

    public static void main(String[] args) {
        char[][] MAT1 = {
                { ' ', 'a', 'b', 'c', 'd', ' ', 'a', ' ', 's', 'e', 'h', ' ', 'd', 'f', 'h', ' ', 'f', ' ', ' ', ' ' },
                { ' ', 'z', 'h', ' ', 'w', 'z', 'z', ' ', 's', ' ', 'h', ' ', 'a', 'b', 'c', 'd', ' ', 'q', ' ', ' ' },
                { ' ', 'h', 'h', ' ', 'd', ' ', 'z', ' ', 's', 'x', ' ', ' ', 'd', 'q', ' ', ' ', 'f', 's', ' ', ' ' },
                { ' ', 's', 'h', ' ', 'd', ' ', 'a', 'b', 'c', 'x', ' ', 'f', 'f', 'q', ' ', ' ', 'f', 'x', ' ',
                        ' ' } };

        char[][] MAT2 = {
                { ' ', 's', 'e', 'c', ' ', ' ', 'z', ' ', 's', 'g', 'h', ' ', 'd', 'f', ' ', ' ', 'f', 'k', 'l', ' ' },
                { ' ', 'z', 'h', ' ', 'w', 'z', 'z', ' ', 's', ' ', 'h', ' ', 'a', 'b', 'c', 'd', ' ', 'q', 'l', ' ' },
                { ' ', 'h', 'h', ' ', 'd', ' ', 'a', ' ', 's', 'x', ' ', ' ', 'd', 'q', ' ', ' ', 'f', 's', ' ', ' ' },
                { ' ', 's', 'h', ' ', 'd', ' ', 'a', 'b', 'c', 'x', ' ', 'f', 'f', 'q', ' ', ' ', 'f', 'x', ' ',
                        ' ' } };
        System.out.println("MAT1");
        imprimir_matriz_secuencias(MAT1);
        System.out.println("MAT2");
        imprimir_matriz_secuencias(MAT2);
        iterarPorFilas(MAT1, MAT2);
        System.out.println("MAT 1 SIN PRIMER VOCAL. AL PRINCIPIO CON EL PRIMER CARACTER DE LA SEC DE MAYOR TAM.");
        imprimir_matriz_secuencias(MAT1);
        System.out.println("MAT 2 SIN PRIMER VOCAL.");
        imprimir_matriz_secuencias(MAT2);
    }

    public static void imprimir_matriz_secuencias(char[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int col = 0; col < MAXCOLUMNA; col++) {
                System.out.print("|" + mat[fila][col]);
            }
            System.out.print("\n");
        }
    }

    public static void iterarPorFilas(char[][] MAT1, char[][] MAT2) {
        // E
        int filausuario = obtenerFila();
        sonIguales(MAT1[filausuario], MAT2[filausuario]);
        // B
        for (int fila = 0; fila < MAXFILA; fila++) {
            eliminarPrimerVocal(MAT1[fila], MAT2[fila]);
        }
        // C
        for (int fila = 0; fila < MAXFILA; fila++) {
            agregarPrimerCaracSecMasLarga(MAT1[fila]);
        }
        // D
        for (int fila = 0; fila < MAXFILA; fila++) {
            esMayor(MAT1[fila], MAT2[fila]);
        }
    }

    public static int buscarIni(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == ' ') {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != ' ') {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquierda(char[] arr, int pos, int fin) {
        while (pos <= fin) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void corrimientoDerecha(char[] arr, int pos) {
        int indice = MAXCOLUMNA - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }

    }

    //B
    public static void eliminarPrimerVocal(char[] arr, int ini, int fin) {
        while (ini < MAXCOLUMNA && arr[ini] != 'a' && arr[ini] != 'e' && arr[ini] != 'i' && arr[ini] != 'o'
                && arr[ini] != 'u') {
            ini++;
        }
        corrimientoIzquierda(arr, ini, fin);
    }

    public static boolean hayVocal(char[] arr, int ini, int fin) {
        while (ini <= fin && arr[ini] != 'a' && arr[ini] != 'e' && arr[ini] != 'i' && arr[ini] != 'o'
                && arr[ini] != 'u') {
            ini++;
        }
        return ini <= fin;
    }

    public static void eliminarPrimerVocal(char[] MAT1, char[] MAT2) {
        int iniMAT1 = 0;
        int finMAT1 = -1;
        int iniMAT2 = 0;
        int finMAT2 = -1;
        while (iniMAT1 < MAXCOLUMNA) {
            iniMAT1 = buscarIni(MAT1, finMAT1 + 1);
            iniMAT2 = buscarIni(MAT2, finMAT2 + 1);
            if (iniMAT1 < MAXCOLUMNA) {
                finMAT1 = buscarFin(MAT1, iniMAT1);
                finMAT2 = buscarFin(MAT2, iniMAT2);
              
                if (hayVocal(MAT1, iniMAT1, finMAT1)) {
                    eliminarPrimerVocal(MAT1, iniMAT1, finMAT1);
                    iniMAT1 = finMAT1;
                }
                if (hayVocal(MAT2, iniMAT2, finMAT2)) {
                    eliminarPrimerVocal(MAT2, iniMAT2, finMAT2);
                    iniMAT2 = finMAT2;
                }

            }
        }
    }

    // C
    public static int obtenerSecMasLarga(char[] MAT1) {
        int iniMAT1 = 0;
        int finMAT1 = -1;
        int iniMAT1MayorLong = 0;
        int longitudMayor = 0;
        while (iniMAT1 < MAXCOLUMNA) {
            iniMAT1 = buscarIni(MAT1, finMAT1 + 1);
            if (iniMAT1 < MAXCOLUMNA) {
                finMAT1 = buscarFin(MAT1, iniMAT1);
                int longitudMAT1 = finMAT1 - iniMAT1 + 1;
                if (longitudMAT1 > longitudMayor) {
                    longitudMayor = longitudMAT1;
                    iniMAT1MayorLong = iniMAT1;
                }
            }
        }
        return iniMAT1MayorLong;
    }

    public static void agregarPrimerCaracSecMasLarga(char[] MAT1) {
        int iniMAT1 = 0;
        int finMAT1 = -1;
        char primerCaracSecMasLarga = MAT1[obtenerSecMasLarga(MAT1)];
        while (iniMAT1 < MAXCOLUMNA) {
            iniMAT1 = buscarIni(MAT1, finMAT1 + 1);
            if (iniMAT1 < MAXCOLUMNA) {
                finMAT1 = buscarFin(MAT1, iniMAT1);
                corrimientoDerecha(MAT1, iniMAT1);
                MAT1[iniMAT1] = primerCaracSecMasLarga;
                finMAT1 = finMAT1 + 1;
            }
        }
    }

    // D
    public static void esMayor(char[] MAT1, char[] MAT2) {
        int iniMayorMAT1 = obtenerSecMasLarga(MAT1);
        int iniMAT2 = 0;
        int finMAT2 = -1;
        if (iniMayorMAT1 < MAXCOLUMNA) {
            int finMayorMAT1 = buscarFin(MAT1, iniMayorMAT1);
            int longitudMAT1 = finMayorMAT1 - iniMayorMAT1 + 1;
            iniMAT2 = buscarIni(MAT2, finMAT2 + 1);
            if (iniMAT2 < MAXCOLUMNA) {
                finMAT2 = buscarFin(MAT2, iniMAT2);
                int longitudMAT2 = finMAT2 - iniMAT2 + 1;
                if (longitudMAT1 > longitudMAT2) {
                    for (int i = 0; i < longitudMAT1 - longitudMAT2; i++) {
                        corrimientoDerecha(MAT2, iniMAT2);
                    }
                    intercambiarSecsMAT1yMAT2(MAT1, MAT2, iniMayorMAT1, finMayorMAT1, iniMAT2, finMAT2);
                    for (int i = 0; i < longitudMAT1 - longitudMAT2; i++) {
                        corrimientoIzquierda(MAT1, iniMayorMAT1, finMayorMAT1);
                    }
                }
            }
        }
    }

    public static void intercambiarSecsMAT1yMAT2(char[] MAT1, char[] MAT2, int iniMAT1, int finMAT1, int iniMAT2,
            int finMAT2) {
        char aux = ' ';
        while (iniMAT1 <= finMAT1) {
            aux = MAT1[iniMAT1];
            MAT1[iniMAT1] = MAT2[iniMAT2];
            MAT2[iniMAT2] = aux;
            iniMAT1++;
            iniMAT2++;
        }
    }

    // E
    public static int obtenerFila() {
        int fila = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(
                    "Ingrese una fila entre 0 y " + (MAXFILA - 1)
                            + " y verificaremos si la primer secuencia de la fila ingresada de MAT1 es igual a la primer secuencia de MAT 2 en la misma fila.");
            fila = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
        return fila;
    }

    public static void sonIguales(char[] MAT1, char[] MAT2) {
        int iniMAT1 = 0;
        int finMAT1 = -1;
        int iniMAT2 = 0;
        int finMAT2 = -1;
        iniMAT1 = buscarIni(MAT1, finMAT1 + 1);
        if (iniMAT1 < MAXCOLUMNA) {
            finMAT1 = buscarFin(MAT1, iniMAT1);
            iniMAT2 = buscarIni(MAT2, finMAT2 + 1);
            if (iniMAT2 < MAXCOLUMNA) {
                finMAT2 = buscarFin(MAT2, iniMAT2);
                while (iniMAT1 <= finMAT1 && MAT1[iniMAT1] == MAT2[iniMAT2]) {
                    iniMAT1++;
                    iniMAT2++;
                }
            }
        }
        if (iniMAT1 > finMAT1) {
            System.out.println(
                    "La primer secuencia de MAT1 en la fila ingresada es igual a la primera secuencia de MAT2 en la fila ingresada ");
        } else {
            System.out.println(
                    "La primer secuencia de MAT1 en la fila ingresada NO es igual a la primera secuencia de MAT2 en la fila ingresada ");
            ;

        }
    }
}
