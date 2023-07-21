package co.com.ps.c5;

import javax.swing.*;  //Se debe importar este paquete

public class Ejercicioc5 {
    public static void main(String[] args) {

        String edadStr = JOptionPane.showInputDialog("Ingresa tu edad:");   //Muestra el dialogo
        int edad = Integer.parseInt(edadStr);                               //Captura y almacena el dato

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad."); //Muestra el mensaje en pantalla
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad."); //Muestra el mensaje en pantalla
        }

        int anoactual=2023;
        int Anonacimiento= anoactual-edad;
        JOptionPane.showMessageDialog(null, "Mi año de nacimiento "+Anonacimiento);

}

}


