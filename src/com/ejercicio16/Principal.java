package com.ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    static String nombre;
    static int edad;
    static String sexo;
    static double peso;
    static double altura;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 16 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Gestion de Persona <<<<<<<<<<<<<<<<<<<<");
        System.out.println("---------------- Ingrese los siguientes datos ---------------------------");
        //Inputs pidiendo datos de Persona1.
        System.out.println("Nombre completo:");
        nombre = lector.nextLine();
        try {
            System.out.println("Edad(numero mayor a CERO):");
            edad = lector.nextInt();
            if (edad <= 0) {
                System.out.println("¡¡¡¡ERROR!!!! - DEBE INGRESAR UN NUMERO MAYOR A CERO");
            }
        }catch(InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }
        System.out.println("Sexo(H: hombre, M: mujer):");
        sexo = lector.next();
        try {
            System.out.println("Peso(numero mayor a CERO):");
            peso = lector.nextDouble();
            if (peso <= 0) {
                System.out.println("¡¡¡¡ERROR!!!! - DEBE INGRESAR UN NUMERO MAYOR A CERO");
            }
        }catch(InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }
        try {
            System.out.println("Altura(numero mayor a CERO):");
            altura = lector.nextDouble();
            if (altura <= 0) {
                System.out.println("¡¡¡¡ERROR!!!! - DEBE INGRESAR UN NUMERO MAYOR A CERO");
            }
        }catch(InputMismatchException e){
            System.out.println("¡¡¡ERROR--DEBE INGRESAR UN NUMERO!!!");
        }

        //Genero las personas
        Persona personaUno = new Persona(nombre, edad, sexo, peso, altura);
        Persona personaDos = new Persona(nombre, edad, sexo);
        Persona personaTres = new Persona();
        personaTres.setNombre("Pedro Picapiedra");
        personaTres.setEdad(17);
        personaTres.setSexo("H");
        personaTres.setAltura(2.08);
        personaTres.setPeso(105.0);

        //Realizo los controles correspondientes.
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("------------------- Efectuando controles a la informacion ingresada -----------------------------");
        //Persona Uno
        System.out.println("***** Datos de " + personaUno.getNombre() + " *****");
        System.out.println("Estado fisico: " + pesoIdeal(personaUno.calcularIMC()));
        if(personaUno.esMayorDeEdad()){
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("NO ES MAYOR DE EDAD");
        }
        System.out.println("Datos completos:");
        System.out.println(personaUno.toString());
        System.out.println("======================================================");

        //Persona Dos
        System.out.println("***** Datos de " + personaDos.getNombre() + " *****");
        System.out.println("Estado fisico: " + pesoIdeal(personaDos.calcularIMC()));
        if(personaDos.esMayorDeEdad()){
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("NO ES MAYOR DE EDAD");
        }
        System.out.println("Datos completos:");
        System.out.println(personaDos.toString());
        System.out.println("======================================================");

        //Persona Tres
        System.out.println("***** Datos de " + personaTres.getNombre() + " *****");
        System.out.println("Estado fisico: " + pesoIdeal(personaTres.calcularIMC()));
        if(personaTres.esMayorDeEdad()){
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("NO ES MAYOR DE EDAD");
        }
        System.out.println("Datos completos:");
        System.out.println(personaTres.toString());
        System.out.println("======================================================");

    }//fin main

    //Metodo ke devuelve el pesoIdeal
    private static String pesoIdeal(int pIndice){
        String retorno = "";

        switch(pIndice){
            case -1:
                retorno = "BAJO PESO. Debe alimentarse mas!!!!";
                break;
            case 0:
                retorno = "PESO IDEAL. Siga con esta rutina!!!!";
                break;
            case 1:
                retorno = "SOBREPESO. Alejese de las tentaciones gastronomicas!!!!";
                break;
        }
        return retorno;
    }//fin pesoIdeal
}//fin clase
