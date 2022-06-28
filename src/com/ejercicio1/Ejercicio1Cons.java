package com.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1Cons {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sigue = true;
        int primerNumero = 9999999;
        int segundoNumero = 9999999;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 1 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> ¿Es mayor o menor? <<<<<<<<<<<<<<<<<<<<");
        System.out.println("---------------- Ingresando CERO en ambos finaliza ----------------");

        while(sigue) {
            try {
                System.out.println("Ingrese el primer numero:");
                primerNumero = lector.nextInt();
            }catch (InputMismatchException e){
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                break;
            }
            try {
                System.out.println("Ingrese el segundo numero:");
                segundoNumero = lector.nextInt();
            }catch(InputMismatchException e){
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                break;
            }
            if ((primerNumero == 0) && (segundoNumero == 0)) {
                sigue = false;
            }
            else{
                if(primerNumero > segundoNumero){
                    System.out.println("El primer numero es MAYOR al segundo");
                }
                if(primerNumero < segundoNumero){
                    System.out.println("El segundo numero es MAYOR al primero");
                }
                if(primerNumero == segundoNumero){
                    System.out.println("Los dos numeros son iguales");
                }
            }
        }//Fin while
        System.out.println("---------------- FIN DEL JUEGO ---------------- ");
    }//Fin main
}//Fin clase
