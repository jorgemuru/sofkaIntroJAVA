package com.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double radio = 9999999.0;
        double areaCirculo = 0.0;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 3 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Area de un circulo <<<<<<<<<<<<<<<<<<<<");

            try {
                System.out.println("Ingrese el Radio del circulo:");
                radio = lector.nextDouble();

                if (radio <= 0) {
                    System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO MAYOR A CERO!!!");
                }else{
                    areaCirculo = Math.PI * (Math.pow(radio, 2.0));
                    System.out.println("---------------------------------------------");
                    System.out.println("El area del circulo es: " + areaCirculo);
                    System.out.println("---------------------------------------------");
                }
            }catch (InputMismatchException e){
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
            }
    }//fin main
}//fin clase
