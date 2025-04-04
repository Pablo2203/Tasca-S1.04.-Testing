package org.example.level1.ejercicio2.model;

public class CalculateDni {
    private static int dniNumber;
    private static char alphabetLetter;

    public CalculateDni(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    public static char calculteDniLetter(int dniNumber) {
        String alphabetLetter = "TRWAGMYFPDXBNJZSQVHLCKE";
        int module = dniNumber % 23;
        return alphabetLetter.charAt(module);
    }


}

/*- Ejercicio 2
Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test
reciba un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.*/
