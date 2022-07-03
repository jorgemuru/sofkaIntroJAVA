package com.ejercicio17;

import java.sql.Array;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    //Crear array de electrodomesticos con 10 posiciones
    static Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

    public static void main(String[] args) {
        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 17 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Gestion Tienda de Electroventas <<<<<<<<<<<<<<<<<<<<");

        //Creo 5 lavadoras.
        Electrodomestico lavadoraUno = new Lavadora(1500, "NEGRO", 'A', 35,35);
        listaElectrodomesticos[0] = lavadoraUno;
        Electrodomestico lavadoraDos = new Lavadora(2500, "AZUL", 'B', 45,25);
        listaElectrodomesticos[1] = lavadoraDos;
        Electrodomestico lavadoraTres = new Lavadora(5500, "ROJO", 'F', 55,8);
        listaElectrodomesticos[2] = lavadoraTres;
        Electrodomestico lavadoraCuatro = new Lavadora(15000, "VERDE", 'L', 120,150);
        listaElectrodomesticos[3] = lavadoraCuatro;
        Electrodomestico lavadoraCinco = new Lavadora(500, "GRIS", 'B', 50,10);
        listaElectrodomesticos[4] = lavadoraCinco;

        //Creo 5 televisores
        Electrodomestico teleUno = new Television(25000, "AZUL", 'B',25,45,true);
        listaElectrodomesticos[5] = teleUno;
        Electrodomestico teleDos = new Television(5000, "AZUL", 'A',15,60,true);
        listaElectrodomesticos[6] = teleDos;
        Electrodomestico teleTres = new Television(55000, "VERDE", 'M',45,80,true);
        listaElectrodomesticos[7] = teleTres;
        Electrodomestico teleCuatro = new Television(2500, "GRIS", 'F',20,60,false);
        listaElectrodomesticos[8] = teleCuatro;
        Electrodomestico teleCinco = new Television(10000, "NEGRO", 'B',10,55,true);
        listaElectrodomesticos[9] = teleCinco;


        //Vuelvo a recorrer el mismo Array pero ahora ejecutando a cada objeto el metodo prcioFinal()
        //(listaEletrodomesticos[i].precioFinal)

        //Recorro 3 veces el array, mostrando en consola la info deseada en cada recorrida.

        mostrarEstadisticas();

    }//fin main

    private static void mostrarEstadisticas(){
        double sumaLavadoras = 0;
        double sumaTeles = 0;

        for(int i = listaElectrodomesticos.length-1; i>=0; i--){
            if(listaElectrodomesticos[i].getClass().getSimpleName().contains("Lavadora")){
                sumaLavadoras = sumaLavadoras + listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i].getClass().getSimpleName().contains("Television")){
                sumaTeles = sumaTeles + listaElectrodomesticos[i].precioFinal();
            }
        }
        System.out.println("------------------------ Estadisticas de Ventas ------------------------");
        System.out.println("Proyeccion de ventas de Lavadoras: " + sumaLavadoras);
        System.out.println("Proyeccion de ventas de Televisores: " + sumaTeles);
        System.out.println("Proyeccion Total de ventas: " + (sumaLavadoras + sumaTeles));
        System.out.println("--------------------------------------------------------------------------");
    }
}//Fin clase
