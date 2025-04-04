package org.example.level3;

public class Calculator {
   private int a;
   private int b;

   public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum() {
        return a + b;
    }
    public int substract() {
       return a - b;
    }
    public int multiply() {
       return a * b;
    }
    public int divide() {
       return a / b;
    }
}
