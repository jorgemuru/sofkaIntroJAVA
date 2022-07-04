package com.ejercicio18;

public class Serie implements Entregable{
    /***
     * @Author Jorge MARTINEZ
     */
    private String titulo = "";
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String genero = "0";
    private String creador = "";

    private boolean prestado = false;

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
        Serie unaSerie = (Serie)a;
        this.compareTo(unaSerie);
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
