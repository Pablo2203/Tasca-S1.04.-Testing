package org.example.level1.ejercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    List<String> javaStrings = new ArrayList<>();

    @BeforeEach
            public void setUp() {
        javaStrings.add("Hola");
        javaStrings.add("Mundo");
        javaStrings.add("Java");
        javaStrings.add("C");
        javaStrings.add("C++");
        javaStrings.add("Python");
        javaStrings.add("C#");
        javaStrings.add("JavaScript");
        javaStrings.add("TypeScript");
    }
    @Test
    public void testException(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> javaStrings.get(10));
    }

}
