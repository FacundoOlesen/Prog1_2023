package Ejercicios_Tipo_Parcial;
/* Dado dos arreglos AR y RES de enteros positivos de tamaño MAX, hacer un programa completo bien modularizado que copie en RES
la secuencia de numeros iguales consecutivos (al menos dos numeros iguales consecutivos) que mas se repite en AR. No utilizar 
estructuras auxiliares. Suponer que AR esta cargado y RES inicializado con -1
 */
public class Recuperatorio_2doParcial_2019 {
    public static final int MAX =10;

    public static void main(String[] args) {
        int AR[]={0,3,0,5,5,0,2,2,2,0};
        int RES[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        imprimir_arreglo_secuencias_int(AR);
        procesarSecuencias(AR, RES);
        System.out.println("Arreglo RES con la secuencia de AR que tiene la mayor cantidad de numeros consecutivos.");
        imprimir_arreglo_secuencias_int(RES);
    }

    public static void imprimir_arreglo_secuencias_int(int[] AR) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(AR[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerIni(int[]AR, int pos){
        while(pos<MAX&&AR[pos]==0){
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[]AR, int pos){
        while(pos<MAX&&AR[pos]!=0){
            pos++;
        }
        return pos-1;
    }

    public static int contarNumerosRepetidosSec(int[]AR, int ini, int fin){
        int nroconsecutivo=1;
        for(int i =ini; i<=fin;i++){
            if(AR[i]==AR[i+1]){
                nroconsecutivo++;
            }
        }
        return nroconsecutivo;
    }

    public static void copiarSecMasRep(int[]AR, int[]RES, int inimasrepetido, int finmasrepetido){
        for(int i=inimasrepetido;i<=finmasrepetido;i++){
            RES[i]=AR[i];
        }
    }

    public static void procesarSecuencias(int[]AR, int[]RES){
        int ini=0;
        int fin=-1;
        int inimasrepetido=0;
        int finmasrepetido=0;
        int secmasrepetida=0;
        while(ini<MAX){
            ini=obtenerIni(AR, fin+1);
            if(ini<MAX){
                fin=obtenerFin(AR, ini);
                int nroconsecutivo = contarNumerosRepetidosSec(AR, ini, fin);
                if (nroconsecutivo>secmasrepetida){
                    secmasrepetida=nroconsecutivo;
                    inimasrepetido=ini;
                    finmasrepetido=fin;
                }
            }
        }
        copiarSecMasRep(AR, RES, inimasrepetido, finmasrepetido);
    }
}
