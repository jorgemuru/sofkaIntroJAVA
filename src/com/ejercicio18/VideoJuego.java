package com.ejercicio18;

public class VideoJuego implements Entregable{
    /***
     * @Author Jorge MARTINEZ
     */
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";
    private boolean prestado = false;

    //Constructores
    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //Metodos a implementar (Interfaz Entregable)
    @Override
    public void entregar(Object valor) {
        this.prestado = true;
    }

    @Override
    public void devolver(Object valor) {
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.prestado;
    }

    @Override
    public void compareTo(Object a) {
        VideoJuego unVideo = (VideoJuego) a;
        this.compareTo(unVideo);
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}//fin clase
