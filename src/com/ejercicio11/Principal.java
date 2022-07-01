package com.ejercicio11;

import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    static int totalVocales = 0;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String fraseOriginal;

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 10 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Estadisticas de la Frase <<<<<<<<<<<<<<<<<<<<");

        System.out.println("Ingrese una frase propia: ");
        fraseOriginal = lector.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println("La frase ingresada tiene un largo de " + fraseOriginal.length() + " caracteres.");
        System.out.println("La frase ingresada tiene un total de " + String.valueOf(contarVocales(fraseOriginal)) + " vocales.");
        System.out.println("-------------------------------------------");
    }//fin main

    private static int contarVocales(String pFrase){
        for (int i = 0; i<pFrase.length(); i++){
            char unaLetra = pFrase.charAt(i);
            if((String.valueOf(unaLetra).equals("a"))||(String.valueOf(unaLetra).equals("e"))||(String.valueOf(unaLetra).equals("i"))||(String.valueOf(unaLetra).equals("o"))||(String.valueOf(unaLetra).equals("u"))){
                totalVocales++;
            }
        }
        return totalVocales;
    }
}//fin classe
