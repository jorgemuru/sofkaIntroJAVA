package com.ejercicio18;

import com.ejercicio17.Electrodomestico;

public class Principal {
    /***
     * @Author Jorge MARTINEZ
     */
    //Crear array's de series y videojuegos con 5 posiciones
    static Serie[] listaSeries = new Serie[5];
    static VideoJuego[] listaVideos = new VideoJuego[5];
    static int seriesEntregadas = 0;
    static int videosEntregados = 0;

    public static void main(String[] args) {
        System.out.println("Sofka U :: Training - Intro JAVA");
        System.out.println("Ejercicio 18 :: Jorge MARTINEZ");
        System.out.println("-------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>> Gestion Tienda de Videos y VideoJuegos <<<<<<<<<<<<<<<<<<<<");

        //Creo 5 series
        Serie serieUno = new Serie("La Casa de Madera", 150, "Terror", "Steven Spielberg");
        listaSeries[0] = serieUno;
        Serie serieDos = new Serie("La Casa del Lago", 50, "Comedia", "Steven Spielberg");
        listaSeries[1] = serieDos;
        Serie serieTres = new Serie("La Casa de al lado", 3, "Terror", "Steven Spielberg");
        listaSeries[2] = serieTres;
        Serie serieCuatro = new Serie("La Casa Blanca", 1, "Suspenso", "Steven Spielberg");
        listaSeries[3] = serieCuatro;
        Serie serieCinco = new Serie("La Casa de la Manguera", 15, "Comedia", "Steven Spielberg");
        listaSeries[4] = serieCinco;

        //Creo 5 videojuegos
        VideoJuego videoUno = new VideoJuego("Prehistorik", 15, "Arcade", "Marvel");
        listaVideos[0] = videoUno;
        VideoJuego videoDos = new VideoJuego("Mario Bros", 15, "Arcade", "Sony");
        listaVideos[1] = videoDos;
        VideoJuego videoTres = new VideoJuego("Contra", 15, "Realidad Virtual", "Yamaha");
        listaVideos[2] = videoTres;
        VideoJuego videoCuatro = new VideoJuego("Sonik", 15, "OnLine", "Marvel");
        listaVideos[3] = videoCuatro;
        VideoJuego videoCinco = new VideoJuego("Prehistorik 2", 15, "Arcade", "Warner");
        listaVideos[4] = videoCinco;

        //Entrego Series
        listaSeries[1].entregar(listaSeries[1]);
        listaSeries[3].entregar(listaSeries[3]);

        //Entrego Videojuegos
        listaVideos[0].entregar(listaVideos[0]);
        listaVideos[2].entregar(listaVideos[2]);
        listaVideos[4].entregar(listaVideos[4]);

        //Total de Series y Videos entregadas.
        for(int i = listaSeries.length-1; i>=0; i--){
            if(listaSeries[i].isEntregado()){
                seriesEntregadas++;
            }
        }
        for(int i = listaVideos.length-1; i>=0; i--){
            if(listaVideos[i].isEntregado()){
                videosEntregados++;
            }
        }

        estadisticas();

    }//fin main

    public static void estadisticas(){
        int serieMax = 0;
        int videoMAx = 0;
        Serie serieMasTemp = new Serie();
        VideoJuego videoMasHoras = new VideoJuego();

        //Recorro las series
        for(int i = listaSeries.length-1; i>=0; i--){
            if(listaSeries[i].getNumeroTemporadas()>=serieMax){
                serieMasTemp = listaSeries[i];
                serieMax = listaSeries[i].getNumeroTemporadas();
            }
        }
        //Recorro los videos
        for(int i = listaVideos.length-1; i>=0; i--){
            if(listaVideos[i].getHorasEstimadas()>=videoMAx){
                videoMasHoras = listaVideos[i];
                videoMAx = listaVideos[i].getHorasEstimadas();
            }
        }

        System.out.println("------------------ Estadisticas ------------------");
        System.out.println("****** Serie con mas temporadas ******");
        System.out.println(serieMasTemp.toString());
        System.out.println("___________________________________________________");
        System.out.println("****** VideoJuego con mas horas estimadas ******");
        System.out.println(videoMasHoras.toString());
        System.out.println("___________________________________________________");
    }//fin estadisticas

}//fin clase
