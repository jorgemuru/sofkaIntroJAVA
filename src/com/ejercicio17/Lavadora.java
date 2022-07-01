package com.ejercicio17;

public class Lavadora extends Electrodomestico{
    /***
     * @Author Jorge MARTINEZ
     */
    private int carga = 5;

    //Constructores
    public Lavadora(int carga) {
        super();
        this.carga = carga;
    }

    public Lavadora() {
        super();
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    //Metodos
    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double importeFinal = 0;

        return importeFinal;
    }
}//fin clase
