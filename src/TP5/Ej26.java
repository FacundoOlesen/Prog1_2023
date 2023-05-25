package TP5;

public class Ej26 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, MIN = 0;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        char A[] = {' ', 'a', 'b', 'c','d', ' ',' ','k','z',' ','e','s','s','q',' ','a','b','c','d',' '};     //Aca ir probando cambiando las longitudes de las secuencias
        char B[] = {' ', 's', 'w', ' ',' ', 'z','z','z',' ','h','e','s',' ','q',' ',' ','h',' ',' ', ' '};    //Asi andan los corrimientos para agrandar/achicar la secuencia.
        imprimir_arreglo_int_A(A);
        System.out.println("");
        imprimir_arreglo_int_B(B);
        reemplazoBenA(A, B);
        System.out.println("Arr A reemplazado");
        imprimir_arreglo_int_A(A);
    }

    public static void imprimir_arreglo_int_A(char[] A) {
        System.out.print("Arreglo de secuencias char\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(A[pos] + "|");
        }
        System.out.print("\n");
    }

    public static void imprimir_arreglo_int_B(char[] B) {
        System.out.print("Arreglo de secuencias char\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(B[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerIniSecuenciaMasRepetidaDeA(char[] A) {
        return 1;
    }

    public static int obtenerIniSecuenciaConMasCaracteresRepetidosDeB(char[] B) {
        return 5;
    }

    public static int obtenerFin(char[] A, int pos) {
        while (pos < MAX && A[pos] != ' ') {
            pos++;
        }
        return pos - 1;
    }

    public static void corrimientoIzquierda(char A[], int pos) {
        while (pos < MAX - 1) {
            A[pos] = A[pos + 1];
            pos++;
        }
    }

    public static void corrimientoDerecha(char A[], int ini) {
        int pos= MAX-1;
        while (pos>ini) {
            A[pos] = A[pos - 1];
            pos--;
        }
    }

    public static void agregarLugarYEliminar(char[]A, int inicioA, int longitudA, int longitudB){
        for(int i=0; i<longitudB-longitudA;i++){
            corrimientoDerecha(A, inicioA);
        }
    }

    public static void eliminoLugaresyAgrego(char[]A, int finA, int longitudA, int longitudB){
        for(int i=0; i<longitudA-longitudB;i++){
            corrimientoIzquierda(A, finA);
        }
    }

    public static void reemplazo(char[] A, char[] B, int inicioA, int inicioB, int finA, int finB) {
        for (int i = inicioA; i <= finA; i++) {
                A[i] = B[inicioB-inicioA+i];
        }
    }

    public static void reemplazoBenA(char A[], char B[]) {
        int inicioA = obtenerIniSecuenciaMasRepetidaDeA(A);
        int finA = obtenerFin(A, inicioA);
        int inicioB = obtenerIniSecuenciaConMasCaracteresRepetidosDeB(B);
        int finB = obtenerFin(B, inicioB);
        int longitudA = (finA - inicioA) + 1;
        int longitudB = (finB - inicioB) + 1;
        if (longitudA == longitudB) {
            reemplazo(A, B, inicioA, inicioB, finA, finB);
        }

        if (longitudA > longitudB) {
            eliminoLugaresyAgrego(A, inicioA, longitudA, longitudB);
            inicioA = obtenerIniSecuenciaMasRepetidaDeA(A);
            finA = obtenerFin(A, inicioA);
            reemplazo(A, B, inicioA, inicioB, finA, finB);
        }

        if (longitudA < longitudB) {
            agregarLugarYEliminar(A, inicioA, longitudA, longitudB);
            inicioA = obtenerIniSecuenciaMasRepetidaDeA(A);
            finA = obtenerFin(A, inicioA);
            reemplazo(A, B, inicioA, inicioB, finA, finB);
        }
    }
}
