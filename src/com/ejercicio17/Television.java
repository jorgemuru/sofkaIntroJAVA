package com.ejercicio17;

public class Television extends Electrodomestico{
    /***
     * @Author Jorge MARTINEZ
     */

    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    //Constructores
    public Television(int resolucion, boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television() {
        super();
    }

    public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
    }

    //Metodos
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double importeFinal = 0;
        double precioRes = 0;
        double precioSintoniza = 0;

        if(this.resolucion>40){
            precioRes = (super.precioFinal()*30)/100;
        }
        if(this.sintonizadorTDT){
            precioSintoniza = 50;
        }
        importeFinal = super.precioFinal() + precioRes + precioSintoniza;
        return importeFinal;
    }
}//fin clase
