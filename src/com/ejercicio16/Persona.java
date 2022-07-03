package com.ejercicio16;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Persona {
    /***
     * @Author Jorge MARTINEZ
     */
    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private String sexo = "";
    private double peso = 0.0;
    private double altura = 0.0;
    char[] letraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Constructores
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.generaDNI();
        this.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
        this.generaDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.comprobarSexo(sexo);
        this.generaDNI();
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", Sexo=" + sexo +
                ", Peso=" + peso +
                ", Altura=" + altura +
                '}';
    }

    //Metodos y funciones especificas
    public int calcularIMC(){
        double resultado = 0;
        int indice = 0;

        resultado = this.peso * (Math.pow(this.altura,2));

        if(resultado<20){
            indice = -1;
        }
        if (resultado>=20&&resultado<=25){
            indice = 0;
        }
        if (resultado>25){
            indice = 1;
        }
        return indice;
    }//fin calcularIMC

    public Boolean esMayorDeEdad(){
        Boolean esMayor = false;
        if(this.edad >= 18){
            esMayor = true;
        }
        return esMayor;
    }//fin esMayorDeEdad

    private void comprobarSexo(String pSexo){
        if(!pSexo.contains("H")) {
            if (!pSexo.contains("M")) {
                this.setSexo("H");
            } else {
                this.setSexo(pSexo);
            }
        }
    }//fin comprobarSexo

    private void generaDNI(){
        Random aleatorio = new Random();
        int min = 10000000;
        int max = 90000000;
        int numero = ThreadLocalRandom.current().nextInt(min, max);
        int posicion;

        if((numero%23)<1){
            posicion = 0;
        } else if ((numero%23)>22) {
            posicion = 22;
        }else {
            posicion = numero%23;
        }

        this.DNI = String.valueOf(numero) + this.letraDNI[posicion];

    }//fin generaDNI

}//fin clase
