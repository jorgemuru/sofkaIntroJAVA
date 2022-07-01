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
}//fin clase
