package com.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    public static void main(String[] args) {
        LocalDateTime fechaHoy= LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 13 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Formato de Fecha <<<<<<<<<<<<<<<<<<<<");

        System.out.println("La fecha y hora actual con el formato (AAA/MM/DD - HH:MM:SS) es: " + formatoFechaHora.format(fechaHoy));
        System.out.println();
        System.out.println("-------------------------------------------");
    }//fin main
}//fin clase
