/*
Tema 2: Se tiene un arreglo A de secuencias de enteros y un arreglo B de enteros ordenado ascendente. Cada secuencia de A tiene números primos 
(solo divisible por 1 y por sí mismo) 
o múltiplos de 5. 
Además se tiene el siguiente método pre-existente: _un método que permite obtener el índice inicial de la secuencia con menor cantidad de números múltiplos 
de un valor dado
 para un arreglo de secuencias.
Se pide realizar el programa y los métodos que permitan agregar en B (manteniendo su orden) los números primos de la secuencia de A con menor cantidad de 
números múltiplos de 5.
Observaciones: _los arreglos son de tamaño MAX y están precargados,
_las secuencias están separadas por uno o más ceros, empiezan y terminan con uno o más ceros,
_definir el encabezado del método pre-existente (no hay que implementarlo),
_no realizar métodos de carga e impresión de arreglos ni utilizar arreglos auxiliares.
 */
package Ejercicios_Tipo_Parcial;

public class Parcial_Tema_2_2022 {
    public static final int MAX = 20;

    public static void main(String[] args) {
        int numerodado = 5;
        int[] arrA = { 0, 2, 3, 5, 0, 11, 13, 22, 0, 5, 25, 0, 5, 10, 35, 0, 2, 5, 0, 0 };
        int[] arrB = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19 };

    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerIniSecuenciaConMenorCantidadDeMultiplosDe5(int[] arrA) {
        return 5;
    }

    public static int obtenerFinSecuenciaConMenorCantidadDeMultiplosDe5(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoDerecha(int[] arrA, int pos) {
        while (pos < MAX) {
            arrA[pos] = arrA[pos - 1];
            pos--;
        }
    }

    public static int obtenerPosOrd(int[] arr, int ini, int fin, int valor) {
        while ((ini < fin) && (arr[ini] < valor)) {
            ini++;
        }
        return ini;
    }

    public static void obtenerPrimosSecConMenorCantidadDeMultiplosDe5(int[] arrA, int[] arrB, int ini, int fin) {
        int pos = 0;
        while (ini < fin) {
            if (arrA[pos] % 5 != 0) {
                pos=obtenerPosOrd(arrB, ini, fin, arrA[pos]);
                if (pos < fin) {
                    corrimientoDerecha(arrB, pos);
                    arrB[pos] = arrA[pos];
                }
            }
            ini++;
        }
    }
}
