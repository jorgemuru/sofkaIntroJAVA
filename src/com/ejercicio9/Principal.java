package com.ejercicio9;

import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frasePropia = "-DEBE INGRESAR UNA FRASE-";
        String fraseOriginal = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseCambiada;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 9 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Frases concatenadas <<<<<<<<<<<<<<<<<<<<");

        System.out.println("La frase original es: " + fraseOriginal);
        fraseCambiada = fraseOriginal.replace("a", "e");
        System.out.println("La frase cambiada es: " + fraseCambiada);
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese una frase propia: ");
        frasePropia = lector.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println("La frase final es: \n" + fraseCambiada + " " + frasePropia);
        System.out.println("-------------------------------------------");

    }//fin main
}//fin clase
