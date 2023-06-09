package TP5.Bonus_Track_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MIN = 0;
    public static final char MINOPC = '1', MAXOPC = '7';

    public static void main(String[] args) {
        int arr[] = { 0, 20, 40, 10, 0, 0, 3, 5, 8, 0, 5, 7, 20, 0, 7, 6, 10, 5, 14, 0 };
        menu(arr);
    }

    public static void menu(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char opcion = '1';
        while (opcion >= MINOPC && opcion <= MAXOPC) {
            try {
                System.out.println(
                "\nBienvenido al Supermercado Carrefive."
                +"Ingrese:\n1. Para saber la cantidad de tickets emitidos este fin de semana. "
                + "\n2. Para saber el importe total de ventas."
                + "\n3. Para saber cual fue el ticket de mayor importe y su valor."
                + "\n4. Para la mayor cantidad de articulos vendidos en un ticket. Y saber el art mas caro, mas barato y el promedio."
                + "\n5. Para obtener el promedio de venta de cada ticket en el fin de semana."
                + "\n6. Para obtener el ticket de menor importe(el valor)."
                + "\n7. Para ver el ticket con menor cant de articulos vendididos."
                + "\n0. Para salir.");
                opcion = entrada.readLine().charAt(0);

                switch (opcion) {
                    case '1':
                        contarCantidadTickets(arr);
                        break;
                    case '2':
                        calcularImporteTotal(arr);
                        break;
                    case '3':
                        obtenerTicketMayorImporte(arr);
                        break;
                    case '4':
                        calcularTicketMayorCantArticulos(arr);
                        break;
                    case '5':
                        obtenerPromedioGeneral(arr);
                        break;
                    case '6':
                        calcularTicketMenorImporte(arr);
                        break;
                    case '7':
                        obtenerTicketMenorCantArtVen(arr);
                        break;
                    case '0':
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("Error, la opcion: " + opcion + " no es valida.");
                        break;
                }
            }

            catch (Exception e) {
                System.out.println(e);
            }
        }

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

    public static void contarCantidadTickets(int arr[]) {
        int ini = 0;
        int fin = -1;
        int contador = -1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            contador++;
            ini = fin + 1;
        }
        System.out.println("\n La cantidad de tickets emitidos en la semana es de: " + contador);
    }

    public static int calcularImporteTotal(int[] arr) {
        int suma = 0;
        for (int i = 0; i < MAX; i++) {
            suma += arr[i];
        }
        System.out.println("\n El importe total de ventas de todos los tickets fue de: " + suma);
        return suma;
    }

    public static int obtenerSumasTickets(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static void obtenerTicketMayorImporte(int[] arr) {
        int ini = 0;
        int fin = -1;
        int iniciomayor = 0;
        int finmayor = 0;
        int sumamayor = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            int suma = obtenerSumasTickets(arr, ini, fin);
            if (suma > sumamayor) {
                sumamayor = suma;
                iniciomayor = ini;
                finmayor = fin;
            }
            fin = ini;
        }
        System.out.println(("\n El ticket de mayor importe empieza en: " + iniciomayor + " termina en: " + finmayor+ " y la suma da: " + sumamayor));
        obtenerInfoTicketMayorImporte(arr, iniciomayor, finmayor);
    }

    public static void obtenerInfoTicketMayorImporte(int[] arr, int ini, int fin) {
        int suma = 0;
        int i = ini;
        while (i <= fin) {
            suma += arr[i];
            i++;
        }
        System.out.println("\n Hay: " + (fin - ini) + 1 + " articulos involucrados. El promedio es de: "+ (suma / (fin - ini) + 1));
    }

    public static void calcularTicketMayorCantArticulos(int[] arr) {
        int ini = 0;
        int fin = -1;
        int longitudmayor = 0;
        int inimayor = 0;
        int finmayor = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            int longitud = (fin - ini) + 1;
            if (longitud > longitudmayor) {
                longitudmayor = longitud;
                inimayor = ini;
                finmayor = fin;
            }
            ini = fin + 1;
        }
        obtenerInfoTicketMayorArtVendidos(arr, inimayor, finmayor);
        System.out.println("\n La mayor cantidad de articulos vendidos en un ticket fue de: " + longitudmayor);
    }

    public static void obtenerInfoTicketMayorArtVendidos(int[] arr, int inimayor, int finmayor) {
        int mayor = 0;
        int menor = 0;
        int i = inimayor;
        int suma = 0;
        while (i <= finmayor) {
            if (arr[i] > arr[i + 1]) {
                mayor = arr[i];
            } 
            else if (arr[i] < arr[i + 1]) {
                menor = arr[i];
            }
            suma += arr[i];
            i++;
        }
        int promedio = suma / (finmayor - inimayor) + 1;
        System.out.println("\n Del ticket con mayor cant de art vendidos, el articulo mas caro es:" + mayor + " el menor "+ menor + " y el promedio: " + promedio);
    }

    public static void obtenerPromedioGeneral(int[] arr) {
        int ini = 0;
        int fin = -1;
        int suma = 0;
        int acum = 0;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                for (int i = ini; i <= fin; i++) {
                    suma += arr[i];
                    acum++;
                }
                ini = fin;
            }
        }
        System.out.println("\n El promedio total de venta de ticket en todo el fin de semana es: " + suma / acum);
    }

    public static void calcularTicketMenorImporte(int[] arr) {
        int ini = 0;
        int fin = -1;
        ini = obtenerIni(arr, fin + 1);
        fin = obtenerFin(arr, ini);
        int menorticket = obtenerSumasTickets(arr, ini, fin);
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                int sumamenor = obtenerSumasTickets(arr, ini, fin);
                if (sumamenor < menorticket) {
                    menorticket = sumamenor;
                    ini = fin;
                }
            }
        }
        System.out.println(("\n El ticket de menor importe tiene un valor de: " + menorticket));
    }

    public static void obtenerTicketMenorCantArtVen(int[] arr) {
        int ini = 0;
        int fin = -1;
        ini = obtenerIni(arr, fin + 1);
        fin = obtenerFin(arr, ini);
        int longitudmenor = (fin - ini) + 1;
        while (ini < MAX) {
            ini = obtenerIni(arr, fin + 1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                int longitud = (fin - ini) + 1;
                if (longitud < longitudmenor) {
                    longitudmenor = longitud;
                    ini = fin;
                }
            }
        }
        System.out.println("\n La menor cantidad de articulos vendidos en un ticket fue de: " + longitudmenor);
    }
}
