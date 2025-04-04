package org.example.level1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> javaStrings = new ArrayList<>();
        javaStrings.add("Hola");
        javaStrings.add("Mundo");
        javaStrings.add("Java");
        javaStrings.add("C");
        javaStrings.add("C++");
        javaStrings.add("Python");
        javaStrings.add("C#");
        javaStrings.add("JavaScript");
        javaStrings.add("TypeScript");
        System.out.println(javaStrings);
        System.out.println(javaStrings.size());
        System.out.println(javaStrings.get(0));
        System.out.println(javaStrings.get(1));
    }
}
