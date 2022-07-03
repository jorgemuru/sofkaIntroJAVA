package com.ejercicio18;

import com.ejercicio17.Electrodomestico;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    public static void main(String[] args) {
        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 18 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Gestion Tienda de Videos y VideoJuegos <<<<<<<<<<<<<<<<<<<<");

        //Crear array's de series y videojuegos con 5 posiciones
        Serie[] lasSeries = new Serie[5];
        VideoJuego[] losVideoJuegos = new VideoJuego[5];

        //Con un For recorro cada array y en cada posicion creo un objeto distinto (new Serie(atributos)
        // y VideoJuego(atributos)

        //Recorro cada array y ejecuto en algunos objetos el metodo entregar()
        //(lasSeries[i].entregar(), losVideoJuegos.entregar())

        //A las recorridas anteriores les agrego un contador y obtengo la cantidad de objetos entregados.

        //Recorro los array's kedandome con la ubicacion del videojuego con mayor cantidad de horas estimadas y la mayor cantidad
        //de temporadas de la serie.
        //Luego muestro por consola el objeto ubicandolo en el array por la ubicacion guardada (lasSeries[ubicaSerie].toString(),
        // losVideoJuegos[ubicaJuego].toString())

        //Todas las recorridas las realizo con un For.

    }//fin main
}//fin clase
