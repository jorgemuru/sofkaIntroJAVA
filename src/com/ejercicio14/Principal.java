package com.ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 14 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> De dos en dos <<<<<<<<<<<<<<<<<<<<");

        try {
            System.out.println("Ingrese un numero igual o mayor a CERO y menor a 1000:");
            numero = lector.nextInt();
            if (numero < 0 || numero > 1000) {
                System.out.println("¡¡¡¡ERROR!!!! - DEBE INGRESAR UN NUMERO MAYOR/IGUAL A CERO O MENOR A MIL");
            }else{
                System.out.println("Listado de numeros de 2 en 2 hasta 1000:");
                System.out.println();
                for (int i = numero; i <= 1000; i = i + 2) {
                    System.out.print(String.valueOf(i) + " ");
                }
                System.out.println();
                System.out.println("---------------- FIN DEL LISTADO ---------------- ");
            }
        }catch(InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }


    }//fin main
}//fin clase
