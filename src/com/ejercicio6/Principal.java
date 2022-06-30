package com.ejercicio6;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int[] numerosPares = new int[50];
        int[] numerosImpares = new int[50];
        byte j = 0;
        byte k = 0;
        byte m = 0;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 6 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Numeros Pares e impares del 1 al 100 (con FOR) <<<<<<<<<<<<<<<<<<<<");

        //Cargo el array.
        while(j < 100){
            numeros[j] = j + 1;
            j++;
        }

        for(int i = 0; i<numeros.length; i++){
            //si es par lo agrego a un arreglo de numeros pares.
            if((i%2) == 0){
                if ( k < numerosPares.length) { //controlo con un contador la ubicacion del numero en el arreglo
                    numerosPares[k] = i;
                    k++;
                }
            }else{ //si no es par, lo agrego en un arreglo de numeros impares.
                if ( m < numerosImpares.length) { //controlo con un contador la ubicacion del numero en el arreglo
                    numerosImpares[m] = i;
                    m++;
                }
            }
        }//fin for

        //Muestro los arreglos en pantalla
        System.out.println("Los numeros pares son: ");
        for(int n=0; n<numerosPares.length; n++){
            System.out.print(String.valueOf(numerosPares[n]) + " ");
        }
        System.out.println();
        System.out.println("Los numeros impares son: ");
        for(int n=0; n<numerosImpares.length; n++){
            System.out.print(String.valueOf(numerosImpares[n]) + " ");
        }
        System.out.println();
        System.out.println("---------------- FIN DEL LISTADO ---------------- ");
    }//fin main
}//fin clase
