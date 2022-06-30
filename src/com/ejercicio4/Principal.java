package com.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double precio = 9999999.0;
        double IVA = 21.0;
        double resultado = 0.0;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 4 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Calculo del IVA <<<<<<<<<<<<<<<<<<<<");

        try {
            System.out.println("Ingrese el precio del producto:");
            precio = lector.nextDouble();

            if (precio <= 0) {
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO MAYOR A CERO!!!");
            }else{
                resultado = precio + ((precio * IVA)/100);
                System.out.println("---------------------------------------------");
                System.out.println("El precio del producto es: " + resultado);
                System.out.println("---------------------------------------------");
            }
        }catch (InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }
    }//fin main
}//fin clase
