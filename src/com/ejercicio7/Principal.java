package com.ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sigue = true;
        int numero = -9999;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 7 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> ¿Es mayor a CERO -solo negativos-? <<<<<<<<<<<<<<<<<<<<");
        System.out.println("---------------- Ingresando CERO o un numero mayor finaliza ----------------");

        while(sigue) {
            try {
                System.out.println("Ingrese un numero menor a CERO:");
                numero = lector.nextInt();
                if (numero >= 0) {
                    sigue = false;
                }
            }catch (InputMismatchException e){
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                break;
            }
        }//Fin while
        System.out.println("---------------- FIN DEL JUEGO ---------------- ");

    }//fin main
}//fi clase
