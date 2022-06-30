package com.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] numerosPares = new int[50];
        int[] numerosImpares = new int[50];
        byte i = 1;
        byte j = 0;
        byte k = 0;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 5 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Numeros Pares e impares del 1 al 100 <<<<<<<<<<<<<<<<<<<<");

        while(i <= 100){ //verifico ke el numero sea par
            //si es par lo agrego a un arreglo de numeros pares.
            if((i%2) == 0){
                if ( j < numerosPares.length) { //controlo con un contador la ubicacion del numero en el arreglo
                    numerosPares[j] = i;
                    j++;
                }
            }else{ //si no es par, lo agrego en un arreglo de numeros impares.
                if ( k < numerosImpares.length) { //controlo con un contador la ubicacion del numero en el arreglo
                    numerosImpares[k] = i;
                    k++;
                }
            }
            i++; //aumento el contador del while
        }//fin while

        //Muestro los arreglos en pantalla
        System.out.println("Los numeros pares son: ");
        for(i=0; i<numerosPares.length; i++){
            System.out.print(String.valueOf(numerosPares[i]) + " ");
        }
        System.out.println();
        System.out.println("Los numeros impares son: ");
        for(i=0; i<numerosImpares.length; i++){
            System.out.print(String.valueOf(numerosImpares[i]) + " ");
        }
        System.out.println();
        System.out.println("---------------- FIN DEL LISTADO ---------------- ");
    }//fin main
}//fin clase
