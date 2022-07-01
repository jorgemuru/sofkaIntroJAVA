package com.ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    static String palabra1;
    static String palabra2;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList lasDif = new ArrayList();

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 12 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Iguales y diferentes <<<<<<<<<<<<<<<<<<<<");

        System.out.println("Ingrese la primer palabra: ");
        palabra1 = lector.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        palabra2 = lector.nextLine();

        //Paso los caracteres a mayusculas para evitar errores de comparacion
        palabra1 = palabra1.toUpperCase();
        palabra2 = palabra2.toUpperCase();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras ingresadas son IGUALES");
        }else{
            lasDif = diferencias(palabra1,palabra2);
            System.out.println("Las letras diferentes son: ");
            for(int i=0; i<lasDif.size(); i++){
                System.out.print(lasDif.get(i).toString() + ", ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");


    }//fin main

    private static ArrayList diferencias(String pPalabra1, String pPalabra2){
        ArrayList lasDif = new ArrayList();
        String largo;

        //Verifico las longitudes de las palabras
        if(pPalabra1.length()==pPalabra2.length()){
            largo="igual";
        }
        if(pPalabra1.length()>pPalabra2.length()){
            largo="palabra1";
        }else{
            largo="palabra2";
        }
        switch(largo){
            case "igual":
                for(int i = 0; i<pPalabra1.length(); i++){
                    char letra1 = pPalabra1.charAt(i);
                    char letra2 = pPalabra2.charAt(i);
                    if(!(letra1==letra2)){
                        lasDif.add(letra1);
                        lasDif.add(letra2);
                    }
                }
                break;
            case "palabra1":
                for(int i = 0; i<pPalabra2.length(); i++){
                    char letra1 = pPalabra1.charAt(i);
                    char letra2 = pPalabra2.charAt(i);
                    if(!(letra1==letra2)){
                        lasDif.add(letra1);
                        lasDif.add(letra2);
                    }
                }
                for(int j = (pPalabra2.length()); j<pPalabra1.length(); j++){
                    lasDif.add(pPalabra1.charAt(j));
                }
                break;
            case "palabra2":
                for(int i = 0; i<pPalabra1.length(); i++){
                    char letra1 = pPalabra1.charAt(i);
                    char letra2 = pPalabra2.charAt(i);
                    if(!(letra1==letra2)){
                        lasDif.add(letra1);
                        lasDif.add(letra2);
                    }
                }
                for(int k = (pPalabra1.length()); k<pPalabra2.length(); k++){
                    lasDif.add(pPalabra2.charAt(k));
                }
                break;
        }
        return lasDif;
    }//fin diferencias

}//fin clase
