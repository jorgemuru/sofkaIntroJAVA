package com.ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sigue = true;
        String diaSemana;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 8 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> ¿Es laborable? <<<<<<<<<<<<<<<<<<<<");
        System.out.println("---------------- Ingresando FIN termina el programa ----------------");

        while(sigue) {
            try {
                System.out.println("Ingrese un dia de la semana:");
                diaSemana = lector.next();
                diaSemana = diaSemana.toUpperCase();
                if (diaSemana.contains("FIN")) {
                    sigue = false;
                    break;
                }else{
                    switch (diaSemana){
                        case "LUNES":
                        case "MARTES":
                        case "MIERCOLES":
                        case "JUEVES":
                            System.out.println("Lamentablemente " + diaSemana + " es un dia laborable. Vaya a trabajar!!!");
                            break;
                        case "VIERNES":
                            System.out.println("Lamentablemente " + diaSemana + " es un dia laborable. PERO ES ULTIMO DE LA SEMANA!!!");
                            break;
                        case "SABADO":
                        case "DOMINGO":
                            System.out.println("Siiiiiii!!!! " + diaSemana + " es un dia NO laborable. Vaya a pasear!!!");
                            break;
                        default:
                            System.out.println(diaSemana + " NO es un dia de la semana!!!");
                            break;
                    }//fin switch
                }//fin else
            }catch (InputMismatchException e){
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                break;
            }
        }//Fin while
        System.out.println("---------------- FIN DEL JUEGO ---------------- ");

    }//fin main
}//fin clase
