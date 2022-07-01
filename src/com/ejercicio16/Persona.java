package com.ejercicio16;

public class Persona {
    /***
     * @Author Jorge MARTINEZ
     */
    private String nombre = "";
    private byte edad = 0;
    private String DNI = "";
    private char sexo = 'H';
    private double peso = 0.0;
    private double altura = 0.0;

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
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
    public Persona(String nombre, byte edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public Persona(String nombre, byte edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    //Metodos y funciones especificas
    public int calcularIMC(){
        int indice = 0;

        return indice;
    }//fin calcularIMC

    public Boolean esMayorDeEdad(){
        Boolean esMayor = false;

        return esMayor;
    }//fin esMayorDeEdad

    private void comprobarSexo(char pSexo){
        if(pSexo!='H'||pSexo!='M'){
            this.setSexo('H');
        }else{
            this.setSexo(pSexo);
        }
    }//fin comprobarSexo

    private void generaDNI(){

    }//fin generaDNI
}//fin clase
