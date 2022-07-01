package com.ejercicio10;

import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String fraseOriginal;
        String fraseCambiada;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 10 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Frase sin espacios <<<<<<<<<<<<<<<<<<<<");

        System.out.println("Ingrese una frase propia: ");
        fraseOriginal = lector.nextLine();
        System.out.println("-------------------------------------------");
        fraseCambiada = fraseOriginal.replace(" ", "");
        System.out.println("La frase cambiada es: " + fraseCambiada);
        System.out.println("-------------------------------------------");
    }//fin main
}//fin clase
