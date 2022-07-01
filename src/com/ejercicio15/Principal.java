package com.ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 15 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> De dos en dos <<<<<<<<<<<<<<<<<<<<");

        while(opcion!=8) {
            menuPrincipal();
            try {
                opcion = lector.nextInt();
                switch (opcion) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        System.out.println("Usted selecciono la OPCION " + opcion);
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }//fin switch
            } catch (InputMismatchException e) {
                System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
                break;
            }//fin try/catch
        }//fin while
        System.out.println("---------------- FIN DEL PROGRAMA ---------------- ");
        System.exit(0);
    }//fin main
    private static void menuPrincipal(){
        System.out.println("************* GESTION CINEMATOGRAFICA *************");
        System.out.println("1- NUEVO ACTOR");
        System.out.println("2- BUSCAR ACTOR");
        System.out.println("3- ELIMINAR ACTOR");
        System.out.println("4- MODIFICAR ACTOR");
        System.out.println("5- VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8- SALIR");
        System.out.println("****************************************************");
        System.out.println("Ingrese la opcion deseada (1 al 8): ");
    }//fin menuPrincipal
}//fin clase
