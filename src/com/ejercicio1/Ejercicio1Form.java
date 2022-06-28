package com.ejercicio1;
import javax.swing.*;
import java.util.InputMismatchException;

import static java.lang.Integer.parseInt;

public class Ejercicio1Form {
    public static void main(String[] args) {
        int primerNumero=999999;
        int segundoNumero=999999;
        String resultado = "";
        boolean sigue = true;

        while(sigue) {
            try {
                primerNumero = parseInt(JOptionPane.showInputDialog(null, "Ingrese el Primer Numero (CERO para salir)", "Sofka_U::Training::Ejercicio Uno", 1));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico.", "Sofka_U::Training::Ejercicio Uno", 2);
                break;
            }
            try {
                segundoNumero = parseInt(JOptionPane.showInputDialog(null, "Ingrese el Segundo Numero (CERO para salir)", "Sofka_U::Training::Ejercicio Uno", 1));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico.", "Sofka_U::Training::Ejercicio Uno", 2);
                break;
            }
                if ((primerNumero == 0) && (segundoNumero == 0)) {
                    resultado = "FIN DEL JUEGO. ¡Gracias por jugar!";
                    sigue = false;
                } else {
                    if (primerNumero > segundoNumero) {
                        resultado = "El primer numero es MAYOR al segundo";
                    }
                    if (primerNumero < segundoNumero) {
                        resultado = "El segundo numero es MAYOR al primero";
                    }
                    if (primerNumero == segundoNumero) {
                        resultado = "Los dos numeros son iguales";
                    }
                }
            JOptionPane.showMessageDialog(null, resultado, "Sofka_U::Training::Ejercicio Uno", 1);
        }//fin While
    }//fin main
}//Fin clase
