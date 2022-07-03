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

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //Metodos
    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double importeFinal = 0;

        if(this.carga>30){
            importeFinal = super.precioFinal() + 50;
        }
        return importeFinal;
    }
}//fin clase
