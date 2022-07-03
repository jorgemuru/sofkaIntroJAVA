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
        this.comprobarColor("BLANCO");
        this.comprobarConsumoEnergetico('F');
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.comprobarColor("BLANCO");
        this.comprobarConsumoEnergetico('F');
    }

    //Metodos y funciones especificas
    private void comprobarConsumoEnergetico(char valor){
        switch(valor){
            case 'A':
                this.consumoEnergetico = 'A';
                break;
            case 'B':
                this.consumoEnergetico = 'B';
                break;
            case 'C':
                this.consumoEnergetico = 'C';
                break;
            case 'D':
                this.consumoEnergetico = 'D';
                break;
            case 'E':
                this.consumoEnergetico = 'E';
                break;
            default:
                this.consumoEnergetico = 'F';
        }
    }//fin comprobarConsumoEnergetico

    private void comprobarColor(String Color){
        switch(color) {
            case "NEGRO":
                this.color = "NEGRO";
                break;
            case "ROJO":
                this.color = "ROJO";
                break;
            case "AZUL":
                this.color = "AZUL";
                break;
            case "GRIS":
                this.color = "GRIS";
                break;
            default:
                this.color = "BLANCO";
        }
    }//fin comprobarColor

    public double precioFinal(){
        double importeFinal=0;
        double precioConsumo = 0;
        double precioPeso = 0;

        //Compruebo precio por consumo energetico
        switch(this.consumoEnergetico){
            case 'A':
                precioConsumo = 100;
                break;
            case 'B':
                precioConsumo = 80;
                break;
            case 'C':
                precioConsumo = 60;
                break;
            case 'D':
                precioConsumo = 50;
                break;
            case 'E':
                precioConsumo = 30;
                break;
            case 'F':
                precioConsumo = 10;
        }

        if(this.peso>=0&&this.peso<=19){
            precioPeso = 10;
        }
        if(this.peso>=20&&this.peso<=49){
            precioPeso = 50;
        }
        if(this.peso>=50&&this.peso<=79){
            precioPeso = 80;
        }
        if(this.peso>=80){
            precioPeso = 10;
        }

        importeFinal = this.precioBase + precioConsumo + precioPeso;
        return importeFinal;

    }//fin precioFinal
}//fin clase
