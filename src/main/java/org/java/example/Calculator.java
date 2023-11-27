package org.java.example;

public class Calculator {
	
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double divide(double num1, double num2) throws Exception {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new Exception("Cannot divide by zero");
        }
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

}
