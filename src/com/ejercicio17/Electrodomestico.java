package com.ejercicio17;

public class Electrodomestico {
    /***
     * @Author Jorge MARTINEZ
     */
    private double precioBase = 100;
    private String color = "BLANCO";
    private char consumoEnergetico = 'F';
    private int peso = 5;

    //Getters y Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    //Metodos y funciones especificas
    private void comprobarConsumoEnergetico(char valor){

    }//fin comprobarConsumoEnergetico

    private void comprobarColor(String Color){

    }//fin comprobarColor

    public double precioFinal(){
        double importeFinal=0;

        return importeFinal;
    }//fin precioFinal
}//fin clase
