package com.ejercicio18;

public class Serie implements Entregable{
    /***
     * @Author Jorge MARTINEZ
     */
    private String titulo = "";
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    //Constructores
    public Serie() {
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    //Metodos a implementar (Interface Entregable)
    @Override
    public boolean entregar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public void isEntregado() {

    }

    @Override
    public void compareTo(Object a) {

    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

}//Fin clase
