package org.example.level1.ejercicio2.model;

import org.example.level1.ejercicio2.model.CalculateDni;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateDniTest {
    CalculateDni calculateDni;
    CalculateDni calculateDni2;
    CalculateDni calculateDni3;
    CalculateDni calculateDni4;
    CalculateDni calculateDni5;
    CalculateDni calculateDni6;
    CalculateDni calculateDni7;
    CalculateDni calculateDni8;
    CalculateDni calculateDni9;
    CalculateDni calculateDni10;

    @BeforeEach
    public void setUp() {
        calculateDni = new CalculateDni(12345678);
        calculateDni2 = new CalculateDni(44456789);
        calculateDni3 = new CalculateDni(22345678);
        calculateDni4 = new CalculateDni(33456766);
        calculateDni5 = new CalculateDni(12345655);
        calculateDni6 = new CalculateDni(33456755);
        calculateDni7 = new CalculateDni(12345612);
        calculateDni8 = new CalculateDni(33456712);
        calculateDni9 = new CalculateDni(12345674);
        calculateDni10 = new CalculateDni(33456783);
    }
    @Test
    public void testcalculteDniLetter() {
    Assertions.assertEquals('Z', calculateDni.calculteDniLetter(12345678));
    Assertions.assertEquals('C', calculateDni2.calculteDniLetter(44456789));
    Assertions.assertEquals('M', calculateDni3.calculteDniLetter(22345678));
    Assertions.assertEquals('T', calculateDni4.calculteDniLetter(33456766));
    Assertions.assertEquals('Z', calculateDni5.calculteDniLetter(12345655));
    Assertions.assertEquals('N', calculateDni6.calculteDniLetter(33456755));
    Assertions.assertEquals('V', calculateDni7.calculteDniLetter(12345612));
    Assertions.assertEquals('S', calculateDni8.calculteDniLetter(33456712));
    Assertions.assertEquals('X', calculateDni9.calculteDniLetter(12345674));
    Assertions.assertEquals('V', calculateDni10.calculteDniLetter(33456783));

    }

}

/*- Ejercicio 2
Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test
reciba un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.*/
