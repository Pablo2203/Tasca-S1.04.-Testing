package org.example.level1.ejercicio2.main;

import org.example.level1.ejercicio2.model.CalculateDni;

public class Main {
    public static void main(String[] args) {
        CalculateDni calculateDni = new CalculateDni(12345678);
        CalculateDni calculateDni2 = new CalculateDni(44456789);
        CalculateDni calculateDni3 = new CalculateDni(22345678);
        CalculateDni  calculateDni4 = new CalculateDni(33456766);
        CalculateDni calculateDni5 = new CalculateDni(12345655);
        CalculateDni calculateDni6 = new CalculateDni(33456755);
        CalculateDni calculateDni7 = new CalculateDni(12345612);
        CalculateDni calculateDni8 = new CalculateDni(33456712);
        CalculateDni calculateDni9 = new CalculateDni(12345674);
        CalculateDni calculateDni10 = new CalculateDni(33456783);
    System.out.println("The DNI letter is: " + calculateDni.calculteDniLetter(12345678));
    System.out.println("The DNI letter is: " + calculateDni2.calculteDniLetter(44456789));
    System.out.println("The DNI letter is: " + calculateDni3.calculteDniLetter(22345678));
    System.out.println("The DNI letter is: " + calculateDni4.calculteDniLetter(33456766));
    System.out.println("The DNI letter is: " + calculateDni5.calculteDniLetter(12345655));
    System.out.println("The DNI letter is: " + calculateDni6.calculteDniLetter(33456755));
    System.out.println("The DNI letter is: " + calculateDni7.calculteDniLetter(12345612));
    System.out.println("The DNI letter is: " + calculateDni8.calculteDniLetter(33456712));
    System.out.println("The DNI letter is: " + calculateDni9.calculteDniLetter(12345674));
    System.out.println("The DNI letter is: " + calculateDni10.calculteDniLetter(33456783));
    }
}
/*

- Ejercicio 2
Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test
reciba un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.*/
